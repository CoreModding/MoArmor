package info.coremodding.moarmor.handlers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.entity.player.EntityPlayer;

public class PlayerHandler {
	public Map<EntityPlayer, Map<String, Object>> data = new HashMap<EntityPlayer, Map<String, Object>>();

	/**
	 * Set key/value to specified player data
	 * @param player Player to add data for
	 * @param key Key for the value
	 * @param value Value
	 */
	public void setValueForPlayer(EntityPlayer player, String key, Object value){
		Map<String, Object> playerdata;
		if(data.get(player) != null)
			playerdata = data.get(player);
		else
			playerdata = new HashMap<String, Object>();
		playerdata.put(key, value);
		data.put(player, playerdata);
	}
	
	public Object getValueForPlayer(EntityPlayer player, String key){
		Map<String, Object> playerdata;
		if(data.get(player) != null)
			playerdata = data.get(player);
		else
			return null;
		return playerdata.get(key);
	}
}
