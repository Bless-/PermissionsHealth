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
		
        Log.pluginName = this.getDescription().getName();
        Log.pluginVersion = this.getDescription().getVersion();
        Log.setConfigVerbosity(this.getConfig());
        
		PHConfig.load(this.getConfig());
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new HPListener(this), this);

		// This should be the only one we need.
        getCommand("ph").setExecutor(new PHCommands(this));
	//	getCommand("phl").setExecutor(new LookUp(this));
		
		// I would recommend just:
		getServer().getConsoleSender().sendMessage(getDescription().getName()+" "+getDescription().getVersion()+" loaded.");
		

	}

    /** PermissionsHealth - getMaxHealth(playerName)
     *  Gets the configured MaxHealth of given player.
     *  
     * @param playerName Exact name of player, must be online
     * @return MaxHealth that would be set, "defaulthealth" if no 
     *              permission found or null if player doesn't exist
     */
	public static Integer getMaxHealth(String playerName) {
        Player player = Bukkit.getPlayerExact(playerName);
        Log.high("Checking player: "+playerName);
        if (player == null) return null;
        
        if (player.isOp()) return PHConfig.opHealth;
        
	    for (Entry<String, Integer> entry  : PermissionsHealth.permissionsMap.entrySet()) {

	        if (player.hasPermission(entry.getKey())) {
	            Log.high("Got "+entry.getKey()+" ("+entry.getValue()+")");
	            return entry.getValue();
	        }
	    }

        Log.high("Not permission found, returning default health ("+PHConfig.defaultHealth+")");
	    return PHConfig.defaultHealth;
	}

}
