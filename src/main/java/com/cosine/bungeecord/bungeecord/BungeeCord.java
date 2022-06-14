package com.cosine.bungeecord.bungeecord;

import com.cosine.bungeecord.command.Command;
import com.cosine.bungeecord.command.Command2;
import com.cosine.bungeecord.event.Event;
import net.md_5.bungee.api.plugin.Plugin;

public final class BungeeCord extends Plugin {
    @Override
    public void onEnable() {
        getLogger().info("번지 활성화");
        getProxy().getPluginManager().registerCommand(this, new Command());
        getProxy().getPluginManager().registerCommand(this, new Command2());
        getProxy().getPluginManager().registerListener(this, new Event());
    }
    @Override
    public void onDisable() {
        getLogger().info("번지 비활성화");
    }
}
