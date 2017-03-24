package org.github.jbahamonde.guavautils;

import java.util.Comparator;

import com.google.common.collect.ComparisonChain;

/**
 * Allows to use guava ComparisonChain as a builder. Useful to avoid forgetting
 * assignments to a declared ComparisonChain variable, which leads to unexpected
 * results in the final comparison value.
 * 
 * @see com.google.common.collect.ComparisonChain
 * 
 * @author jbahamonde
 *
 */
public final class ComparisonChainBuilder {
    
    private ComparisonChain chain;

    private ComparisonChainBuilder() {
        chain = ComparisonChain.start();
    }
    
    /**
     * Static factory method to instantiate the class
     */
    public static ComparisonChainBuilder start() {
        return new ComparisonChainBuilder();
    }

    /**
     * Compares two comparable objects as specified by {@link Comparable.compareTo}, if
     * the result of the comparison chain has not already been determined.
     */
    public ComparisonChainBuilder compare(Comparable<?> left, Comparable<?> right) {
        return assign(this.chain.compare(left, right));
    }

    /**
     * Compares two objects using a comparator, if the result of the comparison
     * chain has not already been determined.
     */
    public <T> ComparisonChainBuilder compare(T left, T right, Comparator<T> comparator) {
        return assign(this.chain.compare(left, right, comparator));
    }
    
    /**
     * Compares two {@code int} values as specified by {@link Integer.compare}, if the result
     * of the comparison chain has not already been determined.
     */
    public ComparisonChainBuilder compare(int left, int right) {
        return assign(this.chain.compare(left, right));
    }

    /**
     * Compares two {@code long} values as specified by {@link Long.compare}, if the result
     * of the comparison chain has not already been determined.
     */
    public ComparisonChainBuilder compare(long left, long right) {
        return assign(this.chain.compare(left, right));
    }
    
    /**
     * Compares two {@code float} values as specified by {@link Float.compare}, if the result
     * of the comparison chain has not already been determined.
     */
    public ComparisonChainBuilder compare(float left, float right) {
        return assign(this.chain.compare(left, right));
    }

    /**
     * Compares two {@code double} values as specified by {@link Double.compare}, if the result
     * of the comparison chain has not already been determined.
     */
    public ComparisonChainBuilder compare(double left, double right) {
        return assign(this.chain.compare(left, right));
    }

    /**
     * Compares two {@code boolean} values, considering {@code true} to be less than {@code false}, if
     * the result of the comparison chain has not already been determined.
     */
    public ComparisonChainBuilder compareTrueFirst(boolean left, boolean right) {
        return assign(this.chain.compareTrueFirst(left, right));
    }

    /**
     * Compares two {@code boolean} values, considering {@code false} to be less than {@code true}, if
     * the result of the comparison chain has not already been determined.
     */
    public ComparisonChainBuilder compareFalseFirst(boolean left, boolean right) {
        return assign(this.chain.compareFalseFirst(left, right));
    }

    private ComparisonChainBuilder assign(ComparisonChain chain) {
        this.chain = chain;
        return this;
    }

    /**
     * Returns the actual result of the comparison chain: a value having the
     * same sign as the first nonzero comparison result in the chain, or zero if
     * every result was zero.
     */
    public int result() {
        return this.chain.result();
    }
    
}
