package nauka1.nauka.zbroje.item;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Objects;

import static nauka1.nauka.imports.material.*;
import static nauka1.nauka.imports.name.*;

public class leatcher {

    public static class leatcherarmorListener1 implements Listener {

        @EventHandler
        public void playerEquipsArmourLeather1(InventoryCloseEvent event) {
            Player player = (Player) event.getPlayer();
            ItemStack helmet = player.getInventory().getHelmet();
            ItemStack chestplate = player.getInventory().getChestplate();
            ItemStack leggings = player.getInventory().getLeggings();
            ItemStack boots = player.getInventory().getBoots();


            if (helmet != null && helmet.getType() == itemleatherMaterial3 &&
                    chestplate != null && chestplate.getType() == itemleatherMaterial2 &&
                    leggings != null && leggings.getType() == itemleatherMaterial4 &&
                    boots != null && boots.getType() == itemleatherMaterial1) {

                ItemMeta meta1 = helmet.getItemMeta();
                ItemMeta meta2 = chestplate.getItemMeta();
                ItemMeta meta3 = leggings.getItemMeta();
                ItemMeta meta4 = boots.getItemMeta();


                if (meta1 != null && meta1.hasDisplayName() && meta1.getDisplayName().equals(itemleatherName3 + "1") &&
                        meta2 != null && meta2.hasDisplayName() && meta2.getDisplayName().equals(itemleatherName2 + "1") &&
                        meta3 != null && meta3.hasDisplayName() && meta3.getDisplayName().equals(itemleatherName4 + "1") &&
                        meta4 != null && meta4.hasDisplayName() && meta4.getDisplayName().equals(itemleatherName1 + "1")) {


                    Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(22);

                }

            } else {

                Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(20);
            }
        }
    }

    public static class leatcherarmorListener2 implements Listener {

        @EventHandler
        public void playerEquipsArmourLeather2(InventoryCloseEvent event) {
            Player player = (Player) event.getPlayer();
            ItemStack helmet = player.getInventory().getHelmet();
            ItemStack chestplate = player.getInventory().getChestplate();
            ItemStack leggings = player.getInventory().getLeggings();
            ItemStack boots = player.getInventory().getBoots();


            if (helmet != null && helmet.getType() == itemleatherMaterial3 &&
                    chestplate != null && chestplate.getType() == itemleatherMaterial2 &&
                    leggings != null && leggings.getType() == itemleatherMaterial4 &&
                    boots != null && boots.getType() == itemleatherMaterial1) {

                ItemMeta meta1 = helmet.getItemMeta();
                ItemMeta meta2 = chestplate.getItemMeta();
                ItemMeta meta3 = leggings.getItemMeta();
                ItemMeta meta4 = boots.getItemMeta();


                if (meta1 != null && meta1.hasDisplayName() && meta1.getDisplayName().equals(itemleatherName3 + "2") &&
                        meta2 != null && meta2.hasDisplayName() && meta2.getDisplayName().equals(itemleatherName2 + "2") &&
                        meta3 != null && meta3.hasDisplayName() && meta3.getDisplayName().equals(itemleatherName4 + "2") &&
                        meta4 != null && meta4.hasDisplayName() && meta4.getDisplayName().equals(itemleatherName1 + "2")) {


                    Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(24);

                }

            } else {

                Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(20);
            }
        }
    }

    public static class leatcherarmorListener3 implements Listener {

        @EventHandler
        public void playerEquipsArmourLeather3(InventoryCloseEvent event) {
            Player player = (Player) event.getPlayer();
            ItemStack helmet = player.getInventory().getHelmet();
            ItemStack chestplate = player.getInventory().getChestplate();
            ItemStack leggings = player.getInventory().getLeggings();
            ItemStack boots = player.getInventory().getBoots();


            if (helmet != null && helmet.getType() == itemleatherMaterial3 &&
                    chestplate != null && chestplate.getType() == itemleatherMaterial2 &&
                    leggings != null && leggings.getType() == itemleatherMaterial4 &&
                    boots != null && boots.getType() == itemleatherMaterial1) {

                ItemMeta meta1 = helmet.getItemMeta();
                ItemMeta meta2 = chestplate.getItemMeta();
                ItemMeta meta3 = leggings.getItemMeta();
                ItemMeta meta4 = boots.getItemMeta();


                if (meta1 != null && meta1.hasDisplayName() && meta1.getDisplayName().equals(itemleatherName3 + "3") &&
                        meta2 != null && meta2.hasDisplayName() && meta2.getDisplayName().equals(itemleatherName2 + "3") &&
                        meta3 != null && meta3.hasDisplayName() && meta3.getDisplayName().equals(itemleatherName4 + "3") &&
                        meta4 != null && meta4.hasDisplayName() && meta4.getDisplayName().equals(itemleatherName1 + "3")) {


                    Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(26);

                }

            } else {

                Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(20);
            }
        }
    }

    public static class leatcherarmorListener4 implements Listener {

        @EventHandler
        public void playerEquipsArmourLeather4(InventoryCloseEvent event) {
            Player player = (Player) event.getPlayer();
            ItemStack helmet = player.getInventory().getHelmet();
            ItemStack chestplate = player.getInventory().getChestplate();
            ItemStack leggings = player.getInventory().getLeggings();
            ItemStack boots = player.getInventory().getBoots();


            if (helmet != null && helmet.getType() == itemleatherMaterial3 &&
                    chestplate != null && chestplate.getType() == itemleatherMaterial2 &&
                    leggings != null && leggings.getType() == itemleatherMaterial4 &&
                    boots != null && boots.getType() == itemleatherMaterial1) {

                ItemMeta meta1 = helmet.getItemMeta();
                ItemMeta meta2 = chestplate.getItemMeta();
                ItemMeta meta3 = leggings.getItemMeta();
                ItemMeta meta4 = boots.getItemMeta();


                if (meta1 != null && meta1.hasDisplayName() && meta1.getDisplayName().equals(itemleatherName3 + "4") &&
                        meta2 != null && meta2.hasDisplayName() && meta2.getDisplayName().equals(itemleatherName2 + "4") &&
                        meta3 != null && meta3.hasDisplayName() && meta3.getDisplayName().equals(itemleatherName4 + "4") &&
                        meta4 != null && meta4.hasDisplayName() && meta4.getDisplayName().equals(itemleatherName1 + "4")) {


                    Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(28);

                }

            } else {

                Objects.requireNonNull(player.getAttribute(Attribute.GENERIC_MAX_HEALTH)).setBaseValue(20);
            }
        }
    }
}
