package info.coremodding.moarmor.handlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import info.coremodding.moarmor.helpers.PlayerHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;

public class ForgeEventHandler {
    @SubscribeEvent
	public void onLivingSetAttackTarget(LivingSetAttackTargetEvent event){
		if(event.target instanceof EntityPlayer && event.entityLiving instanceof EntityLiving){
			EntityLiving el = (EntityLiving) event.entityLiving;
			EntityPlayer e = (EntityPlayer) event.target;
			if(PlayerHelper.armorHasAbility(e, PlayerHelper.AbilityCamouflage))
				el.setAttackTarget(null);
		}
	}
}
