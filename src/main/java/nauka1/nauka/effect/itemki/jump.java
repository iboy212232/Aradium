package nauka1.nauka.effect.itemki;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import static nauka1.nauka.imports.general.*;
import static nauka1.nauka.imports.material.itemjumpMaterial;
import static nauka1.nauka.imports.mesage.mesagejump;
import static nauka1.nauka.imports.name.itemjumpName;
import static nauka1.nauka.imports.permisions.permissionjump;

public class jump {


    public static class zajoncItemListener implements Listener {

        private final HashMap<UUID, Long> cooldowns = new HashMap<>();
        private static final int strengthAmplifier = 1;

        @EventHandler
        public void onPlayerInteract(PlayerInteractEvent event) {
            Player player = event.getPlayer();
            ItemStack item = event.getItem();

            if (item == null || item.getType() != itemjumpMaterial) {
                return;
            }

            ItemMeta meta = item.getItemMeta();
            if (meta == null || !meta.hasDisplayName() || !meta.getDisplayName().equals(itemjumpName + "1")) {
                return;
            }

            if (!player.hasPermission(permissionjump)) {
                player.sendMessage(permissions);
                return;
            }

            long currentTime = System.currentTimeMillis();
            if (cooldowns.containsKey(player.getUniqueId()) && currentTime < cooldowns.get(player.getUniqueId())) {
                long remaining = (cooldowns.get(player.getUniqueId()) - currentTime) / 1000;
                int remainingMinutes = (int) remaining / 60;
                int remainingSeconds = (int) remaining % 60;
                player.sendMessage(times + remainingMinutes + minutes + remainingSeconds + second);
                return;
            }

            player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, strengthDuration, strengthAmplifier));
            player.sendMessage(mesagejump + "1" + dot);
            cooldowns.put(player.getUniqueId(), currentTime + (cooldownDuration * 1000));
            if (meta.hasLore()) {
                List<String> lore = meta.getLore();
                meta.setLore(lore);
                item.setItemMeta(meta);
            }
        }
    }

    public static class zajonc2ItemListener implements Listener {
        private final HashMap<UUID, Long> cooldowns = new HashMap<>();
        private static final int strengthAmplifier = 2;

        @EventHandler
        public void onPlayerInteract(PlayerInteractEvent event) {
            Player player = event.getPlayer();
            ItemStack item = event.getItem();

            if (item == null || item.getType() != itemjumpMaterial) {
                return;
            }

            ItemMeta meta = item.getItemMeta();
            if (meta == null || !meta.hasDisplayName() || !meta.getDisplayName().equals(itemjumpName + "2")) {
                return;
            }

            if (!player.hasPermission(permissionjump)) {
                player.sendMessage(permissions);
                return;
            }

            long currentTime = System.currentTimeMillis();
            if (cooldowns.containsKey(player.getUniqueId()) && currentTime < cooldowns.get(player.getUniqueId())) {
                long remaining = (cooldowns.get(player.getUniqueId()) - currentTime) / 1000;
                int remainingMinutes = (int) remaining / 60;
                int remainingSeconds = (int) remaining % 60;
                player.sendMessage(times + remainingMinutes + minutes + remainingSeconds + second);
                return;
            }

            player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, strengthDuration, strengthAmplifier));
            player.sendMessage(mesagejump + "2" + dot);
            cooldowns.put(player.getUniqueId(), currentTime + (cooldownDuration * 1000));
            if (meta.hasLore()) {
                List<String> lore = meta.getLore();
                meta.setLore(lore);
                item.setItemMeta(meta);
            }
        }
    }

    public static class zajonc3ItemListener implements Listener {
        private final HashMap<UUID, Long> cooldowns = new HashMap<>();
        private static final int strengthAmplifier = 3;

        @EventHandler
        public void onPlayerInteract(PlayerInteractEvent event) {
            Player player = event.getPlayer();
            ItemStack item = event.getItem();

            if (item == null || item.getType() != itemjumpMaterial) {
                return;
            }

            ItemMeta meta = item.getItemMeta();
            if (meta == null || !meta.hasDisplayName() || !meta.getDisplayName().equals(itemjumpName + "3")) {
                return;
            }

            if (!player.hasPermission(permissionjump)) {
                player.sendMessage(permissions);
                return;
            }

            long currentTime = System.currentTimeMillis();
            if (cooldowns.containsKey(player.getUniqueId()) && currentTime < cooldowns.get(player.getUniqueId())) {
                long remaining = (cooldowns.get(player.getUniqueId()) - currentTime) / 1000;
                int remainingMinutes = (int) remaining / 60;
                int remainingSeconds = (int) remaining % 60;
                player.sendMessage(times + remainingMinutes + minutes + remainingSeconds + second);
                return;
            }

            player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, strengthDuration, strengthAmplifier));
            player.sendMessage(mesagejump + "3" + dot);
            cooldowns.put(player.getUniqueId(), currentTime + (cooldownDuration * 1000));
            if (meta.hasLore()) {
                List<String> lore = meta.getLore();
                meta.setLore(lore);
                item.setItemMeta(meta);
            }
        }
    }

    public static class zajonc4ItemListener implements Listener {
        private final HashMap<UUID, Long> cooldowns = new HashMap<>();
        private static final int strengthAmplifier = 4;

        @EventHandler
        public void onPlayerInteract(PlayerInteractEvent event) {
            Player player = event.getPlayer();
            ItemStack item = event.getItem();

            if (item == null || item.getType() != itemjumpMaterial) {
                return;
            }

            ItemMeta meta = item.getItemMeta();
            if (meta == null || !meta.hasDisplayName() || !meta.getDisplayName().equals(itemjumpName + "4")) {
                return;
            }

            if (!player.hasPermission(permissionjump)) {
                player.sendMessage(permissions);
                return;
            }

            long currentTime = System.currentTimeMillis();
            if (cooldowns.containsKey(player.getUniqueId()) && currentTime < cooldowns.get(player.getUniqueId())) {
                long remaining = (cooldowns.get(player.getUniqueId()) - currentTime) / 1000;
                int remainingMinutes = (int) remaining / 60;
                int remainingSeconds = (int) remaining % 60;
                player.sendMessage(times + remainingMinutes + minutes + remainingSeconds + second);
                return;
            }

            player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, strengthDuration, strengthAmplifier));
            player.sendMessage(mesagejump + "4" + dot);
            cooldowns.put(player.getUniqueId(), currentTime + (cooldownDuration * 1000));
            if (meta.hasLore()) {
                List<String> lore = meta.getLore();
                meta.setLore(lore);
                item.setItemMeta(meta);
            }
        }
    }
}