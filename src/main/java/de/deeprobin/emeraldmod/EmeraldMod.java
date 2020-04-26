package de.deeprobin.emeraldmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EmeraldMod implements ModInitializer {

	public static final ToolMaterial TOOL_MATERIAL = new EmeraldMaterial();
	public static final ArmorMaterial ARMOR_MATERIAL = new EmeraldArmorMaterial();
	public static final Item EMERALD_SWORD = new SwordItem(TOOL_MATERIAL, 4, -1.8F, (new Item.Settings()).group(ItemGroup.COMBAT));
	public static final Item EMERALD_PICKAXE = new EmeraldPickaxe(TOOL_MATERIAL, 2, -2.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
	public static final Item EMERALD_AXE = new EmeraldAxe(TOOL_MATERIAL, 6.0F, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS));
	public static final Item EMERALD_SHOVEL = new ShovelItem(TOOL_MATERIAL, 2.5F, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS));
	public static final Item EMERALD_HOE = new HoeItem(TOOL_MATERIAL, 0.0F, (new Item.Settings()).group(ItemGroup.TOOLS));

	public static final Item EMERALD_HELMET = new ArmorItem(ARMOR_MATERIAL, EquipmentSlot.HEAD, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item EMERALD_CHESTPLATE = new ArmorItem(ARMOR_MATERIAL, EquipmentSlot.CHEST, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item EMERALD_LEGGINGS = new ArmorItem(ARMOR_MATERIAL, EquipmentSlot.LEGS, (new Item.Settings().group(ItemGroup.COMBAT)));
	public static final Item EMERALD_BOOTS = new ArmorItem(ARMOR_MATERIAL, EquipmentSlot.FEET, (new Item.Settings().group(ItemGroup.COMBAT)));

	public static final Item EMERALD_HORSE_ARMOR = new HorseArmorItem(16, "emerald", (new Item.Settings()).maxCount(1).group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("emerald_mod", "emerald_sword"), EMERALD_SWORD);
		Registry.register(Registry.ITEM, new Identifier("emerald_mod", "emerald_pickaxe"), EMERALD_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("emerald_mod", "emerald_axe"), EMERALD_AXE);
		Registry.register(Registry.ITEM, new Identifier("emerald_mod", "emerald_shovel"), EMERALD_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("emerald_mod", "emerald_hoe"), EMERALD_HOE);
		Registry.register(Registry.ITEM, new Identifier("emerald_mod", "emerald_helmet"), EMERALD_HELMET);
		Registry.register(Registry.ITEM, new Identifier("emerald_mod", "emerald_chestplate"), EMERALD_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier("emerald_mod", "emerald_leggings"), EMERALD_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier("emerald_mod", "emerald_boots"), EMERALD_BOOTS);
		Registry.register(Registry.ITEM, new Identifier("emerald_mod", "emerald_horse_armor"), EMERALD_HORSE_ARMOR);
	}
}
