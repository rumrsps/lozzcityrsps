package com.mayhem.rs2.content.shopping.impl;

import com.mayhem.rs2.content.interfaces.InterfaceHandler;
import com.mayhem.rs2.content.interfaces.impl.QuestTab;
import com.mayhem.rs2.content.shopping.Shop;
import com.mayhem.rs2.entity.item.Item;
import com.mayhem.rs2.entity.player.Player;
import com.mayhem.rs2.entity.player.net.out.impl.SendMessage;

/**
 * Shop for pest credits
 * 
 * @author Daniel
 */
public class CreditsShop extends Shop {

	/**
	 * Id of shop
	 */
	public static final int SHOP_ID = 94;

	/**
	 * Prices of item in shop
	 * 
	 * @param id
	 * @return
	 */
	public static final int getPrice(int id) {
	switch (id) {
	case 7142:
		return 1500;
	case 11770:
	case 11771:
	case 11772:
	case 11773:
		return 600;
	case 12020:
		return 2500;
	case 2577:
		return 250;
	case 12439:
	case 12397:
	case 12393:
	case 12395:
	case 12319:
	case 12351:
	case 12441:
	case 12443:
		return 200;
	case 13239:
	case 13237:
	case 13235:
		return 1000;
	case 4566:
	return 250;
	case 4565:
		return 1000;
	case 12373:
	case 12335:
	case 12337:
	case 12432:
		return 500;
	case 12357:
		return 500;
		
	case 9946:
		return 100;
	case 19553:
		return 700;
	case 19547:
		return 700;
	case 19550:
		return 700;
	case 19544:
		return 700;
	case 21006:
	return 2000;
	case 20997:
	return 3000;
	case 21003:
	return 2000;
	case 21000:
	case 21015:
		return 1500;
	case 21012:
		return 1000;
	}

	return 15000;
}

/**
 * Items in shop
 */
public CreditsShop() {
	super(SHOP_ID, new Item[] { 
			new Item(12020),
			new Item(21006),
			new Item(20997),
			new Item(21003),
			new Item(21000),
			new Item(21015),
			new Item(21012),
			new Item(4566),
			new Item(12319),
			new Item(12439), 	
			new Item(12397),
			new Item(12395),
			new Item(12393),				
			new Item(12351),
			new Item(12441),
			new Item(12443),
			new Item(4565),
			new Item(12373),
			new Item(12335),
			new Item(12337),
			new Item(12432),
			new Item(12357),
			new Item(13239),
			new Item(13237),
			new Item(13235),
			new Item(19553),
			new Item(19547),
			new Item(19550),
			new Item(19544),
			new Item(2577),
			new Item(11770),
			new Item(11771),
			new Item(11772),
			new Item(11773),
			new Item(7142),
			
	}, false, "LozzCity Bucks Store");
}

	@Override
	public void buy(Player player, int slot, int id, int amount) {
		if (!hasItem(slot, id))
			return;
		if (get(slot).getAmount() == 0)
			return;
		if (amount > get(slot).getAmount()) {
			amount = get(slot).getAmount();
		}

		Item buying = new Item(id, amount);

		if (!player.getInventory().hasSpaceFor(buying)) {
			if (!buying.getDefinition().isStackable()) {
				int slots = player.getInventory().getFreeSlots();
				if (slots > 0) {
					buying.setAmount(slots);
					amount = slots;
				} else {
					player.getClient().queueOutgoingPacket(new SendMessage("You do not have enough inventory space to buy this item."));
				}
			} else {
				player.getClient().queueOutgoingPacket(new SendMessage("You do not have enough inventory space to buy this item."));
				return;
			}
		}

		if (player.getCredits() < amount * getPrice(id)) {
			player.getClient().queueOutgoingPacket(new SendMessage("You do not have enough LozzCity Bucks to buy that."));
			return;
		}

		player.setCredits(player.getCredits() - (amount * getPrice(id)));

		//InterfaceHandler.writeText(new QuestTab(player));

		player.getInventory().add(buying);
		update();
	}

	@Override
	public int getBuyPrice(int id) {
		return 0;
	}

	@Override
	public String getCurrencyName() {
		return "Credits";
	}

	@Override
	public int getSellPrice(int id) {
		return getPrice(id);
	}

	@Override
	public boolean sell(Player player, int id, int amount) {
		player.getClient().queueOutgoingPacket(new SendMessage("You cannot sell items to this shop."));
		return false;
	}
}
