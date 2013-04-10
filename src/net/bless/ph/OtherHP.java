package net.bless.ph;

import net.bless.ph.PermissionsHealth;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OtherHP implements CommandExecutor {
	PermissionsHealth plugin;
	public Player player;
	public Player target;
	public int playerHealth;
	public int targetHealth;

	public OtherHP(PermissionsHealth plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		if ((sender instanceof Player)) {
			this.player = ((Player) sender);
		}

		if (commandLabel.equalsIgnoreCase("pho")) {
			if (this.player.hasPermission("permissionshealth.pho")) {
				if (this.player == null) {
					sender.sendMessage("This command can only be run by a player. ");
				} else if (args.length == 0)
					player.sendMessage("Please specify a player by doing /pho <player]>");
				else if (args.length == 1) {
					if (player.getServer().getPlayer(args[0]) != null) {
						Player targetPlayer = player.getServer().getPlayer(
								args[0]);
						player.sendMessage(ChatColor.GREEN + targetPlayer.getDisplayName() + " has "
								+ targetPlayer.getHealth() + " Health!");
					} else {
						player.sendMessage("You do not have permission to do that command!");
					}
				} else
					player.sendMessage(ChatColor.RED
							+ "That player is not online!");
			}

			return true;
		}
		return false;
	}
}