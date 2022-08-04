package xyz.archiebaldry.abtools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.archiebaldry.abtools.item.PaxelItem;

public class Abtools implements ModInitializer {

	public static final String MOD_ID  = "abtools";

	// Paxels
	public static final PaxelItem WOODEN_PAXEL = new PaxelItem(ToolMaterials.WOOD, new FabricItemSettings().group(ItemGroup.TOOLS));
	public static final PaxelItem STONE_PAXEL = new PaxelItem(ToolMaterials.STONE, new FabricItemSettings().group(ItemGroup.TOOLS));
	public static final PaxelItem GOLDEN_PAXEL = new PaxelItem(ToolMaterials.GOLD, new FabricItemSettings().group(ItemGroup.TOOLS));
	public static final PaxelItem IRON_PAXEL = new PaxelItem(ToolMaterials.IRON, new FabricItemSettings().group(ItemGroup.TOOLS));
	public static final PaxelItem DIAMOND_PAXEL = new PaxelItem(ToolMaterials.DIAMOND, new FabricItemSettings().group(ItemGroup.TOOLS));
	public static final PaxelItem NETHERITE_PAXEL = new PaxelItem(ToolMaterials.NETHERITE, new FabricItemSettings().group(ItemGroup.TOOLS).fireproof());

	@Override
	public void onInitialize() {
		// Register paxels
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wooden_paxel"), WOODEN_PAXEL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "stone_paxel"), STONE_PAXEL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "golden_paxel"), GOLDEN_PAXEL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "iron_paxel"), IRON_PAXEL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "diamond_paxel"), DIAMOND_PAXEL);
		Registry.register(Registry.ITEM, new Identifier(MOD_ID, "netherite_paxel"), NETHERITE_PAXEL);
	}

}
