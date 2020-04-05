package main.java.dev.bahamonde.utils.patterns.behavioral.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * Chain of responsibility implementation with Composite pattern.
 * @param <T>
 * @param <R>
 */
public class ChainComposite<T, R> implements Chain<T, R> {

    private final List<Chain<T, R>> chain = new ArrayList<>();

    public void add(Chain<T, R> chain) {
        this.chain.add(chain);
    }

    protected List<Chain<T, R>> getChain() {
        return this.chain;
    }

    @Override
    public T handle(R request) {
        for (Chain<T, R> concreteChain : this.chain) {
            final T result = concreteChain.handle(request);
            if (result != null) {
                return result;
            }
        }

        return null;
    }

}
