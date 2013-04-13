package net.bless.ph;

import java.net.URL;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilderFactory;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.server.PluginEnableEvent;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class UpdateChecker implements Listener {
	// The name of your plugin, as specified in the plugin.yml
	public String pluginName = "PermissionsHealth";

	// Your plugin's BukkitDev URL. DON'T FORGET THE SLASH AT THE END
	public String bukkitURL = "http://dev.bukkit.org/server-mods/permissions-health/";

	// The message that will be sent to a player if the player is an op and
	// joins the server when there's a new update out
	public String notifyMessage = "There is a new version of " + pluginName
			+ " out! Download it at " + bukkitURL;

	// --------------------- DO NOT EDIT BELOW THIS LINE UNLESS YOU KNOW WHAT
	// YOU'RE DOING ------------------------------ \\

	private Logger log = Logger.getLogger("Minecraft");
	public double currentVersion = Double.valueOf(Bukkit.getPluginManager()
			.getPlugin(pluginName).getDescription().getVersion().split("-")[0]
			.replaceFirst("\\.", ""));
	public double newVersion;

	@EventHandler
	public void onJoin1(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		if (player.isOp() && currentVersion < newVersion) {
			player.sendMessage(notifyMessage);
		}
	}

	@EventHandler
	public void onPluginEnable(PluginEnableEvent event) {
		try {
			newVersion = updateCheck(currentVersion);
			if (newVersion > currentVersion) {
				log.warning(pluginName + newVersion + " is out!");
				log.warning("Download the newest version at " + bukkitURL);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public double updateCheck(double currentVersion) throws Exception {
		String pluginURL = bukkitURL + "files.rss";
		try {
			URL url = new URL(pluginURL);
			Document doc = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder()
					.parse(url.openConnection().getInputStream());
			NodeList nodes = doc.getElementsByTagName("item");
			Node firstNode = nodes.item(0);
			if (firstNode.getNodeType() == 1) {
				Element firstElement = (Element) firstNode;
				NodeList firstElementTagName = firstElement
						.getElementsByTagName("title");
				Element firstNameElement = (Element) firstElementTagName
						.item(0);
				NodeList firstNodes = firstNameElement.getChildNodes();
				return Double.valueOf(firstNodes.item(0).getNodeValue()
						.replace(pluginName, "").replaceFirst(".", "").trim());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return currentVersion;
	}
}
