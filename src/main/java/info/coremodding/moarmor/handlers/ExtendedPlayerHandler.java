package info.coremodding.moarmor.handlers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

/**
 * Handles advanced player stuff
 */
public class ExtendedPlayerHandler implements IExtendedEntityProperties
{
    
    /**
     * Extended property name
     */
    public final static String EXT_PROP_NAME = "MoArmorAttributes";
    
    /**
     * Registers the ExtendedEntityProperties handler for the specified player
     * 
     * @param player
     *            Player to register
     */
    public static final void register(EntityPlayer player)
    {
        player.registerExtendedProperties(ExtendedPlayerHandler.EXT_PROP_NAME, new ExtendedPlayerHandler(player));
    }
    
    /**
     * Player for whom the extended properties are set
     */
    @SuppressWarnings("unused")
    private final EntityPlayer player;
    
    /**
     * The delay in ticks until the player is tractable by mobs again
     */
    private int                timeUntilUnseen;
    
    /**
     * The delay in ticks until the armor will repair itself
     */
    private int                timeUntilRepair;
    
    /**
     * Tells if player can be seen by other mobs
     */
    private boolean            isSeen;
    
    /**
     * Tells if player should repair his armor
     */
    private boolean            shouldRepair;
    
    /**
     * The constructor
     * 
     * @param player
     *            The player to handle for
     */
    public ExtendedPlayerHandler(EntityPlayer player)
    {
        this.player = player;
        this.isSeen = false;
        this.timeUntilUnseen = 0;
        this.timeUntilRepair = 80;
        this.shouldRepair = false;
    }
    
    /**
     * Gets the time until player should repair his armor
     * 
     * @return Time in ticks until the player should repair his armor
     */
    public int getTimeUntilRepair()
    {
        return this.timeUntilRepair;
    }
    
    /**
     * Gets the time until player will be intractable by mobs
     * 
     * @return Time in ticks until the player should be unseen
     */
    public int getTimeUntilUnseen()
    {
        return this.timeUntilUnseen;
    }
    
    @Override
    public void init(Entity entity, World world)
    {
        
    }
    
    /**
     * Check if the player can be seen by other mobs
     * 
     * @return True if the player can be seen
     */
    public boolean isPlayerTargetable()
    {
        return this.isSeen;
    }
    
    @Override
    public void loadNBTData(NBTTagCompound compound)
    {
        NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
        
        this.timeUntilUnseen = properties.getInteger("TimeUntilUnseen");
        this.isSeen = properties.getBoolean("IsSeenByMobs");
        this.timeUntilRepair = properties.getInteger("TimeUntilRepair");
        this.shouldRepair = properties.getBoolean("ShouldRepairArmor");
    }
    
    @Override
    public void saveNBTData(NBTTagCompound compound)
    {
        NBTTagCompound properties = new NBTTagCompound();
        
        properties.setInteger("TimeUntilUnseen", this.timeUntilUnseen);
        properties.setBoolean("IsSeenByMobs", this.isSeen);
        properties.setInteger("TimeUntilRepair", this.timeUntilRepair);
        properties.setBoolean("ShouldRepairArmor", this.shouldRepair);
        
        compound.setTag(EXT_PROP_NAME, properties);
    }
    
    /**
     * Sets the time until player will repair his armor, set to 0 to repair
     * armor
     * 
     * @param time
     *            Time in ticks until the player should repair his armor
     */
    public void setTimeUntilRepair(int time)
    {
        this.timeUntilRepair = time;
        if (time > 0) this.shouldRepair = false;
        else this.shouldRepair = true;
    }
    
    /**
     * Sets the time for the player, set to 0 to make player intractable by
     * mobs
     * 
     * @param time
     *            Time in ticks until the player should be unseen
     */
    public void setTimeUntilUnseen(int time)
    {
        this.timeUntilUnseen = time;
        if (time > 0) this.isSeen = true;
        else this.isSeen = false;
    }
    
    /**
     * Check should the player repair his armor
     * 
     * @return True if the player should repair his armor
     */
    public boolean shouldPlayerRepair()
    {
        return this.shouldRepair;
    }
}
