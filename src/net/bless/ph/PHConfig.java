package net.bless.ph;

import org.bukkit.ChatColor;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;

public class PHConfig {

    public static Integer defaultHealth;
    public static Integer opHealth;

    public static void load(FileConfiguration config) {
        defaultHealth = config.getInt("defaulthealth");
        opHealth = config.getInt("ophealth");
        Log.high("Defaulthealth: "+defaultHealth+", Ophealth: "+opHealth);
        
        ConfigurationSection section = config.getConfigurationSection("permissionshealth");
        
        PermissionsHealth.permissionsMap.clear();
        for (String key : section.getKeys(false)) {
            Integer value = section.getInt(key);
            if (value == null) {
                Log.normal(ChatColor.RED + "Error reading config for node ("+key+") value is not an Integer.");
            } else {
                PermissionsHealth.permissionsMap.put("permissionshealth."+key, value);
                Log.high("Loaded node '"+key + ": "+section.get(key, 20).toString()+"'");
            }
        }        
    }

}
