package net.fakerac.racextras;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.fakerac.racextras.RacExtras.Blocks.*;

public class RacExtras implements ModInitializer {
	public static final String MOD_ID = "racextras";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


		Blocks.init();
		Items.init();

	}

	public static Identifier identify(String path) {
		return new Identifier(MOD_ID, path);
	}

	public static final class Blocks {

		// Definitions

		// Bookshelves
		public static final Block SPRUCE_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));
		public static final Block BIRCH_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));
		public static final Block JUNGLE_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));
		public static final Block ACACIA_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));
		public static final Block DARK_OAK_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));
		public static final Block CRIMSON_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));
		public static final Block WARPED_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));
		public static final Block MANGROVE_BOOKSHELF = new Block(FabricBlockSettings.of(Material.WOOD).strength(4.0f).sounds(BlockSoundGroup.WOOD));

		// Nether Rocks/Soil
		public static final Block BASALT_DUST = new FallingBlock(FabricBlockSettings.of(Material.SOIL).strength(0.5f, 0.5f).sounds(BlockSoundGroup.SAND));


		private static void init() {
			register("spruce_bookshelf", SPRUCE_BOOKSHELF);
			register("birch_bookshelf", BIRCH_BOOKSHELF);
			register("jungle_bookshelf", JUNGLE_BOOKSHELF);
			register("acacia_bookshelf", ACACIA_BOOKSHELF);
			register("dark_oak_bookshelf", DARK_OAK_BOOKSHELF);
			register("crimson_bookshelf", CRIMSON_BOOKSHELF);
			register("warped_bookshelf", WARPED_BOOKSHELF);
			register("mangrove_bookshelf", MANGROVE_BOOKSHELF);
			register("basalt_dust", BASALT_DUST);
		}

		private static void register(String name, Block block) {
			Registry.register(Registry.BLOCK, identify(name), block);
		}
	}

	public static final class Items {

		// Definitions

		// Bookshelves
		public static final Item SPRUCE_BOOKSHELF_ITEM = new BlockItem(SPRUCE_BOOKSHELF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
		public static final Item BIRCH_BOOKSHELF_ITEM = new BlockItem(BIRCH_BOOKSHELF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
		public static final Item JUNGLE_BOOKSHELF_ITEM = new BlockItem(JUNGLE_BOOKSHELF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
		public static final Item ACACIA_BOOKSHELF_ITEM = new BlockItem(ACACIA_BOOKSHELF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
		public static final Item DARK_OAK_BOOKSHELF_ITEM = new BlockItem(DARK_OAK_BOOKSHELF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
		public static final Item CRIMSON_BOOKSHELF_ITEM = new BlockItem(CRIMSON_BOOKSHELF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
		public static final Item WARPED_BOOKSHELF_ITEM = new BlockItem(WARPED_BOOKSHELF, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

		// Nether Rocks/Soil
		public static final Item BASALT_DUST_ITEM = new BlockItem(BASALT_DUST, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

		private static void init() {
			register("spruce_bookshelf", SPRUCE_BOOKSHELF_ITEM);
			register("birch_bookshelf", BIRCH_BOOKSHELF_ITEM);
			register("jungle_bookshelf", JUNGLE_BOOKSHELF_ITEM);
			register("acacia_bookshelf", ACACIA_BOOKSHELF_ITEM);
			register("dark_oak_bookshelf", DARK_OAK_BOOKSHELF_ITEM);
			register("crimson_bookshelf", CRIMSON_BOOKSHELF_ITEM);
			register("warped_bookshelf", WARPED_BOOKSHELF_ITEM);
			register("basalt_dust", BASALT_DUST_ITEM);
		}

		private static void register (String name, Item item) {
			Registry.register(Registry.ITEM, identify(name), item);
		}
	}
}

