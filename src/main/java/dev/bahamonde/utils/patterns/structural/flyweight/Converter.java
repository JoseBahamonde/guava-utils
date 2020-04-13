package main.java.dev.bahamonde.utils.patterns.structural.flyweight;

/**
 * Builds an object from another object with different type
 * @param <K> The key object, used to convert from
 * @param <T> The desired object, used to convert to
 */
public interface Converter<K, T> {

    T convert(K key);

}
