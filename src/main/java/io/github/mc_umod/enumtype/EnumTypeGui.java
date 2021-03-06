package io.github.mc_umod.enumtype;

public enum EnumTypeGui {
	
	PULVERISER(0),
	SOLARPANEL(1),
	CHARGESTATION(2),
	CRAFTFURNANCE(3),
	BACKPACK(4),
	BARRELS(5),
	PAINTER(6),
	MAGIC_CRAFTER(7);
	
	public int getID() {
		return id;
	}
	
	public static EnumTypeGui byID(int id) {
		if (id < 0 || id >= all.length) {
			id = 0;
		}
		return all[id];
	}
	
	private int id;
	
	private static final EnumTypeGui[] all = new EnumTypeGui[values().length];
	
	private EnumTypeGui(int id) {
		this.id = id;
	}
	
	static {
		for (EnumTypeGui type : values()) {
			all[type.getID()] = type;
		}
	}
	
}
