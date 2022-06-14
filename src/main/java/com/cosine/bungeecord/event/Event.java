package com.cosine.bungeecord.event;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;
public class Event implements Listener {

    @EventHandler
    public void event(PostLoginEvent event) {
        ProxiedPlayer player = event.getPlayer();
        player.sendMessage("§f서버에 잘 왔음");
    }

    @EventHandler
    public void chat(ChatEvent event) {
        ProxiedPlayer player = (ProxiedPlayer) event.getSender();
        String message = event.getMessage();
        String first = String.valueOf(message.charAt(0));
        if (first.equals("/")) return;
        for (ServerInfo server : ProxyServer.getInstance().getServers().values()) {
            for (ProxiedPlayer players : server.getPlayers()) {
                event.setCancelled(true);
                players.sendMessage("§f<" + player + "> " + message);
            }
        }
    }
}
