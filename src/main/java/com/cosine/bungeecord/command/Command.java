package com.cosine.bungeecord.command;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;

public class Command extends net.md_5.bungee.api.plugin.Command {
    public Command() {
        super("로비2");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender instanceof ProxiedPlayer) {
            ProxiedPlayer player = (ProxiedPlayer) sender;
            if (player.getServer().getInfo() != ProxyServer.getInstance().getServerInfo("lobby2")) {
                player.connect(ProxyServer.getInstance().getServerInfo("lobby2"));
                player.sendMessage("§f로비2로 이동하였습니다.");
            } else {
                player.sendMessage("§f이미 로비2입니다");
            }
        }
    }
}
