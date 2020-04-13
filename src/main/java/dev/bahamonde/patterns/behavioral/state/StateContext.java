package main.java.dev.bahamonde.patterns.behavioral.state;

/**
 * Represents a state context
 * @param <S> The state base hierarchy. By default it would be the {@link State} class. It can me any of its child.
 *           If the type is a child of {@link State} class then any of its parents can't be set up as the current state.
 */
public abstract class StateContext<S extends State<?>> {

    private S state;

    /**
     * Initializes this state context with the given state
     * @param initialState  The initial state
     */
    protected StateContext(S initialState) {
        this.state = initialState;
    }

    /**
     * Sets the current state of this object
     * @param state The current value to set up
     */
    void setState(S state) {
        this.state = state;
    }

}
