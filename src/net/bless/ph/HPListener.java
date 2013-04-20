package net.bless.ph;


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
	    event.getPlayer().setMaxHealth(plugin.getMaxHealth(event.getPlayer().getName()));
	}

	@EventHandler
	public void onInventoryClose(InventoryCloseEvent event) {
        event.getPlayer().setMaxHealth(plugin.getMaxHealth(event.getPlayer().getName()));
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