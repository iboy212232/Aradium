package nauka1.nauka.comand;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.ArrayList;
import java.util.List;

public class sila {

    public static final Material itemMaterial = Material.MAGMA_CREAM;
    public static final String itemName = "Hipersiła MK";
    public static final String itemLore = "Daje nadludzką siłę!";
    public static final String itemMesage = "Otrzymałeś Hipersiła MK"

    public static class sila1 implements CommandExecutor {

        public sila1() {Bukkit.getPluginCommand("Hipersiła1").setExecutor(this);
        }

        @Override
        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("Ta komenda może zostać użyta jedynie przez gracza.");
                return false;
            }

            Player player = (Player) sender;
            ItemStack item = new ItemStack(itemMaterial);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(itemName + "1");
            List<String> lore = new ArrayList<>();
            lore.add(itemLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 1, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage(itemMesage + "1");
            return true;

        }

    }
}