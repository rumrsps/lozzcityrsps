package com.mayhem.rs2.entity.player.net.in.command.impl;

import com.mayhem.Constants;
import com.mayhem.core.util.Utility;
import com.mayhem.rs2.content.PlayersOnline;
import com.mayhem.rs2.content.Yelling;
import com.mayhem.rs2.content.dialogue.DialogueManager;
import com.mayhem.rs2.content.dialogue.OptionDialogue;
import com.mayhem.rs2.content.dialogue.impl.ChangePasswordDialogue;
import com.mayhem.rs2.content.interfaces.InterfaceHandler;
import com.mayhem.rs2.content.interfaces.impl.CommandInterface;
import com.mayhem.rs2.content.interfaces.impl.TrainingInterface;
import com.mayhem.rs2.content.profiles.PlayerProfiler;
import com.mayhem.rs2.content.skill.Skill;
import com.mayhem.rs2.content.skill.Skills;
import com.mayhem.rs2.content.skill.magic.MagicSkill.TeleportTypes;
import com.mayhem.rs2.content.mayhembot.*;
import com.mayhem.rs2.entity.World;
import com.mayhem.rs2.entity.item.Item;
import com.mayhem.rs2.entity.player.Player;
import com.mayhem.rs2.entity.player.net.in.command.Command;
import com.mayhem.rs2.entity.player.net.in.command.CommandParser;
import com.mayhem.rs2.entity.player.net.out.impl.SendInterface;
import com.mayhem.rs2.entity.player.net.out.impl.SendMessage;
import com.mayhem.rs2.entity.player.net.out.impl.SendRemoveInterfaces;
import com.mayhem.rs2.entity.player.net.out.impl.SendString;
import com.motiservice.Motivote;
import com.motiservice.vote.Result;
import com.motiservice.vote.SearchField;
/**
 * A list of commands accessible to all players disregarding rank.
 * 
 * @author 
 */
public class PlayerCommand implements Command {
	
	//public static final Motivote MOTIVOTE = new Motivote("LozzCity", "812db5d2521df8ceac2e31c6c61309f6");
	@Override
	public boolean handleCommand(Player player, CommandParser parser) throws Exception {
		if(player.getDueling().isDueling()) {
			player.getClient().queueOutgoingPacket(new SendMessage("You can not use commands during duel."));
			return false;
		}
		switch (parser.getCommand()) {
		
		/*
		 * Show EloRating
		 */
		case "elo":
			player.send(new SendMessage("Your Elo-Rating is: " + player.eloRating));
			return true;
		case "reward":
			if (parser.hasNext(1)) {
				//Our vote API from EverythingRS.com
				//By default this will work with Project Insanity sources, but it is very easy to make it
				//work with anything (Vencillio/RuneSource, Hyperion, Matrix, etc)
				//Things you will need to change in order to make it work with your server are: 
				//1. "String playerName = c.playerName" . Change that to whatever your source uses to fetch the username
				//2. "c.sendMessage" . Change that to how your server sends the player message packet.
				//3. "c.getItems().addItem" . Change that to how your server handles adding a new item. 
				//And that's it. After tweaking those 3 things, you can get it to work with any source.
				//If you want me to personally add the code for a specific server, please leave a post on our thread
				//And we will personally add the snippet for your current server base
				//String[] args = playerCommand.split(" ");
				new Thread() {
					public void run() {
						try {
							int id = parser.nextInt();
							String playerName = player.getUsername();
							final String request = com.everythingrs.vote.Vote.validate("ypjn5toe9gu66pa8aicc8frh67dkknjio1kn0jlk1qddkj4izjhzdg199mqqoligh8vyrpb9", playerName, id);
							String[][] errorMessage = {
									{ "error_invalid", "There was an error processing your request." },
									{ "error_non_existent_server", "This server is not registered at EverythingRS." },
									{ "error_invalid_reward", "The reward you're trying to claim doesn't exist" },
									{ "error_non_existant_rewards", "This server does not have any rewards set up yet." },
									{ "error_non_existant_player", "There is not record of user " + playerName + " make sure to vote first" },
									{ "not_enough", "You do not have enough vote points to recieve this item" } };
							for (String[] message : errorMessage) {
								if (request.equalsIgnoreCase(message[0])) {
									player.send(new SendMessage(message[1]));
									return;
								}
							}
							if (request.startsWith("complete")) {
								int item = Integer.valueOf(request.split("_")[1]);
								int amount = Integer.valueOf(request.split("_")[2]);
								String itemName = request.split("_")[3];
								int remainingPoints = Integer.valueOf(request.split("_")[4]);
								player.getInventory().add(new Item(item, amount));
								World.sendGlobalMessage("<img=8> @red@" + Utility.formatPlayerName(player.getUsername()) + " has just claimed some vote tickets, do same via ::vote");
								player.send(new SendMessage("You have recieved the item " + itemName + ". You have " + remainingPoints
										+ " points left."));
	
							}
						} catch (Exception e) {
							player.send(new SendMessage("Our API services are currently offline. We are working on bringing it back up"));
							e.printStackTrace();
						}
					}
				}.start();
			}
			return true;
		/*case "reward":
			//String[] args = playerCommand.split(" ");
			new Thread() {
				public void run() {
					try {
						String[] args = null;
						int id = Integer.parseInt(args[1]);
						String playerName = player.getUsername();
						final String request = com.everythingrs.vote.Vote.validate("secret_key", playerName, id);
						String[][] errorMessage = {
								{ "error_invalid", "There was an error processing your request." },
								{ "error_non_existent_server", "This server is not registered at EverythingRS." },
								{ "error_invalid_reward", "The reward you're trying to claim doesn't exist" },
								{ "error_non_existant_rewards", "This server does not have any rewards set up yet." },
								{ "error_non_existant_player", "There is not record of user " + playerName + " make sure to vote first" },
								{ "not_enough", "You do not have enough vote points to recieve this item" } };
						for (String[] message : errorMessage) {
							if (request.equalsIgnoreCase(message[0])) {
								player.send(new SendMessage(message[1]));
								return;
							}
						}
						if (request.startsWith("complete")) {
							int item = Integer.valueOf(request.split("_")[1]);
							int amount = Integer.valueOf(request.split("_")[2]);
							String itemName = request.split("_")[3];
							int remainingPoints = Integer.valueOf(request.split("_")[4]);
							player.getInventory().add(new Item(item, amount));
							player.send(new SendMessage("You have recieved the item " + itemName + ". You have " + remainingPoints
									+ " points left."));

						}
					} catch (Exception e) {
						player.send(new SendMessage("Our API services are currently offline. We are working on bringing it back up"));
						e.printStackTrace();
					}	
			}
		}.start();
		return true;	
		/*case "redeem":
			   String auth = parser.nextString().replaceAll("redeem ", "");
			    
			    try {
			     boolean success = MOTIVOTE.redeem(SearchField.AUTH_CODE, auth) != null;
			     if (success) {
			      Constants.LAST_VOTER = player.getUsername();
			      Constants.CURRENT_VOTES++;
			                                  player.setVotePoints(player.getVotePoints() + 1);
			      World.sendGlobalMessage("<img=8> @red@" + Utility.formatPlayerName(player.getUsername()) + " has just claimed an auth code");
			      player.send(new SendMessage("Thank you for voting, " + Utility.formatPlayerName(player.getUsername()) + "!"));
			     }
			     else {
			      player.send(new SendMessage("Invalid auth!"));
			     }
			    }
			    catch (Exception ex) {
			     ex.printStackTrace();
			    }
			   return true;*/
		/*
		 * Opens the command list
		 */
		case "command":
		case "commands":
		case "commandlist":
		case "commandslist":
			player.send(new SendString("LozzCity Command List", 8144));
			InterfaceHandler.writeText(new CommandInterface(player));
			player.send(new SendInterface(8134));
			return true;

		/*
		 * Opens the teleporting interface
		 */
		case "teleport":
		case "teleports":
		case "teleporting":
		case "teleportings":
			InterfaceHandler.writeText(new TrainingInterface(player));
			player.send(new SendInterface(61000));
			player.send(new SendString("Selected: @red@None", 61031));
			player.send(new SendString("Cost: @red@Free", 61032));
			player.send(new SendString("Requirement: @red@None", 61033));
			player.send(new SendString("Other: @red@None", 61034));
			return true;

		/*
		 * Answers TriviaBot
		 */
		case "answer":
			if (parser.hasNext()) {
				String answer = "";
				while (parser.hasNext()) {
					answer += parser.nextString() + " ";
				}
				MayhemBot.answer(player, answer.trim());
			}
			return true;
			
		case "triviasetting":
		case "triviasettings":
			
			player.start(new OptionDialogue("Turn on TriviaBot", p -> {
				p.setWantTrivia(true);
				p.send(new SendMessage("<col=482CB8>You have turned on the TriviaBot."));
				player.send(new SendRemoveInterfaces());
			}, "Turn off TriviaBot", p -> {
				p.setWantTrivia(false);
				p.send(new SendMessage("<col=482CB8>You have turned off the TriviaBot."));
				player.send(new SendRemoveInterfaces());
			}, "Turn on TriviaBot notification", p -> {
				p.setTriviaNotification(true);
				p.send(new SendMessage("<col=482CB8>You have turned on the TriviaBot notification."));
				player.send(new SendRemoveInterfaces());
			}, "Turn off TriviaBot notification", p -> {
				p.setTriviaNotification(false);
				p.send(new SendMessage("<col=482CB8>You have turned off the TriviaBot notification."));
				player.send(new SendRemoveInterfaces());
			}));		
			return true;

		/*
		 * Gets amount of online players
		 */
		case "players":
			player.send(new SendMessage("There are currently @red@" + Utility.format(World.getActivePlayers()) + "</col> players online."));
			PlayersOnline.showPlayers(player, p -> {
				return true;
			});
			return true;

		/*
		 * Opens donation page
		 */
		case "donate":
		case "donation":
		case "donating":
		case "store":
		case "credits":
			player.send(new SendString("www.lozzcity.com/forum/index.php?/topic/13-donator-benefits-and-how-to-obtain/", 12000));
			player.send(new SendMessage("Loading donation information page"));
			return true;

		/*
		 * Opens website page
		 */
		case "forum":
		case "forums":
			player.send(new SendString("www.lozzcity.com/forum", 12000));
			player.send(new SendMessage("Loading Forums Page: www.lozzcity.com/forum"));
			return true;
			/*
			 * Opens website page
			 */
		case "rules":
		case "Rules":
		case "RULES":
			player.send(new SendString("www.lozzcity.com/forum/index.php?/topic/3-official-rules-of-lozzcity/", 12000));
			player.send(new SendMessage("Loading Rules Page: www.lozzcity.com/forum/index.php?/topic/3-official-rules-of-lozzcity/"));
			return true;
			
			case "website":
			case "homepage":
				player.send(new SendString("www.lozzcity.com", 12000));
				player.send(new SendMessage("Loading website page: www.lozzcity.com"));
				return true;
				
			/*
			 * Opens website page
			 */
			case "discord":
				player.send(new SendString("www.discordapp.com/invite/Ppubwq?utm_source=Discord%20Widget&utm_medium=Connect", 12000));
				player.send(new SendMessage("Loading Discord group chat."));
				return true;

		/*
		 * Opens voting page
		 */
		case "vote":
		case "voting":
			player.send(new SendString("www.lozzcity.com/vote", 12000));
			player.send(new SendMessage("Loading voting page: www.lozzcity.com/vote"));
			return true;

		/*
		 * Finds player to view profile
		 */
		case "find":
			if (parser.hasNext()) {
				String name = parser.nextString();

				while (parser.hasNext()) {
					name += " " + parser.nextString();
				}

				name = name.trim();

				PlayerProfiler.search(player, name);
			}
			return true;

		/**
		 * Withdraw from pouch
		 */
		case "withdrawmp":
			if (parser.hasNext()) {
				try {
					int amount = 1;
					
					if (parser.hasNext()) {
						long temp = Long.parseLong(parser.nextString().toLowerCase().replaceAll("k", "000").replaceAll("m", "000000").replaceAll("b", "000000000"));

						if (temp > Integer.MAX_VALUE) {
							amount = Integer.MAX_VALUE;
						} else {
							amount = (int) temp;
						}
					}

					player.getPouch().withdrawPouch(amount);

				} catch (Exception e) {
					player.send(new SendMessage("Something went wrong!"));
					e.printStackTrace();
				}

			}
			return true;

		/*
		 * Change the password
		 */
		case "changepassword":
		case "changepass":
			if (parser.hasNext()) {
				try {
					String password = parser.nextString();
					if ((password.length() > 4) && (password.length() < 15))
						player.start(new ChangePasswordDialogue(player, password));
					else
						DialogueManager.sendStatement(player, new String[] { "Your password must be between 4 and 15 characters." });
				} catch (Exception e) {
					player.getClient().queueOutgoingPacket(new SendMessage("Invalid password format, syntax: ::changepass password here"));
				}
			}
			return true;
			
            /*
             * Opens bank
             */
		case "bank":
			if (player.getRights() == 1 || player.getRights() == 2 ||  player.getRights() == 3 ||  player.getRights() == 4 || player.getRights() == 6 || player.getRights() == 7 || player.getRights() == 8 || player.getRights() == 13 || player.getMoneySpent() >= 50) {
				if (!player.inWilderness()) {
				player.getBank().openBank();
            return true;
				}
			}
		/*
		 * Changes yell title
		 */
		case "yelltitle":
			if (player.getRights() == 0 || player.getRights() == 5) {
				player.send(new SendMessage("You need to be a super or extreme member to do this!"));
				return true;
			}
			if (parser.hasNext()) {
				try {
					String message = parser.nextString();
					while (parser.hasNext()) {
						message += " " + parser.nextString();
					}

					for (int i = 0; i < Constants.BAD_STRINGS.length; i++) {
						if (message.contains(Constants.BAD_STRINGS[i])) {
							player.send(new SendMessage("You may not use that in your title!"));
							return true;
						}
					}

					for (int i = 0; i < Constants.BAD_TITLES.length; i++) {
						if (message.contains(Constants.BAD_TITLES[i])) {
							player.send(new SendMessage("You may not use that in your title!"));
							return true;
						}
					}

					player.setYellTitle(message);
					DialogueManager.sendTimedStatement(player, "Your yell title is now @red@" + message);
				} catch (Exception e) {
					player.getClient().queueOutgoingPacket(new SendMessage("Invalid yell format, syntax: -title"));
				}
			}
			return true;

		/*
		 * Yell to server
		 */
		case "yell":
			if (parser.hasNext()) {
				try {
					String message = parser.nextString();
					while (parser.hasNext()) {
						message += " " + parser.nextString();
					}
					Yelling.yell(player, message.trim());
				} catch (Exception e) {
					player.getClient().queueOutgoingPacket(new SendMessage("Invalid yell format, syntax: -messsage"));
				}
			}
			return true;

		/*
		 * Handles player emptying inventory 
		 */
		case "empty":
			if (player.getRights() == 2 || player.getRights() == 3) {
				player.getInventory().clear();
				player.send(new SendMessage("You have emptied your inventory."));
				player.send(new SendRemoveInterfaces());
				return true;
			}
			
			player.start(new OptionDialogue("Yes, empty my inventory.", p -> {
				p.getInventory().clear();
				p.send(new SendMessage("You have emptied your inventory."));
				p.send(new SendRemoveInterfaces());
			} , "Wait, nevermind!", p -> p.send(new SendRemoveInterfaces())));
			return true;

		/*
		 * Teleport player home
		 */
		case "home":
			if (player.getWildernessLevel() > 20 && player.inWilderness()) {
				player.send(new SendMessage("You cannot teleport above 20 wilderness!"));
				return true;
			}
			player.getMagic().teleport(1629, 3673, 0, TeleportTypes.SPELL_BOOK);
			return true;
			
		case "sdz":
			if (player.getMoneySpent() >= 50) {
			if (player.getWildernessLevel() > 20 && player.inWilderness()) {
				player.send(new SendMessage("You cannot teleport above 20 wilderness!"));
				return true;
			}
			player.getMagic().teleport(2099, 3914, 0, TeleportTypes.SPELL_BOOK);
			return true;
			}
			
		case "edz":
			if (player.getMoneySpent() >= 500) {
			if (player.getWildernessLevel() > 20 && player.inWilderness()) {
				player.send(new SendMessage("You cannot teleport above 20 wilderness!"));
				return true;
			}
			player.getMagic().teleport(2133, 4911, 0, TeleportTypes.SPELL_BOOK);
			return true;
			}
			
		case "dz":
			if (player.getMoneySpent() >= 10) {
			if (player.getWildernessLevel() > 20 && player.inWilderness()) {
				return true;
			}
			if (player.getRights() == 13) {
			player.getMagic().teleport(2827, 3344, 0, TeleportTypes.SPELL_BOOK);
			return true;
			}
			}
			
		case "claim":
			new Thread() {
				public void run() {
					try {
						com.everythingrs.donate.Donation[] donations = com.everythingrs.donate.Donation.donations("ypjn5toe9gu66pa8aicc8frh67dkknjio1kn0jlk1qddkj4izjhzdg199mqqoligh8vyrpb9", 
								player.getUsername());
						if (donations.length == 0) {
							player.send(new SendMessage("You currently don't have any items waiting. You must donate first!"));
							return;
						}
						if (donations[0].message != null) {
							player.send(new SendMessage(donations[0].message));
							return;
						}
						for (com.everythingrs.donate.Donation donate : donations) {
							player.getInventory().add(new Item(donate.product_id, donate.product_amount));
						}
						player.send(new SendMessage("Thank you for donating!"));
						 World.sendGlobalMessage("<img=8> @red@" + Utility.formatPlayerName(player.getUsername()) + " has just donated to support server, do same via ::store");
					} catch (Exception e) {
						player.send(new SendMessage("Api Services are currently offline. Please check back shortly"));
						e.printStackTrace();
					}	
				}
			}.start();
			return true;
			
		case "shop":
		case "shops":
		case "shopping":
		case "stores":
			
			if (player.getWildernessLevel() > 20 && player.inWilderness()) {
				player.send(new SendMessage("You cannot teleport above 20 wilderness!"));
				return true;
			}
			player.getMagic().teleport(1780, 3690, 0, TeleportTypes.SPELL_BOOK);
			return true;
		}
		return false;
	}

	@Override
	public boolean meetsRequirements(Player player) {
		return true;
	}
}