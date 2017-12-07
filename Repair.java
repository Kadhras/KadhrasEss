package me.kadhras.events;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Repair implements CommandExecutor {
	
	  public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args) {
		  
	    Player player = (Player)sender;
	    if (cmdLabel.equalsIgnoreCase("repair")) {
	      if (player.hasPermission("kadhras.repair")) {
	        if (args.length == 0) {
	          try {
	            if (player.getItemInHand().getDurability() == 0) {
	              player.sendMessage(ChatColor.GREEN + "[KadhrasEss] " + ChatColor.WHITE + "Your item is already at full durability!");
	              return true;
	            }
	            player.getItemInHand().setDurability((short)0);
	            sender.sendMessage(ChatColor.GREEN + "[KadhrasEss] " + ChatColor.WHITE + ChatColor.BOLD + "Your item has been repaired!");
	            return true;
	          }
	          catch (Exception i) {
	            sender.sendMessage(ChatColor.RED + "You cannot repair this item!");
	          }
	        }
	        sender.sendMessage("Check your arguments!");
	        sender.sendMessage(ChatColor.RED + "/Repair");
	      } else {
	        sender.sendMessage(ChatColor.RED + "You do not have permission! you need kadhras.repair");
	      }
	    }
	    return true;
	  }
	}

