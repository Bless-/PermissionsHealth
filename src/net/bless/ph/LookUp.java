package net.bless.ph;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LookUp implements CommandExecutor {
	PermissionsHealth plugin;
	public Player player;

	public LookUp(PermissionsHealth plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd,
			String commandLabel, String[] args) {
		{
			if ((sender instanceof Player)) {
				this.player = ((Player) sender);
			}

			if (cmd.getName().equalsIgnoreCase("phl")) {
				if (args.length == 1) {
					String subCommand = args[0].toLowerCase();
					if (subCommand.equals("page")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Nodes & Health Pages"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GRAY
								+ "page1, page2, page3, page4, page5");
						player.sendMessage(ChatColor.GRAY
								+ "page6, page7, page8, page9, page10");
						player.sendMessage(ChatColor.GRAY
								+ "page11, page12, page13, page14, page15");
						player.sendMessage(ChatColor.GRAY
								+ "page16, page17, page18, page19, page20");
						player.sendMessage(ChatColor.GRAY
								+ "page21, page22, page23, page24, page25");
						player.sendMessage(ChatColor.GRAY
								+ "page26, page27, page28, page29, page30");
						player.sendMessage(ChatColor.GRAY
								+ "page31, page32, page33, page34, page35");
						player.sendMessage(ChatColor.GRAY
								+ "page36, page37, page38, page39, page40");
						return true;
					} else if (subCommand.equals("page1")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page1/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "GuestHealth: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("GuestHealth"));
						player.sendMessage(ChatColor.GOLD + "AdminHealth: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("AdminHealth"));
						player.sendMessage(ChatColor.GOLD + "Node1: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node1"));
						player.sendMessage(ChatColor.GOLD + "Health1: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health1"));
						player.sendMessage(ChatColor.GOLD + "Node2: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node2"));
						player.sendMessage(ChatColor.GOLD + "Health2: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health2"));
						player.sendMessage(ChatColor.GOLD + "Node3: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node3"));
						player.sendMessage(ChatColor.GOLD + "Health3: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health3"));
						player.sendMessage(ChatColor.GOLD + "Node4: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node4"));
						player.sendMessage(ChatColor.GOLD + "Health4: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health4"));
						player.sendMessage(ChatColor.GOLD + "Node5: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node5"));
						player.sendMessage(ChatColor.GOLD + "Health5: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health5"));
						return true;
					} else

					if (subCommand.equals("page2")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page2/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node6: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node6"));
						player.sendMessage(ChatColor.GOLD + "Health6: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health6"));
						player.sendMessage(ChatColor.GOLD + "Node7: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node7"));
						player.sendMessage(ChatColor.GOLD + "Health7: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health7"));
						player.sendMessage(ChatColor.GOLD + "Node8: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node8"));
						player.sendMessage(ChatColor.GOLD + "Health8: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health8"));
						player.sendMessage(ChatColor.GOLD + "Node9: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node9"));
						player.sendMessage(ChatColor.GOLD + "Health9: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health9"));
						player.sendMessage(ChatColor.GOLD + "Node10: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node10"));
						player.sendMessage(ChatColor.GOLD + "Health10: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health10"));
						return true;

					} else

					if (subCommand.equals("page3")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page3/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node11: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node11"));
						player.sendMessage(ChatColor.GOLD + "Health11: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health11"));
						player.sendMessage(ChatColor.GOLD + "Node12: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node12"));
						player.sendMessage(ChatColor.GOLD + "Health12: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health12"));
						player.sendMessage(ChatColor.GOLD + "Node13: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node13"));
						player.sendMessage(ChatColor.GOLD + "Health13: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health13"));
						player.sendMessage(ChatColor.GOLD + "Node14: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node14"));
						player.sendMessage(ChatColor.GOLD + "Health14: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health14"));
						player.sendMessage(ChatColor.GOLD + "Node15: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node15"));
						player.sendMessage(ChatColor.GOLD + "Health15: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health15"));
						return true;
					} else

					if (subCommand.equals("page4")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page4/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node16: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node16"));
						player.sendMessage(ChatColor.GOLD + "Health16: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health16"));
						player.sendMessage(ChatColor.GOLD + "Node17: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node17"));
						player.sendMessage(ChatColor.GOLD + "Health17: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health17"));
						player.sendMessage(ChatColor.GOLD + "Node18: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node18"));
						player.sendMessage(ChatColor.GOLD + "Health18: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health18"));
						player.sendMessage(ChatColor.GOLD + "Node19: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node19"));
						player.sendMessage(ChatColor.GOLD + "Health19: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health19"));
						player.sendMessage(ChatColor.GOLD + "Node20: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node20"));
						player.sendMessage(ChatColor.GOLD + "Health20: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health20"));
						return true;
					} else

					if (subCommand.equals("page5")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page5/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node21: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node21"));
						player.sendMessage(ChatColor.GOLD + "Health21: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health21"));
						player.sendMessage(ChatColor.GOLD + "Node22: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node22"));
						player.sendMessage(ChatColor.GOLD + "Health22: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health22"));
						player.sendMessage(ChatColor.GOLD + "Node23: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node23"));
						player.sendMessage(ChatColor.GOLD + "Health23: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health23"));
						player.sendMessage(ChatColor.GOLD + "Node24: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node24"));
						player.sendMessage(ChatColor.GOLD + "Health24: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health24"));
						player.sendMessage(ChatColor.GOLD + "Node25: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node25"));
						player.sendMessage(ChatColor.GOLD + "Health25: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health25"));
						return true;
					} else

					if (subCommand.equals("page6")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page6/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node26: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node26"));
						player.sendMessage(ChatColor.GOLD + "Health26: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health26"));
						player.sendMessage(ChatColor.GOLD + "Node27: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node27"));
						player.sendMessage(ChatColor.GOLD + "Health27: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health27"));
						player.sendMessage(ChatColor.GOLD + "Node28: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node28"));
						player.sendMessage(ChatColor.GOLD + "Health28: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health28"));
						player.sendMessage(ChatColor.GOLD + "Node29: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node29"));
						player.sendMessage(ChatColor.GOLD + "Health29: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health29"));
						player.sendMessage(ChatColor.GOLD + "Node30: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node30"));
						player.sendMessage(ChatColor.GOLD + "Health30: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health30"));
						return true;
					} else

					if (subCommand.equals("page7")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page7/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node31: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node31"));
						player.sendMessage(ChatColor.GOLD + "Health31: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health31"));
						player.sendMessage(ChatColor.GOLD + "Node32: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node32"));
						player.sendMessage(ChatColor.GOLD + "Health12: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health32"));
						player.sendMessage(ChatColor.GOLD + "Node13: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node33"));
						player.sendMessage(ChatColor.GOLD + "Health13: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health33"));
						player.sendMessage(ChatColor.GOLD + "Node14: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node34"));
						player.sendMessage(ChatColor.GOLD + "Health14: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health34"));
						player.sendMessage(ChatColor.GOLD + "Node35: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node35"));
						player.sendMessage(ChatColor.GOLD + "Health35: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health35"));
						return true;
					} else

					if (subCommand.equals("page8")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page8/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node36: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node36"));
						player.sendMessage(ChatColor.GOLD + "Health36: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health36"));
						player.sendMessage(ChatColor.GOLD + "Node37: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node37"));
						player.sendMessage(ChatColor.GOLD + "Health37: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health37"));
						player.sendMessage(ChatColor.GOLD + "Node38: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node38"));
						player.sendMessage(ChatColor.GOLD + "Health38: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health38"));
						player.sendMessage(ChatColor.GOLD + "Node39: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node39"));
						player.sendMessage(ChatColor.GOLD + "Health39: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health39"));
						player.sendMessage(ChatColor.GOLD + "Node40: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node40"));
						player.sendMessage(ChatColor.GOLD + "Health40: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health40"));
						return true;
					} else

					if (subCommand.equals("page9")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page9/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node41: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node41"));
						player.sendMessage(ChatColor.GOLD + "Health41: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health41"));
						player.sendMessage(ChatColor.GOLD + "Node42: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node42"));
						player.sendMessage(ChatColor.GOLD + "Health12: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health42"));
						player.sendMessage(ChatColor.GOLD + "Node43: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node43"));
						player.sendMessage(ChatColor.GOLD + "Health43: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health43"));
						player.sendMessage(ChatColor.GOLD + "Node44: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node44"));
						player.sendMessage(ChatColor.GOLD + "Health44: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health44"));
						player.sendMessage(ChatColor.GOLD + "Node45: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node45"));
						player.sendMessage(ChatColor.GOLD + "Health45: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health45"));
						return true;
					} else

					if (subCommand.equals("page10")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page10/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------------");
						player.sendMessage(ChatColor.GOLD + "Node46: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node46"));
						player.sendMessage(ChatColor.GOLD + "Health46: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health46"));
						player.sendMessage(ChatColor.GOLD + "Node47: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node47"));
						player.sendMessage(ChatColor.GOLD + "Health47: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health47"));
						player.sendMessage(ChatColor.GOLD + "Node48: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node48"));
						player.sendMessage(ChatColor.GOLD + "Health48: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health48"));
						player.sendMessage(ChatColor.GOLD + "Node49: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node49"));
						player.sendMessage(ChatColor.GOLD + "Health49: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health49"));
						player.sendMessage(ChatColor.GOLD + "Node50: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node50"));
						player.sendMessage(ChatColor.GOLD + "Health50: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health50"));
						return true;

					} else

					if (subCommand.equals("page11")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page11/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node51: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node51"));
						player.sendMessage(ChatColor.GOLD + "Health51: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health51"));
						player.sendMessage(ChatColor.GOLD + "Node52: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node52"));
						player.sendMessage(ChatColor.GOLD + "Health52: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health52"));
						player.sendMessage(ChatColor.GOLD + "Node53: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node53"));
						player.sendMessage(ChatColor.GOLD + "Health53: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health53"));
						player.sendMessage(ChatColor.GOLD + "Node54: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node54"));
						player.sendMessage(ChatColor.GOLD + "Health54: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health54"));
						player.sendMessage(ChatColor.GOLD + "Node55: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node55"));
						player.sendMessage(ChatColor.GOLD + "Health55: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health55"));
						return true;
					} else

					if (subCommand.equals("page12")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page12/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------------");
						player.sendMessage(ChatColor.GOLD + "Node56: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node56"));
						player.sendMessage(ChatColor.GOLD + "Health56: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health56"));
						player.sendMessage(ChatColor.GOLD + "Node57: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node57"));
						player.sendMessage(ChatColor.GOLD + "Health57: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health57"));
						player.sendMessage(ChatColor.GOLD + "Node58: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node58"));
						player.sendMessage(ChatColor.GOLD + "Health58: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health58"));
						player.sendMessage(ChatColor.GOLD + "Node59: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node59"));
						player.sendMessage(ChatColor.GOLD + "Health59: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health59"));
						player.sendMessage(ChatColor.GOLD + "Node60: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node60"));
						player.sendMessage(ChatColor.GOLD + "Health60: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health60"));
						return true;
					} else

					if (subCommand.equals("page13")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page13/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node61: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node61"));
						player.sendMessage(ChatColor.GOLD + "Health61: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health61"));
						player.sendMessage(ChatColor.GOLD + "Node62: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node62"));
						player.sendMessage(ChatColor.GOLD + "Health62: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health62"));
						player.sendMessage(ChatColor.GOLD + "Node63: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node63"));
						player.sendMessage(ChatColor.GOLD + "Health63: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health63"));
						player.sendMessage(ChatColor.GOLD + "Node64: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node64"));
						player.sendMessage(ChatColor.GOLD + "Health64: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health64"));
						player.sendMessage(ChatColor.GOLD + "Node65: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node65"));
						player.sendMessage(ChatColor.GOLD + "Health65: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health65"));
						return true;
					} else

					if (subCommand.equals("page14")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page14/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------------");
						player.sendMessage(ChatColor.GOLD + "Node66: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node66"));
						player.sendMessage(ChatColor.GOLD + "Health66: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health66"));
						player.sendMessage(ChatColor.GOLD + "Node67: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node67"));
						player.sendMessage(ChatColor.GOLD + "Health67: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health67"));
						player.sendMessage(ChatColor.GOLD + "Node68: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node68"));
						player.sendMessage(ChatColor.GOLD + "Health68: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health68"));
						player.sendMessage(ChatColor.GOLD + "Node69: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node69"));
						player.sendMessage(ChatColor.GOLD + "Health69: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health69"));
						player.sendMessage(ChatColor.GOLD + "Node70: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node70"));
						player.sendMessage(ChatColor.GOLD + "Health70: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health70"));
						return true;
					} else

					if (subCommand.equals("page15")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page15/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node71: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node71"));
						player.sendMessage(ChatColor.GOLD + "Health71: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health71"));
						player.sendMessage(ChatColor.GOLD + "Node72: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node72"));
						player.sendMessage(ChatColor.GOLD + "Health72: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health72"));
						player.sendMessage(ChatColor.GOLD + "Node73: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node73"));
						player.sendMessage(ChatColor.GOLD + "Health73: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health73"));
						player.sendMessage(ChatColor.GOLD + "Node74: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node74"));
						player.sendMessage(ChatColor.GOLD + "Health74: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health74"));
						player.sendMessage(ChatColor.GOLD + "Node75: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node75"));
						player.sendMessage(ChatColor.GOLD + "Health75: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health75"));
						return true;
					} else

					if (subCommand.equals("page16")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page16/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------------");
						player.sendMessage(ChatColor.GOLD + "Node76: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node76"));
						player.sendMessage(ChatColor.GOLD + "Health76: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health76"));
						player.sendMessage(ChatColor.GOLD + "Node77: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node77"));
						player.sendMessage(ChatColor.GOLD + "Health77: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health77"));
						player.sendMessage(ChatColor.GOLD + "Node58: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node78"));
						player.sendMessage(ChatColor.GOLD + "Health78: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health78"));
						player.sendMessage(ChatColor.GOLD + "Node79: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node79"));
						player.sendMessage(ChatColor.GOLD + "Health79: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health79"));
						player.sendMessage(ChatColor.GOLD + "Node80: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node80"));
						player.sendMessage(ChatColor.GOLD + "Health80: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health80"));
						return true;
					} else

					if (subCommand.equals("page17")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page17/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node81: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node81"));
						player.sendMessage(ChatColor.GOLD + "Health81: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health81"));
						player.sendMessage(ChatColor.GOLD + "Node82: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node82"));
						player.sendMessage(ChatColor.GOLD + "Health82: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health82"));
						player.sendMessage(ChatColor.GOLD + "Node83: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node83"));
						player.sendMessage(ChatColor.GOLD + "Health83: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health83"));
						player.sendMessage(ChatColor.GOLD + "Node84: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node84"));
						player.sendMessage(ChatColor.GOLD + "Health84: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health84"));
						player.sendMessage(ChatColor.GOLD + "Node85: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node85"));
						player.sendMessage(ChatColor.GOLD + "Health85: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health85"));
						return true;
					} else

					if (subCommand.equals("page18")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page18/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------------");
						player.sendMessage(ChatColor.GOLD + "Node86: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node86"));
						player.sendMessage(ChatColor.GOLD + "Health86: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health86"));
						player.sendMessage(ChatColor.GOLD + "Node87: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node87"));
						player.sendMessage(ChatColor.GOLD + "Health87: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health87"));
						player.sendMessage(ChatColor.GOLD + "Node88: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node88"));
						player.sendMessage(ChatColor.GOLD + "Health88: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health88"));
						player.sendMessage(ChatColor.GOLD + "Node89: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node89"));
						player.sendMessage(ChatColor.GOLD + "Health89: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health89"));
						player.sendMessage(ChatColor.GOLD + "Node90: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node90"));
						player.sendMessage(ChatColor.GOLD + "Health90: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health90"));
						return true;
					} else

					if (subCommand.equals("page19")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page19/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node91: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node91"));
						player.sendMessage(ChatColor.GOLD + "Health91: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health91"));
						player.sendMessage(ChatColor.GOLD + "Node92: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node92"));
						player.sendMessage(ChatColor.GOLD + "Health92: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health92"));
						player.sendMessage(ChatColor.GOLD + "Node93: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node93"));
						player.sendMessage(ChatColor.GOLD + "Health93: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health93"));
						player.sendMessage(ChatColor.GOLD + "Node94: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node94"));
						player.sendMessage(ChatColor.GOLD + "Health94: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health94"));
						player.sendMessage(ChatColor.GOLD + "Node95: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node95"));
						player.sendMessage(ChatColor.GOLD + "Health95: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health95"));
						return true;
					} else

					if (subCommand.equals("page20")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page20/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------------");
						player.sendMessage(ChatColor.GOLD + "Node96: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node96"));
						player.sendMessage(ChatColor.GOLD + "Health96: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health96"));
						player.sendMessage(ChatColor.GOLD + "Node97: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node97"));
						player.sendMessage(ChatColor.GOLD + "Health97: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health97"));
						player.sendMessage(ChatColor.GOLD + "Node98: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node98"));
						player.sendMessage(ChatColor.GOLD + "Health98: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health98"));
						player.sendMessage(ChatColor.GOLD + "Node99: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node99"));
						player.sendMessage(ChatColor.GOLD + "Health99: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health99"));
						player.sendMessage(ChatColor.GOLD + "Node100: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node100"));
						player.sendMessage(ChatColor.GOLD + "Health100: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health100"));
						return true;

					} else if (subCommand.equals("page21")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page21/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node101: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node101"));
						player.sendMessage(ChatColor.GOLD + "Health101: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health101"));
						player.sendMessage(ChatColor.GOLD + "Node102: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node102"));
						player.sendMessage(ChatColor.GOLD + "Health102: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health102"));
						player.sendMessage(ChatColor.GOLD + "Node103: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node103"));
						player.sendMessage(ChatColor.GOLD + "Health103: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health103"));
						player.sendMessage(ChatColor.GOLD + "Node104: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node104"));
						player.sendMessage(ChatColor.GOLD + "Health104: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health104"));
						player.sendMessage(ChatColor.GOLD + "Node105: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node105"));
						player.sendMessage(ChatColor.GOLD + "Health105: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health105"));
						return true;
					} else

					if (subCommand.equals("page22")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page22/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node106: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node106"));
						player.sendMessage(ChatColor.GOLD + "Health106: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health106"));
						player.sendMessage(ChatColor.GOLD + "Node107: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node107"));
						player.sendMessage(ChatColor.GOLD + "Health107: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health107"));
						player.sendMessage(ChatColor.GOLD + "Node108: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node108"));
						player.sendMessage(ChatColor.GOLD + "Health108: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health108"));
						player.sendMessage(ChatColor.GOLD + "Node109: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node109"));
						player.sendMessage(ChatColor.GOLD + "Health109: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health109"));
						player.sendMessage(ChatColor.GOLD + "Node110: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node110"));
						player.sendMessage(ChatColor.GOLD + "Health110: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health110"));
						return true;

					} else

					if (subCommand.equals("page23")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page23/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node111: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node111"));
						player.sendMessage(ChatColor.GOLD + "Health111: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health111"));
						player.sendMessage(ChatColor.GOLD + "Node112: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node112"));
						player.sendMessage(ChatColor.GOLD + "Health112: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health112"));
						player.sendMessage(ChatColor.GOLD + "Node113: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node113"));
						player.sendMessage(ChatColor.GOLD + "Health113: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health113"));
						player.sendMessage(ChatColor.GOLD + "Node114: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node114"));
						player.sendMessage(ChatColor.GOLD + "Health114: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health114"));
						player.sendMessage(ChatColor.GOLD + "Node115: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node115"));
						player.sendMessage(ChatColor.GOLD + "Health115: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health115"));
						return true;
					} else

					if (subCommand.equals("page24")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page24/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node116: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node116"));
						player.sendMessage(ChatColor.GOLD + "Health116: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health116"));
						player.sendMessage(ChatColor.GOLD + "Node117: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node117"));
						player.sendMessage(ChatColor.GOLD + "Health117: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health117"));
						player.sendMessage(ChatColor.GOLD + "Node118: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node118"));
						player.sendMessage(ChatColor.GOLD + "Health118: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health118"));
						player.sendMessage(ChatColor.GOLD + "Node119: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node119"));
						player.sendMessage(ChatColor.GOLD + "Health119: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health119"));
						player.sendMessage(ChatColor.GOLD + "Node120: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node120"));
						player.sendMessage(ChatColor.GOLD + "Health120: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health120"));
						return true;
					} else

					if (subCommand.equals("page25")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page25/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node121: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node121"));
						player.sendMessage(ChatColor.GOLD + "Health121: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health121"));
						player.sendMessage(ChatColor.GOLD + "Node122: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node122"));
						player.sendMessage(ChatColor.GOLD + "Health122: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health122"));
						player.sendMessage(ChatColor.GOLD + "Node123: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node123"));
						player.sendMessage(ChatColor.GOLD + "Health23: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health123"));
						player.sendMessage(ChatColor.GOLD + "Node124: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node124"));
						player.sendMessage(ChatColor.GOLD + "Health24: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health124"));
						player.sendMessage(ChatColor.GOLD + "Node125: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node125"));
						player.sendMessage(ChatColor.GOLD + "Health125: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health125"));
						return true;
					} else

					if (subCommand.equals("page26")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page26/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node126: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node126"));
						player.sendMessage(ChatColor.GOLD + "Health126: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health126"));
						player.sendMessage(ChatColor.GOLD + "Node127: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node127"));
						player.sendMessage(ChatColor.GOLD + "Health127: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health127"));
						player.sendMessage(ChatColor.GOLD + "Node128: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node128"));
						player.sendMessage(ChatColor.GOLD + "Health128: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health128"));
						player.sendMessage(ChatColor.GOLD + "Node129: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node129"));
						player.sendMessage(ChatColor.GOLD + "Health129: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health129"));
						player.sendMessage(ChatColor.GOLD + "Node130: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node130"));
						player.sendMessage(ChatColor.GOLD + "Health130: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health130"));
						return true;
					} else

					if (subCommand.equals("page27")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page27/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node131: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node131"));
						player.sendMessage(ChatColor.GOLD + "Health131: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health131"));
						player.sendMessage(ChatColor.GOLD + "Node132: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node132"));
						player.sendMessage(ChatColor.GOLD + "Health132: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health132"));
						player.sendMessage(ChatColor.GOLD + "Node132: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node133"));
						player.sendMessage(ChatColor.GOLD + "Health133: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health133"));
						player.sendMessage(ChatColor.GOLD + "Node134: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node134"));
						player.sendMessage(ChatColor.GOLD + "Health134: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health134"));
						player.sendMessage(ChatColor.GOLD + "Node135: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node135"));
						player.sendMessage(ChatColor.GOLD + "Health135: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health135"));
						return true;
					} else

					if (subCommand.equals("page28")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page28/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node136: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node136"));
						player.sendMessage(ChatColor.GOLD + "Health136: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health136"));
						player.sendMessage(ChatColor.GOLD + "Node137: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node137"));
						player.sendMessage(ChatColor.GOLD + "Health137: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health137"));
						player.sendMessage(ChatColor.GOLD + "Node138: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node138"));
						player.sendMessage(ChatColor.GOLD + "Health138: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health138"));
						player.sendMessage(ChatColor.GOLD + "Node139: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node139"));
						player.sendMessage(ChatColor.GOLD + "Health139: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health139"));
						player.sendMessage(ChatColor.GOLD + "Node140: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node140"));
						player.sendMessage(ChatColor.GOLD + "Health140: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health140"));
						return true;
					} else

					if (subCommand.equals("page29")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page29/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node141: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node141"));
						player.sendMessage(ChatColor.GOLD + "Health141: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health141"));
						player.sendMessage(ChatColor.GOLD + "Node142: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node142"));
						player.sendMessage(ChatColor.GOLD + "Health142: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health142"));
						player.sendMessage(ChatColor.GOLD + "Node143: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node143"));
						player.sendMessage(ChatColor.GOLD + "Health143: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health143"));
						player.sendMessage(ChatColor.GOLD + "Node144: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node144"));
						player.sendMessage(ChatColor.GOLD + "Health144: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health144"));
						player.sendMessage(ChatColor.GOLD + "Node145: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node145"));
						player.sendMessage(ChatColor.GOLD + "Health145: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health145"));
						return true;
					} else

					if (subCommand.equals("page30")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page30/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------------");
						player.sendMessage(ChatColor.GOLD + "Node146: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node146"));
						player.sendMessage(ChatColor.GOLD + "Health146: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health146"));
						player.sendMessage(ChatColor.GOLD + "Node147: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node147"));
						player.sendMessage(ChatColor.GOLD + "Health147: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health147"));
						player.sendMessage(ChatColor.GOLD + "Node148: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node148"));
						player.sendMessage(ChatColor.GOLD + "Health148: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health148"));
						player.sendMessage(ChatColor.GOLD + "Node149: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node149"));
						player.sendMessage(ChatColor.GOLD + "Health149: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health149"));
						player.sendMessage(ChatColor.GOLD + "Node150: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node150"));
						player.sendMessage(ChatColor.GOLD + "Health150: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health150"));
						return true;

					} else

					if (subCommand.equals("page31")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page31/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node151: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node151"));
						player.sendMessage(ChatColor.GOLD + "Health151: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health151"));
						player.sendMessage(ChatColor.GOLD + "Node152: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node152"));
						player.sendMessage(ChatColor.GOLD + "Health152: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health152"));
						player.sendMessage(ChatColor.GOLD + "Node153: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node153"));
						player.sendMessage(ChatColor.GOLD + "Health153: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health153"));
						player.sendMessage(ChatColor.GOLD + "Node154: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node154"));
						player.sendMessage(ChatColor.GOLD + "Health154: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health154"));
						player.sendMessage(ChatColor.GOLD + "Node155: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node155"));
						player.sendMessage(ChatColor.GOLD + "Health155: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health155"));
						return true;
					} else

					if (subCommand.equals("page32")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page32/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------------");
						player.sendMessage(ChatColor.GOLD + "Node156: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node156"));
						player.sendMessage(ChatColor.GOLD + "Health156: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health156"));
						player.sendMessage(ChatColor.GOLD + "Node157: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node157"));
						player.sendMessage(ChatColor.GOLD + "Health157: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health157"));
						player.sendMessage(ChatColor.GOLD + "Node158: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node158"));
						player.sendMessage(ChatColor.GOLD + "Health158: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health158"));
						player.sendMessage(ChatColor.GOLD + "Node159: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node159"));
						player.sendMessage(ChatColor.GOLD + "Health159: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health159"));
						player.sendMessage(ChatColor.GOLD + "Node160: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node160"));
						player.sendMessage(ChatColor.GOLD + "Health160: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health160"));
						return true;
					} else

					if (subCommand.equals("page33")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page33/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node161: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node161"));
						player.sendMessage(ChatColor.GOLD + "Health161: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health161"));
						player.sendMessage(ChatColor.GOLD + "Node162: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node162"));
						player.sendMessage(ChatColor.GOLD + "Health162: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health162"));
						player.sendMessage(ChatColor.GOLD + "Node163: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node163"));
						player.sendMessage(ChatColor.GOLD + "Health163: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health163"));
						player.sendMessage(ChatColor.GOLD + "Node164: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node164"));
						player.sendMessage(ChatColor.GOLD + "Health164: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health164"));
						player.sendMessage(ChatColor.GOLD + "Node165: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node165"));
						player.sendMessage(ChatColor.GOLD + "Health165: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health165"));
						return true;
					} else

					if (subCommand.equals("page34")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page34/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------------");
						player.sendMessage(ChatColor.GOLD + "Node166: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node166"));
						player.sendMessage(ChatColor.GOLD + "Health166: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health166"));
						player.sendMessage(ChatColor.GOLD + "Node167: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node167"));
						player.sendMessage(ChatColor.GOLD + "Health67: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health167"));
						player.sendMessage(ChatColor.GOLD + "Node168: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node168"));
						player.sendMessage(ChatColor.GOLD + "Health168: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health168"));
						player.sendMessage(ChatColor.GOLD + "Node169: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node169"));
						player.sendMessage(ChatColor.GOLD + "Health169: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health169"));
						player.sendMessage(ChatColor.GOLD + "Node170: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node170"));
						player.sendMessage(ChatColor.GOLD + "Health170: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health170"));
						return true;
					} else

					if (subCommand.equals("page35")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page35/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node171: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node171"));
						player.sendMessage(ChatColor.GOLD + "Health171: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health171"));
						player.sendMessage(ChatColor.GOLD + "Node172: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node172"));
						player.sendMessage(ChatColor.GOLD + "Health172: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health172"));
						player.sendMessage(ChatColor.GOLD + "Node173: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node173"));
						player.sendMessage(ChatColor.GOLD + "Health173: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health173"));
						player.sendMessage(ChatColor.GOLD + "Node174: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node174"));
						player.sendMessage(ChatColor.GOLD + "Health174: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health174"));
						player.sendMessage(ChatColor.GOLD + "Node175: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node175"));
						player.sendMessage(ChatColor.GOLD + "Health175: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health175"));
						return true;
					} else

					if (subCommand.equals("page36")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page36/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------------");
						player.sendMessage(ChatColor.GOLD + "Node176: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node176"));
						player.sendMessage(ChatColor.GOLD + "Health176: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health176"));
						player.sendMessage(ChatColor.GOLD + "Node177: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node177"));
						player.sendMessage(ChatColor.GOLD + "Health177: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health177"));
						player.sendMessage(ChatColor.GOLD + "Node178: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node178"));
						player.sendMessage(ChatColor.GOLD + "Health178: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health178"));
						player.sendMessage(ChatColor.GOLD + "Node179: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node179"));
						player.sendMessage(ChatColor.GOLD + "Health179: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health179"));
						player.sendMessage(ChatColor.GOLD + "Node180: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node180"));
						player.sendMessage(ChatColor.GOLD + "Health180: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health180"));
						return true;
					} else

					if (subCommand.equals("page37")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page37/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node181: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node181"));
						player.sendMessage(ChatColor.GOLD + "Health181: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health181"));
						player.sendMessage(ChatColor.GOLD + "Node182: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node182"));
						player.sendMessage(ChatColor.GOLD + "Health182: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health182"));
						player.sendMessage(ChatColor.GOLD + "Node183: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node183"));
						player.sendMessage(ChatColor.GOLD + "Health183: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health183"));
						player.sendMessage(ChatColor.GOLD + "Node184: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node184"));
						player.sendMessage(ChatColor.GOLD + "Health184: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health184"));
						player.sendMessage(ChatColor.GOLD + "Node185: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node185"));
						player.sendMessage(ChatColor.GOLD + "Health185: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health185"));
						return true;
					} else

					if (subCommand.equals("page38")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page38/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------------");
						player.sendMessage(ChatColor.GOLD + "Node186: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node186"));
						player.sendMessage(ChatColor.GOLD + "Health186: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health186"));
						player.sendMessage(ChatColor.GOLD + "Node187: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node187"));
						player.sendMessage(ChatColor.GOLD + "Health187: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health187"));
						player.sendMessage(ChatColor.GOLD + "Node188: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node188"));
						player.sendMessage(ChatColor.GOLD + "Health188: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health188"));
						player.sendMessage(ChatColor.GOLD + "Node189: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node189"));
						player.sendMessage(ChatColor.GOLD + "Health189: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health189"));
						player.sendMessage(ChatColor.GOLD + "Node190: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node190"));
						player.sendMessage(ChatColor.GOLD + "Health190: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health190"));
						return true;
					} else

					if (subCommand.equals("page39")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page39/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------");
						player.sendMessage(ChatColor.GOLD + "Node191: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node191"));
						player.sendMessage(ChatColor.GOLD + "Health191: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health191"));
						player.sendMessage(ChatColor.GOLD + "Node192: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node192"));
						player.sendMessage(ChatColor.GOLD + "Health192: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health192"));
						player.sendMessage(ChatColor.GOLD + "Node193: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node193"));
						player.sendMessage(ChatColor.GOLD + "Health193: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health193"));
						player.sendMessage(ChatColor.GOLD + "Node194: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node194"));
						player.sendMessage(ChatColor.GOLD + "Health194: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health194"));
						player.sendMessage(ChatColor.GOLD + "Node195: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node195"));
						player.sendMessage(ChatColor.GOLD + "Health195: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health195"));
						return true;
					} else

					if (subCommand.equals("page40")) {
						player.sendMessage(ChatColor.YELLOW + "---------"
								+ ChatColor.WHITE + "Page40/40: Nodes & Health"
								+ ChatColor.YELLOW + "---------------");
						player.sendMessage(ChatColor.GOLD + "Node196: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node196"));
						player.sendMessage(ChatColor.GOLD + "Health96: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health196"));
						player.sendMessage(ChatColor.GOLD + "Node197: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node197"));
						player.sendMessage(ChatColor.GOLD + "Health197: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health197"));
						player.sendMessage(ChatColor.GOLD + "Node198: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node198"));
						player.sendMessage(ChatColor.GOLD + "Health198: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health198"));
						player.sendMessage(ChatColor.GOLD + "Node199: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node199"));
						player.sendMessage(ChatColor.GOLD + "Health199: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health199"));
						player.sendMessage(ChatColor.GOLD + "Node200: "
								+ ChatColor.WHITE
								+ plugin.getConfig().getString("Node200"));
						player.sendMessage(ChatColor.GOLD + "Health200: "
								+ ChatColor.GREEN
								+ plugin.getConfig().getString("Health200"));
						return true;

					}
					return false;
				}
			}
		}
		return false;
	}
}