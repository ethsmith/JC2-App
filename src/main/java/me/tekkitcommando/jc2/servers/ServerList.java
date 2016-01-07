package me.tekkitcommando.jc2.servers;

import java.util.HashMap;

/**
 * Created by TekkitCommando on 11/6/2015.
 */
public class ServerList {

    /**
     * @author Phillip
     * @author Ethan
     */
    public HashMap softwares;

    public ServerList() {
        this.softwares = new HashMap<>();
        softwares.put("spigot", "http://getspigot.org/spigot18/spigot_server.jar");
        softwares.put("craftbukkit", "http://getspigot.org/spigot18/craftbukkit_server.jar");
        softwares.put("forge", "http://files.minecraftforge.net/");
        softwares.put("sponge", "http://files.minecraftforge.net/maven/org/spongepowered/spongeforge/1.8-1543-2.1-DEV-794/spongeforge-1.8-1543-2.1-DEV-794.jar");
    }

}
