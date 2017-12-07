package me.kadhras.events;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Fly implements CommandExecutor{

	  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    if (!(sender instanceof Player)) {
	      sender.sendMessage("Only players can do this!");
	    }
	    Player p = (Player)sender;
	    if (!p.hasPermission("kadhras.fly")) {
	      p.sendMessage(ChatColor.RED + "You need permissions kadhras.fly");
	      return true;
	    }
	    
	    if (p.getAllowFlight()) {
	      p.setAllowFlight(false);
	      p.setFlying(false);
	      
	      p.sendMessage(ChatColor.GREEN + "Fly Disabled!");
	      
	    } else {
	    	
	      p.setAllowFlight(true);
	      
	      p.sendMessage(ChatColor.GREEN + "Fly Enabled!");
	    }
	    return true;
	  }
	}

