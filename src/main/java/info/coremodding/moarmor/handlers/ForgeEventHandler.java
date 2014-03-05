package info.coremodding.moarmor.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import info.coremodding.moarmor.MoArmor;
import info.coremodding.moarmor.helpers.PlayerHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;

public class ForgeEventHandler {
    @SubscribeEvent
	public void onLivingSetAttackTarget(LivingSetAttackTargetEvent event){
		if(event.target instanceof EntityPlayer && event.entityLiving instanceof EntityLiving){
			EntityLiving el = (EntityLiving) event.entityLiving;
			EntityPlayer e = (EntityPlayer) event.target;
			
			if((Integer) MoArmor.ph.getValueForPlayer(e, "revealed") == null){
				if(PlayerHelper.armorHasAbility(e, PlayerHelper.AbilityCamouflage))
					el.setAttackTarget(null);
			} else {
	    		MoArmor.ph.setValueForPlayer((EntityPlayer) event.entityLiving, "revealed", 100);
			}
		}
	}
    
    @SubscribeEvent
    public void onAttackEntityEvent(AttackEntityEvent event){
    	if(event.target instanceof EntityLiving && event.entityLiving instanceof EntityPlayer){
    		MoArmor.ph.setValueForPlayer((EntityPlayer) event.entityLiving, "revealed", 100);
    	}
    }
}
