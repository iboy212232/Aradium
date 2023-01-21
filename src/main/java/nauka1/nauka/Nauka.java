package nauka1.nauka;

import nauka1.nauka.itemki.sila;
import nauka1.nauka.itemki.skok;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;
import java.util.logging.Level;


public final class Nauka extends JavaPlugin {
    private static Nauka instance;
    public Nauka() {
        instance = this;
    }
    public static Nauka getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {

        super.onEnable();
        this.getLogger().log(Level.INFO, "[Nauka] Enabled");

        getServer().getPluginManager().registerEvents(new sila.HipersilaItemListener(), this);
        getServer().getPluginManager().registerEvents(new sila.Hipersila2ItemListener(), this);
        getServer().getPluginManager().registerEvents(new sila.Hipersila3ItemListener(), this);
        getServer().getPluginManager().registerEvents(new sila.Hipersila4ItemListener(), this);
        getServer().getPluginManager().registerEvents(new skok.zajoncItemListener(), this);
        getServer().getPluginManager().registerEvents(new skok.zajonc2ItemListener(), this);
        getServer().getPluginManager().registerEvents(new skok.zajonc3ItemListener(), this);
        getServer().getPluginManager().registerEvents(new skok.zajonc4ItemListener(), this);
        getServer().getPluginCommand().registerCommand(new nauka1.nauka.comand.sila.sila1(), this);


        File pluginFolder = new File("plugins/Naukaconf");
        if (!pluginFolder.exists()) {
            pluginFolder.mkdir();
        }
        File textureFolder = new File("plugins/Naukaconf/textures");
        if (!textureFolder.exists()) {
            textureFolder.mkdir();
        }

    }


    @Override
    public void onDisable() {}


}
