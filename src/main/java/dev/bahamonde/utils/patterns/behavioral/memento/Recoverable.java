package main.java.dev.bahamonde.utils.patterns.behavioral.memento;

/**
 * Recoverable object with memento pattern. Types that could be recovered should implement this
 * @param <M> The memento type for this object
 */
public interface Recoverable<M extends Memento> {
    
    M save();
    
    void revert(M memento);
    
}
