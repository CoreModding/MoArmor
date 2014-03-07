package info.coremodding.moarmor.handlers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayerHandler implements IExtendedEntityProperties {
	
	/**
	 * Extended property name
	 */
	public final static String EXT_PROP_NAME = "PlayerMobTargetInfo";
	
	/**
	 * Player for whom the extended properties are set
	 */
	private final EntityPlayer player;
	
	/**
	 * The delay in ticks until the player is targetable by mobs again
	 */
	private int timeUntilUnseen;
	
	/**
	 * Tells if player can be seen by other mobs
	 */
	private boolean isSeen;
	
	public ExtendedPlayerHandler(EntityPlayer player){
		this.player = player;
		this.isSeen = false;
		this.timeUntilUnseen = 0;
	}
	
	/**
	 * Registers the ExtendedEntityProperties handler for the specified player
	 * @param player Player to register
	 */
	public static final void register(EntityPlayer player){
		player.registerExtendedProperties(ExtendedPlayerHandler.EXT_PROP_NAME, new ExtendedPlayerHandler(player));
	}
	
	/**
	 * Gets ExtendedPlayerHandler for specified player
	 * @param player Player to get properties for
	 * @return Extended player properties
	 */
	public static final ExtendedPlayerHandler get(EntityPlayer player){
		return (ExtendedPlayerHandler) player.getExtendedProperties(EXT_PROP_NAME);
	}
	
	/**
	 * Writes the NBT tag compound
	 */
	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();
		
		properties.setInteger("TimeUntilUnseen", timeUntilUnseen);
		properties.setBoolean("IsSeenByMobs", isSeen);
		
		compound.setTag(EXT_PROP_NAME, properties);
	}

	/**
	 * Loads the NBT tag compound
	 */
	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		
		this.timeUntilUnseen = properties.getInteger("TimeUntilUnseen");
		this.isSeen = properties.getBoolean("IsSeenByMobs");
	}

	@Override
	public void init(Entity entity, World world) {
		
	}

	/**
	 * Sets the time for the player, set to 0 to make player untargetable by mobs
	 * @param time Time in ticks until the player should be unseen
	 */
	public void setTimeUntilUnseen(int time){
		this.timeUntilUnseen = time;
		if(time > 0)
			this.isSeen = true;
		else
			this.isSeen = false;
	}
	
	/**
	 * Gets the time until entity will be untargetable by mobs
	 * @return Time in ticks until the player should be unseen
	 */
	public int getTimeUntilUnseen(){
		return this.timeUntilUnseen;
	}
	
	/**
	 * Check if the player can be seen by other mobs
	 * @return True if the player can be seen
	 */
	public boolean isPlayerTargetable(){
		return this.isSeen;
	}
}
