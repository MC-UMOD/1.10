package net.hycrafthd.umod.event;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.Event;


public class RenderEntityRegisterEvent extends RegisterEvents {

	public RenderEntityRegisterEvent(World worldIn, BlockPos pos) {
		super(worldIn, pos);
	}
	
}
