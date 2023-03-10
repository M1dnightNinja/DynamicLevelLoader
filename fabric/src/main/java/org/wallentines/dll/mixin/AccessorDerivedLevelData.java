package org.wallentines.dll.mixin;

import net.minecraft.world.level.storage.DerivedLevelData;
import net.minecraft.world.level.storage.ServerLevelData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(DerivedLevelData.class)
public interface AccessorDerivedLevelData {

    @Accessor("wrapped")
    ServerLevelData getWrapped();

}
