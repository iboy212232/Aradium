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

import static nauka1.nauka.imports.getmesage.itemjumpMesage;
import static nauka1.nauka.imports.lore.itemjumpLore;
import static nauka1.nauka.imports.material.itemjumpMaterial;
import static nauka1.nauka.imports.name.itemjumpName;

public class jump {

    public static class skok1 implements CommandExecutor, Listener {

        public skok1() {Objects.requireNonNull(Bukkit.getPluginCommand("Zając")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {

            if (!(sender instanceof Player)) {
                sender.sendMessage("Ta komenda może zostać użyta jedynie przez gracza.");
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemjumpMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemjumpName + "1");
            List<String> lore = new ArrayList<>();
            lore.add(itemjumpLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 1, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemjumpMesage + "1");
            return true;
        }
    }

    public static class skok2 implements CommandExecutor, Listener {

        public skok2() {Objects.requireNonNull(Bukkit.getPluginCommand("Zając2")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {

            if (!(sender instanceof Player)) {
                sender.sendMessage("Ta komenda może zostać użyta jedynie przez gracza.");
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemjumpMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemjumpName + "2");
            List<String> lore = new ArrayList<>();
            lore.add(itemjumpLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 2, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemjumpMesage + "2");
            return true;
        }
    }

    public static class skok3 implements CommandExecutor, Listener {

        public skok3() {Objects.requireNonNull(Bukkit.getPluginCommand("Zając3")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {

            if (!(sender instanceof Player)) {
                sender.sendMessage("Ta komenda może zostać użyta jedynie przez gracza.");
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemjumpMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemjumpName + "3");
            List<String> lore = new ArrayList<>();
            lore.add(itemjumpLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 3, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemjumpMesage + "3");
            return true;
        }
    }

    public static class skok4 implements CommandExecutor, Listener {

        public skok4() {Objects.requireNonNull(Bukkit.getPluginCommand("Zając4")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {

            if (!(sender instanceof Player)) {
                sender.sendMessage("Ta komenda może zostać użyta jedynie przez gracza.");
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemjumpMaterial);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemjumpName + "4");
            List<String> lore = new ArrayList<>();
            lore.add(itemjumpLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 4, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemjumpMesage + "4");
            return true;
        }
    }
}