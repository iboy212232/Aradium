package nauka1.nauka.zbroje.comand;

import org.bukkit.Bukkit;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
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
import java.util.UUID;

import static nauka1.nauka.imports.general.console;
import static nauka1.nauka.imports.getmesage.itemarrmorMesage;
import static nauka1.nauka.imports.lore.*;
import static nauka1.nauka.imports.material.*;
import static nauka1.nauka.imports.name.*;

public class leather {

    public static class leather1 implements CommandExecutor, Listener {

        public leather1() {
            Objects.requireNonNull(Bukkit.getPluginCommand("leather1")).setExecutor(this);
        }

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemleatherMaterial1);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemleatherName1 + "1");
            List<String> lore = new ArrayList<>();
            lore.add(itemLore1);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 1, true);
            meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            meta.setUnbreakable(true);
            AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 5, AttributeModifier.Operation.ADD_NUMBER);
            meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);

            ItemStack item2 = new ItemStack(itemleatherMaterial2);
            ItemMeta meta2 = item2.getItemMeta();
            assert meta2 != null;
            meta2.setDisplayName(itemleatherName2 + "1");
            List<String> lore2 = new ArrayList<>();
            lore2.add(itemLore2);
            meta2.setLore(lore2);
            meta2.addEnchant(Enchantment.DURABILITY, 1, true);
            meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            meta2.setUnbreakable(true);
            item2.setItemMeta(meta2);
            player.getInventory().addItem(item2);

            ItemStack item3 = new ItemStack(itemleatherMaterial3);
            ItemMeta meta3 = item3.getItemMeta();
            assert meta3 != null;
            meta3.setDisplayName(itemleatherName3 + "1");
            List<String> lore3 = new ArrayList<>();
            lore3.add(itemLore3);
            meta3.setLore(lore3);
            meta3.addEnchant(Enchantment.DURABILITY, 1, true);
            meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            meta3.setUnbreakable(true);
            item3.setItemMeta(meta3);
            player.getInventory().addItem(item3);

            ItemStack item4 = new ItemStack(itemleatherMaterial4);
            ItemMeta meta4 = item4.getItemMeta();
            assert meta4 != null;
            meta4.setDisplayName(itemleatherName4 + "1");
            List<String> lore4 = new ArrayList<>();
            lore4.add(itemLore4);
            meta4.setLore(lore4);
            meta4.addEnchant(Enchantment.DURABILITY, 1, true);
            meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
            meta4.setUnbreakable(true);
            item4.setItemMeta(meta4);
            player.getInventory().addItem(item4);
            player.sendMessage(itemarrmorMesage + "1");
            return true;

        }
    }

        public static class leather2 implements CommandExecutor, Listener {

            public leather2() {
                Objects.requireNonNull(Bukkit.getPluginCommand("leather2")).setExecutor(this);}

            @Override
            public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
                if (!(sender instanceof Player)) {
                    sender.sendMessage(console);
                    return false;
                }

                Player player = (Player) sender;
                ItemStack item = new ItemStack(itemleatherMaterial1);
                ItemMeta meta = item.getItemMeta();
                assert meta != null;
                meta.setDisplayName(itemleatherName1 + "2");
                List<String> lore = new ArrayList<>();
                lore.add(itemLore1);
                meta.setLore(lore);
                meta.addEnchant(Enchantment.DURABILITY, 2, true);
                meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
                meta.setUnbreakable(true);
                item.setItemMeta(meta);
                player.getInventory().addItem(item);

                ItemStack item2 = new ItemStack(itemleatherMaterial2);
                ItemMeta meta2 = item2.getItemMeta();
                assert meta2!= null;
                meta2.setDisplayName(itemleatherName2 + "2");
                List<String> lore2 = new ArrayList<>();
                lore2.add(itemLore2);
                meta2.setLore(lore2);
                meta2.addEnchant(Enchantment.DURABILITY, 2, true);
                meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
                meta2.setUnbreakable(true);
                item2.setItemMeta(meta2);
                player.getInventory().addItem(item2);

                ItemStack item3 = new ItemStack(itemleatherMaterial3);
                ItemMeta meta3 = item3.getItemMeta();
                assert meta3!= null;
                meta3.setDisplayName(itemleatherName3 + "2");
                List<String> lore3 = new ArrayList<>();
                lore3.add(itemLore3);
                meta3.setLore(lore3);
                meta3.addEnchant(Enchantment.DURABILITY, 2, true);
                meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
                meta3.setUnbreakable(true);
                item3.setItemMeta(meta3);
                player.getInventory().addItem(item3);

                ItemStack item4 = new ItemStack(itemleatherMaterial4);
                ItemMeta meta4 = item4.getItemMeta();
                assert meta4!= null;
                meta4.setDisplayName(itemleatherName4 + "2");
                List<String> lore4 = new ArrayList<>();
                lore4.add(itemLore4);
                meta4.setLore(lore4);
                meta4.addEnchant(Enchantment.DURABILITY, 2, true);
                meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
                meta4.setUnbreakable(true);
                item4.setItemMeta(meta4);
                player.getInventory().addItem(item4);
                player.sendMessage(itemarrmorMesage + "2");
                return true;

            }
    }

    public static class leather3 implements CommandExecutor, Listener {

        public leather3() {
            Objects.requireNonNull(Bukkit.getPluginCommand("leather3")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemleatherMaterial1);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemleatherName1 + "3");
            List<String> lore = new ArrayList<>();
            lore.add(itemLore1);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 3, true);
            meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
            meta.setUnbreakable(true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);

            ItemStack item2 = new ItemStack(itemleatherMaterial2);
            ItemMeta meta2 = item2.getItemMeta();
            assert meta2!= null;
            meta2.setDisplayName(itemleatherName2 + "3");
            List<String> lore2 = new ArrayList<>();
            lore2.add(itemLore2);
            meta2.setLore(lore2);
            meta2.addEnchant(Enchantment.DURABILITY, 3, true);
            meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
            meta2.setUnbreakable(true);
            item2.setItemMeta(meta2);
            player.getInventory().addItem(item2);

            ItemStack item3 = new ItemStack(itemleatherMaterial3);
            ItemMeta meta3 = item3.getItemMeta();
            assert meta3!= null;
            meta3.setDisplayName(itemleatherName3 + "3");
            List<String> lore3 = new ArrayList<>();
            lore3.add(itemLore3);
            meta3.setLore(lore3);
            meta3.addEnchant(Enchantment.DURABILITY, 3, true);
            meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
            meta3.setUnbreakable(true);
            item3.setItemMeta(meta3);
            player.getInventory().addItem(item3);

            ItemStack item4 = new ItemStack(itemleatherMaterial4);
            ItemMeta meta4 = item4.getItemMeta();
            assert meta4!= null;
            meta4.setDisplayName(itemleatherName4 + "3");
            List<String> lore4 = new ArrayList<>();
            lore4.add(itemLore4);
            meta4.setLore(lore4);
            meta4.addEnchant(Enchantment.DURABILITY, 3, true);
            meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
            meta4.setUnbreakable(true);
            item4.setItemMeta(meta4);
            player.getInventory().addItem(item4);
            player.sendMessage(itemarrmorMesage + "3");
            return true;

        }
    }

    public static class leather4 implements CommandExecutor, Listener {

        public leather4() {
            Objects.requireNonNull(Bukkit.getPluginCommand("leather4")).setExecutor(this);}

        @Override
        public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(console);
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemleatherMaterial1);
            ItemMeta meta = item.getItemMeta();
            assert meta != null;
            meta.setDisplayName(itemleatherName1 + "4");
            List<String> lore = new ArrayList<>();
            lore.add(itemLore1);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 4, true);
            meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
            meta.setUnbreakable(true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);

            ItemStack item2 = new ItemStack(itemleatherMaterial2);
            ItemMeta meta2 = item2.getItemMeta();
            assert meta2!= null;
            meta2.setDisplayName(itemleatherName2 + "4");
            List<String> lore2 = new ArrayList<>();
            lore2.add(itemLore2);
            meta2.setLore(lore2);
            meta2.addEnchant(Enchantment.DURABILITY, 4, true);
            meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
            meta2.setUnbreakable(true);
            item2.setItemMeta(meta2);
            player.getInventory().addItem(item2);

            ItemStack item3 = new ItemStack(itemleatherMaterial3);
            ItemMeta meta3 = item3.getItemMeta();
            assert meta3!= null;
            meta3.setDisplayName(itemleatherName3 + "4");
            List<String> lore3 = new ArrayList<>();
            lore3.add(itemLore3);
            meta3.setLore(lore3);
            meta3.addEnchant(Enchantment.DURABILITY, 4, true);
            meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
            meta3.setUnbreakable(true);
            item3.setItemMeta(meta3);
            player.getInventory().addItem(item3);

            ItemStack item4 = new ItemStack(itemleatherMaterial4);
            ItemMeta meta4 = item4.getItemMeta();
            assert meta4!= null;
            meta4.setDisplayName(itemleatherName4 + "4");
            List<String> lore4 = new ArrayList<>();
            lore4.add(itemLore4);
            meta4.setLore(lore4);
            meta4.addEnchant(Enchantment.DURABILITY, 4, true);
            meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
            meta4.setUnbreakable(true);
            item4.setItemMeta(meta4);
            player.getInventory().addItem(item4);
            player.sendMessage(itemarrmorMesage + "4");
            return true;

        }
    }

}
