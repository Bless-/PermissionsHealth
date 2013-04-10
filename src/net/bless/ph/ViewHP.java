package net.bless.ph;

import net.bless.ph.PermissionsHealth;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ViewHP implements CommandExecutor {
	PermissionsHealth plugin;
	public Player player;

	public ViewHP(PermissionsHealth plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		if ((sender instanceof Player)) {
			this.player = ((Player) sender);
		}

		if (commandLabel.equalsIgnoreCase("phc")
				|| commandLabel.equalsIgnoreCase("hp")) {
			this.player.sendMessage(player.getHealth() + " health");

		}

		return true;
	}
}
