package io.github.mc_umod.network.message;

import io.github.mc_umod.api.render.ISliderEntry;
import io.github.mc_umod.util.NetworkUtil;
import io.netty.buffer.ByteBuf;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.*;

public class MessageSliderRequest implements IMessage, IMessageHandler<MessageSliderRequest, MessageSliderGet> {
	
	public int id;
	public BlockPos pos;
	
	public MessageSliderRequest() {
	}
	
	public MessageSliderRequest(int id, BlockPos ps) {
		this.id = id;
		this.pos = ps;
	}
	
	@Override
	public void fromBytes(ByteBuf buf) {
		this.pos = NetworkUtil.getPosFromBuffer(buf);
		this.id = buf.readInt();
	}
	
	@Override
	public void toBytes(ByteBuf buf) {
		NetworkUtil.addPosToBuffer(buf, pos);
		buf.writeInt(id);
	}
	
	@Override
	public MessageSliderGet onMessage(MessageSliderRequest message, MessageContext ctx) {
		TileEntity tl = ctx.getServerHandler().playerEntity.worldObj.getTileEntity(message.pos);
		if (tl != null && tl instanceof ISliderEntry) {
			ISliderEntry entry = (ISliderEntry) tl;
			return new MessageSliderGet(message.id, entry.getValueFromId(message.id));
		}
		return null;
	}
	
}
