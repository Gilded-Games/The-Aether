package com.aether.block;

import com.aether.Aether;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(Aether.MODID)
public class AetherBlocks {

	public static final Block AETHER_GRASS_BLOCK = null;
	public static final Block ENCHANTED_AETHER_GRASS_BLOCK = null;
	public static final Block AETHER_DIRT = null;
	public static final Block HOLYSTONE = null;
	public static final Block MOSSY_HOLYSTONE = null;
	public static final Block HOLYSTONE_BRICKS = null;
	public static final AercloudBlock COLD_AERCLOUD = null;
	public static final TintedAercloudBlock BLUE_AERCLOUD = null;
	public static final TintedAercloudBlock GOLDEN_AERCLOUD = null;
	public static final AercloudBlock PINK_AERCLOUD = null;
	public static final Block QUICKSOIL = null;
	public static final Block ICESTONE = null;
	public static final Block AMBROSIUM_ORE = null;
	public static final Block ZANITE_ORE = null;
	public static final Block GRAVITITE_ORE = null;
	public static final Block SKYROOT_LEAVES = null;
	public static final Block GOLDEN_OAK_LEAVES = null;
	public static final Block CRYSTAL_LEAVES = null;
	public static final Block CRYSTAL_FRUIT_LEAVES = null;
	public static final Block HOLIDAY_LEAVES = null;
	public static final Block SKYROOT_LOG = null;
	public static final Block GOLDEN_OAK_LOG = null;
	public static final Block SKYROOT_PLANKS = null;
	public static final Block QUICKSOIL_GLASS = null;
	public static final Block AEROGEL = null;
	public static final Block ENCHANTED_GRAVITITE = null;
	public static final Block ZANITE_BLOCK = null;
	public static final Block BERRY_BUSH = null;
	public static final Block BERRY_BUSH_STEM = null;
	public static final Block ENCHANTER = null;
	public static final Block FREEZER = null;
	public static final Block INCUBATOR = null;
	public static final Block AMBROSIUM_TORCH = null;
	public static final Block AMBROSIUM_WALL_TORCH = null;
	public static final Block AETHER_PORTAL = null;
	public static final Block CHEST_MIMIC = null;
	public static final Block TREASURE_CHEST = null;
	public static final Block CARVED_STONE = null;
	public static final Block SENTRY_STONE = null;
	public static final Block ANGELIC_STONE = null;
	public static final Block LIGHT_ANGELIC_STONE = null;
	public static final Block HELLFIRE_STONE = null;
	public static final Block LIGHT_HELLFIRE_STONE = null;
	public static final Block LOCKED_CARVED_STONE = null;
	public static final Block LOCKED_SENTRY_STONE = null;
	public static final Block LOCKED_ANGELIC_STONE = null;
	public static final Block LOCKED_LIGHT_ANGELIC_STONE = null;
	public static final Block LOCKED_HELLFIRE_STONE = null;
	public static final Block LOCKED_LIGHT_HELLFIRE_STONE = null;
	public static final Block TRAPPED_CARVED_STONE = null;
	public static final Block TRAPPED_SENTRY_STONE = null;
	public static final Block TRAPPED_ANGELIC_STONE = null;
	public static final Block TRAPPED_LIGHT_ANGELIC_STONE = null;
	public static final Block TRAPPED_HELLFIRE_STONE = null;
	public static final Block TRAPPED_LIGHT_HELLFIRE_STONE = null;
	public static final Block PURPLE_FLOWER = null;
	public static final Block WHITE_FLOWER = null;
	public static final Block SKYROOT_SAPLING = null;
	public static final Block GOLDEN_OAK_SAPLING = null;
	public static final Block CRYSTAL_SAPLING = null;
	public static final Block PILLAR = null;
	public static final Block PILLAR_TOP = null;
	public static final Block SKYROOT_FENCE = null;
	public static final Block SKYROOT_FENCE_GATE = null;
	public static final Block CARVED_STAIRS = null;
	public static final Block ANGELIC_STAIRS = null;
	public static final Block HELLFIRE_STAIRS = null;
	public static final Block SKYROOT_STAIRS = null;
	public static final Block HOLYSTONE_STAIRS = null;
	public static final Block MOSSY_HOLYSTONE_STAIRS = null;
	public static final Block HOLYSTONE_BRICK_STAIRS = null;
	public static final Block AEROGEL_STAIRS = null;
	public static final Block CARVED_SLAB = null;
	public static final Block ANGELIC_SLAB = null;
	public static final Block HELLFIRE_SLAB = null;
	public static final Block SKYROOT_SLAB = null;
	public static final Block HOLYSTONE_SLAB = null;
	public static final Block MOSSY_HOLYSTONE_SLAB = null;
	public static final Block HOLYSTONE_BRICK_SLAB = null;
	public static final Block AEROGEL_SLAB = null;
	public static final Block CARVED_WALL = null;
	public static final Block ANGELIC_WALL = null;
	public static final Block HELLFIRE_WALL = null;
	public static final Block HOLYSTONE_WALL = null;
	public static final Block MOSSY_HOLYSTONE_WALL = null;
	public static final Block HOLYSTONE_BRICK_WALL = null;
	public static final Block AEROGEL_WALL = null;
	public static final Block PRESENT = null;
	public static final Block SUN_ALTAR = null;
	public static final Block SKYROOT_BOOKSHELF = null;
	
	@EventBusSubscriber(modid = Aether.MODID, bus = EventBusSubscriber.Bus.MOD)
	public static final class Registration {
		
		/**
		 * @deprecated Modders should never access this, it is only used to automatically register items for blocks.
		 */
		@Deprecated
		public static Block[] blocks;
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			Block.Properties temp0, temp1;
			
			event.getRegistry().registerAll(blocks = new Block[] {
				
				block("aether_grass_block", new AetherGrassBlock(Block.Properties.from(Blocks.GRASS_BLOCK))),
				block("enchanted_aether_grass_block", new EnchantedAetherGrassBlock(Block.Properties.from(Blocks.GRASS_BLOCK))),
				block("aether_dirt", new DefaultAetherDoubleDropBlock(Block.Properties.from(Blocks.DIRT))),
				block("holystone", new DefaultAetherDoubleDropBlock(Block.Properties.from(Blocks.STONE).hardnessAndResistance(0.5f))),
				block("mossy_holystone", new DefaultAetherDoubleDropBlock(Block.Properties.from(Blocks.STONE).hardnessAndResistance(0.5f))),
				block("holystone_bricks", new Block(Block.Properties.from(Blocks.STONE_BRICKS).hardnessAndResistance(0.5f, 10.0f))),
				block("cold_aercloud", new AercloudBlock(Block.Properties.create(Material.ICE).hardnessAndResistance(0.2f).sound(SoundType.CLOTH))),
				block("blue_aercloud", new BouncyAercloudBlock(TintedAercloudBlock.COLOR_BLUE_OLD, TintedAercloudBlock.COLOR_BLUE_NEW, Block.Properties.create(Material.ICE).hardnessAndResistance(0.2f).sound(SoundType.CLOTH))),
				block("golden_aercloud", new TintedAercloudBlock(TintedAercloudBlock.COLOR_GOLDEN_OLD, TintedAercloudBlock.COLOR_GOLDEN_NEW, Block.Properties.create(Material.ICE).hardnessAndResistance(0.2f).sound(SoundType.CLOTH))),
				block("pink_aercloud", new HealingAercloudBlock(Block.Properties.create(Material.ICE).hardnessAndResistance(0.2f).sound(SoundType.CLOTH))),
				block("quicksoil", new DefaultAetherDoubleDropBlock(Block.Properties.from(Blocks.SAND).slipperiness(1.1f))),
				block("icestone", new IcestoneBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f).tickRandomly().sound(SoundType.GLASS))),
				block("ambrosium_ore", new AetherOreBlock(0, 2, temp0 = Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0f).sound(SoundType.STONE))),
				block("zanite_ore", new AetherOreBlock(3, 5, temp0)),
				block("gravitite_ore", new FloatingBlock(false, Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0f).sound(SoundType.STONE))),
				block("skyroot_leaves", new LeavesBlock(Block.Properties.from(Blocks.OAK_LEAVES))),
				block("golden_oak_leaves", new LeavesWithParticlesBlock(0.976f, 0.7450980392156863f, 0.0f, Block.Properties.from(Blocks.OAK_LEAVES))),
				block("crystal_leaves", new LeavesWithParticlesBlock(0.0f, 0.6450980392156863f, 0.7450980392156863f, Block.Properties.from(Blocks.OAK_LEAVES))),
				block("crystal_fruit_leaves", new LeavesWithParticlesBlock(0.0f, 0.6450980392156863f, 0.7450980392156863f, Block.Properties.from(Blocks.OAK_LEAVES))),
				block("holiday_leaves", new LeavesWithParticlesBlock(1.0f, 1.0f, 1.0f, Block.Properties.from(Blocks.OAK_LEAVES))),
				block("decorated_holiday_leaves", new LeavesWithParticlesBlock(1.0f, 1.0f, 1.0f, Block.Properties.from(Blocks.OAK_LEAVES))),
				block("skyroot_log", new AetherLogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG))),
				block("golden_oak_log", new AetherLogBlock(MaterialColor.WOOD, Block.Properties.from(Blocks.OAK_LOG))),
				block("skyroot_planks", new Block(Block.Properties.from(Blocks.OAK_PLANKS))),
				block("quicksoil_glass", new QuicksoilGlassBlock(Block.Properties.from(Blocks.GLASS).slipperiness(1.1f).lightValue(11))),
				block("aerogel", new AerogelBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.0f, 2000.0f).sound(SoundType.METAL))),
				block("zanite_block", new Block(Block.Properties.from(Blocks.IRON_BLOCK))),
				block("enchanted_gravitite", new FloatingBlock(true, Block.Properties.from(Blocks.IRON_BLOCK))),
				block("berry_bush", new BerryBushBlock(temp0 = Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.2f).sound(SoundType.PLANT))),
				block("berry_bush_stem", new BerryBushStemBlock(temp0)),
				block("enchanter", new EnchanterBlock(temp0 = Block.Properties.create(Material.ROCK).hardnessAndResistance(2.0f).sound(SoundType.STONE))),
				//block("freezer", new FreezerBlock(temp0)),
				//block("incubator", new IncubatorBlock(temp0)),
				//block("ambrosium_torch", new TorchBlock(Block.Properties.from(Blocks.TORCH))),
				//block("chest_mimic", new ChestMimicBlock(Block.Properties.from(Blocks.CHEST))),
				//block("treasure_chest", new TreasureChestBlock(???)),
				block("carved_stone", new Block(temp0 = Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f).sound(SoundType.STONE))),
				block("sentry_stone", new Block(temp1 = Block.Properties.create(Material.ROCK).hardnessAndResistance(0.5f).lightValue(11).sound(SoundType.STONE))),
				block("angelic_stone", new Block(temp0)),
				block("light_angelic_stone", new Block(temp1)),
				block("hellfire_stone", new Block(temp0)),
				block("light_hellfire_stone", new Block(temp1)),
				block("locked_carved_stone", new Block(temp0 = Block.Properties.from(Blocks.BEDROCK))),
				block("locked_sentry_stone", new Block(temp1 = Block.Properties.from(Blocks.BEDROCK).lightValue(11))),
				block("locked_angelic_stone", new Block(temp0)),
				block("locked_light_angelic_stone", new Block(temp1)),
				block("locked_hellfire_stone", new Block(temp0)),
				block("locked_light_hellfire_stone", new Block(temp1)),
				//block("trapped_carved_stone", new TrappedBlock(() -> AetherEntityTypes.SENTRY, () -> LOCKED_CARVED_STONE, temp0)),
				//block("trapped_sentry_stone", new TrappedBlock(() -> AetherEntityTypes.SENTRY, () -> LOCKED_SENTRY_STONE, temp1)),
				//block("trapped_angelic_stone", new TrappedBlock(() -> AetherEntityTypes.VALKYRIE, () -> LOCKED_ANGELIC_STONE, temp0)),
				//block("trapped_light_angelic_stone", new TrappedBlock(() -> AetherEntityTypes.VALKYRIE, () -> LOCKED_LIGHT_ANGELIC_STONE, temp1)),
				//block("trapped_hellfire_stone", new TrappedBlock(() -> AetherEntityTypes.FIRE_MINION, () -> LOCKED_HELLFIRE_STONE, temp0)),
				//block("trapped_light_hellfire_stone", new TrappedBlock(() -> AetherEntityTypes.FIRE_MINION, () -> LOCKED_LIGHT_HELLFIRE_STONE, temp1)),
				
			});
			
			// for blocks that don't have corresponding items
			event.getRegistry().registerAll(new Block[] {
				
				//block("ambrosium_wall_torch", new WallTorchBlock(Block.Properties.from(Blocks.WALL_TORCH))),
				//block("aether_portal", new AetherPortalBlock(Block.Properties.from(Blocks.NETHER_PORTAL))),
				
			});
		}
	
		private static <B extends Block> B block(String name, B block) {
			block.setRegistryName(name);
			return block;
		}
		
	}

}