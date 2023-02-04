package nauka1.nauka.special.comand;

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
import static nauka1.nauka.imports.getmesage.itemghostMesage;
import static nauka1.nauka.imports.lore.itemghostLore;
import static nauka1.nauka.imports.material.itemghostMaterial;
import static nauka1.nauka.imports.name.itemghostName;

public class duch {

        public static class duch1 implements CommandExecutor, Listener {

            public duch1() {
                Objects.requireNonNull(Bukkit.getPluginCommand("duch1")).setExecutor(this);}

            @Override
            public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
                if (!(sender instanceof Player)) {
                    sender.sendMessage(console);
                    return false;
                }

                Player player = (Player) sender;
                ItemStack item = new ItemStack(itemghostMaterial);
                ItemMeta meta = item.getItemMeta();
                assert meta != null;
                meta.setDisplayName(itemghostName);
                List<String> lore = new ArrayList<>();
                lore.add(itemghostLore);
                meta.setLore(lore);
                meta.addEnchant(Enchantment.DURABILITY, 1, true);
                item.setItemMeta(meta);
                player.getInventory().addItem(item);
                player.sendMessage(itemghostMesage);
                return true;

            }

        }
}
