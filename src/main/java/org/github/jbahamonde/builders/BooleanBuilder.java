package org.github.jbahamonde.builders;

/**
 * Utility to ease the creation of Boolean expressions using the Builder pattern
 * @author jbahamonde
 * 
 */
public class BooleanBuilder {

	private boolean value;
	
	private BooleanBuilder(boolean initialValue) {
		this.value = initialValue;
	}
	
	/**
	 * Applies a logical and to the builder
	 * @param other: The value to perform the operation
	 * @return
	 */
	public BooleanBuilder and(boolean other) {
		this.value = this.value && other;
		return this;
	}
	
	/**
	 * Applies a logical or to the builder
	 * @param other: The value to perform the operation
	 * @return
	 */
	public BooleanBuilder or(boolean other) {
		this.value = this.value || other;
		return this;
	}
	
	/**
	 * Applies a logical xor to the builder
	 * @param other: The value to perform the operation
	 * @return
	 */
	public BooleanBuilder xor(boolean other) {
		this.value = this.value ^ other;
		return this;
	}
	
	/**
	 * Applies a logical nor to the builder
	 * @param other: The value to perform the operation
	 * @return
	 */
	public BooleanBuilder nor(boolean other) {
		this.value = !(this.value || other);
		return this;
	}
	
	/**
	 * Applies a logical nand to the builder
	 * @param other: The value to perform the operation
	 * @return
	 */
	public BooleanBuilder nand(boolean other) {
		this.value = !(this.value && other);
		return this;
	}
	
	/**
	 * Applies a logical xnor to the builder
	 * @param other: The value to perform the operation
	 * @return
	 */
	public BooleanBuilder xnor(boolean other) {
		this.value = (this.value && other) || (!this.value && !other);
		return this;
	}
	
	/**
	 * Applies a logical not to the builder
	 * @param other: The value to perform the operation
	 * @return
	 */
	public BooleanBuilder not() {
		this.value = !this.value;
		return this;
	}
	
	/**
	 * @return The value accumulated on the builder.
	 */
	public boolean result() {
		return new Boolean(this.value).booleanValue();
	}
	
	/**
	 * Constructs the builder starting with a true value
	 * @return
	 */
	public static BooleanBuilder trueValue() {
		return new BooleanBuilder(true);
	}
	
	/**
	 * Constructs the builder starting with a false value
	 * @return
	 */
	public static BooleanBuilder falseValue() {
		return new BooleanBuilder(false);
	}
	
}
