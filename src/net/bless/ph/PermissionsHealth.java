package net.bless.ph;

import java.util.logging.Logger;

import net.bless.ph.PHeal;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.PluginDescriptionFile;

import org.bukkit.plugin.java.JavaPlugin;

public class PermissionsHealth extends JavaPlugin implements Listener {
	public static PermissionsHealth plugin;
	public final Logger logger = Logger.getLogger("MineCraft");

	@Override
	public void onDisable() {
		PluginDescriptionFile p = this.getDescription();
		this.logger.info(p.getName() + " V" + p.getVersion()
				+ " Has Been Enabled!");
	}

	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
		this.saveDefaultConfig();
		PluginDescriptionFile p = this.getDescription();
		this.logger.info(p.getName() + " V" + p.getVersion()
				+ " Has Been Enabled!");
		getCommand("pheal").setExecutor(new PHeal(this));
		getCommand("phc").setExecutor(new VHealth(this));
		getCommand("hp").setExecutor(new VHealth(this));
		getCommand("pho").setExecutor(new Ohealth(this));
		getCommand("ph").setExecutor(new Reload(this));
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		if (event.getPlayer().hasPermission("permissionshealth.guest")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("GuestHealth"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.1")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health1"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.2")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health2"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.3")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health3"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.4")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health4"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.5")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health5"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.6")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health6"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.7")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health7"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.8")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health8"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.9")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health9"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.10")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health10"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.11")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health11"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.12")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health12"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.13")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health13"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.14")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health14"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.15")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health15"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.16")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health16"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.17")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health17"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.18")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health18"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.19")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health19"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.level.20")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health20"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.admin")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("AdminHealth"));
		}

	}

	@EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
	public void onLeave(PlayerQuitEvent event) {
		event.getPlayer().setMaxHealth(20);
	}
	@EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
	public void onKick(PlayerKickEvent event) {
		event.getPlayer().setMaxHealth(20);
}
}
