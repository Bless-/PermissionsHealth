package net.bless.ph;

import net.bless.ph.PermissionsHealth;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class HPListener implements Listener {
	PermissionsHealth plugin;

	public HPListener(PermissionsHealth instance) {
		plugin = instance;
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		if (event.getPlayer().hasPermission("permissionshealth.guest")) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("GuestHealth"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node1"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health1"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node2"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health2"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node3"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health3"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node4"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health4"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node5"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health5"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node6"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health6"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node7"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health7"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node8"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health8"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node9"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health9"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node10"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health10"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node11"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health11"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node12"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health12"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node13"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health13"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node14"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health14"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node15"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health15"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node16"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health16"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node17"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health17"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node18"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health18"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node19"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health19"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node20"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health20"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node21"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health21"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node22"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health22"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node23"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health23"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node24"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health24"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node25"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health25"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node26"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health26"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node27"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health27"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node28"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health28"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node29"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health29"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node30"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health30"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node31"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health31"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node32"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health32"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node33"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health33"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node34"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health34"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node35"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health35"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node36"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health36"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node37"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health37"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node38"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health38"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node39"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health39"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node40"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health40"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node41"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health41"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node42"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health42"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node43"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health43"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node44"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health44"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node45"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health45"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node46"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health46"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node47"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health47"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node48"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health48"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node49"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health49"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node50"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health50"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node51"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health51"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node52"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health52"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node53"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health53"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node54"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health54"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node55"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health55"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node56"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health56"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node57"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health57"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node58"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health58"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node59"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health59"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node60"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health60"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node61"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health61"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node62"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health62"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node63"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health63"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node64"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health64"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node65"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health65"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node66"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health66"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node67"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health67"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node68"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health68"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node69"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health69"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node70"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health70"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node71"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health71"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node72"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health72"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node73"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health73"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node74"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health74"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node75"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health75"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node76"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health76"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node77"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health77"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node78"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health78"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node79"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health79"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node80"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health80"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node81"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health81"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node82"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health82"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node83"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health83"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node84"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health84"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node85"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health85"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node86"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health86"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node87"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health87"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node88"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health88"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node89"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health89"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node90"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health90"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node91"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health91"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node92"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health92"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node93"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health93"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node94"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health94"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node95"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health95"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node96"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health96"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node97"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health97"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node98"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health98"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node99"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health99"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node100"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health100"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node101"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health101"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node102"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health102"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node103"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health103"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node104"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health104"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node105"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health105"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node106"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health106"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node107"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health107"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node108"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health108"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node109"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health109"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node110"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health110"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node111"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health111"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node112"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health112"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node113"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health113"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node114"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health114"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node115"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health115"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node116"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health116"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node117"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health117"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node118"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health118"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node119"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health119"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node120"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health120"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node121"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health121"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node122"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health122"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node123"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health123"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node124"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health124"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node125"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health125"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node126"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health126"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node127"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health127"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node128"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health128"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node129"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health129"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node130"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health130"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node131"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health131"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node132"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health132"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node133"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health133"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node134"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health134"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node135"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health135"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node136"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health136"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node137"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health137"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node138"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health138"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node139"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health139"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node140"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health140"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node141"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health141"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node142"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health142"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node143"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health143"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node144"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health144"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node145"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health145"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node146"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health146"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node147"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health147"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node148"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health148"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node149"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health149"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node150"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health150"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node151"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health151"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node152"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health152"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node153"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health153"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node154"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health154"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node155"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health155"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node156"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health156"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node157"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health157"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node158"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health158"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node159"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health159"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node160"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health160"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node161"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health161"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node162"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health162"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node163"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health163"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node164"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health164"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node165"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health165"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node166"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health166"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node167"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health167"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node168"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health168"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node169"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health169"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node170"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health170"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node171"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health171"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node172"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health172"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node173"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health173"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node174"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health174"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node175"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health175"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node176"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health176"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node177"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health177"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node178"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health178"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node179"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health179"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node180"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health180"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node181"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health181"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node182"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health182"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node183"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health183"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node184"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health184"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node185"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health185"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node186"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health186"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node187"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health187"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node188"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health188"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node189"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health189"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node190"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health190"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node191"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health191"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node192"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health192"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node193"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health193"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node194"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health194"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node195"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health195"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node196"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health196"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node197"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health197"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node198"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health198"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node199"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health199"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node200"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health200"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.admin")) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("AdminHealth"));
		}
	}

	@EventHandler
	public void onInventoryClose(InventoryCloseEvent event) {
		if (event.getPlayer().hasPermission("permissionshealth.guest")) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("GuestHealth"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node1"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health1"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node2"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health2"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node3"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health3"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node4"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health4"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node5"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health5"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node6"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health6"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node7"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health7"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node8"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health8"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node9"))) {
			event.getPlayer()
					.setMaxHealth(plugin.getConfig().getInt("Health9"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node10"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health10"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node11"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health11"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node12"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health12"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node13"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health13"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node14"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health14"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node15"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health15"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node16"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health16"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node17"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health17"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node18"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health18"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node19"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health19"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node20"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health20"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node21"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health21"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node22"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health22"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node23"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health23"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node24"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health24"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node25"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health25"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node26"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health26"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node27"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health27"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node28"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health28"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node29"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health29"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node30"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health30"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node31"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health31"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node32"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health32"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node33"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health33"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node34"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health34"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node35"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health35"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node36"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health36"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node37"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health37"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node38"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health38"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node39"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health39"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node40"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health40"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node41"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health41"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node42"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health42"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node43"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health43"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node44"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health44"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node45"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health45"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node46"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health46"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node47"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health47"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node48"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health48"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node49"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health49"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node50"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health50"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node51"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health51"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node52"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health52"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node53"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health53"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node54"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health54"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node55"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health55"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node56"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health56"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node57"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health57"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node58"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health58"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node59"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health59"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node60"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health60"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node61"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health61"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node62"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health62"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node63"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health63"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node64"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health64"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node65"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health65"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node66"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health66"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node67"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health67"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node68"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health68"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node69"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health69"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node70"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health70"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node71"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health71"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node72"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health72"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node73"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health73"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node74"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health74"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node75"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health75"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node76"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health76"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node77"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health77"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node78"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health78"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node79"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health79"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node80"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health80"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node81"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health81"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node82"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health82"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node83"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health83"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node84"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health84"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node85"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health85"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node86"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health86"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node87"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health87"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node88"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health88"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node89"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health89"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node90"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health90"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node91"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health91"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node92"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health92"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node93"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health93"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node94"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health94"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node95"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health95"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node96"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health96"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node97"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health97"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node98"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health98"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node99"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health99"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node100"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health100"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node101"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health101"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node102"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health102"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node103"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health103"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node104"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health104"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node105"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health105"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node106"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health106"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node107"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health107"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node108"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health108"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node109"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health109"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node110"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health110"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node111"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health111"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node112"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health112"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node113"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health113"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node114"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health114"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node115"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health115"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node116"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health116"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node117"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health117"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node118"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health118"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node119"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health119"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node120"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health120"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node121"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health121"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node122"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health122"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node123"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health123"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node124"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health124"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node125"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health125"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node126"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health126"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node127"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health127"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node128"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health128"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node129"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health129"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node130"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health130"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node131"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health131"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node132"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health132"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node133"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health133"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node134"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health134"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node135"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health135"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node136"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health136"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node137"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health137"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node138"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health138"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node139"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health139"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node140"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health140"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node141"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health141"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node142"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health142"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node143"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health143"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node144"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health144"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node145"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health145"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node146"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health146"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node147"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health147"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node148"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health148"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node149"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health149"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node150"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health150"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node151"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health151"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node152"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health152"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node153"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health153"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node154"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health154"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node155"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health155"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node156"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health156"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node157"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health157"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node158"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health158"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node159"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health159"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node160"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health160"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node161"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health161"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node162"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health162"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node163"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health163"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node164"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health164"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node165"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health165"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node166"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health166"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node167"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health167"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node168"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health168"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node169"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health169"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node170"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health170"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node171"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health171"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node172"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health172"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node173"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health173"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node174"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health174"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node175"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health175"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node176"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health176"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node177"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health177"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node178"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health178"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node179"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health179"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node180"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health180"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node181"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health181"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node182"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health182"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node183"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health183"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node184"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health184"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node185"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health185"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node186"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health186"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node187"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health187"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node188"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health188"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node189"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health189"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node190"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health190"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node191"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health191"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node192"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health192"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node193"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health193"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node194"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health194"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node195"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health195"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node196"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health196"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node197"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health197"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node198"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health198"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node199"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health199"));
		}
		if (event.getPlayer().hasPermission(
				plugin.getConfig().getString("Node200"))) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("Health200"));
		}
		if (event.getPlayer().hasPermission("permissionshealth.admin")) {
			event.getPlayer().setMaxHealth(
					plugin.getConfig().getInt("AdminHealth"));
		}
	}
	@EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
	public void onKick(PlayerKickEvent event) {
		event.getPlayer().setMaxHealth(20);
	}

	@EventHandler(ignoreCancelled = true, priority = EventPriority.MONITOR)
	public void onLeave(PlayerQuitEvent event) {
		event.getPlayer().setMaxHealth(20);
	}
}