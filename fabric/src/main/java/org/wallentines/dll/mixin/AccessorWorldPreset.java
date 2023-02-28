package org.wallentines.dll.mixin;


import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.presets.WorldPreset;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(WorldPreset.class)
public interface AccessorWorldPreset {

    @Accessor("dimensions")
    Map<ResourceKey<LevelStem>, LevelStem> getDimensions();

}
