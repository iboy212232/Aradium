package nauka1.nauka.ory.primitive;

import nauka1.nauka.Nauka;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitRunnable;
import org.jetbrains.annotations.NotNull;

import static nauka1.nauka.imports.general.*;
import static nauka1.nauka.imports.material.itemdirtMaterial;
import static nauka1.nauka.imports.permisions.permissiondirt;

public class dirt {

    public static final String usage = "Usage: /dirtregion <min|max>";

    public static class dirtRespawnTask extends BukkitRunnable implements Listener {

        private final World world;
        private final Location min;
        private final Location max;
        private final long interval;

        public dirtRespawnTask(World world, Location min, Location max, long interval) {
            this.world = world;
            this.min = min;
            this.max = max;
            this.interval = interval;

        }

        @Override
        public void run() {
            if (world.isThundering()) {
                return;
            }

            int minX = Math.min(min.getBlockX(), max.getBlockX());
            int minY = Math.min(min.getBlockY(), max.getBlockY());
            int minZ = Math.min(min.getBlockZ(), max.getBlockZ());
            int maxX = Math.max(min.getBlockX(), max.getBlockX());
            int maxY = Math.max(min.getBlockY(), max.getBlockY());
            int maxZ = Math.max(min.getBlockZ(), max.getBlockZ());

            for (int x = minX; x <= maxX; x++) {
                for (int y = minY; y <= maxY; y++) {
                    for (int z = minZ; z <= maxZ; z++) {
                        Block block = world.getBlockAt(x, y, z);
                        if (block.getType().equals(Material.AIR)) {
                            block.setType(itemdirtMaterial);
                        }
                    }
                }
            }
        }
    }

    public static class dirtRegionCommand implements CommandExecutor, Listener {
        private Location min;
        private Location max;

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return true;
            }
            if (!sender.hasPermission(permissiondirt)) {
                sender.sendMessage(permissions);
                return true;
            }
            if (args.length != 1) {
                sender.sendMessage(usage);
                return true;
            }
            Player player = (Player) sender;
            Location location = player.getLocation();
            if (args[0].equalsIgnoreCase("min")) {
                min = location;
                sender.sendMessage(mini);
            } else if (args[0].equalsIgnoreCase("max")) {
                max = location;
                sender.sendMessage(maxi);
            } else {
                sender.sendMessage(usage);
                return true;
            }
            if (min != null && max != null) {
                World world = min.getWorld(); // Get the world from the min location
                long interval = 20L * 10;
                BukkitRunnable task = new dirt.dirtRespawnTask(world, min, max, interval);
                Nauka plugin = (Nauka) Bukkit.getPluginManager().getPlugin("nauka");
                assert plugin != null;
                task.runTaskTimer(plugin, 20L, 20L * 10);
                sender.sendMessage(place);
            }
            return true;
        }
    }
}
