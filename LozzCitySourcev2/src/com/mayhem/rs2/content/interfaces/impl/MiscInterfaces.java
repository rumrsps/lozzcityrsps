package com.mayhem.rs2.content.interfaces.impl;

import com.mayhem.rs2.entity.player.Player;
import com.mayhem.rs2.entity.player.net.out.impl.SendString;

public class MiscInterfaces {
	
	public static void startUp(Player player) {
	
		//Magic Tab - Normal
		player.send(new SendString("Home Teleport", 19220));
		player.send(new SendString("Teleport home", 19222));	
		player.send(new SendString("PvP Teleport", 19641));
		player.send(new SendString("Opens PvP interface", 19642));	
		player.send(new SendString("Location Teleport", 19722));
		player.send(new SendString("Opens Location interface", 19723));	
		player.send(new SendString("Minigame Teleport", 19803));
		player.send(new SendString("Opens Minigame interface", 19804));
		player.send(new SendString("Bosses Teleport", 19960));
		player.send(new SendString("Opens Bosses interface", 19961));
		player.send(new SendString("Skilling Teleport", 20195));
		player.send(new SendString("Opens Skilling interface", 20196));	
		player.send(new SendString("Training Teleport", 20354));
		player.send(new SendString("Opens Training interface", 20355));	
		
		//Magic Tab - Ancients
		player.send(new SendString("Home Teleport", 21756));
		player.send(new SendString("Teleport home", 21757));	
		player.send(new SendString("PvP Teleport", 21833));
		player.send(new SendString("Opens PvP interface", 21834));	
		player.send(new SendString("Location Teleport", 21933));
		player.send(new SendString("Opens Location interface", 21934));	
		player.send(new SendString("Minigame Teleport", 22052));
		player.send(new SendString("Opens Minigame interface", 22053));
		player.send(new SendString("Bosses Teleport", 22123));
		player.send(new SendString("Opens Bosses interface", 22124));
		player.send(new SendString("Skilling Teleport", 22232));
		player.send(new SendString("Opens Skilling interface", 22233));	
		player.send(new SendString("Training Teleport", 22307));
		player.send(new SendString("Opens Training interface", 22308));
		

	
	}

}
