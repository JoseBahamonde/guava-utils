package main.java.dev.bahamonde.utils.patterns.behavioral.memento;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * History of mementos
 * @param <M> The memento type
 * @param <T> The recoverable type
 */
public class Caretaker<M extends Memento, T extends Recoverable<M>> {

    private final Deque<M> history = new LinkedList<>();
    private final int historySize;

    public Caretaker(int historySize) {
        if (historySize <= 0) {
            throw new IllegalArgumentException("Expected a positive number as the history size");
        }
        this.historySize = historySize;
    }

    public void save(T object) {
        final M memento = object.save();

        if (memento == null) {
            throw new IllegalArgumentException("Provided object can't build a memento");
        }

        offer(memento);
    }

    private void offer(M memento) {
        if (revertSize() == this.historySize) {
            this.history.removeFirst();
        }
        this.history.offer(memento);
    }

    public void revert(T object) {
        object.revert(this.history.pollFirst());
    }

    public void safeRevert(T object) {
        if (revertSize() > 0) {
            revert(object);
        }
    }

    public int revertSize() {
        return this.history.size();
    }

}
