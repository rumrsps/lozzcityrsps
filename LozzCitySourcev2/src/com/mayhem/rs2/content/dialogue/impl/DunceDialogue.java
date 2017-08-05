package com.mayhem.rs2.content.dialogue.impl;

import com.mayhem.rs2.content.PlayerTitle;
import com.mayhem.rs2.content.dialogue.Dialogue;
import com.mayhem.rs2.content.dialogue.DialogueConstants;
import com.mayhem.rs2.content.dialogue.DialogueManager;
import com.mayhem.rs2.content.dialogue.Emotion;
import com.mayhem.rs2.entity.player.Player;
import com.mayhem.rs2.entity.player.PlayerConstants;
import com.mayhem.rs2.entity.player.net.out.impl.SendMessage;
import com.mayhem.rs2.entity.player.net.out.impl.SendRemoveInterfaces;

public class DunceDialogue extends Dialogue {

	public DunceDialogue(Player player) {
		this.player = player; 
	}
	
	private void title(String title, int color) {
		player.setPlayerTitle(PlayerTitle.create(title, color, false));
		player.send(new SendMessage("Special title has been set!"));
		player.setAppearanceUpdateRequired(true);
		player.send(new SendRemoveInterfaces());
	}

	@Override
	public boolean clickButton(int id) {
		switch (id) {
		
		case DialogueConstants.OPTIONS_4_1:
			if (PlayerConstants.isStaff(player) || player.getRights() == 5 || player.getRights() == 6 || player.getRights() == 7 || player.getRights() == 8) {
				title("Member", 0xcc0000);
			} else {
				DialogueManager.sendNpcChat(player, 6749, Emotion.SAD, "You need to at least be a <img=4> <col=cc0000>Member</col>!");
			}
			break;
			
		case DialogueConstants.OPTIONS_4_2:
			if (PlayerConstants.isStaff(player) || player.getRights() == 6 || player.getRights() == 7 || player.getRights() == 8) {
				title("Super", 0x37120);
			} else {
				DialogueManager.sendNpcChat(player, 6749, Emotion.SAD, "You need to at least be a <img=5> <col=37120>Super Member</col>!");
			}
			break;
			
		case DialogueConstants.OPTIONS_4_3:
			if (PlayerConstants.isStaff(player) || player.getRights() == 7 || player.getRights() == 8) {
				title("Respected", 0x0066cc);
			} else {
				DialogueManager.sendNpcChat(player, 6749, Emotion.SAD, "You need to at least be a <img=6> <col=0066cc>Respected Member</col>!");
			}
			break;
			
		case DialogueConstants.OPTIONS_4_4:
			if (PlayerConstants.isStaff(player) || player.getRights() == 8) {
				title("Legendary", 0xE100DA);
			} else {
				DialogueManager.sendNpcChat(player, 6749, Emotion.SAD, "You need to at least be a <img=7> <col=E100DA>Legendary Member</col>!");
			}
			break;
		
		}
		return false;
	}

	@Override
	public void execute() {
		switch (next) {
		
		case 0:
			DialogueManager.sendNpcChat(player, 6749, Emotion.HAPPY_TALK, "Hello " + player.getUsername() + "!", "I can give you a special title.", "You must be privilaged enough of course!");
			next++;
			break;
			
		case 1:
			DialogueManager.sendOption(player, "Member", "Super", "Respected", "Legendary");
			break;
		
		}
	}
	
	
	
}
