package info.coremodding.moarmor.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import info.coremodding.moarmor.MoArmor;
import info.coremodding.moarmor.helpers.ArmorHelper;
import info.coremodding.moarmor.helpers.PlayerHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;

public class ForgeEventHandler {
	
	@SubscribeEvent
	public void onEntityConstructing(EntityConstructing event){
		if (event.entity instanceof EntityPlayer && PlayerHelper.getProperties((EntityPlayer) event.entity) == null)
			ExtendedPlayerHandler.register((EntityPlayer) event.entity);
	}
	
    @SubscribeEvent
	public void onLivingSetAttackTarget(LivingSetAttackTargetEvent event){
		if(event.target instanceof EntityPlayer && event.entityLiving instanceof EntityLiving){
			EntityLiving el = (EntityLiving) event.entityLiving;
			EntityPlayer e = (EntityPlayer) event.target;
			
			if(!PlayerHelper.getProperties(e).isPlayerTargetable()){
				if(PlayerHelper.armorHasAbility(e, PlayerHelper.AbilityCamouflage))
					el.setAttackTarget(null);
			} else {
				PlayerHelper.getProperties(e).setTimeUntilUnseen(100);
			}
		}
	}
    
    @SubscribeEvent
    public void onAttackEntityEvent(AttackEntityEvent event){
    	if(event.target instanceof EntityLiving && event.entityLiving instanceof EntityPlayer)
    		PlayerHelper.getProperties((EntityPlayer) event.entityLiving).setTimeUntilUnseen(100);
    }
    
    @SubscribeEvent
    public void onLivingUpdateEvent(LivingUpdateEvent event){
    	if(event.entityLiving instanceof EntityPlayer){
    		EntityPlayer p = (EntityPlayer) event.entityLiving;
    		ExtendedPlayerHandler properties = PlayerHelper.getProperties(p);
    		if(properties.getTimeUntilUnseen() > 0)
    			properties.setTimeUntilUnseen(properties.getTimeUntilUnseen() - 1);
    		if(p.getFoodStats().needFood()){
	    		if(PlayerHelper.armorHasAbility(p, PlayerHelper.AbilityEatable)){
	    			int feedLevel = Integer.parseInt(ArmorHelper.getStringFromNBT(p.inventory.armorInventory[3], "feedlevel"));
	    			if(20-p.getFoodStats().getFoodLevel() >= feedLevel){
	    				p.getFoodStats().setFoodLevel(p.getFoodStats().getFoodLevel() + feedLevel);
	    				p.inventory.armorInventory[3].stackSize--;
	    			}
	    		}
    		}
    	}
    }
}
