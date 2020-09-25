package me.annwan.afkPlug;

import org.bukkit.plugin.java.JavaPlugin;

public class AfkPlug extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("toggleafk").setExecutor(new AfkCommand());
    }

    @Override
    public void onDisable() {

    }
}
