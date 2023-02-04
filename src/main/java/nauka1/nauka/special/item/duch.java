package nauka1.nauka.special.item;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

import static nauka1.nauka.imports.general.*;
import static nauka1.nauka.imports.material.itemghostMaterial;
import static nauka1.nauka.imports.name.itemghostName;
import static nauka1.nauka.imports.permisions.permissionghost;

public class duch {

    public static class duch1ItemListener implements Listener {
        private final HashMap<UUID, Long> cooldowns = new HashMap<>();

        @EventHandler
        public void onPlayerInteract(PlayerInteractEvent event) {
            Player player = event.getPlayer();
            ItemStack item = event.getItem();

            if (item == null || item.getType() != itemghostMaterial) {
                return;
            }

            ItemMeta meta = item.getItemMeta();
            if (meta == null || !meta.hasDisplayName() || !meta.getDisplayName().equals(itemghostName)) {
                return;
            }

            if (!player.hasPermission(permissionghost)) {
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

            player.setGameMode(GameMode.SPECTATOR);
            player.setFlySpeed(0.5f);
            player.setAllowFlight(true);
            player.setFlying(true);
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10, 5));

            Bukkit.getScheduler().runTaskLater(Objects.requireNonNull(Bukkit.getPluginManager().getPlugin("nauka")), () -> {
                player.setGameMode(GameMode.SURVIVAL);
                player.setFlySpeed(0.1f);
                player.setAllowFlight(false);
                player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1, 5));
                cooldowns.put(player.getUniqueId(), currentTime + (cooldownDuration * 1000));
            }, 10);

        }

    }
}

