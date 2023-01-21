package nauka1.nauka.itemki;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import java.util.UUID;
import java.util.HashMap;

import java.util.ArrayList;
import java.util.List;


public class sila {


    public static class HipersilaItemListener implements Listener {
        private final Material itemMaterial = Material.MAGMA_CREAM;
        private final String itemName = "Hipersiła MK1";
        private final String itemLore = "Daje nadludzką siłę!";
        private final String permission = "use.hipersiła";
        private final int strengthDuration = 20*60*5; //5 minutes
        private final int strengthAmplifier = 1;
        private final int cooldownDuration = 60*10; //10 minutes
        private final HashMap<UUID, Long> cooldowns = new HashMap<>();


        @EventHandler
        public void onPlayerInteract(PlayerInteractEvent event) {
            Player player = event.getPlayer();
            ItemStack item = event.getItem();

            if (item == null || item.getType() != itemMaterial) {
                return;
            }

            ItemMeta meta = item.getItemMeta();
            if (meta == null || !meta.hasDisplayName() || !meta.getDisplayName().equals(itemName)) {
                return;
            }

            if (!player.hasPermission(permission)) {
                player.sendMessage("Nie posiadasz permisji aby kożystać z tego przedmiotu.");
                return;
            }

            long currentTime = System.currentTimeMillis();
            if (cooldowns.containsKey(player.getUniqueId()) && currentTime < cooldowns.get(player.getUniqueId())) {
                long remaining = (cooldowns.get(player.getUniqueId()) - currentTime) / 1000;
                int remainingMinutes = (int) remaining / 60;
                int remainingSeconds = (int) remaining % 60;
                player.sendMessage("Przedmiot się odnawia pozostało " + remainingMinutes + " minut " + remainingSeconds + " sekund.");
                return;
            }

            player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, strengthDuration, strengthAmplifier));
            player.sendMessage("HiperSiła MK1 Aktywna.");
            cooldowns.put(player.getUniqueId(), currentTime + (cooldownDuration * 1000));
            if (meta.hasLore()) {
                List<String> lore = meta.getLore();
                meta.setLore(lore);
                item.setItemMeta(meta);
            }
        }

    }



    public static class Hipersila2ItemListener implements Listener, CommandExecutor {
        private final Material itemMaterial = Material.MAGMA_CREAM;
        private final String itemName = "Hipersiła MK2";
        private final String itemLore = "Daje nadludzką siłę!";
        private final String permission = "use.hipersiła";
        private final int strengthDuration = 20*60*5; //5 minutes
        private final int strengthAmplifier = 2;
        private final int cooldownDuration = 60*10; //10 minutes
        private final HashMap<UUID, Long> cooldowns = new HashMap<>();

        public Hipersila2ItemListener() {
            Bukkit.getPluginCommand("Hipersiła2").setExecutor(this);
        }

        @EventHandler
        public void onPlayerInteract(PlayerInteractEvent event) {
            Player player = event.getPlayer();
            ItemStack item = event.getItem();

            if (item == null || item.getType() != itemMaterial) {
                return;
            }

            ItemMeta meta = item.getItemMeta();
            if (meta == null || !meta.hasDisplayName() || !meta.getDisplayName().equals(itemName)) {
                return;
            }

            if (!player.hasPermission(permission)) {
                player.sendMessage("Nie posiadasz permisji aby kożystać z tego przedmiotu.");
                return;
            }

            long currentTime = System.currentTimeMillis();
            if (cooldowns.containsKey(player.getUniqueId()) && currentTime < cooldowns.get(player.getUniqueId())) {
                long remaining = (cooldowns.get(player.getUniqueId()) - currentTime) / 1000;
                int remainingMinutes = (int) remaining / 60;
                int remainingSeconds = (int) remaining % 60;
                player.sendMessage("Przedmiot się odnawia pozostało " + remainingMinutes + " minut " + remainingSeconds + " sekund.");
                return;
            }

            player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, strengthDuration, strengthAmplifier));
            player.sendMessage("HiperSiła MK2 Aktywna.");
            cooldowns.put(player.getUniqueId(), currentTime + (cooldownDuration * 1000));
            if (meta.hasLore()) {
                List<String> lore = meta.getLore();
                meta.setLore(lore);
                item.setItemMeta(meta);
            }
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
            meta.setDisplayName(itemName);
            List<String> lore = new ArrayList<>();
            lore.add(itemLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 2, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage("Otrzymałeś Hipersiła MK2.");
            return true;
        }
    }

    public static class Hipersila3ItemListener implements Listener, CommandExecutor {
        private final Material itemMaterial = Material.MAGMA_CREAM;
        private final String itemName = "Hipersiła MK3";
        private final String itemLore = "Daje nadludzką siłę!";
        private final String permission = "use.hipersiła MK3";
        private final int strengthDuration = 20*60*5; //5 minutes
        private final int strengthAmplifier = 3;
        private final int cooldownDuration = 60*10; //10 minutes
        private final HashMap<UUID, Long> cooldowns = new HashMap<>();

        public Hipersila3ItemListener() {
            Bukkit.getPluginCommand("Hipersiła3").setExecutor(this);}

        @EventHandler
        public void onPlayerInteract(PlayerInteractEvent event) {
            Player player = event.getPlayer();
            ItemStack item = event.getItem();

            if (item == null || item.getType() != itemMaterial) {
                return;
            }

            ItemMeta meta = item.getItemMeta();
            if (meta == null || !meta.hasDisplayName() || !meta.getDisplayName().equals(itemName)) {
                return;
            }

            if (!player.hasPermission(permission)) {
                player.sendMessage("Nie posiadasz permisji aby kożystać z tego przedmiotu.");
                return;
            }

            long currentTime = System.currentTimeMillis();
            if (cooldowns.containsKey(player.getUniqueId()) && currentTime < cooldowns.get(player.getUniqueId())) {
                long remaining = (cooldowns.get(player.getUniqueId()) - currentTime) / 1000;
                int remainingMinutes = (int) remaining / 60;
                int remainingSeconds = (int) remaining % 60;
                player.sendMessage("Przedmiot się odnawia pozostało " + remainingMinutes + " minut " + remainingSeconds + " sekund.");
                return;
            }

            player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, strengthDuration, strengthAmplifier));
            player.sendMessage("HiperSiła MK3 Aktywna.");
            cooldowns.put(player.getUniqueId(), currentTime + (cooldownDuration * 1000));
            if (meta.hasLore()) {
                List<String> lore = meta.getLore();
                meta.setLore(lore);
                item.setItemMeta(meta);
            }
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
            meta.setDisplayName(itemName);
            List<String> lore = new ArrayList<>();
            lore.add(itemLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 3, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage("Otrzymałeś Hipersiła MK3.");
            return true;
        }
    }


    public static class Hipersila4ItemListener implements Listener, CommandExecutor {
        private final Material itemMaterial = Material.MAGMA_CREAM;
        private final String itemName = "Hipersiła MK4";
        private final String itemLore = "Daje nadludzką siłę!";
        private final String permission = "use.hipersiła";
        private final int strengthDuration = 20*60*5; //5 minutes
        private final int strengthAmplifier = 4;
        private final int cooldownDuration = 60*10; //10 minutes
        private final HashMap<UUID, Long> cooldowns = new HashMap<>();
        private final String TEXTURE_FILE = "textures/try.png";

        public Hipersila4ItemListener() {
            Bukkit.getPluginCommand("Hipersiła4").setExecutor(this);
        }

        @EventHandler
        public void onPlayerInteract(PlayerInteractEvent event) {
            Player player = event.getPlayer();
            ItemStack item = event.getItem();

            if (item == null || item.getType() != itemMaterial) {
                return;
            }

            ItemMeta meta = item.getItemMeta();
            if (meta == null || !meta.hasDisplayName() || !meta.getDisplayName().equals(itemName)) {
                return;
            }

            if (!player.hasPermission(permission)) {
                player.sendMessage("Nie posiadasz permisji aby kożystać z tego przedmiotu.");
                return;
            }

            long currentTime = System.currentTimeMillis();
            if (cooldowns.containsKey(player.getUniqueId()) && currentTime < cooldowns.get(player.getUniqueId())) {
                long remaining = (cooldowns.get(player.getUniqueId()) - currentTime) / 1000;
                int remainingMinutes = (int) remaining / 60;
                int remainingSeconds = (int) remaining % 60;
                player.sendMessage("Przedmiot się odnawia pozostało " + remainingMinutes + " minut " + remainingSeconds + " sekund.");
                return;
            }

            player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, strengthDuration, strengthAmplifier));
            player.sendMessage("HiperSiła MK4 Aktywna.");
            cooldowns.put(player.getUniqueId(), currentTime + (cooldownDuration * 1000));
            if (meta.hasLore()) {
                List<String> lore = meta.getLore();
                meta.setLore(lore);
                item.setItemMeta(meta);
            }
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
            meta.setDisplayName(itemName);
            List<String> lore = new ArrayList<>();
            lore.add(itemLore);
            meta.setLore(lore);
            meta.addEnchant(Enchantment.DURABILITY, 4, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage("Otrzymałeś Hipersiła 4.");
            return true;
        }
    }




}