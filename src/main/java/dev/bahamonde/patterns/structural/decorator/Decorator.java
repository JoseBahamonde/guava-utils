package main.java.dev.bahamonde.patterns.structural.decorator;

/**
 * Definition for the decorator pattern. It wraps the decorated components. Its intention is also provides a base
 * documentation for the concrete decorator.
 * @param <T> The type to decorate
 */
public abstract class Decorator<T> {

    private final T component;

    public Decorator(T component) {
        this.component = component;
    }

    protected T getComponent() {
        return this.component;
    }

}
