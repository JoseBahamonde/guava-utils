package main.java.dev.bahamonde.patterns.behavioral.chain;

/**
 * Chain of responsibility implementation for filters
 *
 * @param <R> The request type
 */
public class FilterChain<R> extends ChainComposite<Boolean, R> {

    /**
     * Applies a list of filters to a request. If one filter can't handle the request (the concrete filter returns
     * <code>false</code>) then the result is <code>false</code>.
     *
     * @param request The request to validate.
     * @return <code>true</code> if this filter validates the request, <code>false</code> in other case.
     */
    @Override
    public Boolean handle(R request) {
        for (Chain<Boolean, R> filter : this.getChain()) {
            if (!filter.handle(request)) {
                return false;
            }
        }

        return true;
    }


}
