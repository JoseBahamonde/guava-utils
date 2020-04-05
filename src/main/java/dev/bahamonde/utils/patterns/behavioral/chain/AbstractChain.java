package main.java.dev.bahamonde.utils.patterns.behavioral.chain;

/**
 * Chain of responsibility implementation
 * @param <T> Return type when handling a request
 * @param <R> The request type
 */
public abstract class AbstractChain<T, R> implements Chain<T, R> {

    private final AbstractChain<T, R> next;
    private final T defaultReturn;

    public AbstractChain(AbstractChain<T, R> next) {
        this.next = next;
        this.defaultReturn = null;
    }

    public AbstractChain(T defaultReturn) {
        this.next = null;
        this.defaultReturn = defaultReturn;
    }

    @Override
    public final T handle(R request) {
        if (canHandle(request)) {
            return internalHandle(request);
        } else if (this.next != null) {
            return this.next.handle(request);
        }

        return this.defaultReturn;
    }

    protected abstract boolean canHandle(R request);

    protected abstract T internalHandle(R request);

}
