package me.annwan.afkPlug;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AfkCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            if (player.getPlayerListName().startsWith("[AFK] ")) {
                Bukkit.broadcastMessage(player.getName() + " is no longer AFK");
                player.setPlayerListName(player.getName());
            } else {
                Bukkit.broadcastMessage(player.getName() + " is now AFK");
                player.setPlayerListName("[AFK] " + player.getName());
            }
        }
        return true;
    }
}
