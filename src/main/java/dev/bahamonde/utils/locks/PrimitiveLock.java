package dev.bahamonde.utils.locks;

/**
 * Utility to ease de synchronization with primitive values. Returns the same
 * object for de same primitive value.
 * 
 * @author jose@bahamonde.dev
 *
 */
public class PrimitiveLock {

	public Object of(int value) {
		return String.valueOf(value).intern();
	}

	public Object of(long value) {
		return String.valueOf(value).intern();
	}

	public Object of(double value) {
		return String.valueOf(value).intern();
	}

	public Object of(float value) {
		return String.valueOf(value).intern();
	}

	public Object of(byte value) {
		return String.valueOf(value).intern();
	}

	public Object of(char value) {
		return String.valueOf(value).intern();
	}

}
