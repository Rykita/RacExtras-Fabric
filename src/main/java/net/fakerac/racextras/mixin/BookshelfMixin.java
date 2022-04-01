package net.fakerac.racextras.mixin;

import net.fakerac.racextras.RacExtras;
import net.minecraft.block.Blocks;
import net.minecraft.block.EnchantingTableBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// I'm fully aware this is a HORRIBLE way of doing it and there could be a cleaner way of injecting to allow custom bookshelf functionality, I'll get to it eventually.
// TODO: Fix spaghetti code and spam of ||, see how this can be improved, perhaps via tags or inheritance

@Mixin(EnchantingTableBlock.class)
public class BookshelfMixin {
    @Inject(at = @At("RETURN"), method = "canAccessBookshelf", cancellable = true)
    private static void canAccessBookshelf(World world, BlockPos tablePos, BlockPos bookshelfOffset, CallbackInfoReturnable<Boolean> cir) {
       cir.setReturnValue(world.getBlockState(tablePos.add(bookshelfOffset)).isOf(Blocks.BOOKSHELF)
               || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(RacExtras.SPRUCE_BOOKSHELF)
               || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(RacExtras.BIRCH_BOOKSHELF)
               || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(RacExtras.JUNGLE_BOOKSHELF)
               || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(RacExtras.CRIMSON_BOOKSHELF)
               || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(RacExtras.DARK_OAK_BOOKSHELF)
               || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(RacExtras.ACACIA_BOOKSHELF)
               || world.getBlockState(tablePos.add(bookshelfOffset)).isOf(RacExtras.WARPED_BOOKSHELF)
               && world.isAir(tablePos.add(bookshelfOffset.getX() / 2, bookshelfOffset.getY(), bookshelfOffset.getZ() / 2)));
    }
}
