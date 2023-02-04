package nauka1.nauka.effect.comand;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static nauka1.nauka.imports.general.console;
import static nauka1.nauka.imports.getmesage.itemspeedMesage;
import static nauka1.nauka.imports.lore.itemspeedLore;
import static nauka1.nauka.imports.material.itemspeedMaterial;
import static nauka1.nauka.imports.name.itemspeedName;

public class speed {

    public static class speed1 implements CommandExecutor, Listener {

        public speed1() {
            Objects.requireNonNull(Bukkit.getPluginCommand("speed1")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemspeedMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemspeedName + "1");
            List<String> lore = new ArrayList<>();
            lore.add(itemspeedLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 1, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemspeedMesage + "1");
            return true;

        }

    }

    public static class speed2 implements CommandExecutor, Listener {

        public speed2() {Objects.requireNonNull(Bukkit.getPluginCommand("speed2")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemspeedMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemspeedName + "2");
            List<String> lore = new ArrayList<>();
            lore.add(itemspeedLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 2, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemspeedMesage + "2");
            return true;

        }

    }

    public static class speed3 implements CommandExecutor, Listener {

        public speed3() {Objects.requireNonNull(Bukkit.getPluginCommand("speed3")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemspeedMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemspeedName + "3");
            List<String> lore = new ArrayList<>();
            lore.add(itemspeedLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 3, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemspeedMesage + "3");
            return true;

        }

    }

    public static class speed4 implements CommandExecutor, Listener {

        public speed4() {Objects.requireNonNull(Bukkit.getPluginCommand("speed4")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemspeedMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemspeedName + "4");
            List<String> lore = new ArrayList<>();
            lore.add(itemspeedLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 4, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemspeedMesage + "4");
            return true;

        }

    }

}
