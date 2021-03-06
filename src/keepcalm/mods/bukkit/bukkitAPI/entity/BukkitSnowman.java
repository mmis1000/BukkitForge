package keepcalm.mods.bukkit.bukkitAPI.entity;

import keepcalm.mods.bukkit.bukkitAPI.BukkitServer;
import net.minecraft.entity.monster.EntitySnowman;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Snowman;
//import org.bukkit.craftbukkit.BukkitServer;

public class BukkitSnowman extends BukkitGolem implements Snowman {
    public BukkitSnowman(BukkitServer server, EntitySnowman entity) {
        super(server, entity);
    }

    @Override
    public EntitySnowman getHandle() {
        return (EntitySnowman) entity;
    }

    @Override
    public String toString() {
        return "BukkitSnowman";
    }

    public EntityType getType() {
        return EntityType.SNOWMAN;
    }
}
