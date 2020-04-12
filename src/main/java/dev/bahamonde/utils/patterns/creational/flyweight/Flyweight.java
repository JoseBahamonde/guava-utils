package main.java.dev.bahamonde.utils.patterns.creational.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Implements a flyweight pattern. It can be used to never duplicate objects with same hashcode.
 * @param <T> The type that this flyweight can manage. It should be an immutable type
 */
public class Flyweight<T> {

    private final Map<Integer, T> instances = new HashMap<>();

    public final T valueOf(T object) {
        final int hash = object.hashCode();
        if (!this.instances.containsKey(hash)) {
            this.instances.put(hash, object);
        }

        return this.instances.get(hash);
    }

    public <K> T valueOf(K key, Converter<K, T> converter) {
        return valueOf(converter.convert(key));
    }

}
