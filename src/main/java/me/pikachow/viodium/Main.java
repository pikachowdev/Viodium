package me.pikachow.viodium;

import me.pikachow.viodium.commands.DiscordCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginCommand("discord").setExecutor(new DiscordCommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
