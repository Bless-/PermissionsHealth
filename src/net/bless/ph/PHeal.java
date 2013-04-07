package net.bless.ph;

import net.bless.ph.PermissionsHealth;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PHeal implements CommandExecutor {
	PermissionsHealth plugin;
	public Player player;
	public Player target;

	public PHeal(PermissionsHealth plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if ((sender instanceof Player)) {
			this.player = ((Player) sender);
		}

		if (cmd.getName().equalsIgnoreCase("pheal")) {
			if (this.player.hasPermission("permissionshealth.pheal")) {
				if (this.player == null) {
					sender.sendMessage("This command can only be run by a player. ");
				} else if (args.length == 0) {
					this.player.setHealth(player.getMaxHealth());
					this.player.setFoodLevel(20);
					this.player.setFireTicks(0);
					this.player.sendMessage(ChatColor.RED
							+ "You health is full.");
					return true;
				}
				if (args.length == 1) {
					this.target = this.player.getServer().getPlayer(args[0]);

					if (this.target == null) {
						sender.sendMessage(ChatColor.RED + args[0]
								+ " is not online!");
						return false;
					}
					this.target.setHealth(target.getMaxHealth());
					this.target.sendMessage(ChatColor.RED
							+ "Your health is full.");
				}
				if (args.length > 1)
					sender.sendMessage("Please write /heal <name>");
			} else {
				sender.sendMessage(ChatColor.RED
						+ "You dont have the required permission.");
			}

			return true;
		}

		return false;
	}
}