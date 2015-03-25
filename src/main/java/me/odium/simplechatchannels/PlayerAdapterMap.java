package me.odium.simplechatchannels;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by portalBlock on 3/24/2015.
 */
public class PlayerAdapterMap<V> {

    private HashMap<UUID, V> valueMap = new HashMap<UUID, V>();

    //@Override
    public V put(Player key, V value) {
        return valueMap.put(key.getUniqueId(), value);
    }

    //@Override
    public boolean containsKey(Object key) {
        return valueMap.containsKey(key);
    }

    //@Override
    public V remove(Object key) {
        if(key instanceof Player){
            return valueMap.remove(((Player)key).getUniqueId());
        }
        return valueMap.remove(key);
    }

    //@Override
    public V get(Object key) {
        return valueMap.get(key);
    }
}
