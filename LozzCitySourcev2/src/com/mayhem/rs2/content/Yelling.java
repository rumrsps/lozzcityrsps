package com.mayhem.rs2.content;

import com.mayhem.core.util.Utility;
import com.mayhem.rs2.entity.World;
import com.mayhem.rs2.entity.player.Player;
import com.mayhem.rs2.entity.player.net.out.impl.SendMessage;

public class Yelling {

	public static final String YELL_COOLDOWN_KEY = "yellcooldown";

	public static String send;

	public static void yell(Player player, String message) {
		
		message = Utility.capitalizeFirstLetter(message);

		int rights = player.getRights();
		
		if (rights == 1) {
			send = "[<col=AF01E9>Moderator</col>] <img=0> <col=AF01E9>" + player.getUsername() + "</col>: <col=AF01E9>" + message;
		} else if (rights == 2) {
			send = "[<col=FFFF00>Administrator</col>]  <img=1> <col=FFFF00>" + player.getUsername() + "</col>: <col=FFFF00>" + message;
		} else if (rights == 3) {
			send = "[@red@Community Manager</col>] <img=2> @red@" + player.getUsername() + "</col>: @red@" + message;
		} else if (rights == 4) {
			send = "[<trans=1212>Developer] <img=3> <trans=1212>" + player.getUsername() + ": <trans=1212>" + message;
		} else if (rights == 5) {
			send = "[<col=cc0000>Donator</col>] <img=4> <col=cc0000>" + player.getUsername() + "</col>: <col=cc0000>" + message;
		} else if (rights == 6) {
			send = "[<col=37120>" + Utility.capitalize(player.getYellTitle()) + "</col>] <img=5> <col=37120>" + player.getUsername() + "</col>: <col=37120>" + message;
		} else if (rights == 7) {
			send = "[<col=0066cc>" + Utility.capitalize(player.getYellTitle()) + "</col>] <img=6> <col=0066cc>" + player.getUsername() + "</col>: <col=0066cc>" + message;
		} else if (rights == 8) {
			send = "[<col=E100DA>" + Utility.capitalize(player.getYellTitle()) + "</col>] <img=7> <col=E100DA>" + player.getUsername() + "</col>: <col=E100DA>" + message;
		} else if (rights == 13) {
			send = "[<col=191970>Server Support</col>] <img=12><col=191970> " + player.getUsername() + "</col>: <col=191970>" + message;
		} else if (rights == 15) {
			send = "[@red@Youtuber</col>]@red@ <img=15>" + player.getUsername() + "</col>: <col=cc0000>" + message;
		}
		
		
		else {

			if (player.getRights() == 0) {
				if (player.getAttributes().get("yellcooldown") == null) {
					player.getAttributes().set("yellcooldown", Long.valueOf(System.currentTimeMillis()));
				} else if (System.currentTimeMillis() - ((Long) player.getAttributes().get("yellcooldown")).longValue() < 3000L) {
					player.getClient().queueOutgoingPacket(new SendMessage("You must wait a few seconds before yelling again."));
					return;
				}
				
				player.getAttributes().set("yellcooldown", Long.valueOf(System.currentTimeMillis()));
			}
			return;
		}

		if (player.isMuted()) {
			player.getClient().queueOutgoingPacket(new SendMessage("You are muted and cannot yell."));
			return;
		}

		if (player.isYellMuted()) {
			player.getClient().queueOutgoingPacket(new SendMessage("You are muted are not allowed to yell."));
			return;
		}

		if (message.contains("<")) {
			player.getClient().queueOutgoingPacket(new SendMessage("You cannot use text arguments when yelling."));
			return;
		}


		for (Player i : World.getPlayers())
			if (i != null && send != null)
				i.getClient().queueOutgoingPacket(new SendMessage(send));
	}
}
