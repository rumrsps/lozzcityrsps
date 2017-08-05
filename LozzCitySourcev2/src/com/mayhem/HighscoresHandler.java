package com.mayhem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mayhem.rs2.content.skill.Skill;
import com.mayhem.rs2.content.skill.Skills;
import com.mayhem.rs2.entity.player.Player;
import com.mysql.jdbc.Statement;

public class HighscoresHandler implements Runnable{

	/**
	 * Secret key
	 */
	final static String secret = "71079eb48cc431f";
	/**
	 * Username that is used for mysql connection
	 */
	final static String user = "ebbe97";


	private Player player;

	public HighscoresHandler(Player player) {
		this.player = player;
	}

	/**
	 * Function that handles everything, it inserts or updates
	 * user data in database
	 */
	@Override
	public void run() {
		/**
		 * Players username
		 */
		final String username = player.getUsername();
		/**
		 * Represents game mode
		 * If you want to set game modes do this:
		 */
		final int gameMode = 0;
		final String gameMode1 = player.isExtreme() ? "afc87c" : "0";
		final String gameMode2 = player.isIron() ? "08e435" : "0";
		final String gameMode3 = player.isUltimateIron() ? "9b6187" : "0";
		/**
		 * Represents overall xp
		 */
		final long overallXp = (long) player.getSkill().getTotalExperience();
		/**
		 * Represents attack xp
		 */
		final long attackXp = (long) (long) player.getSkill().getExperience()[Skills.ATTACK];
		/**
		 * Represents defence xp
		 */
		final long defenceXp = (long) player.getSkill().getExperience()[Skills.DEFENCE];
		/**
		 * Represents strength xp
		 */
		final long strengthXp = (long) player.getSkill().getExperience()[Skills.STRENGTH];
		/**
		 * Represents constitution xp
		 */
		final long constitutionXp = (long) player.getSkill().getExperience()[Skills.HITPOINTS];
		/**
		 * Represents ranged xp
		 */
		final long rangedXp = (long) player.getSkill().getExperience()[Skills.RANGED];
		/**
		 * Represents prayer xp
		 */
		final long prayerXp = (long) player.getSkill().getExperience()[Skills.PRAYER];
		/**
		 * Represents magic xp
		 */
		final long magicXp = (long) player.getSkill().getExperience()[Skills.MAGIC];
		/**
		 * Represents cooking xp
		 */
		final long cookingXp = (long) player.getSkill().getExperience()[Skills.COOKING];
		/**
		 * Represents woodcutting xp
		 */
		final long woodcuttingXp = (long) player.getSkill().getExperience()[Skills.WOODCUTTING];
		/**
		 * Represents fletching xp
		 */
		final long fletchingXp = (long) player.getSkill().getExperience()[Skills.FLETCHING];
		/**
		 * Represents fishing xp
		 */
		final long fishingXp = (long) player.getSkill().getExperience()[Skills.FISHING];
		/**
		 * Represents firemaking xp
		 */
		final long firemakingXp = (long) player.getSkill().getExperience()[Skills.FIREMAKING];
		/**
		 * Represents crafting xp
		 */
		final long craftingXp = (long) player.getSkill().getExperience()[Skills.CRAFTING];
		/**
		 * Represents smithing xp
		 */
		final long smithingXp = (long) player.getSkill().getExperience()[Skills.SMITHING];
		/**
		 * Represents mining xp
		 */
		final long miningXp = (long) player.getSkill().getExperience()[Skills.MINING];
		/**
		 * Represents herblore xp
		 */
		final long herbloreXp = (long) player.getSkill().getExperience()[Skills.HERBLORE];
		/**
		 * Represents agility xp
		 */
		final long agilityXp = (long) player.getSkill().getExperience()[Skills.AGILITY];
		/**
		 * Represents thieving xp
		 */
		final long thievingXp = (long) player.getSkill().getExperience()[Skills.THIEVING];
		/**
		 * Represents slayer xp
		 */
		final long slayerXp = (long) player.getSkill().getExperience()[Skills.SLAYER];
		/**
		 * Represents farming xp
		 */
		final long farmingXp = (long) player.getSkill().getExperience()[Skills.FARMING];
		/**
		 * Represents runecrafting xp
		 */
		final long runecraftingXp = (long) player.getSkill().getExperience()[Skills.RUNECRAFTING];
		/**
		 * Represents hunter xp
		 */
		final long hunterXp = (long) player.getSkill().getExperience()[Skills.HUNTER];
		/**
		 * Represents construction xp
		 */
		//final long constructionXp = (long) player.getSkill().getExperience()[Skills.CONSTRUCTION];
		/**
		 * Creates new instance of jdbc driver
		 * if that driver exists
		 */
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		/**
		 * Sets Connection variable to null
		 */
		Connection connection = null;
		/**
		 * Sets Statement variable to null
		 */
		Statement stmt = null;

		/**
		 * Attempts connecting to database
		 */
		try {
			connection = DriverManager.getConnection("jdbc:mysql://198.211.123.88:3306/admin_scores_data", user, secret);
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
		/**
		 * Checks if connection isnt null
		 */
		if (connection != null) {
		    try {
		    	stmt = (Statement) connection.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS count FROM `"+user+"_scores` WHERE username='" +username+ "'");
				if(rs.next()) {
					if(rs.getInt("count") > 0)  {
						stmt.executeUpdate("UPDATE `"+user+"_scores` SET overall_xp = '"+overallXp+"', attack_xp = '"+attackXp+"', defence_xp = '"+defenceXp+"', strength_xp = '"+strengthXp+"', constitution_xp = '"+constitutionXp+"', ranged_xp = '"+rangedXp+"', prayer_xp = '"+prayerXp+"', magic_xp = '"+magicXp+"', cooking_xp = '"+cookingXp+"', woodcutting_xp = '"+woodcuttingXp+"', fletching_xp = '"+fletchingXp+"', fishing_xp = '"+fishingXp+"', firemaking_xp = '"+firemakingXp+"', crafting_xp = '"+craftingXp+"', smithing_xp = '"+smithingXp+"', mining_xp = '"+miningXp+"', herblore_xp = '"+herbloreXp+"', agility_xp = '"+agilityXp+"', thieving_xp = '"+thievingXp+"', slayer_xp = '"+slayerXp+"', farming_xp = '"+farmingXp+"', runecrafting_xp = '"+runecraftingXp+"', hunter_xp = '"+hunterXp+"' WHERE username = '"+username+"'");
					} else {
						stmt.executeUpdate("INSERT INTO `"+user+"_scores` (username, mode, overall_xp, attack_xp, defence_xp, strength_xp, constitution_xp, ranged_xp, prayer_xp, magic_xp, cooking_xp, woodcutting_xp, fletching_xp, fishing_xp, firemaking_xp, crafting_xp, smithing_xp, mining_xp, herblore_xp, agility_xp, thieving_xp, slayer_xp, farming_xp, runecrafting_xp, hunter_xp, construction_xp) VALUES ('"+username+"', '"+gameMode+"', '"+overallXp+"', '"+attackXp+"', '"+defenceXp+"', '"+strengthXp+"', '"+constitutionXp+"', '"+rangedXp+"', '"+prayerXp+"', '"+magicXp+"', '"+cookingXp+"', '"+woodcuttingXp+"', '"+fletchingXp+"', '"+fishingXp+"', '"+firemakingXp+"', '"+craftingXp+"', '"+smithingXp+"', '"+miningXp+"', '"+herbloreXp+"', '"+agilityXp+"', '"+thievingXp+"', '"+slayerXp+"', '"+farmingXp+"', '"+runecraftingXp+"', '"+hunterXp+"')");
					}
				}
				stmt.close();
				connection.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} else {
			System.out.println("Failed to make connection!");
		}

		return;
	}
}