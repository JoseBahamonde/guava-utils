package main.java.dev.bahamonde.patterns.behavioral.chain;

/**
 * Chain of responsibility definition
 * @param <T> The return type after handling request
 * @param <R> The request type
 */
public interface Chain<T, R> {

    T handle(R request);

}
