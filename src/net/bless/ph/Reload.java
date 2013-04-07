package net.bless.ph;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Reload implements CommandExecutor {
	PermissionsHealth plugin;
	public Player player;

	public Reload(PermissionsHealth plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		{
			if ((sender instanceof Player)) {
				this.player = ((Player) sender);
			}

			if (cmd.getName().equalsIgnoreCase("ph")) {
				this.plugin.reloadConfig();
				this.player.sendMessage(ChatColor.GOLD
						+ "PermissionsHealth has been reloaded");
				return true;
			}
			return false;
		}
	}
}
