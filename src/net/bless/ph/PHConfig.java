package net.bless.ph;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;

public class PHConfig {

    public static void load(FileConfiguration config) {
        ConfigurationSection section = config.getConfigurationSection("permissionshealth");
        
        for (String key : section.getKeys(false)) {
            Integer value = section.getInt(key);
            if (value == null) {
                Bukkit.getServer().getConsoleSender().sendMessage(
                        ChatColor.RED + "Error reading config for node ("+key+") value is not an Integer.");
            } else {
                PermissionsHealth.permissionsMap.put("permissionshealth."+key, value);
                Bukkit.getServer().getConsoleSender().sendMessage(key + " equals "+section.get(key, 20).toString());
            }
        }        
    }

}
