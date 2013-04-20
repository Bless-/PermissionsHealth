package net.bless.ph;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Help implements CommandExecutor {
	PermissionsHealth plugin;
	public Player player;

	public Help(PermissionsHealth plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		{
			if ((sender instanceof Player)) {
				this.player = ((Player) sender);
			}

			if (cmd.getName().equalsIgnoreCase("phelp")) {
				if (this.player.hasPermission("permissionshealth.help")) {
					if (this.player == null) {
						sender.sendMessage("This command can only be run by a player. ");
					} else if (args.length == 0) {
						this.player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Help: PermissionsHealth"
								+ ChatColor.YELLOW + "---------------");
						this.player.sendMessage(ChatColor.GOLD + "/hp"
								+ ChatColor.WHITE
								+ " : used to view your current health.");
						this.player.sendMessage(ChatColor.GOLD + "/phc"
								+ ChatColor.WHITE
								+ " : used to view your current health.");
						this.player.sendMessage(ChatColor.GOLD + "/ph reload"
								+ ChatColor.WHITE + " : Reloads Config.");
						this.player.sendMessage(ChatColor.GOLD + "/pheal"
								+ ChatColor.WHITE
								+ " : used to to fully heal you.");
						this.player.sendMessage(ChatColor.GOLD
								+ "/pheal <player>" + ChatColor.WHITE
								+ " : used to to fully heal a player.");
						this.player.sendMessage(ChatColor.GOLD + "/pho"
								+ ChatColor.WHITE
								+ " : used to view target's current health.");
						this.player.sendMessage(ChatColor.GOLD + "/phl page"
								+ ChatColor.WHITE
								+ " : displays pages for nodes and health.");
						this.player
								.sendMessage(ChatColor.GOLD
										+ "/phn <node#> <newpermissionsnodename>"
										+ ChatColor.WHITE
										+ " : lets you edit the nodes from ingame changing them.");
						this.player
								.sendMessage(ChatColor.GOLD
										+ "/phh <health#> <amount>"
										+ ChatColor.WHITE
										+ " : lets you edit ingame the amount of health the node has");
						return true;
					}
				}
			}
		}
		return false;
	}
}