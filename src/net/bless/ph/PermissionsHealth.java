package net.bless.ph;

import java.util.logging.Logger;

import net.bless.ph.PHeal;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
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
		getCommand("phc").setExecutor(new ViewHP(this));
		getCommand("hp").setExecutor(new ViewHP(this));
		getCommand("pho").setExecutor(new OtherHP(this));
		getCommand("phreload").setExecutor(new Reload(this));
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		if (event.getPlayer().hasPermission("permissionshealth.guest")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("GuestHealth"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.1")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health1"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.2")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health2"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.3")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health3"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.4")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health4"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.5")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health5"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.6")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health6"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.7")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health7"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.8")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health8"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.9")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health9"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.10")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health10"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.11")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health11"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.12")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health12"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.13")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health13"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.14")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health14"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.15")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health15"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.16")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health16"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.17")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health17"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.18")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health18"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.19")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health19"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.20")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health20"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.21")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health21"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.22")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health22"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.23")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health23"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.24")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health24"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.25")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health25"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.26")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health26"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.27")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health27"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.28")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health28"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.29")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health29"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.30")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health30"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.31")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health31"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.32")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health32"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.33")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health33"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.34")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health34"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.35")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health35"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.36")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health36"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.37")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health37"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.38")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health38"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.39")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health39"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.40")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health40"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.41")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health41"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.42")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health42"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.43")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health43"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.44")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health44"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.45")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health45"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.46")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health46"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.47")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health47"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.48")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health48"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.49")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health49"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.50")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health50"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.51")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health51"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.52")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health52"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.53")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health53"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.54")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health54"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.55")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health55"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.56")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health56"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.57")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health57"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.58")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health58"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.59")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health59"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.60")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health60"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.62")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health62"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.63")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health63"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.64")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health64"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.65")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health65"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.66")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health66"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.67")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health67"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.68")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health68"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.69")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health69"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.70")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health70"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.71")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health71"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.72")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health72"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.73")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health73"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.74")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health74"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.75")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health75"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.76")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health76"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.77")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health77"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.78")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health78"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.79")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health79"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.80")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health80"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.81")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health81"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.82")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health82"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.83")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health83"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.84")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health84"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.85")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health85"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.86")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health86"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.87")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health87"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.88")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health88"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.89")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health89"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.90")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health90"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.91")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health91"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.92")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health92"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.93")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health93"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.94")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health94"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.95")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health95"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.96")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health96"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.97")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health97"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.98")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health98"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.99")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health99"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.100")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health100"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.101")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health101"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.102")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health102"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.103")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health103"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.104")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health104"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.105")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health105"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.106")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health106"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.107")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health107"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.108")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health108"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.109")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health109"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.110")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health110"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.111")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health111"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.112")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health112"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.113")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health113"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.114")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health114"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.115")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health115"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.116")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health116"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.117")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health117"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.118")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health118"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.119")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health119"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.120")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health120"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.121")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health121"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.122")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health122"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.123")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health123"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.124")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health124"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.125")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health125"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.126")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health126"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.127")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health127"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.128")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health128"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.129")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health129"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.130")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health130"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.131")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health131"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.132")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health132"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.133")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health133"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.134")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health134"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.135")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health135"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.136")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health136"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.137")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health137"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.138")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health138"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.139")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health139"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.140")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health140"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.141")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health141"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.142")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health142"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.143")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health143"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.144")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health144"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.145")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health145"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.146")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health146"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.147")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health147"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.148")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health148"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.149")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health149"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.150")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health150"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.151")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health151"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.152")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health152"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.153")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health153"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.154")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health154"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.155")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health55"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.156")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health156"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.157")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health157"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.158")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health158"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.159")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health159"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.160")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health160"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.162")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health162"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.163")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health163"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.164")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health164"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.165")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health165"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.166")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health166"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.167")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health167"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.168")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health168"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.169")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health169"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.170")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health170"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.171")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health171"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.172")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health172"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.173")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health173"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.174")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health174"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.175")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health175"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.176")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health176"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.177")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health177"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.178")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health178"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.179")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health179"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.180")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health180"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.181")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health181"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.182")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health182"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.183")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health183"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.184")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health184"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.185")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health185"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.186")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health186"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.187")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health187"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.188")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health188"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.189")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health189"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.190")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health190"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.191")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health191"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.192")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health192"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.193")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health193"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.194")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health194"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.195")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health195"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.196")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health196"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.197")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health197"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.198")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health198"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.199")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health199"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.200")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health200"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.admin")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("AdminHealth"));
		}
	}

	@EventHandler
	public void onInventoryClose(InventoryCloseEvent event) {
		if (event.getPlayer().hasPermission("permissionshealth.guest")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("GuestHealth"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.1")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health1"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.2")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health2"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.3")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health3"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.4")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health4"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.5")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health5"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.6")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health6"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.7")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health7"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.8")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health8"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.9")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health9"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.10")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health10"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.11")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health11"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.12")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health12"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.13")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health13"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.14")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health14"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.15")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health15"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.16")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health16"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.17")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health17"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.18")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health18"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.19")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health19"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.20")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health20"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.21")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health21"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.22")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health22"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.23")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health23"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.24")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health24"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.25")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health25"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.26")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health26"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.27")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health27"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.28")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health28"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.29")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health29"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.30")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health30"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.31")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health31"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.32")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health32"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.33")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health33"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.34")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health34"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.35")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health35"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.36")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health36"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.37")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health37"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.38")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health38"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.39")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health39"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.40")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health40"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.41")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health41"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.42")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health42"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.43")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health43"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.44")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health44"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.45")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health45"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.46")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health46"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.47")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health47"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.48")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health48"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.49")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health49"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.50")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health50"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.51")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health51"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.52")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health52"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.53")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health53"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.54")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health54"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.55")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health55"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.56")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health56"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.57")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health57"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.58")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health58"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.59")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health59"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.60")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health60"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.62")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health62"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.63")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health63"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.64")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health64"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.65")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health65"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.66")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health66"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.67")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health67"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.68")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health68"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.69")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health69"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.70")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health70"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.71")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health71"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.72")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health72"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.73")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health73"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.74")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health74"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.75")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health75"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.76")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health76"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.77")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health77"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.78")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health78"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.79")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health79"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.80")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health80"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.81")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health81"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.82")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health82"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.83")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health83"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.84")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health84"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.85")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health85"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.86")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health86"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.87")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health87"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.88")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health88"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.89")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health89"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.90")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health90"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.91")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health91"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.92")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health92"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.93")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health93"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.94")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health94"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.95")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health95"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.96")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health96"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.97")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health97"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.98")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health98"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.99")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health99"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.100")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health100"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.101")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health101"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.102")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health102"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.103")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health103"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.104")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health104"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.105")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health105"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.106")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health106"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.107")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health107"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.108")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health108"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.109")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health109"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.110")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health110"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.111")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health111"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.112")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health112"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.113")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health113"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.114")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health114"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.115")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health115"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.116")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health116"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.117")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health117"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.118")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health118"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.119")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health119"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.120")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health120"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.121")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health121"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.122")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health122"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.123")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health123"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.124")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health124"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.125")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health125"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.126")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health126"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.127")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health127"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.128")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health128"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.129")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health129"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.130")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health130"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.131")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health131"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.132")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health132"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.133")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health133"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.134")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health134"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.135")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health135"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.136")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health136"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.137")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health137"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.138")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health138"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.139")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health139"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.140")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health140"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.141")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health141"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.142")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health142"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.143")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health143"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.144")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health144"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.145")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health145"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.146")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health146"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.147")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health147"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.148")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health148"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.149")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health149"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.150")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health150"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.151")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health151"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.152")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health152"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.153")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health153"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.154")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health154"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.155")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health55"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.156")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health156"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.157")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health157"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.158")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health158"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.159")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health159"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.160")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health160"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.162")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health162"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.163")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health163"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.164")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health164"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.165")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health165"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.166")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health166"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.167")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health167"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.168")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health168"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.169")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health169"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.170")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health170"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.171")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health171"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.172")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health172"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.173")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health173"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.174")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health174"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.175")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health175"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.176")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health176"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.177")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health177"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.178")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health178"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.179")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health179"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.180")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health180"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.181")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health181"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.182")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health182"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.183")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health183"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.184")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health184"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.185")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health185"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.186")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health186"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.187")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health187"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.188")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health188"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.189")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health189"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.190")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health190"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.191")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health191"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.192")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health192"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.193")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health193"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.194")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health194"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.195")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health195"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.196")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health196"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.197")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health197"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.198")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health198"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.199")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health199"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.hp.200")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("Health200"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.admin")) {
			event.getPlayer().setMaxHealth(
					PermissionsHealth.this.getConfig().getInt("AdminHealth"));
		}

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