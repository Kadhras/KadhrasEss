package me.kadhras.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.kadhras.events.Fly;
import me.kadhras.events.Gamemodes;
import me.kadhras.events.Repair;

public class Main extends JavaPlugin{

	public void onEnable() {
		
		Bukkit.getServer().getLogger().info("[KadhrasEssentials] Deze plugin is volledig zelf gecodeerd door de developer van KadhrasNetwork (Jayden_)");
		Bukkit.getServer().getPluginCommand("gmc").setExecutor(new Gamemodes());
		Bukkit.getServer().getPluginCommand("gmspec").setExecutor(new Gamemodes());
		Bukkit.getServer().getPluginCommand("gms").setExecutor(new Gamemodes());
		Bukkit.getServer().getPluginCommand("fly").setExecutor(new Fly());
		Bukkit.getServer().getPluginCommand("repair").setExecutor(new Repair());
	}
	
	public void onDisable() {
		
		Bukkit.getServer().getLogger().info("[KadhrasEssentials] Doei fijne dag nog!");
	}
}
