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
import static nauka1.nauka.imports.getmesage.itemstrenghtMesage;
import static nauka1.nauka.imports.lore.itemstrenghtLore;
import static nauka1.nauka.imports.material.itemstrenghtMaterial;
import static nauka1.nauka.imports.name.itemstrenghtName;

public class strenght {

    public static class sila1 implements CommandExecutor, Listener {

        public sila1() {Objects.requireNonNull(Bukkit.getPluginCommand("Hipersiła1")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemstrenghtMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemstrenghtName + "1");
            List<String> lore = new ArrayList<>();
            lore.add(itemstrenghtLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 1, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemstrenghtMesage + "1");
            return true;

        }

    }

    public static class sila2 implements CommandExecutor, Listener {

        public sila2() {Objects.requireNonNull(Bukkit.getPluginCommand("Hipersiła2")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemstrenghtMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemstrenghtName + "2");
            List<String> lore = new ArrayList<>();
            lore.add(itemstrenghtLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 2, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemstrenghtMesage + "2");
            return true;

        }

    }

    public static class sila3 implements CommandExecutor, Listener {

        public sila3() {Objects.requireNonNull(Bukkit.getPluginCommand("Hipersiła3")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemstrenghtMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemstrenghtName + "3");
            List<String> lore = new ArrayList<>();
            lore.add(itemstrenghtLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 3, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemstrenghtMesage + "3");
            return true;

        }

    }

    public static class sila4 implements CommandExecutor, Listener {

        public sila4() {Objects.requireNonNull(Bukkit.getPluginCommand("Hipersiła4")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemstrenghtMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemstrenghtName + "4");
            List<String> lore = new ArrayList<>();
            lore.add(itemstrenghtLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 4, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemstrenghtMesage + "4");
            return true;

        }

    }
}