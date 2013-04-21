package net.bless.ph;


import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class HPListener implements Listener {
	PermissionsHealth plugin;

	public HPListener(PermissionsHealth instance) {
		plugin = instance;
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {	    
        setMaxHealth(event.getPlayer());
	}

/*	@EventHandler
	public void onEntityRegainHealthEvent(EntityRegainHealthEvent event) {     
	    if (event.getEntityType().equals(EntityType.PLAYER)) {
	        Double regainAmount = Double.valueOf(event.getAmount());
	        Player player = (Player)event.getEntity();
            int max = player.getMaxHealth();
	        
	        regainAmount =  regainAmount/20*(((max-20)/2)+20);
	        
            Log.high("Player regain event..."+regainAmount.intValue());
	        event.setAmount(regainAmount.intValue() > 0 ? regainAmount.intValue() : 1);
	    }
	}*/

	@EventHandler
	public void onInventoryClose(InventoryCloseEvent event) {
        setMaxHealth(event.getPlayer());
	}

    /**
     * @param player
     */
    private void setMaxHealth(HumanEntity player) {
        Integer maxHealth = plugin.getMaxHealth(player.getName());
        if (maxHealth != null) player.setMaxHealth(maxHealth);
    }

    
	@EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
	public void onKick(PlayerKickEvent event) {
		event.getPlayer().setMaxHealth(20);
	}

	@EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
	public void onLeave(PlayerQuitEvent event) {
		event.getPlayer().setMaxHealth(20);
	}


}