package betweenlands.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import betweenlands.lib.Ids;
import betweenlands.lib.Names;
import net.minecraft.item.Item;

public class Items {

	public static Item swampTalisman;
	public static Item swampTalismanPiece1;
	public static Item swampTalismanPiece2;
	public static Item swampTalismanPiece3;
	public static Item swampTalismanPiece4;
	
	public static void init() {
		swampTalisman = new SwampTalisman(Ids.swampTalisman_actual);
		swampTalismanPiece1 = new SwampTalismanPiece1(Ids.swampTalismanPiece1_actual);
		swampTalismanPiece2 = new SwampTalismanPiece2(Ids.swampTalismanPiece2_actual);
		swampTalismanPiece3 = new SwampTalismanPiece3(Ids.swampTalismanPiece3_actual);
		swampTalismanPiece4 = new SwampTalismanPiece4(Ids.swampTalismanPiece4_actual);
	}
	
	public static void addNames() {
		
		LanguageRegistry.addName(swampTalisman, Names.swampTalisman_name);
		LanguageRegistry.addName(swampTalismanPiece1, Names.swampTalismanPiece1_name);
		LanguageRegistry.addName(swampTalismanPiece2, Names.swampTalismanPiece2_name);
		LanguageRegistry.addName(swampTalismanPiece3, Names.swampTalismanPiece3_name);
		LanguageRegistry.addName(swampTalismanPiece4, Names.swampTalismanPiece4_name);
	}
	
}
