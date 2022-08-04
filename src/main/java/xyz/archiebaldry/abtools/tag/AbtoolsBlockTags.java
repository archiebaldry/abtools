package xyz.archiebaldry.abtools.tag;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.archiebaldry.abtools.Abtools;

public class AbtoolsBlockTags {

    public static final TagKey<Block> PAXEL_MINEABLE = TagKey.of(Registry.BLOCK_KEY, new Identifier(Abtools.MOD_ID, "mineable/paxel"));

}
