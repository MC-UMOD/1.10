package io.github.mc_umod.item.infected;

import java.util.List;

import io.github.mc_umod.UPotion;
import io.github.mc_umod.UReference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

public class ItemInfectedBeef extends ItemFood {
	
	public ItemInfectedBeef() {
		super(3, 0.3F, true);
		this.setCreativeTab(UReference.infected);
		this.setPotionEffect(new PotionEffect(UPotion.radiationPotion, 5, 1), 0.8F);
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
		UReference.proxy.addTooltip(stack, player, tooltip, advanced);
	}
	
}
