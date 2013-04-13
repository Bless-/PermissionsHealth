package net.bless.ph;

import java.util.logging.Logger;
import net.bless.ph.OtherHP;
import net.bless.ph.PHeal;
import net.bless.ph.PermissionsHealth;
import net.bless.ph.Reload;
import net.bless.ph.ViewHP;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class PermissionsHealth extends JavaPlugin implements Listener {
	public static PermissionsHealth plugin;
	public final Logger logger = Logger.getLogger("MineCraft");


	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(
				ChatColor.RED
						+ "+------------------------------------------+");
		getServer().getConsoleSender().sendMessage(
				ChatColor.RED + "|    " + ChatColor.WHITE
			+ "PermissionsHealth " + getDescription().getVersion()
						+ " - Disable" + ChatColor.RED + "    |");
		getServer().getConsoleSender().sendMessage(
				ChatColor.RED
						+ "+------------------------------------------+");

	}

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new UpdateChecker(), this);
		
		getServer().getConsoleSender().sendMessage(
				ChatColor.RED
						+ "+------------------------------------------+");
		getServer().getConsoleSender().sendMessage(
				ChatColor.RED + "|    " + ChatColor.WHITE
			+ "PermissionsHealth " + getDescription().getVersion()
						+ " - Enabled" + ChatColor.RED + "    |");
		getServer().getConsoleSender().sendMessage(
				ChatColor.RED
						+ "+------------------------------------------+");

		this.saveDefaultConfig();
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new HPListener(this), this);
		
		
		getCommand("pheal").setExecutor(new PHeal(this));
		getCommand("phc").setExecutor(new ViewHP(this));
		getCommand("hp").setExecutor(new ViewHP(this));
		getCommand("pho").setExecutor(new OtherHP(this));
		getCommand("phreload").setExecutor(new Reload(this));
	}	
	
}

