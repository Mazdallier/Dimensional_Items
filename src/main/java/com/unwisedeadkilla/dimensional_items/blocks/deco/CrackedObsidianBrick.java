package com.unwisedeadkilla.dimensional_items.blocks.deco;

import com.unwisedeadkilla.dimensional_items.Dimensional_Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CrackedObsidianBrick extends Block{

	public CrackedObsidianBrick() {
		super(Material.rock);
		
		this.setBlockTextureName(Dimensional_Items.modID + ":Cracked_ObsidianBrick");
		this.setCreativeTab(Dimensional_Items.ObsidianBiome);
		this.setResistance(100F);
		this.setHardness(3F);
		this.setHarvestLevel("pickaxe", 0);
	}

}
