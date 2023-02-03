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
import static nauka1.nauka.imports.getmesage.itemhealthMesage;
import static nauka1.nauka.imports.lore.itemhealthLore;
import static nauka1.nauka.imports.material.itemhealthMaterial;
import static nauka1.nauka.imports.name.itemhealthName;

public class health {

    public static class health1 implements CommandExecutor, Listener {

        public health1() {Objects.requireNonNull(Bukkit.getPluginCommand("health1")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemhealthMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemhealthName + "1");
            List<String> lore = new ArrayList<>();
            lore.add(itemhealthLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 1, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemhealthMesage + "1");
            return true;

        }

    }

    public static class health2 implements CommandExecutor, Listener {

        public health2() {Objects.requireNonNull(Bukkit.getPluginCommand("health2")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemhealthMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemhealthName + "2");
            List<String> lore = new ArrayList<>();
            lore.add(itemhealthLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 2, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemhealthMesage + "2");
            return true;

        }

    }

    public static class health3 implements CommandExecutor, Listener {

        public health3() {Objects.requireNonNull(Bukkit.getPluginCommand("health3")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemhealthMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemhealthName + "3");
            List<String> lore = new ArrayList<>();
            lore.add(itemhealthLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 3, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemhealthMesage + "3");
            return true;

        }

    }

    public static class health4 implements CommandExecutor, Listener {

        public health4() {Objects.requireNonNull(Bukkit.getPluginCommand("health4")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemhealthMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemhealthName + "4");
            List<String> lore = new ArrayList<>();
            lore.add(itemhealthLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 4, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemhealthMesage + "4");
            return true;

        }

    }
}
