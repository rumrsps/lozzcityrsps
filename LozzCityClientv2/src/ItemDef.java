public final class ItemDef {
	
	public static void applyTexturing(Model model, int id) {
		switch (id) {
		case 11992:
			//System.out.println("Lava Scale-------------------------");
			model.setTexture(47155, 40);
			//Model.printModelColours(model);
			//System.out.println("Lava Scale-------------------------");
			break;
		case 11943:
			//System.out.println("Lava bone-------------------------");
			model.setTexture(40);
			//Model.printModelColours(model);
			//System.out.println("Lava bone-------------------------");
			break;
		case 12046:
			//System.out.println("Lava phat-------------------------");
			model.setTexture(40);
			//Model.printModelColours(model);
			//System.out.println("Lava phat-------------------------");
			break;
		case 13329:
			//System.out.println("Lava maxcape-------------------------");
			model.setTexture(127, 40);
			//model.setTexture(5683, 40);
			//Model.printModelColours(model);
			//System.out.println("Lava maxcape-------------------------");
			break;
		//case 13330:
			//System.out.println("Lava maxhood-------------------------");
		//	model.setTexture(16, 40);
			//model.setTexture(5683, 40);
		//	Model.printModelColours(model);
		//	System.out.println("Lava maxhood-------------------------");
		//	break;
		case 12106:
			//System.out.println("Lava santa-------------------------");
			model.setTexture(40);
			//Model.printModelColours(model);
			//System.out.println("Lava santa-------------------------");
			break;
		case 12076:
			//System.out.println("Lava hween-------------------------");
			model.setTexture(40);
			//model.setTexture(40);
		//	Model.printModelColours(model);
		//	System.out.println("Lava hween-------------------------");
			break;
		case 5030:
			//System.out.println("water ss-------------------------");
			model.setTexture(25);
			//Model.printModelColours(model);
			//System.out.println("water ss-------------------------");
			break;
		case 3791:
			//System.out.println("Lava boots-------------------------");
			model.setTexture(40);
			//Model.printModelColours(model);
			//System.out.println("Lava boots-------------------------");
			break;
		case 3799:
			//System.out.println("Lava gloves-------------------------");
			model.setTexture(40);
			//Model.printModelColours(model);
			//System.out.println("Lava gloves-------------------------");
			break;
		case 5024:
			//System.out.println("Stone ss-------------------------");
			model.setTexture(2);
			//Model.printModelColours(model);
			//System.out.println("Stone ss-------------------------");
			break;
		case 5026:
			//System.out.println("Ice ss-------------------------");
			model.setTexture(26);
			//Model.printModelColours(model);
			//System.out.println("Ice ss-------------------------");
			break;
		case 5028:
			//System.out.println("Wooden ss-------------------------");
			model.setTexture(36);
			//Model.printModelColours(model);
			//System.out.println("Wooden ss-------------------------");
			break;
		case 5032:
			//System.out.println("nature ss-------------------------");
			model.setTexture(41);
			//Model.printModelColours(model);
			//System.out.println("nature ss-------------------------");
			break;
		case 5018:
			//System.out.println("Lava ss-------------------------");
			//model.setTexture(15951, 40);
			//model.setTexture(15925, 40);
			//model.setTexture(15922, 40);
			//model.setTexture(15916, 40);
			//model.setTexture(15919, 40);
			//model.setTexture(40);
			model.setTexture(19102, 40);
			model.setTexture(19404, 40);
			model.setTexture(19129, 40);
			
			//Model.printModelColours(model);
			//System.out.println("Lava ss-------------------------");
			break;
		case 12769:
			//System.out.println("Frozen Mix-------------------------");
			model.setTexture(42);
			//Model.printModelColours(model);
			//System.out.println("Frozen Mix-------------------------");
			break;
		case 12771:
			//System.out.println("Volcanic Mix-------------------------");
			model.setTexture(40);
			//Model.printModelColours(model);
			//System.out.println("Volcanic Mix-------------------------");
			break;
		case 6570:
			model.setTexture(40);
			break;
		case 12773:
			//System.out.println("Volcanic whip-------------------------");
			model.setTexture(16, 40);
			//Model.printModelColours(model);
			//System.out.println("Volcanic whip-------------------------");
			break;
		case 12774:
			//System.out.println("Frozen whip-------------------------");
			model.setTexture(16, 42);
			model.setTexture(42);
			//Model.printModelColours(model);
			//System.out.println("Frozen whip-------------------------");
			break;
		case 12371:
			//System.out.println("Lava mask-------------------------");
			model.setTexture(38119, 40);
			//Model.printModelColours(model);
			//System.out.println("Lava mask-------------------------");
			break;
		}
	}
	
	public static ItemDef forID(int i) {
		for (int j = 0; j < 10; j++)
			if (cache[j].id == i)
				return cache[j];
		
		cacheIndex = (cacheIndex + 1) % 10;
		ItemDef itemDef = cache[cacheIndex];
		stream.currentOffset = streamIndices[i];
		itemDef.id = i;
		itemDef.setDefaults();
		itemDef.readValues(stream);
		if (!isMembers && itemDef.membersObject) {
            itemDef.name = "Members Object";
            itemDef.description = "Login to a members' server to use this object.".getBytes();
            itemDef.groundActions = null;
            itemDef.itemActions = null;
            itemDef.team = 0;
        }
		/* Customs items  */
		switch (i) {
		
			//case 12020:
			//	itemDef.name = "Dice bag";
			//	itemDef.itemActions = new String[5];
			//	itemDef.itemActions[0] = "Roll";
			//	itemDef.description = "It's a dice bag.".getBytes();
			//	break;
				
			case 12020:
				itemDef.name = "100-sided dice";
				itemDef.description = "A 100-sided dice.".getBytes();
				itemDef.modelID = 35150;
				itemDef.modelZoom = 820;
				itemDef.modelRotationY = 175;
				itemDef.modelRotationX = 0;
				itemDef.modelOffset1 = -5;
				itemDef.modelOffset2 = -18;
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Roll";
		       break;
				
			case 12108:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.itemActions[4] = "Drop";
				itemDef.modelID = 32799;
				itemDef.name = "Twisted bow";
				itemDef.modelZoom = 2000;
				itemDef.modelRotationY = 720;
				itemDef.modelRotationX = 1500;
				itemDef.modelOffset1 = 3;
				itemDef.modelOffset2 = 1;
				itemDef.anInt165 = 32674;
				itemDef.anInt200 = 32674;
				itemDef.description = "A mystical bow carved from the twisted remains of the Great Olm.".getBytes();
				break;
				
				case 7812:
					itemDef.name = "Bandos chestplate (i)";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.modelZoom = 984;
					itemDef.groundActions = new String[] { null, null, "Take", null, null };
					itemDef.modelID = 28042;
					itemDef.anInt200 = 27644;//female wield
					itemDef.anInt165 = 27636;//male wield
					itemDef.anInt164 = 28827;//female arm
					itemDef.anInt188 = 28826;//male arm
					itemDef.modelRotationY = 501;
					itemDef.modelRotationX = 6;
					itemDef.modelOffset1 = 1;
					itemDef.modelOffset2 = 4;
					//itemDef.brightness = 100;
					itemDef.description = "An upgraded bandos chestplate.".getBytes();
					break;
					
				
				case 7813:
					itemDef.name = "Bandos tassets (i)";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.modelZoom = 854;
					itemDef.groundActions = new String[] { null, null, "Take", null, null };
					itemDef.modelID = 28047;
					itemDef.anInt200 = 27640;//female wield
					itemDef.anInt165 = 27625;//male wield
					itemDef.modelRotationY = 540;
					itemDef.modelRotationX = 2039;
					itemDef.modelOffset1 = 3;
					itemDef.modelOffset2 = 3;
					//itemDef.brightness = 100;
					itemDef.description = "An upgraded bandos tassets.".getBytes();
					break;
				
				case 7814:
					itemDef.name = "Bandos boots (i)";
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.modelZoom = 724;
					itemDef.groundActions = new String[] { null, null, "Take", null, null };
					itemDef.modelID = 28040;
					itemDef.anInt200 = 19951;//female wield
					itemDef.anInt165 = 27637;//male wield
					itemDef.modelRotationY = 171;
					itemDef.modelRotationX = 0;
					itemDef.modelOffset1 = 0;
					itemDef.modelOffset2 = -7;
					//itemDef.brightness = 100;
					itemDef.description = "An upgraded pair of bandos chest boots.".getBytes();
					break;
					
				case 7815:
						itemDef.name = "Armadyl helmet (i)";
						itemDef.itemActions = new String[5];
						itemDef.itemActions[1] = "Wear";
						itemDef.modelZoom = 789;
						itemDef.groundActions = new String[] { null, null, "Take", null, null };
						itemDef.modelID = 28043;
						itemDef.anInt200 = 27639;//female wield
						itemDef.anInt165 = 27623;//male wield
						itemDef.modelRotationY = 66;
						itemDef.modelRotationX = 372;
						itemDef.modelOffset1 = 9;//x
						itemDef.modelOffset2 = 0;//y
						//itemDef.brightness = 50;
						itemDef.description = "An upgraded Armadyl helmet.".getBytes();
						break;
					
				case 7816:
						itemDef.name = "Armadyl chestplate (i)";
						itemDef.itemActions = new String[5];
						itemDef.itemActions[1] = "Wear";
						itemDef.modelZoom = 854;
						itemDef.groundActions = new String[] { null, null, "Take", null, null };
						itemDef.modelID = 28039;
						itemDef.anInt200 = 27645;//female wield
						itemDef.anInt165 = 27633;//male wield
						itemDef.anInt164 = 28828;//female arm
						itemDef.anInt188 = 27629;//male arm
						itemDef.modelRotationX = 0;
						itemDef.modelRotationY = 453;
						itemDef.modelOffset1 = 1;
						itemDef.modelOffset2 = -5;
						//itemDef.brightness = 50;
						itemDef.description = "An upgraded Armadyl chestplate.".getBytes();
						break;
					
				case 7817:
						itemDef.name = "Armadyl chainskirt (i)";
						itemDef.itemActions = new String[5];
						itemDef.itemActions[1] = "Wear";
						itemDef.modelZoom = 1957;
						itemDef.groundActions = new String[] { null, null, "Take", null, null };
						itemDef.modelID = 28046;
						itemDef.anInt200 = 27641;//female wield
						itemDef.anInt165 = 27627;//male wield
						itemDef.modelRotationX = 2036;
						itemDef.modelRotationY = 555;
						itemDef.modelOffset1 = -1;
						itemDef.modelOffset2 = -3;
						//itemDef.brightness = 50;
						itemDef.description = "An upgraded pair of bandos chest boots.".getBytes();
						break;
					
				case 7818:
						itemDef.name = "Ahrim's hood (i)";
						itemDef.itemActions = new String[5];
						itemDef.itemActions[1] = "Wear";
						itemDef.modelZoom = 730;
						itemDef.groundActions = new String[] { null, null, "Take", null, null };
						itemDef.modelID = 5419;
						itemDef.anInt200 = 5435;//female wield
						itemDef.anInt165 = 5430;//male wield
						itemDef.originalModelColors = new int [1];
						itemDef.modifiedModelColors = new int [1];
						itemDef.originalModelColors[0] = 10512;
						itemDef.modifiedModelColors[0] = 8741;
						itemDef.modelRotationX = 2036;
						itemDef.modelRotationY = 0;
						itemDef.modelOffset1 = 0;
						itemDef.modelOffset2 = 0;
						itemDef.modelRotationY = 2036;
						itemDef.description = "An upgraded Ahrim's hood.".getBytes();
						break;
					
				case 7819:
						itemDef.name = "Ahrim's staff (i)";
						itemDef.itemActions = new String[5];
						itemDef.itemActions[1] = "Wear";
						itemDef.modelZoom = 1550;
						itemDef.groundActions = new String[] { null, null, "Take", null, null };
						itemDef.modelID = 6590;
						itemDef.anInt200 = 6706;//female wield
						itemDef.anInt165 = 6706;//male wield
						itemDef.originalModelColors = new int [4];
						itemDef.modifiedModelColors = new int [4];
						itemDef.originalModelColors[0] = 10512;
						itemDef.originalModelColors[1] = 10508;
						itemDef.originalModelColors[2] = 10760;
						itemDef.originalModelColors[3] = 11140;
						itemDef.modifiedModelColors[0] = 4503;
						itemDef.modifiedModelColors[1] = 14499;
						itemDef.modifiedModelColors[2] = 14494;
						itemDef.modifiedModelColors[3] = 14490;
						itemDef.modelRotationX = 116;
						itemDef.modelRotationY = 224;
						itemDef.modelOffset1 = -4;
						itemDef.modelOffset2 = -19;
						itemDef.description = "An upgraded Ahrim's staff.".getBytes();
						break;
					
				case 7820:
						itemDef.name = "Ahrim's robetop (i)";
						itemDef.itemActions = new String[5];
						itemDef.itemActions[1] = "Wear";
						itemDef.modelZoom = 1250;
						itemDef.groundActions = new String[] { null, null, "Take", null, null };
						itemDef.modelID = 6578;
						itemDef.anInt200 = 6697;//female wield
						itemDef.anInt165 = 6669;//male wield
						itemDef.anInt164 = 348;//female arm
						itemDef.anInt188 = 170;//male arm
						itemDef.originalModelColors = new int [2];
						itemDef.modifiedModelColors = new int [2];
						itemDef.originalModelColors[0] = 10512;
						itemDef.originalModelColors[1] = 10512;
						itemDef.modifiedModelColors[0] = 8741;
						itemDef.modifiedModelColors[1] = 14490;
						itemDef.modelRotationX = 0;
						itemDef.modelRotationY = 468;
						itemDef.modelOffset1 = 0;
						itemDef.modelOffset2 = 3;
						//itemDef.modelRotationX = 468;
						itemDef.description = "An upgraded Ahrim's robetop.".getBytes();
						break;
					
				case 7821:
						itemDef.name = "Ahrim's robeskirt (i)";
						itemDef.itemActions = new String[5];
						itemDef.itemActions[1] = "Wear";
						itemDef.modelZoom = 1730;
						itemDef.groundActions = new String[] { null, null, "Take", null, null };
						itemDef.modelID = 6577;
						itemDef.anInt200 = 6691;//female wield
						itemDef.anInt165 = 6659;//male wield
						itemDef.originalModelColors = new int [2];
						itemDef.modifiedModelColors = new int [2];
						itemDef.originalModelColors[0] = 10512;
						itemDef.originalModelColors[1] = -21696;
						itemDef.modifiedModelColors[0] = 14490;
						itemDef.modifiedModelColors[1] = -20068;
						itemDef.modelRotationX = 0;
						itemDef.modelRotationY = 504;
						itemDef.modelOffset1 = 0;
						itemDef.modelOffset2 = -4;
						//itemDef.modelRotationX = 504;
						itemDef.description = "An upgraded Ahrim's staff.".getBytes();
						break;
						
				case 19742:
					itemDef.name = "Bandos upgrade scroll";
					itemDef.description = "Use this to upgrade your Bandos armor.".getBytes();
					break;
					
				case 19744:
					itemDef.name = "Armadyl upgrade scroll";
					itemDef.description = "Use this to upgrade your Armadyl armor.".getBytes();
					break;
				
				case 904:
				itemDef.name = "Gnome scarf";
				itemDef.modelID = 17125;
				itemDef.originalModelColors = new int [3];
				itemDef.modifiedModelColors = new int [3];
				itemDef.originalModelColors[0] = 119;
				itemDef.modifiedModelColors[0] = 7737;
				itemDef.originalModelColors[1] = 103;
				itemDef.modifiedModelColors[1] = 7737;
				itemDef.originalModelColors[2] = 127;
				itemDef.modifiedModelColors[2] = 7737;
				itemDef.modelZoom = 919;
				itemDef.modelRotationY = 595;
				itemDef.modelRotationX = 0;
				itemDef.modelOffset1 = -7;
				itemDef.modelOffset2 = 8;
				itemDef.anInt165 = 17155;
				itemDef.anInt200 = 17157;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.description = "It's a @red@red</col> Gnome scarf.".getBytes();
			break;
				
			case 12026:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 6028;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2635;
				itemDef.modelZoom = 440;
				itemDef.modelRotationY = 76;
				itemDef.modelRotationX = 1850;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 1;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 187;
				itemDef.anInt200 = 363;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Bronze partyhat";
				itemDef.description = "It's a Bronze partyhat.".getBytes();
				break;
				
			case 12027:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 35321;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2635;
				itemDef.modelZoom = 440;
				itemDef.modelRotationY = 76;
				itemDef.modelRotationX = 1850;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 1;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 187;
				itemDef.anInt200 = 363;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Cyan partyhat";
				itemDef.description = "It's a Cyan partyhat.".getBytes();
				break;
				
				case 12028:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 33;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2635;
				itemDef.modelZoom = 440;
				itemDef.modelRotationY = 76;
				itemDef.modelRotationX = 1850;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 1;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 187;
				itemDef.anInt200 = 363;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Iron partyhat";
				itemDef.description = "It's a Iron partyhat.".getBytes();
				break;
				
			
				case 20345:
					itemDef.name = "Elder maul";
					itemDef.modelZoom = 1800;
					itemDef.modelRotationY = 308;
					itemDef.modelRotationX = 36;
					itemDef.modelOffset1 = 7;
					itemDef.itemActions = new String[] { null, "Wield", "null", null, "Destroy" };
					itemDef.modelID = 32792;
					itemDef.anInt165 = 32678;
					itemDef.anInt200 = 32678;
					itemDef.aByte205 = 10;
					itemDef.aByte154 = 10;
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 0;
					itemDef.modifiedModelColors[0] = 4;
					break;
					
				
				case 12029:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 350;
					itemDef.modifiedModelColors[0] = 926;
					itemDef.modelID = 2635;
					itemDef.modelZoom = 440;
					itemDef.modelRotationY = 76;
					itemDef.modelRotationX = 1850;
					itemDef.anInt204 = 0;
					itemDef.modelOffset1 = 1;
					itemDef.modelOffset2 = 0;
					itemDef.anInt165 = 187;
					itemDef.anInt200 = 363;
					itemDef.anInt188 = -1;
					itemDef.anInt164 = -1;
					itemDef.anInt175 = -1;
					itemDef.anInt197 = -1;
					itemDef.name = "Pink partyhat";
					itemDef.description = "It's a Pink partyhat.".getBytes();
					break;
				
				case 12030:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 61;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2635;
				itemDef.modelZoom = 440;
				itemDef.modelRotationY = 76;
				itemDef.modelRotationX = 1850;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 1;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 187;
				itemDef.anInt200 = 363;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Steel partyhat";
				itemDef.description = "It's a Steel partyhat.".getBytes();
				break;
				
				case 12031:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 19860;
					itemDef.modifiedModelColors[0] = 926;
					itemDef.modelID = 2635;
					itemDef.modelZoom = 440;
					itemDef.modelRotationY = 76;
					itemDef.modelRotationX = 1850;
					itemDef.anInt204 = 0;
					itemDef.modelOffset1 = 1;
					itemDef.modelOffset2 = 0;
					itemDef.anInt165 = 187;
					itemDef.anInt200 = 363;
					itemDef.anInt188 = -1;
					itemDef.anInt164 = -1;
					itemDef.anInt175 = -1;
					itemDef.anInt197 = -1;
					itemDef.name = "Dark green partyhat";
					itemDef.description = "It's a Dark green partyhat.".getBytes();
					break;
				
				case 12032:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 6020;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2635;
				itemDef.modelZoom = 440;
				itemDef.modelRotationY = 76;
				itemDef.modelRotationX = 1850;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 1;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 187;
				itemDef.anInt200 = 363;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Brown partyhat";
				itemDef.description = "It's a Brown partyhat.".getBytes();
				break;
				
				case 12033:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 58933;
					itemDef.modifiedModelColors[0] = 926;
					itemDef.modelID = 2635;
					itemDef.modelZoom = 440;
					itemDef.modelRotationY = 76;
					itemDef.modelRotationX = 1850;
					itemDef.anInt204 = 0;
					itemDef.modelOffset1 = 1;
					itemDef.modelOffset2 = 0;
					itemDef.anInt165 = 187;
					itemDef.anInt200 = 363;
					itemDef.anInt188 = -1;
					itemDef.anInt164 = -1;
					itemDef.anInt175 = -1;
					itemDef.anInt197 = -1;
					itemDef.name = "Magenta partyhat";
					itemDef.description = "It's a Magenta partyhat.".getBytes();
					break;
				
				case 12034:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 43297;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2635;
				itemDef.modelZoom = 440;
				itemDef.modelRotationY = 76;
				itemDef.modelRotationX = 1850;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 1;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 187;
				itemDef.anInt200 = 363;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Mithril partyhat";
				itemDef.description = "It's a Mithril partyhat.".getBytes();
				break;
				case 12036:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 21662;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2635;
				itemDef.modelZoom = 440;
				itemDef.modelRotationY = 76;
				itemDef.modelRotationX = 1850;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 1;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 187;
				itemDef.anInt200 = 363;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Adamant partyhat";
				itemDef.description = "It's a Adamant partyhat.".getBytes();
				break;
				
			case 12038:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 36252;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2635;
				itemDef.modelZoom = 440;
				itemDef.modelRotationY = 76;
				itemDef.modelRotationX = 1850;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 1;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 187;
				itemDef.anInt200 = 363;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Rune partyhat";
				itemDef.description = "It's a Rune partyhat.".getBytes();
				break;
				
			case 12040:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 926;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2635;
				itemDef.modelZoom = 440;
				itemDef.modelRotationY = 76;
				itemDef.modelRotationX = 1850;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 1;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 187;
				itemDef.anInt200 = 363;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Dragon partyhat";
				itemDef.description = "It's a Dragon partyhat.".getBytes();
				break;
				case 12042:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 10388;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2635;
				itemDef.modelZoom = 440;
				itemDef.modelRotationY = 76;
				itemDef.modelRotationX = 1850;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 1;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 187;
				itemDef.anInt200 = 363;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Barrows partyhat";
				itemDef.description = "It's a Barrows partyhat.".getBytes();
				break;
				case 12044:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 40;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2635;
				itemDef.modelZoom = 440;
				itemDef.modelRotationY = 76;
				itemDef.modelRotationX = 1850;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 1;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 187;
				itemDef.anInt200 = 363;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Lime partyhat";
				itemDef.description = "It's a Lime partyhat.".getBytes();
				break;
				case 12046:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 6073;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2635;
				itemDef.modelZoom = 440;
				itemDef.modelRotationY = 76;
				itemDef.modelRotationX = 1850;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 1;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 187;
				itemDef.anInt200 = 363;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Lava partyhat";
				itemDef.description = "It's a Lava partyhat.".getBytes();
				break;
				case 12056:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 6028;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2438;
				itemDef.modelZoom = 730;
				itemDef.modelRotationY = 516;
				itemDef.modelRotationX = 0;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = -10;
				itemDef.anInt165 = 3188;
				itemDef.anInt200 = 3192;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Bronze h'ween mask";
				itemDef.description = "It's a Bronze h'ween mask.".getBytes();
				break;
				case 12057:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 35321;
					itemDef.modifiedModelColors[0] = 926;
					itemDef.modelID = 2438;
					itemDef.modelZoom = 730;
					itemDef.modelRotationY = 516;
					itemDef.modelRotationX = 0;
					itemDef.anInt204 = 0;
					itemDef.modelOffset1 = 0;
					itemDef.modelOffset2 = -10;
					itemDef.anInt165 = 3188;
					itemDef.anInt200 = 3192;
					itemDef.anInt188 = -1;
					itemDef.anInt164 = -1;
					itemDef.anInt175 = -1;
					itemDef.anInt197 = -1;
					itemDef.name = "Cyan h'ween mask";
					itemDef.description = "It's a Cyan h'ween mask.".getBytes();
					break;
				case 12059:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 350;
					itemDef.modifiedModelColors[0] = 926;
					itemDef.modelID = 2438;
					itemDef.modelZoom = 730;
					itemDef.modelRotationY = 516;
					itemDef.modelRotationX = 0;
					itemDef.anInt204 = 0;
					itemDef.modelOffset1 = 0;
					itemDef.modelOffset2 = -10;
					itemDef.anInt165 = 3188;
					itemDef.anInt200 = 3192;
					itemDef.anInt188 = -1;
					itemDef.anInt164 = -1;
					itemDef.anInt175 = -1;
					itemDef.anInt197 = -1;
					itemDef.name = "Pink h'ween mask";
					itemDef.description = "It's a Pink h'ween mask.".getBytes();
					break;
				case 12061:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 19860;
					itemDef.modifiedModelColors[0] = 926;
					itemDef.modelID = 2438;
					itemDef.modelZoom = 730;
					itemDef.modelRotationY = 516;
					itemDef.modelRotationX = 0;
					itemDef.anInt204 = 0;
					itemDef.modelOffset1 = 0;
					itemDef.modelOffset2 = -10;
					itemDef.anInt165 = 3188;
					itemDef.anInt200 = 3192;
					itemDef.anInt188 = -1;
					itemDef.anInt164 = -1;
					itemDef.anInt175 = -1;
					itemDef.anInt197 = -1;
					itemDef.name = "Dark green h'ween mask";
					itemDef.description = "It's a Dark green h'ween mask.".getBytes();
					break;
				case 12063:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 58933;
					itemDef.modifiedModelColors[0] = 926;
					itemDef.modelID = 2438;
					itemDef.modelZoom = 730;
					itemDef.modelRotationY = 516;
					itemDef.modelRotationX = 0;
					itemDef.anInt204 = 0;
					itemDef.modelOffset1 = 0;
					itemDef.modelOffset2 = -10;
					itemDef.anInt165 = 3188;
					itemDef.anInt200 = 3192;
					itemDef.anInt188 = -1;
					itemDef.anInt164 = -1;
					itemDef.anInt175 = -1;
					itemDef.anInt197 = -1;
					itemDef.name = "Magenta h'ween mask";
					itemDef.description = "It's a Magenta h'ween mask.".getBytes();
					break;
				case 12058:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 33;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2438;
				itemDef.modelZoom = 730;
				itemDef.modelRotationY = 516;
				itemDef.modelRotationX = 0;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = -10;
				itemDef.anInt165 = 3188;
				itemDef.anInt200 = 3192;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Iron h'ween mask";
				itemDef.description = "It's a Iron h'ween mask.".getBytes();
				break;
				case 12060:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 61;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2438;
				itemDef.modelZoom = 730;
				itemDef.modelRotationY = 516;
				itemDef.modelRotationX = 0;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = -10;
				itemDef.anInt165 = 3188;
				itemDef.anInt200 = 3192;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Steel h'ween mask";
				itemDef.description = "It's a Steel h'ween mask.".getBytes();
				break;
				case 12062:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 6020;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2438;
				itemDef.modelZoom = 730;
				itemDef.modelRotationY = 516;
				itemDef.modelRotationX = 0;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = -10;
				itemDef.anInt165 = 3188;
				itemDef.anInt200 = 3192;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Brown h'ween mask";
				itemDef.description = "It's a Brown h'ween mask.".getBytes();
				break;
				case 12162:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 100;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2438;
				itemDef.modelZoom = 730;
				itemDef.modelRotationY = 516;
				itemDef.modelRotationX = 0;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = -10;
				itemDef.anInt165 = 3188;
				itemDef.anInt200 = 3192;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "White h'ween mask";
				itemDef.description = "It's a White h'ween mask.".getBytes();
				break;
				case 12064:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 43297;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2438;
				itemDef.modelZoom = 730;
				itemDef.modelRotationY = 516;
				itemDef.modelRotationX = 0;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = -10;
				itemDef.anInt165 = 3188;
				itemDef.anInt200 = 3192;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Mithril h'ween mask";
				itemDef.description = "It's a Mithril h'ween mask.".getBytes();
				break;
				case 12066:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 21662;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2438;
				itemDef.modelZoom = 730;
				itemDef.modelRotationY = 516;
				itemDef.modelRotationX = 0;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = -10;
				itemDef.anInt165 = 3188;
				itemDef.anInt200 = 3192;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Adamant h'ween mask";
				itemDef.description = "It's a Adamant h'ween mask.".getBytes();
				break;
				case 12068:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 36252;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2438;
				itemDef.modelZoom = 730;
				itemDef.modelRotationY = 516;
				itemDef.modelRotationX = 0;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = -10;
				itemDef.anInt165 = 3188;
				itemDef.anInt200 = 3192;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Rune h'ween mask";
				itemDef.description = "It's a Rune h'ween mask.".getBytes();
				break;
				case 12070:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 926;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2438;
				itemDef.modelZoom = 730;
				itemDef.modelRotationY = 516;
				itemDef.modelRotationX = 0;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = -10;
				itemDef.anInt165 = 3188;
				itemDef.anInt200 = 3192;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Dragon h'ween mask";
				itemDef.description = "It's a Dragon h'ween mask.".getBytes();
				break;
				case 12072:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 10388;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2438;
				itemDef.modelZoom = 730;
				itemDef.modelRotationY = 516;
				itemDef.modelRotationX = 0;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = -10;
				itemDef.anInt165 = 3188;
				itemDef.anInt200 = 3192;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Barrows h'ween mask";
				itemDef.description = "It's a Barrows h'ween mask.".getBytes();
				break;
				case 12074:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 17350;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2438;
				itemDef.modelZoom = 730;
				itemDef.modelRotationY = 516;
				itemDef.modelRotationX = 0;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = -10;
				itemDef.anInt165 = 3188;
				itemDef.anInt200 = 3192;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Lime h'ween mask";
				itemDef.description = "It's a Lime h'ween mask.".getBytes();
				break;
				case 12076:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 6073;
				itemDef.modifiedModelColors[0] = 926;
				itemDef.modelID = 2438;
				itemDef.modelZoom = 730;
				itemDef.modelRotationY = 516;
				itemDef.modelRotationX = 0;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = -10;
				itemDef.anInt165 = 3188;
				itemDef.anInt200 = 3192;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Lava h'ween mask";
				itemDef.description = "It's a Lava h'ween mask.".getBytes();
				break;
				case 12086:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 6028;
				itemDef.modifiedModelColors[0] = 933;
				itemDef.modelID = 2537;
				itemDef.modelZoom = 540;
				itemDef.modelRotationY = 72;
				itemDef.modelRotationX = 136;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 189;
				itemDef.anInt200 = 366;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Bronze santa hat";
				itemDef.description = "It's a Bronze santa hat.".getBytes();
				break;
				case 12087:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 35321;
					itemDef.modifiedModelColors[0] = 933;
					itemDef.modelID = 2537;
					itemDef.modelZoom = 540;
					itemDef.modelRotationY = 72;
					itemDef.modelRotationX = 136;
					itemDef.anInt204 = 0;
					itemDef.modelOffset1 = 0;
					itemDef.modelOffset2 = 0;
					itemDef.anInt165 = 189;
					itemDef.anInt200 = 366;
					itemDef.anInt188 = -1;
					itemDef.anInt164 = -1;
					itemDef.anInt175 = -1;
					itemDef.anInt197 = -1;
					itemDef.name = "Cyan santa hat";
					itemDef.description = "It's a Cyan santa hat.".getBytes();
					break;
				case 12089:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 350;
					itemDef.modifiedModelColors[0] = 933;
					itemDef.modelID = 2537;
					itemDef.modelZoom = 540;
					itemDef.modelRotationY = 72;
					itemDef.modelRotationX = 136;
					itemDef.anInt204 = 0;
					itemDef.modelOffset1 = 0;
					itemDef.modelOffset2 = 0;
					itemDef.anInt165 = 189;
					itemDef.anInt200 = 366;
					itemDef.anInt188 = -1;
					itemDef.anInt164 = -1;
					itemDef.anInt175 = -1;
					itemDef.anInt197 = -1;
					itemDef.name = "Pink santa hat";
					itemDef.description = "It's a Pink santa hat.".getBytes();
					break;
				case 12091:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 19860;
					itemDef.modifiedModelColors[0] = 933;
					itemDef.modelID = 2537;
					itemDef.modelZoom = 540;
					itemDef.modelRotationY = 72;
					itemDef.modelRotationX = 136;
					itemDef.anInt204 = 0;
					itemDef.modelOffset1 = 0;
					itemDef.modelOffset2 = 0;
					itemDef.anInt165 = 189;
					itemDef.anInt200 = 366;
					itemDef.anInt188 = -1;
					itemDef.anInt164 = -1;
					itemDef.anInt175 = -1;
					itemDef.anInt197 = -1;
					itemDef.name = "Dark green santa hat";
					itemDef.description = "It's a Dark green santa hat.".getBytes();
					break;
				case 12093:
					itemDef.itemActions = new String[5];
					itemDef.itemActions[1] = "Wear";
					itemDef.originalModelColors = new int[1];
					itemDef.modifiedModelColors = new int[1];
					itemDef.originalModelColors[0] = 58933;
					itemDef.modifiedModelColors[0] = 933;
					itemDef.modelID = 2537;
					itemDef.modelZoom = 540;
					itemDef.modelRotationY = 72;
					itemDef.modelRotationX = 136;
					itemDef.anInt204 = 0;
					itemDef.modelOffset1 = 0;
					itemDef.modelOffset2 = 0;
					itemDef.anInt165 = 189;
					itemDef.anInt200 = 366;
					itemDef.anInt188 = -1;
					itemDef.anInt164 = -1;
					itemDef.anInt175 = -1;
					itemDef.anInt197 = -1;
					itemDef.name = "Magenta santa hat";
					itemDef.description = "It's a Magenta santa hat.".getBytes();
					break;
				case 12088:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 33;
				itemDef.modifiedModelColors[0] = 933;
				itemDef.modelID = 2537;
				itemDef.modelZoom = 540;
				itemDef.modelRotationY = 72;
				itemDef.modelRotationX = 136;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 189;
				itemDef.anInt200 = 366;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Iron santa hat";
				itemDef.description = "It's a Iron santa hat.".getBytes();
				break;
				case 12090:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 61;
				itemDef.modifiedModelColors[0] = 933;
				itemDef.modelID = 2537;
				itemDef.modelZoom = 540;
				itemDef.modelRotationY = 72;
				itemDef.modelRotationX = 136;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 189;
				itemDef.anInt200 = 366;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Steel santa hat";
				itemDef.description = "It's a Steel santa hat.".getBytes();
				break;
				case 12092:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 6020;
				itemDef.modifiedModelColors[0] = 933;
				itemDef.modelID = 2537;
				itemDef.modelZoom = 540;
				itemDef.modelRotationY = 72;
				itemDef.modelRotationX = 136;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 189;
				itemDef.anInt200 = 366;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Brown santa hat";
				itemDef.description = "It's a Brown santa hat.".getBytes();
				break;
				case 12192:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 100;
				itemDef.modifiedModelColors[0] = 933;
				itemDef.modelID = 2537;
				itemDef.modelZoom = 540;
				itemDef.modelRotationY = 72;
				itemDef.modelRotationX = 136;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 189;
				itemDef.anInt200 = 366;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "White santa hat";
				itemDef.description = "It's a White santa hat.".getBytes();
				break;
				case 12094:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 43297;
				itemDef.modifiedModelColors[0] = 933;
				itemDef.modelID = 2537;
				itemDef.modelZoom = 540;
				itemDef.modelRotationY = 72;
				itemDef.modelRotationX = 136;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 189;
				itemDef.anInt200 = 366;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Mithril santa hat";
				itemDef.description = "It's a Mithril santa hat.".getBytes();
				break;
				case 12096:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 21662;
				itemDef.modifiedModelColors[0] = 933;
				itemDef.modelID = 2537;
				itemDef.modelZoom = 540;
				itemDef.modelRotationY = 72;
				itemDef.modelRotationX = 136;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 189;
				itemDef.anInt200 = 366;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Adamant santa hat";
				itemDef.description = "It's a Adamant santa hat.".getBytes();
				break;
				case 12098:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 36252;
				itemDef.modifiedModelColors[0] = 933;
				itemDef.modelID = 2537;
				itemDef.modelZoom = 540;
				itemDef.modelRotationY = 72;
				itemDef.modelRotationX = 136;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 189;
				itemDef.anInt200 = 366;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Rune santa hat";
				itemDef.description = "It's a Rune santa hat.".getBytes();
				break;
				case 12100:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 926;
				itemDef.modifiedModelColors[0] = 933;
				itemDef.modelID = 2537;
				itemDef.modelZoom = 540;
				itemDef.modelRotationY = 72;
				itemDef.modelRotationX = 136;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 189;
				itemDef.anInt200 = 366;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Dragon santa hat";
				itemDef.description = "It's a Dragon santa hat.".getBytes();
				break;
				case 12102:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 10388;
				itemDef.modifiedModelColors[0] = 933;
				itemDef.modelID = 2537;
				itemDef.modelZoom = 540;
				itemDef.modelRotationY = 72;
				itemDef.modelRotationX = 136;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 189;
				itemDef.anInt200 = 366;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Barrows santa hat";
				itemDef.description = "It's a Barrows santa hat.".getBytes();
				break;
				case 12104:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 17350;
				itemDef.modifiedModelColors[0] = 933;
				itemDef.modelID = 2537;
				itemDef.modelZoom = 540;
				itemDef.modelRotationY = 72;
				itemDef.modelRotationX = 136;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 189;
				itemDef.anInt200 = 366;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Lime santa hat";
				itemDef.description = "It's a Lime santa hat.".getBytes();
				break;
				case 12106:
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.originalModelColors = new int[1];
				itemDef.modifiedModelColors = new int[1];
				itemDef.originalModelColors[0] = 6073;
				itemDef.modifiedModelColors[0] = 933;
				itemDef.modelID = 2537;
				itemDef.modelZoom = 540;
				itemDef.modelRotationY = 72;
				itemDef.modelRotationX = 136;
				itemDef.anInt204 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.modelOffset2 = 0;
				itemDef.anInt165 = 189;
				itemDef.anInt200 = 366;
				itemDef.anInt188 = -1;
				itemDef.anInt164 = -1;
				itemDef.anInt175 = -1;
				itemDef.anInt197 = -1;
				itemDef.name = "Lava santa hat";
				itemDef.description = "It's a Lava santa hat.".getBytes();
				break;
			
			case 13190:
				itemDef.name = "100 LozzCity Bucks";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Redeem";
				itemDef.modelID = 29210;
				itemDef.modelZoom = 2300;
				itemDef.modelRotationY = 512;
				itemDef.modelOffset1 = 3;
				itemDef.modelOffset2 = 1;
				break;
				
			case 13191:
				itemDef.name = "300 LozzCity Bucks";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Redeem";
				itemDef.modelID = 29210;
				itemDef.modelZoom = 2300;
				itemDef.modelRotationY = 512;
				itemDef.modelOffset1 = 3;
				itemDef.modelOffset2 = 1;
				break;
				
			case 13192:
				itemDef.name = "500 LozzCity Bucks";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Redeem";
				itemDef.modelID = 29210;
				itemDef.modelZoom = 2300;
				itemDef.modelRotationY = 512;
				itemDef.modelOffset1 = 3;
				itemDef.modelOffset2 = 1;
				break;
				
			case 13193:
				itemDef.name = "7500 LozzCity Bucks";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Redeem";
				itemDef.modelID = 29210;
				itemDef.modelZoom = 2300;
				itemDef.modelRotationY = 512;
				itemDef.modelOffset1 = 3;
				itemDef.modelOffset2 = 1;
				break;
				
			case 14000:
				itemDef.name = "1000 LozzCity Bucks";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Redeem";
				itemDef.modelID = 29210;
				itemDef.modelZoom = 2300;
				itemDef.modelRotationY = 512;
				itemDef.modelOffset1 = 3;
				itemDef.modelOffset2 = 1;
				itemDef.stackable = false;
				break;
				
			case 13195:
				itemDef.name = "2500 LozzCity Bucks";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Redeem";
				itemDef.modelID = 29210;
				itemDef.modelZoom = 2300;
				itemDef.modelRotationY = 512;
				itemDef.modelOffset1 = 3;
				itemDef.modelOffset2 = 1;
				break;
				
			case 20526:
				itemDef.name = "Event Key";
				break;
				
			case 13196:
				itemDef.name = "5000 LozzCity Bucks";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Redeem";
				itemDef.modelID = 29210;
				itemDef.modelZoom = 2300;
				itemDef.modelRotationY = 512;
				itemDef.modelOffset1 = 3;
				itemDef.modelOffset2 = 1;
				break;
				
			case 5444:
				itemDef.name = "10,000 LozzCity Bucks";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Redeem";
				itemDef.modelID = 29210;
				itemDef.modelZoom = 2300;
				itemDef.modelRotationY = 512;
				itemDef.modelOffset1 = 3;
				itemDef.modelOffset2 = 1;
				break;
				
			case 13198:
				itemDef.name = "20,000 LozzCity Bucks";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Redeem";
				itemDef.modelID = 29210;
				itemDef.modelZoom = 2300;
				itemDef.modelRotationY = 512;
				itemDef.modelOffset1 = 3;
				itemDef.modelOffset2 = 1;
				break;
				
			case 7478:
				itemDef.name = "20 LozzCity Bucks";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[0] = "Redeem";
				itemDef.modelID = 29210;
				itemDef.modelZoom = 2300;
				itemDef.modelRotationY = 512;
				itemDef.modelOffset1 = 3;
				itemDef.modelOffset2 = 1;
				itemDef.description = "Spend these in the Donator store!".getBytes();
				break;
				
			case 5000:
				itemDef.name = "Vesta's Chainbody";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.modelID = 42593;
				itemDef.modelZoom = 1440;
				itemDef.modelRotationY = 545;
				itemDef.modelRotationX = 2;
				itemDef.modelOffset2 = 5;
				itemDef.modelOffset1 = 4;
				itemDef.anInt204 = 0;
				itemDef.anInt165 = 42624;
				itemDef.anInt200 = 42644;
			itemDef.description = "An ancient chainbody once worn by Vesta.".getBytes();
			break;
			case 5001:
				itemDef.name = "Vesta's Plateskirt";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.modelID = 42581;
				itemDef.modelZoom = 1753;
				itemDef.modelRotationY = 562;
				itemDef.modelRotationX = 1;
				itemDef.modelOffset2 = 11;
				itemDef.modelOffset1 = -3;
				itemDef.anInt204 = 0;
				itemDef.anInt165 = 42633;
				itemDef.anInt200 = 42649;
			itemDef.description = "An ancient plateskirt once worn by Vesta.".getBytes();
			break;
			case 5002:
				itemDef.name = "Vesta's Longsword";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.modelID = 42597;
				itemDef.modelZoom = 1744;
				itemDef.modelRotationY = 738;
				itemDef.modelRotationX = 1985;
				itemDef.modelOffset2 = 0;
				itemDef.modelOffset1 = 0;
				itemDef.anInt204 = 0;
				itemDef.aByte205 = -12;
				itemDef.aByte154 = 0;
				itemDef.anInt165 = 42615;
				itemDef.anInt200 = 42615;
			itemDef.description = "An ancient longsword once worn by Vesta.".getBytes();
			break;
			case 5003:
				itemDef.name = "Vesta's Spear";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.modelID = 42599;
				itemDef.modelZoom = 2022;
				itemDef.modelRotationY = 480;
				itemDef.modelRotationX = 15;
				itemDef.anInt204 = 0;
				itemDef.aByte205 = -12;
				itemDef.aByte154 = 0;
				itemDef.modelOffset2 = 5;
				itemDef.modelOffset1 = 0;
				//itemDef.anInt204 = 0;
				itemDef.anInt165 = 42614;
				itemDef.anInt200 = 42614;
			itemDef.description = "An ancient spear once worn by Vesta.".getBytes();
			break;
			
			case 5004:
				itemDef.name = "Zuriel's staff";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.modelID = 42595;
				itemDef.modelZoom = 2000;
				itemDef.modelRotationY = 366;
				itemDef.modelRotationX = 3;
				itemDef.modelOffset2 = 1;
				itemDef.modelOffset1 = 1;
				itemDef.anInt204 = 0;
				itemDef.aByte205 = -12;
				itemDef.anInt165 = 42617;
				itemDef.anInt200 = 42617;
				itemDef.description = "Zuriel's staff. Derp!".getBytes();
			break;
			
			case 5008:
				itemDef.name = "Statius's Platebody";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.modelID = 42602;
				itemDef.modelZoom = 1312;
				itemDef.modelRotationY = 272;
				itemDef.modelRotationX = 2047;
				itemDef.modelOffset2 = 39;
				itemDef.modelOffset1 = -2;
				itemDef.anInt204 = 0;
				itemDef.anInt165 = 42625;
				itemDef.anInt200 = 42641;
				itemDef.description = "Statius's Platebody, a reward from PVP."
						.getBytes();
				break;
			case 5009:
				itemDef.name = "Statius's Platelegs";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.modelID = 42590;
				itemDef.modelZoom = 1625;
				itemDef.modelRotationY = 355;
				itemDef.modelRotationX = 2046;
				itemDef.modelOffset2 = -11;
				itemDef.modelOffset1 = 0;
				itemDef.anInt204 = 0;
				itemDef.anInt165 = 42632;
				itemDef.anInt200 = 42647;
				itemDef.description = "Statius's Platelegs, a reward from PVP."
						.getBytes();
				break;
			case 5010:
				itemDef.name = "Statius's Full Helm";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wear";
				itemDef.modelID = 42596;
				itemDef.modelZoom = 789;
				itemDef.modelRotationY = 96;
				itemDef.modelRotationX = 2039;
				itemDef.modelOffset2 = -7;
				itemDef.modelOffset1 = 2;
				itemDef.anInt204 = 0;
				itemDef.anInt165 = 42639;
				itemDef.anInt200 = 42655;
				itemDef.description = "Statius's Full Helm, a reward from PVP."
						.getBytes();
				break;
			case 5011:
				itemDef.name = "Statius's Warhammer";
				itemDef.itemActions = new String[5];
				itemDef.itemActions[1] = "Wield";
				itemDef.modelID = 42577;
				itemDef.modelZoom = 1360;
				itemDef.modelRotationY = 507;
				itemDef.modelRotationX = 27;
				itemDef.modelOffset2 = 6;
				itemDef.modelOffset1 = 7;
				itemDef.anInt204 = 0;
				itemDef.aByte205 = -12;
				itemDef.aByte154 = 0;
				itemDef.anInt165 = 42623;
				itemDef.anInt200 = 42623;
				itemDef.description = "An ancient warhammer once used by Statius."
						.getBytes();
				break;
				
			 case 5012:
				   itemDef.modelID = 60831;
				   itemDef.name = "Korasi's sword";
				   itemDef.modelZoom = 1744;
				   itemDef.modelRotationY = 330;
				   itemDef.modelRotationX = 1505;
				   itemDef.modelOffset1 = 0;
				   itemDef.modelOffset2 = 0;
				   itemDef.anInt165 = 57780;
				   itemDef.anInt200 = 57784;
				   itemDef.aByte205 = -5;
				   itemDef.itemActions = new String[5];
				   itemDef.itemActions[1] = "Wield";
				   itemDef.itemActions[4] = "Drop";
				  break;
				  
			   case 5016:
                   itemDef.name = "Divine spirit shield";
                   itemDef.modelZoom = 1600;
                   itemDef.modelRotationY = 396;
                   itemDef.modelRotationX = 1050;
                   itemDef.modelOffset1 = 4;
                   itemDef.modelOffset2 = 13;
                   itemDef.modelID = 40921;
                   itemDef.anInt165 = 11047;
                   itemDef.anInt200 = 11047;
                   break;
			   case 5018:
                   itemDef.name = "Lava spirit shield";
                   itemDef.modelZoom = 1600;
                   itemDef.modelRotationY = 396;
                   itemDef.modelRotationX = 1050;
                   itemDef.modelOffset1 = 4;
                   itemDef.modelOffset2 = 13;
                   itemDef.modelID = 40921;
                   itemDef.anInt165 = 11047;
                   itemDef.anInt200 = 11047;
                   break;
			   case 5032:
                   itemDef.name = "Nature spirit shield";
                   itemDef.itemActions = new String[5];
                   itemDef.itemActions[0] = "Wear";
                   itemDef.modelZoom = 1600;
                   itemDef.modelRotationY = 396;
                   itemDef.modelRotationX = 1050;
                   itemDef.modelOffset1 = 4;
                   itemDef.modelOffset2 = 13;
                   itemDef.modelID = 40921;
                   itemDef.anInt165 = 11047;
                   itemDef.anInt200 = 11047;
                   break;
			   case 5030:
                   itemDef.name = "Water spirit shield";
                   itemDef.modelZoom = 1600;
                   itemDef.modelRotationY = 396;
                   itemDef.modelRotationX = 1050;
                   itemDef.modelOffset1 = 4;
                   itemDef.modelOffset2 = 13;
                   itemDef.modelID = 40921;
                   itemDef.anInt165 = 11047;
                   itemDef.anInt200 = 11047;
                   break;
			   case 5024:
                   itemDef.name = "Stone spirit shield";
                   itemDef.modelZoom = 1600;
                   itemDef.modelRotationY = 396;
                   itemDef.modelRotationX = 1050;
                   itemDef.modelOffset1 = 4;
                   itemDef.modelOffset2 = 13;
                   itemDef.modelID = 40921;
                   itemDef.anInt165 = 11047;
                   itemDef.anInt200 = 11047;
                   break;
			   case 5026:
                   itemDef.name = "Frozen spirit shield";
                   itemDef.modelZoom = 1600;
                   itemDef.modelRotationY = 396;
                   itemDef.modelRotationX = 1050;
                   itemDef.modelOffset1 = 4;
                   itemDef.modelOffset2 = 13;
                   itemDef.modelID = 40921;
                   itemDef.anInt165 = 11047;
                   itemDef.anInt200 = 11047;
                   break;
			   case 5028:
                   itemDef.name = "Wooden spirit shield";
                   itemDef.modelZoom = 1600;
                   itemDef.modelRotationY = 396;
                   itemDef.modelRotationX = 1050;
                   itemDef.modelOffset1 = 4;
                   itemDef.modelOffset2 = 13;
                   itemDef.modelID = 40921;
                   itemDef.anInt165 = 11047;
                   itemDef.anInt200 = 11047;
                   break;
                   
			   case 17014:
                   itemDef.itemActions = new String[5];
                   itemDef.itemActions[1] = "Wear";
                   itemDef.modelID = 9506; //Model ID
                   itemDef.modelZoom = 1440;
                   itemDef.modelRotationY = 272;
                   itemDef.modelRotationX = 352;
                   itemDef.modelOffset1 = 32;
                  // itemDef.modelOffset2 = 0;
                   itemDef.anInt165 = 9506;
                   itemDef.anInt200 = 9506;
                   itemDef.anInt164 = -1;
                   itemDef.anInt188 = -1;
                   itemDef.aByte205 = -8;
                  // itemDef.aBoolean176 = false;
                   itemDef.name = "Dragon flail";
                   itemDef.description = "a Dragon flail.".getBytes();
                   break;
			
			
		case 995://Money
			itemDef.name = "Coins";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[4] = "Drop";
			itemDef.itemActions[3] = "Add-to-pouch";				
			break;
		
		case 4155://Gem
			itemDef.name = "Slayer gem";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Check-task";
			break;
		
		case 2568://Ring of forging
			itemDef.itemActions[2] = "Check charges";
			break;
			
		case 10500:
			itemDef.name = "Amulet of Recall";
			itemDef.itemActions[2] = "Recall";
			itemDef.description = "Useful to recall your travels".getBytes();
			break;
			
		case 13188:// Dragon claws
			itemDef.name = "Dragon claws";
			break;
			
		case 12690://Armour sets
		case 12962:
		case 12972:
		case 12974:
		case 12984:
		case 12986:
		case 12988:
		case 12990:
		case 13000:
		case 13002:
		case 13012:
		case 13014:
		case 13024:
		case 13026:
		case 9666:
		case 9670:
		case 12865:
		case 12867:
		case 12869:
		case 12871:
		case 12966:
		case 12964:
		case 12968:
		case 12970:
		case 12976:
		case 12978:
		case 12980:
		case 12982:
		case 12992:
		case 12994:
		case 12996:
		case 12998:
		case 13004:
		case 13006:
		case 13008:
		case 13010:
		case 13016:
		case 13018:
		case 13020:
		case 13022:
		case 13028:
		case 13030:
		case 13032:
		case 13034:
		case 13036:
		case 13038:
		case 12960:
		case 13173:
		case 13175:
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Unpack";
			break;	
			
		case 6828:
			itemDef.name = "Armour set 1";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Unpack";
			break;	
			
		case 6829:
			itemDef.name = "Armour set 2";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Unpack";
			break;	
			
		case 6830:
			itemDef.name = "Armour set 3";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Unpack";
			break;	
			
		case 6831:
			itemDef.name = "Armour set 4";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Unpack";
			break;	
			
		case 3849:
			itemDef.name = "Thieving casket";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Open";
			itemDef.description = "Open this casket for a random Thieving reward!".getBytes();
			break;
			
		case 12873:
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Open";
			break;
			
		case 12875:
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Open";
			break;
			
		case 12877:
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Open";
			break;
			
		case 12879:
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Open";
			break;
			
		case 12881:
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Open";
			break;
			
		case 12883:
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Open";
			break;
			
		case 4067:
			itemDef.name = "Vote Ticket";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Open";
			itemDef.description = "You can use these to claim vote rewards or sell them to other players.".getBytes();
			break;
			
		case 20594:
			itemDef.name = "Append implings";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Click to";
			itemDef.description = "Developer item. please give this to a staff member or risk being banned!".getBytes();
			break;
			
		case 19668:
			itemDef.name = "Slayer helmet (i) scroll";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = null;
			itemDef.description = "Use this on a slayer helmet to inhance it(5% slayer exp bonus!)".getBytes();
			break;
			
		case 7956:
			itemDef.name = "Fishing casket";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Open";
			itemDef.description = "Open this casket for a random Fishing reward!".getBytes();
			break;
			
		case 20703:
			itemDef.name = "Crate of Cats";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Open";
			itemDef.description = "Open this crate for a random pet Cat!".getBytes();
			break;
			
		case 1554:
			itemDef.name = "Love cats";
			itemDef.description = "Two cats on a carpet... Seems legit.".getBytes();
			break;
			
		case 16500:
			itemDef.name = "Lazy jubbly chick";
			itemDef.modelID = 26863;
			itemDef.modelZoom = 4000;
			itemDef.description = "A lazy pet jubbly.".getBytes();
			break;
			
		case 16504:
			itemDef.name = "Pet dark beast";
			itemDef.modelID = 26395;
			itemDef.modelZoom = 4000;
			itemDef.description = "A pet dark beast aquired from slaying many dark beasts.".getBytes();
			break;
			
		case 15040:
			itemDef.name = "Mini Ancient Warlock";
			itemDef.modelID = 21193;
			itemDef.modelZoom = 4000;
			itemDef.description = "A pet Warlock.".getBytes();
			break;
			
		case 15041:
			itemDef.name = "Mini Ancient Archer";
			itemDef.modelID = 21189;
			itemDef.modelZoom = 4000;
			itemDef.description = "A pet Archer.".getBytes();
			break;
			
		case 15042:
			itemDef.name = "Mini Ancient Samurai";
			itemDef.modelID = 21166;
			itemDef.modelZoom = 4000;
			itemDef.description = "A pet Samurai.".getBytes();
			break;
			
		case 18333:
			itemDef.name = "Pet Flambeed";
			itemDef.modelID = 13905;
			//itemDef.modelID = 13906;
			//itemDef.modelID = 13907;
			itemDef.modelRotationY = 72;
			itemDef.modelRotationX = 136;
			itemDef.modelZoom = 8000;
			itemDef.description = "A pet for killing lots of Flambeeds.".getBytes();
			break;
			
		case 18834:
			itemDef.name = "Pet Karamel";
			itemDef.modelID = 13337;
			itemDef.modelZoom = 3500;
			itemDef.description = "mmmm... Karamel.".getBytes();
			break;
			
		case 18400:
			itemDef.name = "Gelatin spawn";
			itemDef.modelID = 13442;
			itemDef.originalModelColors = new int[1];
			itemDef.originalModelColors[0] = 103;
			itemDef.modifiedModelColors = new int[1];
			itemDef.modifiedModelColors[0] = 935;
			itemDef.modelZoom = 5500;
			itemDef.description = "a White Gelatin spawn.".getBytes();
			break;
			
		case 18401:
			itemDef.name = "Gelatin spawn";
			itemDef.modelID = 13442;
			itemDef.originalModelColors = new int[1];
			itemDef.originalModelColors[0] = 5056;
			itemDef.modifiedModelColors = new int[1];
			itemDef.modifiedModelColors[0] = 935;
			itemDef.modelZoom = 5500;
			itemDef.description = "a Orange Gelatin spawn.".getBytes();
			break;
			
		case 18402:
			itemDef.name = "Gelatin spawn";
			itemDef.modelID = 13442;
			itemDef.originalModelColors = new int[1];
			itemDef.originalModelColors[0] = 41932;
			itemDef.modifiedModelColors = new int[1];
			itemDef.modifiedModelColors[0] = 935;
			itemDef.modelZoom = 5500;
			itemDef.description = "a Blue Gelatin spawn.".getBytes();
			break;
			
		case 18403:
			itemDef.name = "Gelatin spawn";
			itemDef.modelID = 13442;
			itemDef.modelZoom = 5500;
			itemDef.description = "a Red Gelatin spawn.".getBytes();
			break;
			
		case 18404:
			itemDef.name = "Gelatin spawn";
			itemDef.modelID = 13442;
			itemDef.originalModelColors = new int[1];
			itemDef.originalModelColors[0] = 18343;
			itemDef.modifiedModelColors = new int[1];
			itemDef.modifiedModelColors[0] = 935;
			itemDef.modelZoom = 5500;
			itemDef.description = "a Green Gelatin spawn.".getBytes();
			break;
			
		case 18405:
			itemDef.name = "Gelatin spawn";
			itemDef.modelID = 13442;
			itemDef.originalModelColors = new int[1];
			itemDef.originalModelColors[0] = 6550;
			itemDef.modifiedModelColors = new int[1];
			itemDef.modifiedModelColors[0] = 935;
			itemDef.modelZoom = 5500;
			itemDef.description = "a Brown Gelatin spawn.".getBytes();
			break;
			
		case 18406:
			itemDef.name = "Pet Gorilla";
			itemDef.modelID = 31238;
			itemDef.originalModelColors = new int[1];
			itemDef.originalModelColors[0] = 10266;
			itemDef.modifiedModelColors = new int[1];
			itemDef.modifiedModelColors[0] = 28;
			itemDef.modelZoom = 15000;
			itemDef.description = "a Baby Demonic Gorilla.".getBytes();
			break;
			
		case 18836:
			itemDef.name = "Pet Dessourt";
			itemDef.modelID = 13694;
			itemDef.modelZoom = 3500;
			itemDef.description = "And now, for Dessourt.".getBytes();
			break;
			
		case 17600:
			itemDef.name = "Pet Skotizo";
			itemDef.modelID = 29835;
			itemDef.modelZoom = 3500;
			itemDef.description = "A pet Skotizo. yay.".getBytes();
			break;
			
		case 18837:
			itemDef.name = "Pet Culinomancer";
			itemDef.modelID = 12750;
			itemDef.modelZoom = 2500;
			itemDef.description = "Culinomancer.".getBytes();
			break;
			
		case 18835:
			itemDef.name = "Pet Agrith-Na-Na";
			itemDef.modelID = 13693;
			itemDef.modelZoom = 4750;
			itemDef.description = "Na Na Na Na. Na Na NAAA Na. Hey, hey, hey. Goodbye.".getBytes();
			break;
			
		case 16501:
			itemDef.name = "Pet Jubbly chick";
			itemDef.modelID = 26863;
			itemDef.modelZoom = 4000;
			itemDef.description = "A pet jubbly.".getBytes();
			break;
			
		case 10117:
			itemDef.name = "Cute creature";
			itemDef.modelID = 16954;
			itemDef.modelZoom = 2500;
			itemDef.description = "Awee... how cute.".getBytes();
			break;
			
		case 10115:
			itemDef.name = "Evil creature";
			itemDef.modelID = 16955;
			itemDef.modelZoom = 2500;
			itemDef.description = "A evil little guy..".getBytes();
			break;
			
		case 2740:
			itemDef.name = "??? casket";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Open";
			itemDef.description = "Open this casket for a random ??? reward!".getBytes();
			break;
			
		case 12789:
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Open";
			itemDef.description = "Open this casket for a random Clue scroll!".getBytes();
			break;
			
		case 19836:
			itemDef.name = "Firemaking casket";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = "Open";
			itemDef.description = "Open this casket for a random firemaking reward!".getBytes();
			break;	
			
		case 6645:
			itemDef.name = "Pet Raccoon";
			break;
			
		case 1855:
			itemDef.name = "Pet rockcrab";
			break;
			
		case 4520:
			itemDef.name = "Pet Inadequacy";
			break;
			
		case 7771:
			itemDef.name = "Clockwork cat";
			break;
			
		case 7761:
			itemDef.name = "Toy soldier";
			break;
			
		case 7765:
			itemDef.name = "Toy doll";
			break;
			
		case 13661:
			itemDef.itemActions = new String[5];
			itemDef.itemActions[1] = "Wield";
			itemDef.itemActions[4] = "Destroy";
			itemDef.name = "Inferno adze";
			itemDef.modelID = 41806;
			itemDef.modelZoom = 1762;
			itemDef.modelRotationY = 401;
			itemDef.modelRotationX = 207;
			itemDef.modelOffset2 = -4;
			itemDef.modelOffset1 = -8;
			itemDef.anInt204 = 0;
			itemDef.aByte205 = -10;
			itemDef.anInt165 = 40292;
			itemDef.anInt200 = 40292;
			itemDef.description = "Danger: risk of fire.".getBytes();
			break;
			
		case 7916:
			itemDef.name = "Pet shadow hound";
			itemDef.modelID = 26263;
			itemDef.modelZoom = 2000;
			itemDef.originalModelColors = new int[4];
			itemDef.originalModelColors[0] = 5281;
			itemDef.originalModelColors[1] = 5276;
			itemDef.originalModelColors[2] = 5272;
			itemDef.originalModelColors[3] = 5268;
			itemDef.modifiedModelColors = new int[4];
			itemDef.modifiedModelColors[0] = 22;
			itemDef.modifiedModelColors[1] = 18;
			itemDef.modifiedModelColors[2] = 142;
			itemDef.modifiedModelColors[3] = 138;
			break;
			
		case 272:
			itemDef.name = "Pet Goldfish";
			break;
			
		case 4138:
			itemDef.name = "Pet Pyrefiend";
			break;
			
		case 4033:
			itemDef.name = "Baby monkey";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = null;
			break;
			
			
		case 4179:
			itemDef.name = "Pet Broom?";
			break;
			
		case 13071:
			itemDef.name = "Chompy chick";
			break;
			
		case 4140:
			itemDef.name = "Pet infernal mage";
			break;
			
		case 8131:
			itemDef.name = "Pet skeleton warlord";
			break;
			
		case 12359:
			itemDef.name = "Leprechaun follower";
			itemDef.itemActions = new String[5];
			itemDef.itemActions[0] = null;
			break;
			
		case 1583:
			itemDef.name = "Pet phoenix";
			break;
			
		case 7500:
			itemDef.name = "Dwarf follower";
			break;
			
		case 771:
			itemDef.name = "Pet tree spirit";
			break;
			
		case 964:
			itemDef.name = "Spiritual follower";
			break;
			
		case 7986:
			itemDef.name = "Pet abyssal leech";
			break;
			
		case 7769:
			itemDef.name = "Toy Mouse";
			break;
			
		case 5565:
			itemDef.modelID = 21544;
			itemDef.modelZoom = 1800;
			itemDef.name = "Toy Penguin";
			break;
			
		case 553:
			itemDef.name = "Ghostly follower";
			break;
			
		case 11047:
			itemDef.name = "Hell rat";
			break;
			
		case 10998:
			itemDef.name = "Hell goblin";
			break;
			
		case 10731:
			itemDef.name = "Mutant";
			break;
			
		case 8888:
			itemDef.name = "Zanik(HAM)";
			break;
			
		case 8887:
			itemDef.name = "Zanik";
			break;
			
		case 12840:
			itemDef.name = "Soulless one";
			break;
			
		case 5076:
			itemDef.name = "Black swan";
			break;
			
		case 5077:
			itemDef.name = "White swan";
			break;
			
		case 7993:
			itemDef.name = "Pet shark";
			break;
			
		case 9952:
			itemDef.name = "Inslaved Imp";
			break;
			
		case 9970:
			itemDef.name = "Crimson Monarch";
			break;
			
		case 7914:
			itemDef.modelID = 26253;
			itemDef.modelZoom = 2000;
			itemDef.name = "German Shepard";
			break;
			
		case 8132:
			itemDef.name = "Guard Dog";
			break;
			
		case 9975:
			itemDef.name = "Pet Rabbit";
			break;
			
		case 10149:
			itemDef.name = "Pet salamander";
			break;
			
		case 10146:
			itemDef.name = "Pet salamander";
			break;
			
		case 10147:
			itemDef.name = "Pet salamander";
			break;
			
		case 10148:
			itemDef.name = "Pet salamander";
			break;
			
		case 9976:
			itemDef.name = "Pet chinchompa";
			break;
			
		case 9977:
			itemDef.name = "Pet chinchompa";
			break;
			
		case 11959:
			itemDef.name = "Pet chinchompa";
			break;
			
		case 9957:
			itemDef.name = "Pet kebbit";
			break;
			
		case 10023:
			itemDef.name = "Pet falcon";
			break;
			
		}
		
		if (itemDef.certTemplateID != -1)
			itemDef.toNote();
		return itemDef;
	}


	public static void nullLoader() {
		mruNodes2 = null;
		mruNodes1 = null;
		streamIndices = null;
		cache = null;
		stream = null;
	}

	public boolean method192(int j) {
		int k = anInt175;
		int l = anInt166;
		if (j == 1) {
			k = anInt197;
			l = anInt173;
		}
		if (k == -1)
			return true;
		boolean flag = true;
		if (!Model.method463(k))
			flag = false;
		if (l != -1 && !Model.method463(l))
			flag = false;
		return flag;
	}

	public static void unpackConfig(StreamLoader archive) {
		stream = new Stream(FileUtility.readFile(Signlink.findcachedir() + "obj.dat"));
		Stream stream = new Stream(FileUtility.readFile(Signlink.findcachedir() +  "obj.idx"));
		totalItems = stream.readUnsignedWord() + 21;
		System.out.println("Items Loaded: "+totalItems);
		streamIndices = new int[totalItems + 100000];
		int i = 2;
		for (int j = 0; j < totalItems - 21; j++) {
			streamIndices[j] = i;
			i += stream.readUnsignedWord();
		}

		cache = new ItemDef[10];
		for (int k = 0; k < 10; k++)
			cache[k] = new ItemDef();

	}

	public Model method194(int j) {
		int k = anInt175;
		int l = anInt166;
		if (j == 1) {
			k = anInt197;
			l = anInt173;
		}
		if (k == -1)
			return null;
		Model model = Model.method462(k);
		if (l != -1) {
			Model model_1 = Model.method462(l);
			Model aclass30_sub2_sub4_sub6s[] = { model, model_1 };
			model = new Model(2, aclass30_sub2_sub4_sub6s);
		}
		if (modifiedModelColors != null) {
			for (int i1 = 0; i1 < modifiedModelColors.length; i1++)
				model.method476(modifiedModelColors[i1],
						originalModelColors[i1]);

		}
		return model;
	}

	public boolean method195(int j) {
		int k = anInt165;
		int l = anInt188;
		int i1 = anInt185;
		if (j == 1) {
			k = anInt200;
			l = anInt164;
			i1 = anInt162;
		}
		if (k == -1)
			return true;
		boolean flag = true;
		if (!Model.method463(k))
			flag = false;
		if (l != -1 && !Model.method463(l))
			flag = false;
		if (i1 != -1 && !Model.method463(i1))
			flag = false;
		return flag;
	}

	public Model method196(int i) {
		int j = anInt165;
		int k = anInt188;
		int l = anInt185;
		if (i == 1) {
			j = anInt200;
			k = anInt164;
			l = anInt162;
		}
		if (j == -1)
			return null;
		Model model = Model.method462(j);
		if (k != -1)
			if (l != -1) {
				Model model_1 = Model.method462(k);
				Model model_3 = Model.method462(l);
				Model aclass30_sub2_sub4_sub6_1s[] = { model, model_1, model_3 };
				model = new Model(3, aclass30_sub2_sub4_sub6_1s);
			} else {
				Model model_2 = Model.method462(k);
				Model aclass30_sub2_sub4_sub6s[] = { model, model_2 };
				model = new Model(2, aclass30_sub2_sub4_sub6s);
			}
		if (i == 0 && aByte205 != 0)
			model.method475(0, aByte205, 0);
		if (i == 1 && aByte154 != 0)
			model.method475(0, aByte154, 0);
		applyTexturing(model, id);
		if (modifiedModelColors != null) {
			for (int i1 = 0; i1 < modifiedModelColors.length; i1++)
				model.method476(modifiedModelColors[i1], originalModelColors[i1]);

		}
		return model;
	}

	private void setDefaults() {
		modelID = 0;
		name = null;
		description = null;
		modifiedModelColors = null;
		originalModelColors = null;
		modelZoom = 2000;
		modelRotationY = 0;
		modelRotationX = 0;
		anInt204 = 0;
		modelOffset1 = 0;
		modelOffset2 = 0;
		stackable = false;
		value = 1;
		membersObject = false;
		groundActions = null;
		itemActions = null;
		anInt165 = -1;
		anInt188 = -1;
		aByte205 = 0;
		anInt200 = -1;
		anInt164 = -1;
		aByte154 = 0;
		anInt185 = -1;
		anInt162 = -1;
		anInt175 = -1;
		anInt166 = -1;
		anInt197 = -1;
		anInt173 = -1;
		stackIDs = null;
		stackAmounts = null;
		certID = -1;
		certTemplateID = -1;
		anInt167 = 128;
		anInt192 = 128;
		anInt191 = 128;
		anInt196 = 0;
		anInt184 = 0;
		team = 0;
	}


	private void toNote() {
		ItemDef itemDef = forID(certTemplateID);
		modelID = itemDef.modelID;
		modelZoom = itemDef.modelZoom;
		modelRotationY = itemDef.modelRotationY;
		modelRotationX = itemDef.modelRotationX;

		anInt204 = itemDef.anInt204;
		modelOffset1 = itemDef.modelOffset1;
		modelOffset2 = itemDef.modelOffset2;
		modifiedModelColors = itemDef.modifiedModelColors;
		originalModelColors = itemDef.originalModelColors;
		ItemDef itemDef_1 = forID(certID);
		name = itemDef_1.name;
		membersObject = itemDef_1.membersObject;
		value = itemDef_1.value;
		String s = "a";
		char c = itemDef_1.name.charAt(0);
		if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			s = "an";
		description = ("Swap this note at any bank for " + s + " " + itemDef_1.name + ".").getBytes();
		stackable = true;
	}
	
	public static Sprite getSprite(int id, int size, int color, int zoom) {
		if (id == 0) {
			return Client.cacheSprite[326];
		}
		ItemDef item = forID(id);
		if(item.stackIDs == null) {
			size = -1;
		}
		if(size > 1) {
			int i1 = -1;
			for(int j1 = 0; j1 < 10; j1++) {
				if(size >= item.stackAmounts[j1] && item.stackAmounts[j1] != 0) {
					i1 = item.stackIDs[j1];
				}
			}
			if(i1 != -1) {
				item = forID(i1);
			}
		}
		Model model = item.method201(1);
		if(model == null)
			return null;
		Sprite image = new Sprite(32, 32);
		int k1 = Rasterizer.centerX;
		int l1 = Rasterizer.centerY;
		int ai[] = Rasterizer.anIntArray1472;
		int ai1[] = DrawingArea.pixels;
		float depthBuffer[] = DrawingArea.depthBuffer;
		int i2 = DrawingArea.width;
		int j2 = DrawingArea.height;
		int k2 = DrawingArea.topX;
		int l2 = DrawingArea.bottomX;
		int i3 = DrawingArea.topY;
		int j3 = DrawingArea.bottomY;
		Rasterizer.aBoolean1464 = false;
		DrawingArea.initDrawingArea(32, 32, image.myPixels, new float[32*32]);
		DrawingArea.drawPixels(32, 0, 0, 0, 32);
		Rasterizer.method364();
		int itemZoom = item.modelZoom * zoom - 500;
		int l3 = Rasterizer.anIntArray1470[item.modelRotationY] * itemZoom >> 16;
		int i4 = Rasterizer.anIntArray1471[item.modelRotationY] * itemZoom >> 16;
		model.method482(item.modelRotationX, item.anInt204, item.modelRotationY, item.modelOffset1, l3 + model.modelHeight / 2 + item.modelOffset2, i4 + item.modelOffset2);
		if(color == 0) {
			for(int index = 31; index >= 0; index--) {
				for(int index2 = 31; index2 >= 0; index2--)
					if(image.myPixels[index + index2 * 32] == 0 && index > 0 && index2 > 0 && image.myPixels[(index - 1) + (index2 - 1) * 32] > 0)
						image.myPixels[index + index2 * 32] = 0x302020;
			}
		}
		DrawingArea.initDrawingArea(j2, i2, ai1, depthBuffer);
		DrawingArea.setDrawingArea(j3, k2, l2, i3);
		Rasterizer.centerX = k1;
		Rasterizer.centerY = l1;
		Rasterizer.anIntArray1472 = ai;
		Rasterizer.aBoolean1464 = true;
		if (item.stackable) {
			image.cropWidth = 33;
		} else {
			image.cropWidth = 32;
		}
		image.anInt1445 = size;

		return image;
	}
	
	public static Sprite getSprite(int i, int j, int k) {
		if (k == 0) {
			Sprite sprite = (Sprite) mruNodes1.insertFromCache(i);
			if (sprite != null && sprite.anInt1445 != j && sprite.anInt1445 != -1) {
				
				sprite.unlink();
				sprite = null;
			}
			if (sprite != null) {
				return sprite;
			}
		}
		ItemDef itemDef = forID(i);
		if (itemDef.stackIDs == null)
			j = -1;
		if (j > 1) {
			int i1 = -1;
			for (int j1 = 0; j1 < 10; j1++)
				if (j >= itemDef.stackAmounts[j1]
						&& itemDef.stackAmounts[j1] != 0)
					i1 = itemDef.stackIDs[j1];

			if (i1 != -1)
				itemDef = forID(i1);
		}
		Model model = itemDef.method201(1);
		if (model == null)
			return null;
		Sprite sprite = null;
		if (itemDef.certTemplateID != -1) {
			sprite = getSprite(itemDef.certID, 10, -1);
			if (sprite == null)
				return null;
		}
		Sprite enabledSprite = new Sprite(32, 32);
		int k1 = Rasterizer.centerX;
		int l1 = Rasterizer.centerY;
		int ai[] = Rasterizer.anIntArray1472;
		int ai1[] = DrawingArea.pixels;
		float depthBuffer[] = DrawingArea.depthBuffer;
		int i2 = DrawingArea.width;
		int j2 = DrawingArea.height;
		int k2 = DrawingArea.topX;
		int l2 = DrawingArea.bottomX;
		int i3 = DrawingArea.topY;
		int j3 = DrawingArea.bottomY;
		Rasterizer.aBoolean1464 = false;
		DrawingArea.initDrawingArea(32, 32, enabledSprite.myPixels, new float[32*32]);
		DrawingArea.method336(32, 0, 0, 0, 32);
		Rasterizer.method364();
		int k3 = itemDef.modelZoom;
		if (k == -1)
			k3 = (int) ((double) k3 * 1.5D);
		if (k > 0)
			k3 = (int) ((double) k3 * 1.04D);
		int l3 = Rasterizer.anIntArray1470[itemDef.modelRotationY] * k3 >> 16;
		int i4 = Rasterizer.anIntArray1471[itemDef.modelRotationY] * k3 >> 16;
		model.method482(itemDef.modelRotationX, itemDef.anInt204,
				itemDef.modelRotationY, itemDef.modelOffset1, l3
						+ model.modelHeight / 2 + itemDef.modelOffset2, i4
						+ itemDef.modelOffset2);
		for (int i5 = 31; i5 >= 0; i5--) {
			for (int j4 = 31; j4 >= 0; j4--)
				if (enabledSprite.myPixels[i5 + j4 * 32] == 0)
					if (i5 > 0
							&& enabledSprite.myPixels[(i5 - 1) + j4 * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;
					else if (j4 > 0
							&& enabledSprite.myPixels[i5 + (j4 - 1) * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;
					else if (i5 < 31
							&& enabledSprite.myPixels[i5 + 1 + j4 * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;
					else if (j4 < 31
							&& enabledSprite.myPixels[i5 + (j4 + 1) * 32] > 1)
						enabledSprite.myPixels[i5 + j4 * 32] = 1;

		}

		if (k > 0) {
			for (int j5 = 31; j5 >= 0; j5--) {
				for (int k4 = 31; k4 >= 0; k4--)
					if (enabledSprite.myPixels[j5 + k4 * 32] == 0)
						if (j5 > 0
								&& enabledSprite.myPixels[(j5 - 1) + k4 * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;
						else if (k4 > 0
								&& enabledSprite.myPixels[j5 + (k4 - 1) * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;
						else if (j5 < 31
								&& enabledSprite.myPixels[j5 + 1 + k4 * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;
						else if (k4 < 31
								&& enabledSprite.myPixels[j5 + (k4 + 1) * 32] == 1)
							enabledSprite.myPixels[j5 + k4 * 32] = k;

			}

		} else if (k == 0) {
			for (int k5 = 31; k5 >= 0; k5--) {
				for (int l4 = 31; l4 >= 0; l4--)
					if (enabledSprite.myPixels[k5 + l4 * 32] == 0
							&& k5 > 0
							&& l4 > 0
							&& enabledSprite.myPixels[(k5 - 1) + (l4 - 1) * 32] > 0)
						enabledSprite.myPixels[k5 + l4 * 32] = 0x302020;

			}

		}
		if (itemDef.certTemplateID != -1) {
			int l5 = sprite.cropWidth;
			int j6 = sprite.anInt1445;
			sprite.cropWidth = 32;
			sprite.anInt1445 = 32;
			sprite.drawSprite(0, 0);
			sprite.cropWidth = l5;
			sprite.anInt1445 = j6;
		}
		if (k == 0)
			mruNodes1.removeFromCache(enabledSprite, i);
		DrawingArea.initDrawingArea(j2, i2, ai1, depthBuffer);
		DrawingArea.setDrawingArea(j3, k2, l2, i3);
		Rasterizer.centerX = k1;
		Rasterizer.centerY = l1;
		Rasterizer.anIntArray1472 = ai;
		Rasterizer.aBoolean1464 = true;
		if (itemDef.stackable)
			enabledSprite.cropWidth = 33;
		else
			enabledSprite.cropWidth = 32;
		enabledSprite.anInt1445 = j;
		return enabledSprite;
	}

	public Model method201(int i) {
		if (stackIDs != null && i > 1) {
			int j = -1;
			for (int k = 0; k < 10; k++)
				if (i >= stackAmounts[k] && stackAmounts[k] != 0)
					j = stackIDs[k];

			if (j != -1)
				return forID(j).method201(1);
		}
		Model model = (Model) mruNodes2.insertFromCache(id);
		if (model != null)
			return model;
		model = Model.method462(modelID);
		if (model == null)
			return null;
		applyTexturing(model, id);
		if (anInt167 != 128 || anInt192 != 128 || anInt191 != 128)
			model.method478(anInt167, anInt191, anInt192);
		if (modifiedModelColors != null) {
			for (int l = 0; l < modifiedModelColors.length; l++)
				model.method476(modifiedModelColors[l], originalModelColors[l]);

		}
		model.method479(64 + anInt196, 768 + anInt184, -50, -10, -50, true);
		model.aBoolean1659 = true;
		mruNodes2.removeFromCache(model, id);
		return model;
	}

	public Model method202(int i) {
		if (stackIDs != null && i > 1) {
			int j = -1;
			for (int k = 0; k < 10; k++)
				if (i >= stackAmounts[k] && stackAmounts[k] != 0)
					j = stackIDs[k];

			if (j != -1)
				return forID(j).method202(1);
		}
		Model model = Model.method462(modelID);
		if (model == null)
			return null;
		if (modifiedModelColors != null) {
			for (int l = 0; l < modifiedModelColors.length; l++)
				model.method476(modifiedModelColors[l], originalModelColors[l]);

		}
		return model;
	}

	private void readValues(Stream stream) {
		do {
			int i = stream.readUnsignedByte();
			if (i == 0)
				return;
			if (i == 1)
				modelID = stream.readUnsignedWord();
			else if (i == 2)
				name = stream.readString();
			else if (i == 3)
				description = stream.readBytes();
			else if (i == 4)
				modelZoom = stream.readUnsignedWord();
			else if (i == 5)
				modelRotationY = stream.readUnsignedWord();
			else if (i == 6)
				modelRotationX = stream.readUnsignedWord();
			else if (i == 7) {
				modelOffset1 = stream.readUnsignedWord();
				if (modelOffset1 > 32767)
					modelOffset1 -= 0x10000;
			} else if (i == 8) {
				modelOffset2 = stream.readUnsignedWord();
				if (modelOffset2 > 32767)
					modelOffset2 -= 0x10000;
			} else if (i == 11)
				stackable = true;
			else if (i == 12)
				value = stream.readDWord();
			else if (i == 16)
				membersObject = true;
			else if (i == 23) {
				anInt165 = stream.readUnsignedWord();
				aByte205 = stream.readSignedByte();
			} else if (i == 24)
				anInt188 = stream.readUnsignedWord();
			else if (i == 25) {
				anInt200 = stream.readUnsignedWord();
				aByte154 = stream.readSignedByte();
			} else if (i == 26)
				anInt164 = stream.readUnsignedWord();
			else if (i >= 30 && i < 35) {
				if (groundActions == null)
					groundActions = new String[5];
				groundActions[i - 30] = stream.readString();
				if (groundActions[i - 30].equalsIgnoreCase("hidden"))
					groundActions[i - 30] = null;
			} else if (i >= 35 && i < 40) {
				if (itemActions == null)
					itemActions = new String[5];
				itemActions[i - 35] = stream.readString();
			} else if (i == 40) {
				int j = stream.readUnsignedByte();
				originalModelColors = new int[j];
				modifiedModelColors = new int[j];
				for (int k = 0; k < j; k++) {
					originalModelColors[k] = stream.readUnsignedWord();
					modifiedModelColors[k] = stream.readUnsignedWord();
				}

			} else if (i == 78)
				anInt185 = stream.readUnsignedWord();
			else if (i == 79)
				anInt162 = stream.readUnsignedWord();
			else if (i == 90)
				anInt175 = stream.readUnsignedWord();
			else if (i == 91)
				anInt197 = stream.readUnsignedWord();
			else if (i == 92)
				anInt166 = stream.readUnsignedWord();
			else if (i == 93)
				anInt173 = stream.readUnsignedWord();
			else if (i == 95)
				anInt204 = stream.readUnsignedWord();
			else if (i == 97)
				certID = stream.readUnsignedWord();
			else if (i == 98)
				certTemplateID = stream.readUnsignedWord();
			else if (i >= 100 && i < 110) {
				if (stackIDs == null) {
					stackIDs = new int[10];
					stackAmounts = new int[10];
				}
				stackIDs[i - 100] = stream.readUnsignedWord();
				stackAmounts[i - 100] = stream.readUnsignedWord();
			} else if (i == 110)
				anInt167 = stream.readUnsignedWord();
			else if (i == 111)
				anInt192 = stream.readUnsignedWord();
			else if (i == 112)
				anInt191 = stream.readUnsignedWord();
			else if (i == 113)
				anInt196 = stream.readSignedByte();
			else if (i == 114)
				anInt184 = stream.readSignedByte() * 5;
			else if (i == 115)
				team = stream.readUnsignedByte();
		} while (true);
	}

	private ItemDef() {
		id = -1;
	}

	private byte aByte154;
	public int value;// anInt155
	public int[] modifiedModelColors;// newModelColor
	public int id;// anInt157
	static MRUNodes mruNodes1 = new MRUNodes(100);
	public static MRUNodes mruNodes2 = new MRUNodes(50);
	public int[] originalModelColors;
	public boolean membersObject;// aBoolean161
	private int anInt162;
	public int certTemplateID;
	public int anInt164;// femArmModel
	public int anInt165;// maleWieldModel
	private int anInt166;
	private int anInt167;
	public String groundActions[];
	public int modelOffset1;
	public String name;// itemName
	private static ItemDef[] cache;
	private int anInt173;
	public int modelID;// dropModel
	public int anInt175;
	public boolean stackable;// itemStackable
	public byte[] description;// itemExamine
	public int certID;
	private static int cacheIndex;
	public int modelZoom;
	public static boolean isMembers = true;
	private static Stream stream;
	private int anInt184;
	private int anInt185;
	public int anInt188;// maleArmModel
	public String itemActions[];// itemMenuOption
	public int modelRotationY;// modelRotateUp
	private int anInt191;
	private int anInt192;
	public int[] stackIDs;// modelStack
	public int modelOffset2;//
	private static int[] streamIndices;
	private int anInt196;
	public int anInt197;
	public int modelRotationX;// modelRotateRight
	public int anInt200;// femWieldModel
	public int[] stackAmounts;// itemAmount
	public int team;
	public static int totalItems;
	public int anInt204;// modelPositionUp
	private byte aByte205;

}
