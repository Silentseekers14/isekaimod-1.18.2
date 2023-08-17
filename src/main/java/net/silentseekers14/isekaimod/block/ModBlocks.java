package net.silentseekers14.isekaimod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.silentseekers14.isekaimod.IsekaiMod;
import net.silentseekers14.isekaimod.block.custom.ModFlammableRotatedPillarBlock;
import net.silentseekers14.isekaimod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
        public static final DeferredRegister<Block> BLOCKS =
                DeferredRegister.create(ForgeRegistries.BLOCKS, IsekaiMod.MOD_ID);

    public static final RegistryObject<Block> NYMPH_LOG = registerBlock("nymph_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_NYMPH_LOG = registerBlock("stripped_nymph_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NYMPH_WOOD = registerBlock("nymph_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_NYMPH_WOOD = registerBlock("stripped_nymph_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> NYMPH_PLANKS = registerBlock("nymph_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            },CreativeModeTab.TAB_BUILDING_BLOCKS);

        public static final RegistryObject<Block> NYMPH_STAIRS = registerBlock("nymph_stairs",
                () -> new StairBlock(() -> ModBlocks.NYMPH_PLANKS.get().defaultBlockState(),
                        BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)
                                ), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> NYMPH_SLAB = registerBlock("nymph_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)
                        ), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NYMPH_FENCE = registerBlock("nymph_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
                    ), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> NYMPH_FENCE_GATE = registerBlock("nymph_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)
                    ), CreativeModeTab.TAB_BUILDING_BLOCKS);

        public static final RegistryObject<Block> SHADE_LOG = registerBlock("shade_log",
                () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> STRIPPED_SHADE_LOG = registerBlock("stripped_shade_log",
                () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> SHADE_WOOD = registerBlock("shade_wood",
                () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> STRIPPED_SHADE_WOOD = registerBlock("stripped_shade_wood",
                () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), CreativeModeTab.TAB_BUILDING_BLOCKS);

        public static final RegistryObject<Block> SHADE_PLANKS = registerBlock("shade_planks",
                () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                        @Override
                        public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return true;
                        }

                        @Override
                        public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return 20;
                        }

                        @Override
                        public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return 5;
                        }
                }, CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> SHADE_STAIRS = registerBlock("shade_stairs",
                () -> new StairBlock(() -> ModBlocks.SHADE_PLANKS.get().defaultBlockState(),
                        BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)
                                ), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> SHADE_SLAB = registerBlock("shade_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)
                ), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SHADE_FENCE = registerBlock("shade_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)
            ), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> SHADE_FENCE_GATE = registerBlock("shade_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
            ), CreativeModeTab.TAB_BUILDING_BLOCKS);

        public static final RegistryObject<Block> ELROE_STONE = registerBlock("elroe_stone",
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(3f, 10f).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> ELROE_COBBLESTONE = registerBlock("elroe_cobblestone",
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(3f, 10f).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> ELROE_BRICK = registerBlock("elroe_brick",
                () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(3f, 10f).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> ELROE_BRICK_STAIRS = registerBlock("elroe_brick_stairs",
                () -> new StairBlock(() -> ModBlocks.ELROE_BRICK.get().defaultBlockState(),
                        BlockBehaviour.Properties.of(Material.STONE)
                                .strength(3f, 10f).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> ELROE_BRICK_SLAB = registerBlock("elroe_brick_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(3f, 10f).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> ELROE_BRICK_WALL = registerBlock("elroe_brick_wall",
                () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(3f, 10f).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> ELROE_STONE_STAIRS = registerBlock("elroe_stone_stairs",
                () -> new StairBlock(() -> ModBlocks.ELROE_STONE.get().defaultBlockState(),
                        BlockBehaviour.Properties.of(Material.STONE)
                                .strength(3f, 10f).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> ELROE_STONE_SLAB = registerBlock("elroe_stone_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(3f, 10f).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

        public static final RegistryObject<Block> ELROE_COBBLESTONE_STAIRS = registerBlock("elroe_cobblestone_stairs",
                () -> new StairBlock(() -> ModBlocks.ELROE_COBBLESTONE.get().defaultBlockState(),
                        BlockBehaviour.Properties.of(Material.STONE)
                                .strength(3f, 10f).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> ELROE_COBBLESTONE_SLAB = registerBlock("elroe_cobblestone_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(3f, 10f).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> ELROE_COBBLESTONE_WALL = registerBlock("elroe_cobblestone_wall",
                () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(3f, 10f).sound(SoundType.STONE).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> MAGIC_CHUNK = registerBlock("magic_chunk",
                () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                        .strength(30.0f, 1200.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> MAGISTEEL_BLOCK = registerBlock("magisteel_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                        .strength(50.0f, 1200.0f).sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> MYTHRIL_BLOCK = registerBlock("mythril_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                        .strength(50.0f, 1200.0f).sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> CURSED_STEEL_BLOCK = registerBlock("cursed_steel_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                        .strength(50.0f, 1200.0f).sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                        .strength(50.0f, 1200.0f).sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> ADAMANTITE_BLOCK = registerBlock("adamantite_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                        .strength(50.0f, 1200.0f).sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
        public static final RegistryObject<Block> SCARLETITE_BLOCK = registerBlock("scarletite_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                        .strength(50.0f, 1200.0f).sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> TARATECT_BLOCK = registerBlock("taratect_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(10.0f, 1200.0f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FUTURE_BLOCK = registerBlock("future_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(50.0f, 1200.0f).sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> FUTURE_PLATE_BLOCK = registerBlock("future_plate_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(50.0f, 1200.0f).sound(SoundType.NETHERITE_BLOCK).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
            RegistryObject<T> toReturn = BLOCKS.register(name, block);
            registerBlockItem(name, toReturn, tab);
            return toReturn;
        }

        private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                                CreativeModeTab tab) {
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                    new Item.Properties().tab(tab)));
        }

        public static void register(IEventBus eventBus) {
            BLOCKS.register(eventBus);
        }
    }