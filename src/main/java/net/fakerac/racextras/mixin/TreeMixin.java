package net.fakerac.racextras.mixin;

import net.fakerac.racextras.RacExtras;
import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(TreeConfiguredFeatures.class)
public class TreeMixin {
    @ModifyArg(method = "<clinit>",

            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=azalea_tree")),

            at = @At(value = "INVOKE", target = "Lnet/minecraft/world/gen/stateprovider/BlockStateProvider;of(Lnet/minecraft/block/Block;)Lnet/minecraft/world/gen/stateprovider/SimpleBlockStateProvider;", ordinal = 0))

    private static Block returnBlock(Block block) {
        return RacExtras.Blocks.AZALEA_LOG;
    }

}
