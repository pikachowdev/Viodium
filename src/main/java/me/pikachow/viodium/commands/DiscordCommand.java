package me.pikachow.viodium.commands;

import me.pikachow.viodium.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor {
    private final Main main;
    public DiscordCommand(Main main) {
        this.main = main;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("The discord is https://discord.gg/QJxnnXgJY6");
            return true;
        } else {
            System.out.println("Use this in game");
            return true;
        }
    }
}