package io.github.mc_umod.item.tools.magic;

import java.util.List;

import io.github.mc_umod.UReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMagicHoe extends ItemHoe {
	
	public ItemMagicHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(UReference.magic);
	}
	
	@SuppressWarnings("rawtypes")
	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
		UReference.proxy.addTooltip(stack, player, tooltip, advanced);
	}
	
}
