package net.fakerac.racextras;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fakerac.racextras.blocks.LogBlock;
import net.fakerac.racextras.blocks.PublicFurnace;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.fakerac.racextras.RacExtras.Blocks.*;
import static net.minecraft.block.Blocks.BOOKSHELF;
import static net.minecraft.block.Blocks.OAK_LOG;

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
		public static final Block SPRUCE_BOOKSHELF = new Block(FabricBlockSettings.copyOf(BOOKSHELF));
		public static final Block BIRCH_BOOKSHELF = new Block(FabricBlockSettings.copyOf(BOOKSHELF));
		public static final Block JUNGLE_BOOKSHELF = new Block(FabricBlockSettings.copyOf(BOOKSHELF));
		public static final Block ACACIA_BOOKSHELF = new Block(FabricBlockSettings.copyOf(BOOKSHELF));
		public static final Block DARK_OAK_BOOKSHELF = new Block(FabricBlockSettings.copyOf(BOOKSHELF));
		public static final Block CRIMSON_BOOKSHELF = new Block(FabricBlockSettings.copyOf(BOOKSHELF));
		public static final Block WARPED_BOOKSHELF = new Block(FabricBlockSettings.copyOf(BOOKSHELF));
		public static final Block AZALEA_BOOKSHELF = new Block(FabricBlockSettings.copyOf(BOOKSHELF));
		public static final Block MANGROVE_BOOKSHELF = new Block(FabricBlockSettings.copyOf(BOOKSHELF));

		// Nether Rocks/Soil
		public static final Block BASALT_DUST = new FallingBlock(FabricBlockSettings.of(Material.SOIL).strength(0.5f, 0.5f).sounds(BlockSoundGroup.SAND));

		// Azalea
	    public static final Block AZALEA_LOG = new PillarBlock(FabricBlockSettings.of(Material.WOOD, MapColor.DARK_GREEN).sounds(BlockSoundGroup.WOOD).strength(2.0F));
		public static final Block AZALEA_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD, MapColor.GREEN).sounds(BlockSoundGroup.WOOD).strength(2.0F, 3.0F));

		// Tile Entities
		public static final PublicFurnace DEEPSLATE_FURNACE = new PublicFurnace(FabricBlockSettings.of(Material.STONE).strength(3.5f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE));


		private static void init() {
			register("spruce_bookshelf", SPRUCE_BOOKSHELF);
			register("birch_bookshelf", BIRCH_BOOKSHELF);
			register("jungle_bookshelf", JUNGLE_BOOKSHELF);
			register("acacia_bookshelf", ACACIA_BOOKSHELF);
			register("dark_oak_bookshelf", DARK_OAK_BOOKSHELF);
			register("crimson_bookshelf", CRIMSON_BOOKSHELF);
			register("warped_bookshelf", WARPED_BOOKSHELF);
			register("azalea_bookshelf", AZALEA_BOOKSHELF);
			register("mangrove_bookshelf", MANGROVE_BOOKSHELF);
			register("basalt_dust", BASALT_DUST);
			register("deepslate_furnace", DEEPSLATE_FURNACE);
			register("azalea_log", AZALEA_LOG);
			register("azalea_planks", AZALEA_PLANKS);
		}

		private static void register(String name, Block block) {
			Registry.register(Registry.BLOCK, identify(name), block);
		}
	}

	public static final class Items {

		// Definitions
		private static final FabricItemSettings buildingBlockItem = new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS);

		// Bookshelves
		public static final Item SPRUCE_BOOKSHELF_ITEM = new BlockItem(SPRUCE_BOOKSHELF, buildingBlockItem);
		public static final Item BIRCH_BOOKSHELF_ITEM = new BlockItem(BIRCH_BOOKSHELF, buildingBlockItem);
		public static final Item JUNGLE_BOOKSHELF_ITEM = new BlockItem(JUNGLE_BOOKSHELF, buildingBlockItem);
		public static final Item ACACIA_BOOKSHELF_ITEM = new BlockItem(ACACIA_BOOKSHELF, buildingBlockItem);
		public static final Item DARK_OAK_BOOKSHELF_ITEM = new BlockItem(DARK_OAK_BOOKSHELF, buildingBlockItem);
		public static final Item CRIMSON_BOOKSHELF_ITEM = new BlockItem(CRIMSON_BOOKSHELF, buildingBlockItem);
		public static final Item WARPED_BOOKSHELF_ITEM = new BlockItem(WARPED_BOOKSHELF, buildingBlockItem);
		public static final Item AZALEA_BOOKSHELF_ITEM = new BlockItem(AZALEA_BOOKSHELF, buildingBlockItem);

		// Nether Rocks/Soil
		public static final Item BASALT_DUST_ITEM = new BlockItem(BASALT_DUST, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

		public static final Item AZALEA_LOG_ITEM = new BlockItem(AZALEA_LOG, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
		public static final Item AZALEA_PLANKS_ITEM = new BlockItem(AZALEA_PLANKS, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));

		private static void init() {
			register("spruce_bookshelf", SPRUCE_BOOKSHELF_ITEM);
			register("birch_bookshelf", BIRCH_BOOKSHELF_ITEM);
			register("jungle_bookshelf", JUNGLE_BOOKSHELF_ITEM);
			register("acacia_bookshelf", ACACIA_BOOKSHELF_ITEM);
			register("dark_oak_bookshelf", DARK_OAK_BOOKSHELF_ITEM);
			register("crimson_bookshelf", CRIMSON_BOOKSHELF_ITEM);
			register("warped_bookshelf", WARPED_BOOKSHELF_ITEM);
			register("azalea_bookshelf", AZALEA_BOOKSHELF_ITEM);
			register("basalt_dust", BASALT_DUST_ITEM);
			register("azalea_log", AZALEA_LOG_ITEM);
			register("azalea_planks", AZALEA_PLANKS_ITEM);
		}

		private static void register (String name, Item item) {
			Registry.register(Registry.ITEM, identify(name), item);
		}
	}

	public static final class Biomes {

	}

}

