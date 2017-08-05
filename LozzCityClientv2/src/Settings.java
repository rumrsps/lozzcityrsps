import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Settings {
	private final static String PATH = Signlink.findcachedir() + "/settings.dat";
	/**
	 * String identification
	 */
	private final static int STRING_ID = 28555;
	
	/**
	 * List of settings available
	 */
	public final static String[] strings = { 
		"Tweening", "Fog", "HD Minimap", "Mip Mapping", "Ground Decoration", "Moving Textures", "Status Orbs", 
		"Roofs", "Money Pouch", "Kill Feed", "Hover Menus", "Entity Feed", "Context Menu", "HP Bars", "Hitmarkers",
		"x10 Damage", "Camera Gliding", "Attack Priority", "Time Stamps", "Snow", "Prestige Colors",
	};

	public static void defaultValues() {
		Configuration.enableTweening = true;
		Configuration.enableDistanceFog = true;
		Configuration.enableHDMinimap = true;
		Configuration.enableMipMapping = true;
		Configuration.enableGroundDecors = true;
		Configuration.enableMovingTextures = true;
		Configuration.enableStatusOrbs = true;
		Configuration.enableRoofs = false;
		Configuration.enablePouch = true;
		Configuration.showKillFeed = true;
		Configuration.menuHovers = true;
		Configuration.drawEntityFeed = true;
		Configuration.enableNewMenus = true;
		Configuration.enableNewHpBars = false;
		Configuration.enableNewHitmarks = false;
		Configuration.enable10xDamage = false;
		Configuration.enableScreenGliding = false;
		Configuration.entityAttackPriority = false;
		Configuration.enableTimeStamps = false;
		Configuration.snow = false;
		Configuration.enablePrestigeColors = true;
		updateText();
		Client.loadingStage = 1;
		Client.minimapImage.method343();
	}

	/**
	 * Updates all the text
	 */
	public static void updateText() {
		int line = 28554;
		for (String string : strings) {
			Client.sendFrame126(string, line);
			line += 5;
		}
		
		Client.sendFrame126(prefix(Configuration.enableTweening), STRING_ID + 0);
		Client.sendFrame126(prefix(Configuration.enableDistanceFog), STRING_ID + 5);
		Client.sendFrame126(prefix(Configuration.enableHDMinimap), STRING_ID + 10);		
		Client.sendFrame126(prefix(Configuration.enableMipMapping), STRING_ID + 15);
		Client.sendFrame126(prefix(Configuration.enableGroundDecors), STRING_ID + 20);
		Client.sendFrame126(prefix(Configuration.enableMovingTextures), STRING_ID + 25);
		Client.sendFrame126(prefix(Configuration.enableStatusOrbs), STRING_ID + 30);
		Client.sendFrame126(prefix(Configuration.enableRoofs), STRING_ID + 35);
		Client.sendFrame126(prefix(Configuration.enablePouch), STRING_ID + 40);	
		Client.sendFrame126(prefix(Configuration.showKillFeed), STRING_ID + 45);
		Client.sendFrame126(prefix(Configuration.menuHovers), STRING_ID + 50);
		Client.sendFrame126(prefix(Configuration.drawEntityFeed), STRING_ID + 55);
		Client.sendFrame126(prefix(Configuration.enableNewMenus), STRING_ID + 60);
		Client.sendFrame126(prefix(Configuration.enableNewHpBars), STRING_ID + 65);
		Client.sendFrame126(prefix(Configuration.enableNewHitmarks), STRING_ID + 70);	
		Client.sendFrame126(prefix(Configuration.enable10xDamage), STRING_ID + 75);
		Client.sendFrame126(prefix(Configuration.enableScreenGliding), STRING_ID + 80);
		Client.sendFrame126(prefix(Configuration.entityAttackPriority), STRING_ID + 85);
		Client.sendFrame126(prefix(Configuration.enableTimeStamps), STRING_ID + 90);
		Client.sendFrame126(prefix(Configuration.snow), STRING_ID + 95);
		Client.sendFrame126(prefix(Configuration.enablePrestigeColors), STRING_ID + 100);
	}

	public static boolean click(Client client, int button) {
		System.out.println("[SETTINGS] " + button);
		switch (button) {

		case 28551:
			Configuration.enableTweening = !Configuration.enableTweening;
			updateText();
			return true;
		case 28556:
			Configuration.enableDistanceFog = !Configuration.enableDistanceFog;
			updateText();
			return true;
		case 28561:
			Configuration.enableHDMinimap = !Configuration.enableHDMinimap;
			Client.loadingStage = 1;
			Client.minimapImage.method343();
			updateText();
			return true;
		case 28566:
			Configuration.enableMipMapping = !Configuration.enableMipMapping;
			updateText();
			return true;
		case 28571:
			Configuration.enableGroundDecors= !Configuration.enableGroundDecors;
			Client.loadingStage = 1;
			Client.minimapImage.method343();
			updateText();
			return true;	
		case 28576:
			Configuration.enableMovingTextures = !Configuration.enableMovingTextures;
			updateText();
			return true;	
		case 28581:
			Configuration.enableStatusOrbs = !Configuration.enableStatusOrbs;
			updateText();
			return true;
		case 28586:
			Configuration.enableRoofs = !Configuration.enableRoofs;
			updateText();
			return true;
		case 28591:
			Configuration.enablePouch = !Configuration.enablePouch;
			updateText();
			return true;	
		case 28596:
			Configuration.showKillFeed = !Configuration.showKillFeed;
			updateText();
			return true;	
		case 28601:
			Configuration.menuHovers = !Configuration.menuHovers;
			updateText();
			return true;	
		case 28606:
			Configuration.drawEntityFeed = !Configuration.drawEntityFeed;
			updateText();
			return true;	
		case 28611:
			Configuration.enableNewMenus = !Configuration.enableNewMenus;
			updateText();
			return true;	
		case 28616:
			Configuration.enableNewHpBars = !Configuration.enableNewHpBars;
			updateText();
			return true;
		case 28621:
			Configuration.enableNewHitmarks = !Configuration.enableNewHitmarks;
			updateText();
			return true;	
		case 28626:
			Configuration.enable10xDamage = !Configuration.enable10xDamage;
			updateText();
			return true;	
		case 28631:
			Configuration.enableScreenGliding = !Configuration.enableScreenGliding;
			updateText();
			return true;	
		case 28636:
			Configuration.entityAttackPriority = !Configuration.entityAttackPriority;
			updateText();
			return true;	
		case 28641:
			Configuration.enableTimeStamps = !Configuration.enableTimeStamps;
			updateText();
			return true;
		case 28646:
			Configuration.snow = !Configuration.snow;
			updateText();
			return true;
		case 28651:
			Configuration.enablePrestigeColors = !Configuration.enablePrestigeColors;
			updateText();
			return true;
			
		case 28507:
			defaultValues();
			updateText();
			break;
		}
		return false;
	}

	public static String prefix(boolean paramBoolean) {
		return paramBoolean ? "<col=4DE024>Enabled" : "<col=D61E30>Disabled";
	}

	public static void save() {
		try {
			File file = new File(PATH);
			DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
			out.writeUTF(Client.myUsername);
			out.writeUTF(Client.myPassword);
			out.writeUTF(Client.chatColorHex);
			out.writeBoolean(Client.rememberMe);
			out.writeBoolean(Configuration.enableTweening);
			out.writeBoolean(Configuration.enableDistanceFog);
			out.writeBoolean(Configuration.enableHDMinimap);
			out.writeBoolean(Configuration.enableMipMapping);
			out.writeBoolean(Configuration.enableGroundDecors);
			out.writeBoolean(Configuration.enableMovingTextures);
			out.writeBoolean(Configuration.enableStatusOrbs);
			out.writeBoolean(Configuration.enableRoofs);
			out.writeBoolean(Configuration.enablePouch);
			out.writeBoolean(Configuration.showKillFeed);
			out.writeBoolean(Configuration.menuHovers);
			out.writeBoolean(Configuration.drawEntityFeed);
			out.writeBoolean(Configuration.enableNewMenus);
			out.writeBoolean(Configuration.enableNewHpBars);
			out.writeBoolean(Configuration.enableNewHitmarks);
			out.writeBoolean(Configuration.enable10xDamage);
			out.writeBoolean(Configuration.enableScreenGliding);
			out.writeBoolean(Configuration.entityAttackPriority);
			out.writeBoolean(Configuration.enableTimeStamps);
			out.writeBoolean(Configuration.snow);
			out.writeBoolean(Configuration.enablePrestigeColors);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void load() {
		try {
			File file = new File(PATH);
			if (!file.exists()) {
				return;
			}
			DataInputStream in = new DataInputStream(new FileInputStream(file));
			Client.myUsername = in.readUTF();
			Client.myPassword = in.readUTF();
			Client.chatColorHex = in.readUTF();
			Client.rememberMe = in.readBoolean();
			Configuration.enableTweening = in.readBoolean();
			Configuration.enableDistanceFog = in.readBoolean();
			Configuration.enableHDMinimap = in.readBoolean();
			Configuration.enableMipMapping = in.readBoolean();
			Configuration.enableGroundDecors = in.readBoolean();
			Configuration.enableMovingTextures = in.readBoolean();
			Configuration.enableStatusOrbs = in.readBoolean();
			Configuration.enableRoofs = in.readBoolean();
			Configuration.enablePouch = in.readBoolean();
			Configuration.showKillFeed = in.readBoolean();
			Configuration.menuHovers = in.readBoolean();
			Configuration.drawEntityFeed = in.readBoolean();
			Configuration.enableNewMenus = in.readBoolean();
			Configuration.enableNewHpBars = in.readBoolean();
			Configuration.enableNewHitmarks = in.readBoolean();
			Configuration.enable10xDamage = in.readBoolean();
			Configuration.enableScreenGliding = in.readBoolean();
			Configuration.entityAttackPriority = in.readBoolean();
			Configuration.enableTimeStamps = in.readBoolean();
			Configuration.snow = in.readBoolean();
			Configuration.enablePrestigeColors = in.readBoolean();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
