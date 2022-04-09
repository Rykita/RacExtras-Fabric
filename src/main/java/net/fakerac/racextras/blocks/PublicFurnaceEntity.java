package net.fakerac.racextras.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.recipe.AbstractCookingRecipe;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.FurnaceScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;

public class PublicFurnaceEntity extends AbstractFurnaceBlockEntity {
    protected PublicFurnaceEntity(BlockEntityType<?> blockEntityType, BlockPos pos, BlockState state, RecipeType<? extends AbstractCookingRecipe> recipeType) {
        super(BlockEntityType.FURNACE, pos, state, RecipeType.SMELTING);
    }

    @Override
    protected Text getContainerName() {
        return new TranslatableText("container.deepslate_furnace");
    }

    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new FurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}
