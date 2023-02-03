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
import static nauka1.nauka.imports.lore.itemregeneratonLore;
import static nauka1.nauka.imports.material.itemregenerationMaterial;
import static nauka1.nauka.imports.name.itemregenerationName;
import static nauka1.nauka.imports.getmesage.itemregenerationMesage;

public class regeneration {

    public static class regeneration1 implements CommandExecutor, Listener {

        public regeneration1() {
            Objects.requireNonNull(Bukkit.getPluginCommand("regeneration1")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemregenerationMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemregenerationName + "1");
            List<String> lore = new ArrayList<>();
            lore.add(itemregeneratonLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 1, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemregenerationMesage + "1");
            return true;

        }

    }

    public static class regeneration2 implements CommandExecutor, Listener {

        public regeneration2() {Objects.requireNonNull(Bukkit.getPluginCommand("regeneration2")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemregenerationMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemregenerationName + "2");
            List<String> lore = new ArrayList<>();
            lore.add(itemregeneratonLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 2, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemregenerationMesage + "2");
            return true;

        }

    }

    public static class regeneration3 implements CommandExecutor, Listener {

        public regeneration3() {Objects.requireNonNull(Bukkit.getPluginCommand("regeneration3")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemregenerationMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemregenerationName + "3");
            List<String> lore = new ArrayList<>();
            lore.add(itemregeneratonLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 3, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemregenerationMesage + "3");
            return true;

        }

    }

    public static class regeneration4 implements CommandExecutor, Listener {

        public regeneration4() {Objects.requireNonNull(Bukkit.getPluginCommand("regeneration4")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemregenerationMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemregenerationName + "4");
            List<String> lore = new ArrayList<>();
            lore.add(itemregeneratonLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 4, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemregenerationMesage + "4");
            return true;

        }

    }
}
