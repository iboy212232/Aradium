package nauka1.nauka;

import nauka1.nauka.effect.itemki.*;
import nauka1.nauka.ory.advanced.*;
import nauka1.nauka.ory.normal.*;
import nauka1.nauka.ory.primitive.*;
import nauka1.nauka.special.item.duch;
import nauka1.nauka.zbroje.comand.leather;
import nauka1.nauka.zbroje.item.leatcher;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.*;
import java.util.Objects;
import java.util.logging.Level;


public final class Nauka extends JavaPlugin {

    @Override
    public void onEnable() {

        super.onEnable();
        this.getLogger().log(Level.INFO, "[Nauka] Enabled");

        registersilaEventListeners();
        registerarrmorEventListeners();
        registerhealthEventListeners();
        registerheistEventListeners();
        registerregenerationEventListeners();
        registerskokEventListeners();
        registerspeedEventListeners();
        registerspecialEventListeners();
        oregenerate();
        folder();

    }


    private void registersilaEventListeners() {        //siła
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new strenght.HipersilaItemListener(), this); // items
        pm.registerEvents(new strenght.Hipersila2ItemListener(), this);
        pm.registerEvents(new strenght.Hipersila3ItemListener(), this);
        pm.registerEvents(new strenght.Hipersila4ItemListener(), this);

        pm.registerEvents(new nauka1.nauka.effect.comand.strenght.sila1(), this); // command
        pm.registerEvents(new nauka1.nauka.effect.comand.strenght.sila2(), this);
        pm.registerEvents(new nauka1.nauka.effect.comand.strenght.sila3(), this);
        pm.registerEvents(new nauka1.nauka.effect.comand.strenght.sila4(), this);
    }


    private void registerhealthEventListeners() {       //health
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new health.healthItemListener(), this);  // items
        pm.registerEvents(new health.health2ItemListener(), this);
        pm.registerEvents(new health.health3ItemListener(), this);
        pm.registerEvents(new health.health4ItemListener(), this);


        pm.registerEvents(new nauka1.nauka.effect.comand.health.health1(), this);  // command
        pm.registerEvents(new nauka1.nauka.effect.comand.health.health2(), this);
        pm.registerEvents(new nauka1.nauka.effect.comand.health.health3(), this);
        pm.registerEvents(new nauka1.nauka.effect.comand.health.health4(), this);
    }


    private void registerheistEventListeners() {        //heist
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new heist.heistItemListener(), this); // items
        pm.registerEvents(new heist.heist2ItemListener(), this);
        pm.registerEvents(new heist.heist3ItemListener(), this);
        pm.registerEvents(new heist.heist4ItemListener(), this);


        pm.registerEvents(new nauka1.nauka.effect.comand.heist.heist1(), this);  // command
        pm.registerEvents(new nauka1.nauka.effect.comand.heist.heist2(), this);
        pm.registerEvents(new nauka1.nauka.effect.comand.heist.heist3(), this);
        pm.registerEvents(new nauka1.nauka.effect.comand.heist.heist4(), this);
    }


    private void registerregenerationEventListeners() {     //regeneration
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new regeneration.regenerationItemListener(), this);  // items
        pm.registerEvents(new regeneration.regeneration2ItemListener(), this);
        pm.registerEvents(new regeneration.regeneration3ItemListener(), this);
        pm.registerEvents(new regeneration.regeneration4ItemListener(), this);


        pm.registerEvents(new nauka1.nauka.effect.comand.regeneration.regeneration1(), this);  // command
        pm.registerEvents(new nauka1.nauka.effect.comand.regeneration.regeneration2(), this);
        pm.registerEvents(new nauka1.nauka.effect.comand.regeneration.regeneration3(), this);
        pm.registerEvents(new nauka1.nauka.effect.comand.regeneration.regeneration4(), this);
    }


    private void registerskokEventListeners() {         //skok
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new jump.zajoncItemListener(), this);  // items
        pm.registerEvents(new jump.zajonc2ItemListener(), this);
        pm.registerEvents(new jump.zajonc3ItemListener(), this);
        pm.registerEvents(new jump.zajonc4ItemListener(), this);


        pm.registerEvents(new nauka1.nauka.effect.comand.jump.skok1(), this);  // command
        pm.registerEvents(new nauka1.nauka.effect.comand.jump.skok2(), this);
        pm.registerEvents(new nauka1.nauka.effect.comand.jump.skok3(), this);
        pm.registerEvents(new nauka1.nauka.effect.comand.jump.skok4(), this);
    }


    private void registerspeedEventListeners() {             //speed
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new speed.speedItemListener(), this);  // items
        pm.registerEvents(new speed.speed2ItemListener(), this);
        pm.registerEvents(new speed.speed3ItemListener(), this);
        pm.registerEvents(new speed.speed4ItemListener(), this);


        pm.registerEvents(new nauka1.nauka.effect.comand.speed.speed1(), this);  // command
        pm.registerEvents(new nauka1.nauka.effect.comand.speed.speed2(), this);
        pm.registerEvents(new nauka1.nauka.effect.comand.speed.speed3(), this);
        pm.registerEvents(new nauka1.nauka.effect.comand.speed.speed4(), this);
    }


    private void registerspecialEventListeners() {             //special
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new duch.duch1ItemListener(), this);  // items


        pm.registerEvents(new nauka1.nauka.special.comand.duch.duch1(), this); //command
    }

    private void registerarrmorEventListeners() {      //zbroje
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new leather.leather1(), this);  // command
        pm.registerEvents(new leather.leather2(), this);
        pm.registerEvents(new leather.leather3(), this);
        pm.registerEvents(new leather.leather4(), this);

        pm.registerEvents(new leatcher.leatcherarmorListener1(),this);  // items
        pm.registerEvents(new leatcher.leatcherarmorListener2(),this);
    }


    private void oregenerate() {

        getCommand("diamondregion").setExecutor(new diamondore.DiamondRegionCommand());
        getCommand("coalregion").setExecutor(new coalore.CoalRegionCommand());
        getCommand("goldregion").setExecutor(new goldore.GoldRegionCommand());
        getCommand("ironregion").setExecutor(new ironore.ironoreRegionCommand());
        getCommand("woodregion").setExecutor(new wood.woodRegionCommand());
        getCommand("lapisregion").setExecutor(new lapis.lapisRegionCommand());
        Objects.requireNonNull(getCommand("debrisregion")).setExecutor(new debris.debrisRegionCommand());
        Objects.requireNonNull(getCommand("obsydianregion")).setExecutor(new obsydian.obsydianRegionCommand());
        getCommand("prismarinregion").setExecutor(new prismarin.prismarinRegionCommand());
        getCommand("redstoneregion").setExecutor(new redstone.redstoneRegionCommand());
        getCommand("dirtregion").setExecutor(new dirt.dirtRegionCommand());
        getCommand("emeraldregion").setExecutor(new emerald.emeraldRegionCommand());
        getCommand("copperregion").setExecutor(new copper.copperRegionCommand());
        getCommand("cobelregion").setExecutor(new cobel.cobelRegionCommand());
        getCommand("netherrackregion").setExecutor(new netherrack.netherrackRegionCommand());

    }


    private void folder() {

        File pluginFolder = new File("plugins/Naukaconf");
        if (!pluginFolder.exists()) {
            pluginFolder.mkdir();
        }

        File textureFolder = new File("plugins/Naukaconf/textures");
        if (!textureFolder.exists()) {
            textureFolder.mkdir();
        }

        File generatorFolder = new File("plugins/Naukaconf/generators");
        if (!generatorFolder.exists()) {
            generatorFolder.mkdir();
        }

    }

}