package net.fakerac.racextras;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RacExtras implements ModInitializer {
	public static final String modid = "racextras";

	public static final Logger LOGGER = LoggerFactory.getLogger(modid);


	public static final Item FABRIC_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Block SPRUCE_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));
	public static final Block BIRCH_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));
	public static final Block JUNGLE_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));
	public static final Block ACACIA_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));
	public static final Block DARK_OAK_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));
	public static final Block CRIMSON_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));
	public static final Block WARPED_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));
	public static final Block MANGROVE_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.ITEM, new Identifier(modid, "fabric_item"), FABRIC_ITEM);
		Registry.register(Registry.BLOCK, new Identifier(modid, "spruce_bookshelf"), SPRUCE_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier(modid, "spruce_bookshelf"), new BlockItem(SPRUCE_BOOKSHELF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(modid, "birch_bookshelf"), BIRCH_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier(modid, "birch_bookshelf"), new BlockItem(BIRCH_BOOKSHELF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(modid, "jungle_bookshelf"), JUNGLE_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier(modid, "jungle_bookshelf"), new BlockItem(JUNGLE_BOOKSHELF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(modid, "acacia_bookshelf"), ACACIA_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier(modid, "acacia_bookshelf"), new BlockItem(ACACIA_BOOKSHELF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(modid, "dark_oak_bookshelf"), DARK_OAK_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier(modid, "dark_oak_bookshelf"), new BlockItem(DARK_OAK_BOOKSHELF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(modid, "crimson_bookshelf"), CRIMSON_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier(modid, "crimson_bookshelf"), new BlockItem(CRIMSON_BOOKSHELF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(modid, "warped_bookshelf"), WARPED_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier(modid, "warped_bookshelf"), new BlockItem(WARPED_BOOKSHELF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier(modid, "mangrove_bookshelf"), MANGROVE_BOOKSHELF);
		Registry.register(Registry.ITEM, new Identifier(modid, "mangrove_bookshelf"), new BlockItem(MANGROVE_BOOKSHELF, new FabricItemSettings()));

	}
}

