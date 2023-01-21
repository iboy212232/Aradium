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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class skok {

    public static class zajoncItemListener implements Listener, CommandExecutor {
        private final Material itemMaterial = Material.RABBIT_FOOT;
        private final String itemName = "Króliczy Podskok MK1";
        private final String itemLore = "Skacz jak zając!";
        private final String permission = "use.kicaj";
        private final int strengthDuration = 20*60*5; //5 minutes
        private final int strengthAmplifier = 1;
        private final int cooldownDuration = 60*10; //10 minutes
        private final HashMap<UUID, Long> cooldowns = new HashMap<>();

        public zajoncItemListener() {
            Bukkit.getPluginCommand("Zając").setExecutor(this);
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

            player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, strengthDuration, strengthAmplifier));
            player.sendMessage("Króliczy Podskok MK1 Aktywna.");
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
            meta.addEnchant(Enchantment.DURABILITY, 1, true);
            item.setItemMeta(meta);
            player.getInventory().addItem(item);
            player.sendMessage("Otrzymałeś Króliczy Podskok MK1.");
            return true;
        }
    }

    public static class zajonc2ItemListener implements Listener, CommandExecutor {
        private final Material itemMaterial = Material.RABBIT_FOOT;
        private final String itemName = "Króliczy Podskok MK2";
        private final String itemLore = "Skacz jak zając!";
        private final String permission = "use.kicaj";
        private final int strengthDuration = 20*60*5; //5 minutes
        private final int strengthAmplifier = 2;
        private final int cooldownDuration = 60*10; //10 minutes
        private final HashMap<UUID, Long> cooldowns = new HashMap<>();

        public zajonc2ItemListener() {Bukkit.getPluginCommand("Zając2").setExecutor(this);
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

            player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, strengthDuration, strengthAmplifier));
            player.sendMessage("Króliczy Podskok MK2 Aktywna.");
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
            player.sendMessage("Otrzymałeś Króliczy Podskok MK2.");
            return true;
        }
    }

    public static class zajonc3ItemListener implements Listener, CommandExecutor {
        private final Material itemMaterial = Material.RABBIT_FOOT;
        private final String itemName = "Króliczy Podskok MK3";
        private final String itemLore = "Skacz jak zając!";
        private final String permission = "use.kicaj";
        private final int strengthDuration = 20*60*5; //5 minutes
        private final int strengthAmplifier = 3;
        private final int cooldownDuration = 60*10; //10 minutes
        private final HashMap<UUID, Long> cooldowns = new HashMap<>();

        public zajonc3ItemListener() {
            Bukkit.getPluginCommand("Zając3").setExecutor(this);
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

            player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, strengthDuration, strengthAmplifier));
            player.sendMessage("Króliczy Podskok MK3 Aktywna.");
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
            player.sendMessage("Otrzymałeś Króliczy Podskok MK3.");
            return true;
        }
    }

    public static class zajonc4ItemListener implements Listener, CommandExecutor {
        private final Material itemMaterial = Material.RABBIT_FOOT;
        private final String itemName = "Króliczy Podskok MK4";
        private final String itemLore = "Skacz jak zając!";
        private final String permission = "use.kicaj";
        private final int strengthDuration = 20*60*5; //5 minutes
        private final int strengthAmplifier = 4;
        private final int cooldownDuration = 60*10; //10 minutes
        private final HashMap<UUID, Long> cooldowns = new HashMap<>();

        public zajonc4ItemListener() {Bukkit.getPluginCommand("Zając4").setExecutor(this);
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

            player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, strengthDuration, strengthAmplifier));
            player.sendMessage("Króliczy Podskok MK4 Aktywna.");
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
            player.sendMessage("Otrzymałeś Króliczy Podskok MK4.");
            return true;
        }
    }


}
