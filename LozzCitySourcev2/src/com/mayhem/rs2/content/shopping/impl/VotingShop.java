package com.mayhem.rs2.content.shopping.impl;

import com.mayhem.rs2.content.interfaces.InterfaceHandler;
import com.mayhem.rs2.content.interfaces.impl.QuestTab;
import com.mayhem.rs2.content.shopping.Shop;
import com.mayhem.rs2.entity.item.Item;
import com.mayhem.rs2.entity.player.Player;
import com.mayhem.rs2.entity.player.net.out.impl.SendMessage;

/**
 * Voting store
 * 
 * @author Daniel
 */
public class VotingShop extends Shop {

	/**
	 * Id of Bounty shop
	 */
	public static final int SHOP_ID = 92;

	/**
	 * Price of items in Bounty store
	 * 
	 * @param id
	 * @return
	 */
	public static final int getPrice(int id) {
	switch (id) {
	
	case 2528:
	case 12789:
		return 5;
	case 989:
		return 1;
	case 299:
	return 1;
	case 12020:
		return 300;
	case 6199:
		return 5;
	case 20851:
		return 70;
	case 2572:
		return 50;
	case 12964:
	case 12966:
	case 12968:
	case 12970:
		return 20;
	case 12976:
	case 12978:
	case 12980:
	case 12982:
		return 50;
	case 12992:
	case 12994:
	case 12996:
	case 12998:
		return 70;
	case 13004:
	case 13006:
	case 13008:
	case 13010:
		return 90;
	case 13016:
	case 13018:
	case 13020:
	case 13022:
		return 110;
	case 13028:
	case 13030:
	case 13032:
	case 13034:
		return 120;
	case 13036:
	case 13038:
		return 200;
	case 1837:
		return 5;
	case 5607:
		return 50;
	case 2643:
		
		return 5;
	case 9470:
	case 9472:
		return 20;
	case 20784:
		return 150;
	case 13171:
	case 13167:
	case 13169:
		return 150;
	case 7478:
		return 10;
	case 6585:
		return 15;
	case 12954:
		return 25;
	case 4151:
		return 15;
	case 7462:
			return 20;
	case 6570:
		return 50;
	case 11840:
		return 20;
	case 12873:
		return 30;
	case 12881:
		return 25;
	case 12875:
		return 20;
	case 12877:
		return 40;
	case 12879:
		return 10;
	case 12883:
		return 35;
	case 13343:
		return 100;
	case 13344:
		return 75;
	case 20834:
		return 100;
	case 20836:
		return 100;
	case 20849:
		return 1;
	}
	return 2147483647;
}

/**
 * All items in Bounty store
 */
public VotingShop() {
	super(SHOP_ID, new Item[] {
			new Item(12020), //dicebag
			new Item(299), //mithseeds
			new Item(989), //ckeys
			new Item(7478), //20ariabucks
			new Item(12789), //cluebox
			new Item(6199), //mystery box
			new Item(20851), //olmlet
			new Item(2572), //ROW
			new Item(20849), //dragonthrownaxe
			new Item(20784), //dclaws
			new Item(4151), //whip
			new Item(6585), //fury
			new Item(7462), //bgloves
			new Item(12954), //dragon defender
			new Item(6570), //firecape
			new Item(1837), //desert boots
			new Item(5607), //grain
			new Item(9470), //gnome scarf
			new Item(2643), //black cavalier
			new Item(12873), //guthans
			new Item(12875), //veracs
			new Item(12879), //torags
			new Item(12881), //ahrims
			new Item(12883), //karils
			new Item(12877), //dharoks
			new Item(13343), //black santa hat
			new Item(13344), //inverted santa hat
			new Item(20834), //sack of presents
			new Item(20836), //giant present
			new Item(11840),
			new Item(13036),
			new Item(13038),
	}, false, "Vote Point Store");
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

		if (player.getVotePoints() < amount * getPrice(id)) {
			player.getClient().queueOutgoingPacket(new SendMessage("You do not have enough Vote points to buy that."));
			return;
		}

		player.setVotePoints(player.getVotePoints() - amount * getPrice(id));

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
		return "Vote points";
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
