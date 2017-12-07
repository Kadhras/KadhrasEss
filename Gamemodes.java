package me.kadhras.events;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Gamemodes implements CommandExecutor{
	
	
	  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
	    Player p = (Player) sender;
	    if (cmd.getName().equalsIgnoreCase("gmc")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.RED + "Only players can do this!");
			}
	      if (!p.hasPermission("kadhras.gmc")) {
	        p.sendMessage(ChatColor.RED + "You are not permitted to do this. you need kadhras.gmc");
	      }
	      if (p.hasPermission("kadhras.gmc")) {
	        p.setGameMode(GameMode.CREATIVE);
	        p.sendMessage(ChatColor.GREEN + "Gamemode changed to Creative!");
	      }
	      return true;
	    }
	    if (cmd.getName().equalsIgnoreCase("gmspec")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.RED + "Only players can do this!");
			}
	      if (!p.hasPermission("kadhras.gmspec")) {
	        p.sendMessage(ChatColor.RED + "You are not permitted to do this. you need kadhras.gmspec");
	      }
	      if (p.hasPermission("kadhras.gmspec")) {
	        p.setGameMode(GameMode.SPECTATOR);
	        p.sendMessage(ChatColor.GREEN + "Gamemode changed to Spectator!");
	      }
	      return true;
	    }
	    if (cmd.getName().equalsIgnoreCase("gms")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.RED + "Only players can do this!");
			}
	      if (!p.hasPermission("kadhras.gms")) {
	        p.sendMessage(ChatColor.RED + "You are not permitted to do this. you need kadhras.gms");
	      }
	      if (p.hasPermission("kadhras.gms")) {
	        p.setGameMode(GameMode.SURVIVAL);
	        p.sendMessage(ChatColor.GREEN + "Gamemode changed to Survival!");
	      }
	      return true;
	    }
	    return true;
	  }
	}

