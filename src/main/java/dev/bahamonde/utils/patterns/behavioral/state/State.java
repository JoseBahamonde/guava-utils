package main.java.dev.bahamonde.utils.patterns.behavioral.state;

/**
 * The state base implementation
 * @param <S> The type that tis state represents, usually a base class on a hierarchy. This allows to decorate the base
 *           state pattern class with custom methods/attributes
 */
public abstract class State<S extends State<?>> {

    private StateContext<S> context;

    public State(StateContext<S> context) {
        this.context = context;
    }

    public abstract void handleRequest();

    /**
     * Updates the context state;
     * @param state The new state to set up
     */
    protected final void updateState(S state) {
        this.context.setState(state);
    }

}
