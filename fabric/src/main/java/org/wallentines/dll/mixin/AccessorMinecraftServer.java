package org.wallentines.dll.mixin;

import net.minecraft.core.LayeredRegistryAccess;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.RegistryLayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.progress.ChunkProgressListenerFactory;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.ServerLevelData;
import net.minecraft.world.level.storage.WorldData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

import java.util.Map;

@Mixin(MinecraftServer.class)
public interface AccessorMinecraftServer {

    @Invoker("setInitialSpawn")
    static void callSetInitialSpawn(ServerLevel serverLevel, ServerLevelData serverLevelData, boolean bl, boolean bl2) {
        throw new UnsupportedOperationException();
    }

    @Invoker("setupDebugLevel")
    void callSetupDebugLevel(WorldData worldData);

    @Accessor("levels")
    Map<ResourceKey<Level>, ServerLevel> getLevels();

    @Accessor("progressListenerFactory")
    ChunkProgressListenerFactory getProgressListenerFactory();

    @Accessor("registries")
    LayeredRegistryAccess<RegistryLayer> getRegistries();

    @Accessor("resources")
    MinecraftServer.ReloadableResources getReloadableResources();

}
