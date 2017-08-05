import java.io.FileWriter;

public final class EntityDef {

	public static EntityDef forID(int i, boolean cached) {
		if (cached) {
			for (int j = 0; j < 20; j++)
				if (cache[j].interfaceType == (long) i)
					return cache[j];
		}
		anInt56 = (anInt56 + 1) % 20;
		EntityDef entityDef = new EntityDef();
		if (cached) {
			cache[anInt56] = entityDef;
		}
		stream.currentOffset = streamIndices[i];
		entityDef.interfaceType = i;
		entityDef.readValues(stream);

		// Start of customor modified NPCs
		switch (i) {
		
		
		case 2150:
			entityDef.name = "Player Shops Clerk";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[2] = "Edit shop";
			entityDef.actions[3] = "Explore Shops";
			break;
		
		case 3310:
		case 4291:
			entityDef.name = "House Agent";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[2] = "Visit Friend";
			entityDef.actions[3] = "Enter House";
			break;
			
		case 6878:
			entityDef.name = "Blood money shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade with";
			break;
			
		case 6875:
			entityDef.name = "Nurse Joy";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk to";
			entityDef.actions[2] = "Heal";
			break;
			
		case 6781:
			entityDef.name = "Skill point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade with";
			break;
			
		case 6746:
			entityDef.name = "Clue Item Shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade with";
			break;
			
		case 7152:
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			break;

		case 6144:
			entityDef.name = "Portal";
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 3928;
			entityDef.standAnim = 3928;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anIntArray94 = new int[2];
			entityDef.anIntArray94[0] = 14533;
			entityDef.anIntArray94[1] = 14522;
			entityDef.anIntArray70 = new int[5];
			entityDef.anIntArray70[0] = 10355;
			entityDef.anIntArray70[1] = 10471;
			entityDef.anIntArray70[2] = 10941;
			entityDef.anIntArray70[3] = 11200;
			entityDef.anIntArray70[4] = 11187;
			entityDef.anIntArray76 = new int[5];
			entityDef.anIntArray76[0] = 54387;
			entityDef.anIntArray76[1] = 54503;
			entityDef.anIntArray76[2] = 54744;
			entityDef.anIntArray76[3] = 55219;
			entityDef.anIntArray76[4] = 55203;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 2;
			break;

		case 6145:
			entityDef.name = "Portal";
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 3928;
			entityDef.standAnim = 3928;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anIntArray94 = new int[4];
			entityDef.anIntArray94[0] = 14533;
			entityDef.anIntArray94[1] = 14523;
			entityDef.anIntArray94[2] = 14524;
			entityDef.anIntArray94[3] = 14525;
			entityDef.anIntArray70 = new int[5];
			entityDef.anIntArray70[0] = 63411;
			entityDef.anIntArray70[1] = 63287;
			entityDef.anIntArray70[2] = 63163;
			entityDef.anIntArray70[3] = 63046;
			entityDef.anIntArray70[4] = 63046;
			entityDef.anIntArray76 = new int[5];
			entityDef.anIntArray76[0] = 54387;
			entityDef.anIntArray76[1] = 54503;
			entityDef.anIntArray76[2] = 54744;
			entityDef.anIntArray76[3] = 55219;
			entityDef.anIntArray76[4] = 55203;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 2;
			break;

		case 6146:
			entityDef.name = "Portal";
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 3928;
			entityDef.standAnim = 3928;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anIntArray94 = new int[2];
			entityDef.anIntArray94[0] = 14533;
			entityDef.anIntArray94[1] = 14522;
			entityDef.anIntArray70 = new int[5];
			entityDef.anIntArray70[0] = 10355;
			entityDef.anIntArray70[1] = 10471;
			entityDef.anIntArray70[2] = 10941;
			entityDef.anIntArray70[3] = 11200;
			entityDef.anIntArray70[4] = 11187;
			entityDef.anIntArray76 = new int[5];
			entityDef.anIntArray76[0] = 54387;
			entityDef.anIntArray76[1] = 54503;
			entityDef.anIntArray76[2] = 54744;
			entityDef.anIntArray76[3] = 55219;
			entityDef.anIntArray76[4] = 55203;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 2;
			break;

		case 6147:
			entityDef.name = "Portal";
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 3928;
			entityDef.standAnim = 3928;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anIntArray94 = new int[4];
			entityDef.anIntArray94[0] = 14533;
			entityDef.anIntArray94[1] = 14523;
			entityDef.anIntArray94[2] = 14524;
			entityDef.anIntArray94[3] = 14525;
			entityDef.anIntArray70 = new int[5];
			entityDef.anIntArray70[0] = 63411;
			entityDef.anIntArray70[1] = 63287;
			entityDef.anIntArray70[2] = 63163;
			entityDef.anIntArray70[3] = 63046;
			entityDef.anIntArray70[4] = 63046;
			entityDef.anIntArray76 = new int[5];
			entityDef.anIntArray76[0] = 54387;
			entityDef.anIntArray76[1] = 54503;
			entityDef.anIntArray76[2] = 54744;
			entityDef.anIntArray76[3] = 55219;
			entityDef.anIntArray76[4] = 55203;
			entityDef.anInt91 = 128;
			entityDef.anInt86 = 128;
			entityDef.aByte68 = 2;
			break;
			
		case 311:
			entityDef.name = "Adam (Ironman tutor)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			break;
			
		case 4306:
			entityDef.name = "Wise old man (Skillcapes)";
			break;
			
		case 306:
			entityDef.name = "LozzCity Guide";
			entityDef.actions = new String[5];
			entityDef.actions[2] = "Take a Tour with the";
			break;
			
		case 7303:
			entityDef.name = "Recolored item salesman";
			entityDef.actions = new String[5];
			entityDef.actions[2] = "Trade with";
			break;
			
		case 7039:
			entityDef.name = "Crystal dragon";
			entityDef.combatLevel = 245;
			break;
			
		case 7037:
			entityDef.name = "Crystal avansie";
			entityDef.combatLevel = 180;
			break;
			
		case 7036:
			entityDef.name = "Crystal demon";
			entityDef.combatLevel = 140;
			break;
			
			
		case 6922:
			entityDef.name = "Mining points shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 2662:
			entityDef.name = "PVM points shop";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 3463:
			entityDef.name = "Boss points shop";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 3225:
			entityDef.name = "Smithing points shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 5810:
			entityDef.name = "Crafting points shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 3825:
			entityDef.name = "Thieving points shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 7284:
			entityDef.name = "Herblore point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 3223:
			entityDef.name = "Prayer point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 4397:
			entityDef.name = "Runecrafting point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 4227:
			entityDef.name = "Fletching point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 3226:
			entityDef.name = "Woodcutting point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 6426:
			entityDef.name = "Firemaking point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 6937:
			entityDef.name = "Cooking point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 2913:
			entityDef.name = "Fishing point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 5958:
			entityDef.name = "Farming point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;
			
		case 276:
			entityDef.name = "Trivia point shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Trade";
			break;

		case 1518:
			entityDef.name = "Shimps & Anchovies";
			break;

		case 1526:
			entityDef.name = "Trout & Salmon";
			break;

		case 1520:
			entityDef.name = "Shark";
			break;

		case 1534:
			entityDef.name = "Monkfish";
			break;

		case 1536:
			entityDef.name = "Dark crab";
			break;
			
		case 1103:
			entityDef.actions = new String[5];
			entityDef.name = "Game Instructor";
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[3] = "Open Store";
			break;
			
		case 13178:
		case 495:
		case 5907:
		case 318:
		case 497:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			break;
			
		case 3680:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Travel";
			break;
			
		case 3231:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Tan";
			break;
			
		case 394:
		case 2182:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Bank";
			break;
			
			
		case 3951:
			entityDef.name = "LozzCity Guard";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			break;
			
		case 6749:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			break;
			
		case 5885:
			entityDef.name = "James (Drop tables)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[3] = "Open Drop Tables";
			break;
			
		case 5527:
			entityDef.name = "Achievement shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			break;
			
		case 6524:
			entityDef.name = "Decantor";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[3] = "Decant";
			break;
			
		case 7042:
			entityDef.name = "Donator Spirit";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			entityDef.actions[3] = "Teleport";
			break;
			
		case 1603:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			break;
			
		case 1419:
			entityDef.name = "Pet Raccoon";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 4140:
			entityDef.actions = new String[5];
			entityDef.combatLevel = 0;
			entityDef.actions[0] = "Pickup";
			entityDef.anInt91 = 20;
			entityDef.anInt86 = 20;
			entityDef.description = "A pet for killing the Corrupt sorceress!".getBytes();
			break;
			
		case 1578:
			entityDef.name = "Corrupt sorceress";
			entityDef.combatLevel = 126;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anInt86 = 250;
			entityDef.anInt91 = 250;
			break;
			
		case 1233:
			entityDef.name = "Enraged Cerberus";
			entityDef.description = "Cerberus is HUGE and MAD!".getBytes();
			entityDef.combatLevel = 636;
			entityDef.walkAnim = 4488;
			entityDef.standAnim = 4484;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 29270;
			entityDef.anInt91 = 200;
			entityDef.anInt86 = 200;
			entityDef.aByte68 = 6;
			break;
			
		case 1498:
			entityDef.name = "Enraged General Graador";
			entityDef.description = "General graador is HUGE and MAD!".getBytes();
			entityDef.combatLevel = 872;
			entityDef.walkAnim = 7016;
			entityDef.standAnim = 7017;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anIntArray94 = new int[2];
			entityDef.anIntArray94[0] = 27660;
			entityDef.anIntArray94[1] = 27665;
			entityDef.anInt91 = 200;
			entityDef.anInt86 = 200;
			entityDef.aByte68 = 5;
			break;
			
		case 1234:
			entityDef.name = "Pet dark beast";
			entityDef.description = "Cerberus is HUGE and MAD!".getBytes();
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 2729;
			entityDef.standAnim = 2730;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 26395;
			entityDef.anInt91 = 75;
			entityDef.anInt86 = 75;
			entityDef.aByte68 = 1;
			break;
			
		case 1833:
			entityDef.name = "Enraged Skotizo";
			entityDef.description = "Skotizo is HUGE and MAD!".getBytes();
			entityDef.combatLevel = 954;
			entityDef.walkAnim = 4674;
			entityDef.standAnim = 4675;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Attack";
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 31653;
			entityDef.anInt91 = 130;
			entityDef.anInt86 = 130;
			entityDef.aByte68 = 6;
			break;
			
		case 76:
			entityDef.name = "Pet Flambeed";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "A pet for killing Flambeed!".getBytes();
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 1748;
			entityDef.standAnim = 1749;
			entityDef.anIntArray94 = new int[3];
			entityDef.anIntArray94[0] = 13905;
			entityDef.anIntArray94[1] = 13906;
			entityDef.anIntArray94[2] = 13907;
			entityDef.anInt91 = 20;
			entityDef.anInt86 = 20;
			entityDef.aByte68 = 1;
			break;
			
		case 7264:
			entityDef.name = "Pet Skotizo";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "A pet for killing Skotizo!".getBytes();
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 4674;
			entityDef.standAnim = 4675;
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 31653;
			entityDef.anInt91 = 20;
			entityDef.anInt86 = 20;
			entityDef.aByte68 = 1;
			break;
			
		case 5000:
			entityDef.name = "Mini Ancient Warlock";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "A pet for killing the Ancient Warlock!".getBytes();
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 5479;
			entityDef.standAnim = 5483;
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 21193;
			entityDef.anInt91 = 75;
			entityDef.anInt86 = 75;
			entityDef.aByte68 = 1;
			break;
			
		case 5001:
			entityDef.name = "Mini Ancient Archer";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "A pet for killing the Ancient Archer!".getBytes();
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 5511;
			entityDef.standAnim = 5510;
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 21189;
			entityDef.anInt91 = 75;
			entityDef.anInt86 = 75;
			entityDef.aByte68 = 1;
			break;
			
		case 5002:
			entityDef.name = "Mini Ancient Samurai";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "A pet for killing the Ancient Samurai!".getBytes();
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 2562;
			entityDef.standAnim = 2561;
			entityDef.anIntArray94 = new int[6];
			entityDef.anIntArray94[0] = 26628;
			entityDef.anIntArray94[1] = 26637;
			entityDef.anIntArray94[2] = 26641;
			entityDef.anIntArray94[3] = 23932;
			entityDef.anIntArray94[4] = 26623;
			entityDef.anIntArray94[5] = 11793;
			entityDef.anInt91 = 75;
			entityDef.anInt86 = 75;
			entityDef.aByte68 = 1;
			break;
			
		
			
		case 2333:
			entityDef.name = "Pet Karamel";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "A pet for eating Karamel... I mean, Killing Karamel!".getBytes();
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 819;
			entityDef.standAnim = 808;
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 13337;
			entityDef.anInt91 = 75;
			entityDef.anInt86 = 75;
			entityDef.aByte68 = 1;
			break;
			
		case 2334:
			entityDef.name = "Pet Agrith Na-Na";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "Agrith Na-Na-Nanana...!".getBytes();
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 3499;
			entityDef.standAnim = 3498;
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 13693;
			entityDef.anInt91 = 70;
			entityDef.anInt86 = 70;
			entityDef.aByte68 = 1;
			break;
			
		case 2335:
			entityDef.name = "Dessourt";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "Look at that Dessourt!".getBytes();
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 3506;
			entityDef.standAnim = 3504;
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 13694;
			entityDef.anInt91 = 75;
			entityDef.anInt86 = 75;
			entityDef.aByte68 = 1;
			break;
			
		case 2336:
			entityDef.name = "Gelatinnoth spawn";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "A White Gelatinnoth spawn!".getBytes();
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 13442;
			entityDef.anIntArray76 = new int[1];
			entityDef.anIntArray76[0] = 935;
			entityDef.anIntArray70 = new int[1];
			entityDef.anIntArray70[0] = 103;
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 1339;
			entityDef.standAnim = 1338;
			entityDef.anInt91 = 55;
			entityDef.anInt86 = 55;
			entityDef.aByte68 = 1;
			break;
			
		case 2337:
			entityDef.name = "Gelatinnoth spawn";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "A Blue Gelatinnoth spawn!".getBytes();
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 13442;
			entityDef.anIntArray76 = new int[1];
			entityDef.anIntArray76[0] = 935;
			entityDef.anIntArray70 = new int[1];
			entityDef.anIntArray70[0] = 41932;
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 1339;
			entityDef.standAnim = 1338;
			entityDef.anInt91 = 55;
			entityDef.anInt86 = 55;
			entityDef.aByte68 = 1;
			break;
			
		case 2338:
			entityDef.name = "Gelatinnoth spawn";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "A Red Gelatinnoth spawn!".getBytes();
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 13442;
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 1339;
			entityDef.standAnim = 1338;
			entityDef.anInt91 = 60;
			entityDef.anInt86 = 60;
			entityDef.aByte68 = 1;
			break;
			
		case 2339:
			entityDef.name = "Gelatinnoth spawn";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "A Green Gelatinnoth spawn!".getBytes();
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 13442;
			entityDef.anIntArray76 = new int[1];
			entityDef.anIntArray76[0] = 935;
			entityDef.anIntArray70 = new int[1];
			entityDef.anIntArray70[0] = 18343;
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 1339;
			entityDef.standAnim = 1338;
			entityDef.anInt91 = 55;
			entityDef.anInt86 = 55;
			entityDef.aByte68 = 1;
			break;
			
		case 2340:
			entityDef.name = "Gelatinnoth spawn";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "A Brown Gelatinnoth spawn!".getBytes();
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 13442;
			entityDef.anIntArray76 = new int[1];
			entityDef.anIntArray76[0] = 935;
			entityDef.anIntArray70 = new int[1];
			entityDef.anIntArray70[0] = 6550;
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 1339;
			entityDef.standAnim = 1338;
			entityDef.anInt91 = 55;
			entityDef.anInt86 = 55;
			entityDef.aByte68 = 1;
			break;
			
		case 2341:
			entityDef.name = "Gelatinnoth spawn";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "A Orange Gelatinnoth spawn!".getBytes();
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 13442;
			entityDef.anIntArray76 = new int[1];
			entityDef.anIntArray76[0] = 935;
			entityDef.anIntArray70 = new int[1];
			entityDef.anIntArray70[0] = 5056;
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 1339;
			entityDef.standAnim = 1338;
			entityDef.anInt91 = 55;
			entityDef.anInt86 = 55;
			entityDef.aByte68 = 1;
			break;
			
		case 84:
			entityDef.name = "Ancient Warlock";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Attack";
			entityDef.aByte68 = 3;
			entityDef.anInt91 = 250;
			entityDef.anInt86 = 250;
			break;
			
		case 3358:
			entityDef.name = "Ancient Archer";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Attack";
			entityDef.aByte68 = 3;
			entityDef.anInt91 = 250;
			entityDef.anInt86 = 250;
			break;
			
		case 1540:
			entityDef.name = "Ancient Samurai";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Attack";
			entityDef.aByte68 = 3;
			entityDef.anInt91 = 250;
			entityDef.anInt86 = 250;
			break;
			
		case 2342:
			entityDef.name = "Pet Gorilla";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "A Pet Demonic Gorilla!".getBytes();
			entityDef.anIntArray94 = new int[1];
			entityDef.anIntArray94[0] = 31241;
			entityDef.anIntArray76 = new int[1];
			entityDef.anIntArray76[0] = 10266;
			entityDef.anIntArray70 = new int[1];
			entityDef.anIntArray70[0] = 28;
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 7233;
			entityDef.standAnim = 7230;
			entityDef.anInt91 = 35;
			entityDef.anInt86 = 35;
			entityDef.aByte68 = 1;
			break;
			
		case 4876:
			entityDef.name = "Pet Culinaromancer";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.description = "Ghostly chef..".getBytes();
			entityDef.combatLevel = 0;
			entityDef.anInt91 = 75;
			entityDef.anInt86 = 75;
			break;
			
			
		case 7519:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.actions[1] = null;
			break;
			
		case 1256:
			entityDef.name = "Pet evil creature";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1257:
			entityDef.name = "Fluffy";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 4823:
			entityDef.name = "Pet goldfish";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 436:
			entityDef.name = "Pet pyrefiend";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 102:
			entityDef.name = "Pet rockcrab";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 5268:
			entityDef.name = "Baby monkey";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 3845:
			entityDef.name = "Pet Broom?";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1475:
			entityDef.name = "Chompy chick";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			break;
			
		case 4863:
			entityDef.name = "Jubbly chick";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 60;
			entityDef.anInt91 = 60;
			entityDef.aByte68 = 1;
			break;
			
		case 4864:
			entityDef.name = "Lazy jubbly chick";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 60;
			entityDef.anInt91 = 60;
			entityDef.aByte68 = 1;
			break;
			
		case 2906:
			entityDef.name = "Pet salamander";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 244:
			entityDef.name = "Pet baby red dragon";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			entityDef.aByte68 = 1;
			break;
			
		case 2903:
			entityDef.name = "Pet salamander";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 3449:
			entityDef.name = "Pet shadow hound";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 2904:
			entityDef.name = "Pet salamander";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 2905:
			entityDef.name = "Pet salamander";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 2910:
			entityDef.name = "Pet chinchompa";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 2911:
			entityDef.name = "Pet chinchompa";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 2912:
			entityDef.name = "Pet chinchompa";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
			
		case 1346:
			entityDef.name = "Pet kebbit";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1342:
			entityDef.name = "Pet falcon";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 0:
			entityDef.name = "Leprechaun follower";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 4927:
			entityDef.name = "Pet Phoenix";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 296:
			entityDef.name = "Dwarf follower";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			break;
			
		case 2644:
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			break;
			
		case 1163:
			entityDef.name = "Pet tree spirit";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			break;
			
		case 5728:
			entityDef.name = "Inslaved imp";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 5341:
			entityDef.name = "Spiritual follower";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			break;
			
		case 2583:
			entityDef.name = "Pet Abyssal leech";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 2781:
			entityDef.name = "Toy Mouse";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1062:
			entityDef.name = "Hell rat";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1065:
			entityDef.name = "Hell goblin";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 80;
			entityDef.anInt91 = 80;
			break;
			
		case 3578:
			entityDef.combatLevel = 97;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Attack";
			break;
			
		case 7477:
			entityDef.name = "Platinum Token Salesman";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[1] = "Trade with";
			break;
			
		case 1067:
			entityDef.name = "Mutant";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1072:
			entityDef.name = "Soulless one";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			break;
			
		case 4324:
			entityDef.name = "Zanik";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 4326:
			entityDef.name = "Inslaved imp";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 4228:
			entityDef.name = "Guard Dog";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 111:
			entityDef.name = "German Shepard";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1830:
			entityDef.name = "Pet shark";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1831:
			entityDef.name = "White swan";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1832:
			entityDef.name = "Black swan";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 1854:
			entityDef.name = "Crimson monarch";
			entityDef.combatLevel = 1337;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;
			
		case 3627:
			entityDef.name = "Ghostly follower";
			entityDef.combatLevel = 666;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			entityDef.anInt86 = 75;
			entityDef.anInt91 = 75;
			break;
			
		case 1853:
			entityDef.name = "Pet rabbit";
			entityDef.combatLevel = 0;
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pickup";
			break;

		case 4000:
			entityDef.name = "Prince black dragon";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 17414, 17415, 17429, 17422 };
			entityDef.walkAnim = 4635;
			entityDef.standAnim = 90;
			entityDef.anInt86 = 50;
			entityDef.anInt91 = 50;
			break;

		case 4001:
			entityDef.name = "Pet general graardor";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 27660, 27665 };
			entityDef.walkAnim = 7016;
			entityDef.standAnim = 7017;
			entityDef.anInt86 = 40;
			entityDef.anInt91 = 40;
			break;

		case 4002:
			entityDef.name = "Pet corporeal beast";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 11056 };
			entityDef.walkAnim = 1684;
			entityDef.standAnim = 1678;
			entityDef.anInt86 = 100;
			entityDef.anInt91 = 100;
			break;

		case 4003:
			entityDef.name = "Pet kree'Arra";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 28019, 28021, 28020 };
			entityDef.walkAnim = 6977;
			entityDef.standAnim = 6976;
			entityDef.anInt86 = 25;
			entityDef.anInt91 = 25;
			break;

		case 4004:
			entityDef.name = "Pet k'ril tsutsaroth";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 27683, 27681, 27692, 27682, 27690 };
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 4070;
			entityDef.standAnim = 6935;
			entityDef.anInt86 = 25;
			entityDef.anInt91 = 25;
			break;

		case 4009:
			entityDef.name = "Pet commander zilyana";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 27989, 27937, 27985, 27968, 27990 };
			entityDef.combatLevel = 0;
			entityDef.walkAnim = 6965;
			entityDef.standAnim = 6966;
			entityDef.anInt86 = 70;
			entityDef.anInt91 = 70;
			break;

		case 4006:
			entityDef.name = "Pet dagannoth supreme";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 9941, 9943 };
			entityDef.standAnim = 2850;
			entityDef.walkAnim = 2849;
			entityDef.anInt86 = 70;
			entityDef.anInt91 = 70;
			break;

		case 4007:
			entityDef.name = "Pet dagannoth prime"; // 9940, 9943, 9942
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 9940, 994, 9942 };
			entityDef.walkAnim = 2849;
			entityDef.standAnim = 2850;
			entityDef.anInt86 = 70;
			entityDef.anInt91 = 70;
			break;

		case 4008:
			entityDef.name = "Pet dagannoth rex";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 9941 };
			entityDef.walkAnim = 2849;
			entityDef.standAnim = 2850;
			entityDef.anInt86 = 70;
			entityDef.anInt91 = 70;
			break;
			
		case 4010:
			entityDef.name = "Tzrek-jad";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.anIntArray94 = new int[] { 9319 };
			entityDef.walkAnim = 2651;
			entityDef.standAnim = 2650;
			entityDef.anInt86 = 25;
			entityDef.anInt91 = 25;
			break;
			
		case 963:
			entityDef.anIntArray94 = new int[] { 24602, 24605, 24606 };
			entityDef.walkAnim = 6236;
			entityDef.standAnim = 6236;
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			break;
			
		case 964:
			entityDef.anIntArray94 = new int[] { 24597, 24598 };
			entityDef.walkAnim = 6238;
			entityDef.standAnim = 6239;
			entityDef.anInt86 = 128;
			entityDef.anInt91 = 128;
			break;
			
		case 5547:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			break;
			
		case 5559:
		case 5560:
		case 6637:
		case 6638:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Metamorphosis";
			break;
			
		case 2130:
		case 2131:
		case 2132:
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Pick-up";
			entityDef.actions[1] = "Metamorphosis";
			break;
			
		case 5860:// Big Mo
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Open titles";
			break;
			
		case 155: // title shop
			entityDef.name = "The Titler";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Open titles";
			break;

		case 518:// General Store
		case 519:
			entityDef.name = "General Store";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Store";
			break;
			
		case 6525:// Decantor
			entityDef.name = "Decantor";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			break;

		case 3984:// Potion Pack
			entityDef.name = "Packs shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Store";
			break;

		case 403:// Vannaka
			entityDef.name = "Vannaka (Slayer master)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			break;
			
		case 6797:// nieve
			entityDef.name = "Nieve (Boss tasks)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			break;

		case 1758:// Void knight store
			entityDef.name = "Void knight";
			entityDef.actions[0] = "Store";
			break;

		case 1756:// Void knight
			entityDef.name = "Void knight";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			break;
			
		case 3215:// Prestige
			entityDef.name = "Patchy (Prestige shop)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			entityDef.actions[3] = "Prestige";
			break;

		case 490:// Neive
			entityDef.name = "Nieve (Boss Tasks)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			break;

		case 326:// Genie
			entityDef.name = "Genie (EXP Reset)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[2] = "Reset";
			break;

		case 4936:// Mage of Zamorak
			entityDef.name = "Mage of Zamorak";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			entityDef.actions[3] = "Teleport";
			break;

		case 22:// Merchant
			entityDef.name = "Merchant";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Sell Goods";
			break;

		case 505:// Skilling
			entityDef.name = "Skilling supply shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 225:// Cook
			entityDef.name = "Food/Potion shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 527:// Weapons
			entityDef.name = "Weapons shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 528:// Armour
			entityDef.name = "Armour shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 7240:// Range
			entityDef.name = "(Range shop)";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 5314:// Magic
			entityDef.name = "Magic shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 603:// pure shop
			entityDef.name = "Pure Shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 534:// Clothing
			entityDef.name = "Outfit shop";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Open Store";
			break;

		case 315:// Emblem Trader
			entityDef.name = "Emblem Trader";
			entityDef.actions = new String[5];
			entityDef.actions[0] = "Talk-to";
			entityDef.actions[1] = "Trade";
			entityDef.actions[3] = "Skull";
			break;

		}

		return entityDef;
	}

	public static EntityDef forID(int i) {
		return forID(i, true);
	}

	public Model method160() {
		if (childrenIDs != null) {
			EntityDef entityDef = method161();
			if (entityDef == null)
				return null;
			else
				return entityDef.method160();
		}
		if (anIntArray73 == null)
			return null;
		boolean flag1 = false;
		for (int i = 0; i < anIntArray73.length; i++)
			if (!Model.method463(anIntArray73[i]))
				flag1 = true;

		if (flag1)
			return null;
		Model aclass30_sub2_sub4_sub6s[] = new Model[anIntArray73.length];
		for (int j = 0; j < anIntArray73.length; j++)
			aclass30_sub2_sub4_sub6s[j] = Model.method462(anIntArray73[j]);

		Model model;
		if (aclass30_sub2_sub4_sub6s.length == 1)
			model = aclass30_sub2_sub4_sub6s[0];
		else
			model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
		if (anIntArray76 != null) {
			for (int k = 0; k < anIntArray76.length; k++)
				model.method476(anIntArray76[k], anIntArray70[k]);

		}
		return model;
	}

	public EntityDef method161() {
		int j = -1;
		if (anInt57 != -1) {
			VarBit varBit = VarBit.cache[anInt57];
			int k = varBit.anInt648;
			int l = varBit.anInt649;
			int i1 = varBit.anInt650;
			int j1 = Client.anIntArray1232[i1 - l];
			j = clientInstance.variousSettings[k] >> l & j1;
		} else if (anInt59 != -1)
			j = clientInstance.variousSettings[anInt59];
		if (j < 0 || j >= childrenIDs.length || childrenIDs[j] == -1)
			return null;
		else
			return forID(childrenIDs[j]);
	}

	public static void unpackConfig(StreamLoader streamLoader) {
		stream = new Stream(streamLoader.getDataForName("npc.dat"));
		Stream stream2 = new Stream(streamLoader.getDataForName("npc.idx"));
		int totalNPCs = stream2.readUnsignedWord();
		//System.out.println("Npcs Loaded: " + totalNPCs);
		streamIndices = new int[totalNPCs + 50000];
		int i = 2;
		for (int j = 0; j < totalNPCs; j++) {
			streamIndices[j] = i;
			i += stream2.readUnsignedWord();
		}

		cache = new EntityDef[20];
		for (int k = 0; k < 20; k++)
			cache[k] = new EntityDef();
		for (int index = 0; index < totalNPCs; index++) {
			EntityDef ed = forID(index);
			if (ed == null)
				continue;
			if (ed.name == null)
				continue;
		}
		boolean dump = false;
		if (dump) {
			try {
				FileWriter fw = new FileWriter(System.getProperty("user.home")+"/Desktop/NPC Dump.txt");
				for(int id = 0; id < totalNPCs; id++) {
					EntityDef ed = EntityDef.forID(id);
					fw.write("case "+id+":");
					fw.write(System.getProperty("line.separator"));
					fw.write("entityDef.name = \""+ed.name+"\";");
					fw.write(System.getProperty("line.separator"));
					fw.write("entityDef.description = \""+ed.description+"\";");
					fw.write(System.getProperty("line.separator"));
					fw.write("entityDef.combatLevel = "+ed.combatLevel+";");
					fw.write(System.getProperty("line.separator"));
					fw.write("entityDef.walkAnim = "+ed.walkAnim+";");
					fw.write(System.getProperty("line.separator"));
					fw.write("entityDef.standAnim = "+ed.standAnim+";");
					fw.write(System.getProperty("line.separator"));
					if(ed.actions != null) {
						fw.write("entityDef.actions = new String["+ed.actions.length+"];");
						fw.write(System.getProperty("line.separator"));
						for(int range = 0; range < ed.actions.length; range++) {
							if(ed.actions[range] != null) {
								fw.write("entityDef.actions["+range+"] = \""+ed.actions[range]+"\";");
								fw.write(System.getProperty("line.separator"));
							}
						}
					}
					if(ed.anIntArray94 != null) { 
						fw.write("entityDef.models = new int["+ed.anIntArray94.length+"];");
						fw.write(System.getProperty("line.separator"));
						for(int range = 0; range < ed.anIntArray94.length; range++) {
							fw.write("entityDef.models["+range+"] = "+ed.anIntArray94[range]+";");
							fw.write(System.getProperty("line.separator"));
						}
					}
					if(ed.anIntArray76 != null) {
						fw.write("entityDef.originalModelColors = new int["+ed.anIntArray76.length+"];");
						fw.write(System.getProperty("line.separator"));
						for(int range = 0; range < ed.anIntArray76.length; range++) {
							fw.write("entityDef.originalModelColors["+range+"] = "+ed.anIntArray76[range]+";");
							fw.write(System.getProperty("line.separator"));
						}
					}
					if(ed.anIntArray70 != null) {
						fw.write("entityDef.modifiedModelColors = new int["+ed.anIntArray70.length+"];");
						fw.write(System.getProperty("line.separator"));
						for(int range = 0; range < ed.anIntArray70.length; range++) {
							fw.write("entityDef.modifiedModelColors["+range+"] = "+ed.anIntArray70[range]+";");
							fw.write(System.getProperty("line.separator"));
						}
					}
					fw.write("entityDef.anInt91 = "+ed.anInt91+";");
					fw.write(System.getProperty("line.separator"));
					fw.write("entityDef.anInt86 = "+ed.anInt86+";");
					fw.write(System.getProperty("line.separator"));
					fw.write("entityDef.aByte68 = "+ed.aByte68+";");
					fw.write(System.getProperty("line.separator"));
					fw.write("break;"); 
					fw.write(System.getProperty("line.separator"));
					fw.write(System.getProperty("line.separator"));
				}
				fw.close();
				System.out.println("NPC Dump Finished.");
				System.out.println("Total NPCs: "+totalNPCs);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void nullLoader() {
		mruNodes = null;
		streamIndices = null;
		cache = null;
		stream = null;
	}

	 public Model method164(int j, int currAnim, int nextAnim, int currCycle, int nextCycle, int ai[]) {
	        if (childrenIDs != null) {
	            final EntityDef type = method161();
	            if (type == null) {
	                return null;
	            } else {
	                return type.method164(j, currAnim, ai);
	            }
	        }
	        Model model = (Model) mruNodes.insertFromCache(interfaceType);
	        if (model == null) {
	            boolean flag = false;
	            for (int i1 = 0; i1 < anIntArray94.length; i1++) {
	                if (!Model.method463(anIntArray94[i1])) {
	                    flag = true;
	                }
	            }
	            if (flag) {
	                return null;
	            }
	            final Model[] parts = new Model[anIntArray94.length];
	            for (int j1 = 0; j1 < anIntArray94.length; j1++) {
	                parts[j1] = Model.method462(anIntArray94[j1]);
	            }
	            if (parts.length == 1) {
	                model = parts[0];
	            } else {
	                model = new Model(parts.length, parts);
	            }
	            if(anIntArray70 != null)
				{
					for(int k1 = 0; k1 < anIntArray70.length; k1++)
						model.method476(anIntArray70[k1], anIntArray76[k1]);

				}
	            model.method469();
	            model.method479(64 + anInt85, 1500 + anInt92, -30, -50, -30, true);
	            mruNodes.removeFromCache(model, interfaceType);
	        }
	        final Model model_1 = Model.aModel_1621;
	        model_1.method464(model, SequenceFrame.method532(currAnim) & SequenceFrame.method532(j));
	        if (currAnim != -1 && j != -1) {
	            model_1.method478(anInt91, anInt91, anInt86);
	        } else if (currAnim != -1) {
	             model_1.interpolateFrames(currAnim, nextAnim, nextCycle, currCycle);
	        }
	        if (anInt91 != 128 || anInt86 != 128) {
	            model_1.method478(anInt91, anInt86, anInt91);
	        }
	        model_1.method466();
			model_1.anIntArrayArray1658 = null;
			model_1.anIntArrayArray1657 = null;
			if(aByte68 == 1)
				model_1.aBoolean1659 = true;
			return model_1;
		}
	
	public Model method164(int j, int k, int ai[]) {
		if (childrenIDs != null) {
			EntityDef entityDef = method161();
			if (entityDef == null)
				return null;
			else
				return entityDef.method164(j, k, ai);
		}
		Model model = (Model) mruNodes.insertFromCache(interfaceType);
		if (model == null) {
			boolean flag = false;
			for (int i1 = 0; i1 < anIntArray94.length; i1++)
				if (!Model.method463(anIntArray94[i1]))
					flag = true;

			if (flag)
				return null;
			Model aclass30_sub2_sub4_sub6s[] = new Model[anIntArray94.length];
			for (int j1 = 0; j1 < anIntArray94.length; j1++)
				aclass30_sub2_sub4_sub6s[j1] = Model.method462(anIntArray94[j1]);

			if (aclass30_sub2_sub4_sub6s.length == 1)
				model = aclass30_sub2_sub4_sub6s[0];
			else
				model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
			if (anIntArray76 != null) {
				for (int k1 = 0; k1 < anIntArray76.length; k1++)
					model.method476(anIntArray76[k1], anIntArray70[k1]);

			}
			model.method469();
			model.method479(64 + anInt85, 1500 + anInt92, -30, -50, -30, true);
			mruNodes.removeFromCache(model, interfaceType);
		}
		Model model_1 = Model.aModel_1621;
		model_1.method464(model, SequenceFrame.method532(k) & SequenceFrame.method532(j));
		if (k != -1 && j != -1)
			model_1.method471(ai, j, k);
		else if (k != -1)
			model_1.method470(k);
		if (anInt91 != 128 || anInt86 != 128)
			model_1.method478(anInt91, anInt91, anInt86);
		model_1.method466();
		model_1.anIntArrayArray1658 = null;
		model_1.anIntArrayArray1657 = null;
		if (aByte68 == 1)
			model_1.aBoolean1659 = true;
		return model_1;
	}

	public void readValues(Stream stream) {
		do {
			int i = stream.readUnsignedByte();
			if (i == 0)
				return;
			if (i == 1) {
				int j = stream.readUnsignedByte();
				anIntArray94 = new int[j];
				for (int j1 = 0; j1 < j; j1++)
					anIntArray94[j1] = stream.readUnsignedWord();

			} else if (i == 2)
				name = stream.readString();
			else if (i == 3)
				description = stream.readBytes();
			else if (i == 12)
				aByte68 = stream.readSignedByte();
			else if (i == 13)
				standAnim = stream.readUnsignedWord();
			else if (i == 14)
				walkAnim = stream.readUnsignedWord();
			else if (i == 17) {
				walkAnim = stream.readUnsignedWord();
				anInt58 = stream.readUnsignedWord();
				anInt83 = stream.readUnsignedWord();
				anInt55 = stream.readUnsignedWord();
			} else if (i >= 30 && i < 40) {
				if (actions == null)
					actions = new String[5];
				actions[i - 30] = stream.readString();
				if (actions[i - 30].equalsIgnoreCase("hidden"))
					actions[i - 30] = null;
			} else if (i == 40) {
				int k = stream.readUnsignedByte();
				anIntArray76 = new int[k];
				anIntArray70 = new int[k];
				for (int k1 = 0; k1 < k; k1++) {
					anIntArray76[k1] = stream.readUnsignedWord();
					anIntArray70[k1] = stream.readUnsignedWord();
				}

			} else if (i == 60) {
				int l = stream.readUnsignedByte();
				anIntArray73 = new int[l];
				for (int l1 = 0; l1 < l; l1++)
					anIntArray73[l1] = stream.readUnsignedWord();

			} else if (i == 90)
				stream.readUnsignedWord();
			else if (i == 91)
				stream.readUnsignedWord();
			else if (i == 92)
				stream.readUnsignedWord();
			else if (i == 93)
				aBoolean87 = false;
			else if (i == 95)
				combatLevel = stream.readUnsignedWord();
			else if (i == 97)
				anInt91 = stream.readUnsignedWord();
			else if (i == 98)
				anInt86 = stream.readUnsignedWord();
			else if (i == 99)
				aBoolean93 = true;
			else if (i == 100)
				anInt85 = stream.readSignedByte();
			else if (i == 101)
				anInt92 = stream.readSignedByte() * 5;
			else if (i == 102)
				anInt75 = stream.readUnsignedWord();
			else if (i == 103)
				anInt79 = stream.readUnsignedWord();
			else if (i == 106) {
				anInt57 = stream.readUnsignedWord();
				if (anInt57 == 65535)
					anInt57 = -1;
				anInt59 = stream.readUnsignedWord();
				if (anInt59 == 65535)
					anInt59 = -1;
				int i1 = stream.readUnsignedByte();
				childrenIDs = new int[i1 + 1];
				for (int i2 = 0; i2 <= i1; i2++) {
					childrenIDs[i2] = stream.readUnsignedWord();
					if (childrenIDs[i2] == 65535)
						childrenIDs[i2] = -1;
				}

			} else if (i == 107)
				aBoolean84 = false;
		} while (true);
	}

	public EntityDef() {
		anInt55 = -1;
		anInt57 = -1;
		anInt58 = -1;
		anInt59 = -1;
		combatLevel = -1;
		anInt64 = 1834;
		walkAnim = -1;
		aByte68 = 1;
		anInt75 = -1;
		standAnim = -1;
		interfaceType = -1L;
		anInt79 = 32;
		anInt83 = -1;
		aBoolean84 = true;
		anInt86 = 128;
		aBoolean87 = true;
		anInt91 = 128;
		aBoolean93 = false;
	}

	public int anInt55;
	public static int anInt56;
	public int anInt57;
	public int anInt58;
	public int anInt59;
	public static Stream stream;
	public int combatLevel;
	public final int anInt64;
	public String name;
	public String actions[];
	public int walkAnim;
	public byte aByte68;
	public int[] anIntArray70;
	public static int[] streamIndices;
	public int[] anIntArray73;
	public int anInt75;
	public int[] anIntArray76;
	public int standAnim;
	public long interfaceType;
	public int anInt79;
	public static EntityDef[] cache;
	public static Client clientInstance;
	public int anInt83;
	public boolean aBoolean84;
	public int anInt85;
	public int anInt86;
	public boolean aBoolean87;
	public int childrenIDs[];
	public byte description[];
	public int anInt91;
	public int anInt92;
	public boolean aBoolean93;
	public int[] anIntArray94;
	public static MRUNodes mruNodes = new MRUNodes(30);

}
