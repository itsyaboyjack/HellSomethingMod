package com.overloaded.overloadedmod.biomes;

import com.overloaded.overloadedmod.entities.EntityDemonWizard;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenHell;

public class BiomeGenHellStone extends BiomeGenBase {

    public BiomeGenHellStone(int p_i1971_1_) {
        super(p_i1971_1_);
        this.spawnableCreatureList.clear();
        this.setDisableRain();
        this.setBiomeName("HellStone Biome");
        //this.topBlock = HellStone Brick
        //this.fillerBlock = HellStone
        this.spawnableCreatureList.clear();
        this.spawnableCreatureList.add(new SpawnListEntry(EntityDemonWizard.class, 1, 4,4));
    }
}
