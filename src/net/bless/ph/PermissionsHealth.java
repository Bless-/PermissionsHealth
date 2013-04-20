package net.bless.ph;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class PermissionsHealth extends JavaPlugin implements Listener {
	public static PermissionsHealth plugin;
    public static Map<String, Integer> permissionsMap = new HashMap<String, Integer>();
    
	public final Logger logger = Logger.getLogger("MineCraft");


	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(
				ChatColor.RED + "+------------------------------------------+");
		getServer().getConsoleSender().sendMessage(
				ChatColor.RED + "|    " + ChatColor.WHITE
						+ "PermissionsHealth " + getDescription().getVersion()
						+ " - Disable" + ChatColor.RED + "    |");
		getServer().getConsoleSender().sendMessage(
				ChatColor.RED + "+------------------------------------------+");

	}

	@Override
	public void onEnable() {
		this.saveDefaultConfig();
		PHConfig.load(this.getConfig());
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new HPListener(this), this);

		// This should be the only one we need.
        getCommand("ph").setExecutor(new PHCommands(this));
	//	getCommand("phl").setExecutor(new LookUp(this));
		
		// I would recommend just:
		//getServer().getConsoleSender().sendMessage(getDescription().getName()+" "+getDescription().getVersion()+" loaded.");
		
        getServer().getConsoleSender().sendMessage(
                ChatColor.RED + "+------------------------------------------+");
        getServer().getConsoleSender().sendMessage(
                ChatColor.RED + "|    " + ChatColor.WHITE
                        + "PermissionsHealth " + getDescription().getVersion()
                        + " - Enabled" + ChatColor.RED + "    |");
        getServer().getConsoleSender().sendMessage(
                ChatColor.RED + "+------------------------------------------+");

	}

    /** PermissionsHealth - getMaxHealth(playerName)
     *  Gets the configured MaxHealth of given player.
     *  
     * @param playerName Exact name of player, must be online
     * @return MaxHealth that would be set, null if no permission found or player doesn't exist
     */
    public Integer getMaxHealth(String playerName) {
        for (Entry<String, Integer> entry  : PermissionsHealth.permissionsMap.entrySet()) {
            Player player = Bukkit.getPlayerExact(playerName);
            
            if (player.hasPermission(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

}
