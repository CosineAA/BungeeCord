package com.cosine.bungeecord.command;

import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;

public class Command2 extends net.md_5.bungee.api.plugin.Command {
    public Command2() {
        super("로비");
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (sender instanceof ProxiedPlayer) {
            ProxiedPlayer player = (ProxiedPlayer) sender;
            if (player.getServer().getInfo() != ProxyServer.getInstance().getServerInfo("lobby")) {
                player.connect(ProxyServer.getInstance().getServerInfo("lobby"));
                player.sendMessage("§f로비1로 이동하였습니다.");
            } else {
                player.sendMessage("§f이미 로비1입니다");
            }
        }
    }
}
