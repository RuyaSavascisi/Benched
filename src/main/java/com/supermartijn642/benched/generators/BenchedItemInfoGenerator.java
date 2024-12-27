package com.supermartijn642.benched.generators;

import com.supermartijn642.benched.BenchType;
import com.supermartijn642.core.generator.ItemInfoGenerator;
import com.supermartijn642.core.generator.ResourceCache;

/**
 * Created 26/12/2024 by SuperMartijn642
 */
public class BenchedItemInfoGenerator extends ItemInfoGenerator {

    public BenchedItemInfoGenerator(ResourceCache cache){
        super("benched", cache);
    }

    @Override
    public void generate(){
        for(BenchType type : BenchType.values())
            this.simpleInfo(type.getItem(), "item/" + (type == BenchType.OAK ? "bench" : type.getIdentifier() + "_bench"));
    }
}
