package main.java.dev.bahamonde.patterns.creational.factory;

/**
 * Utility to ease de synchronization with primitive values. Returns the same
 * object for de same primitive value.
 * 
 * @author jose@bahamonde.dev
 *
 */
public class PrimitiveLock {

	public static Object of(int value) {
		return String.valueOf(value).intern();
	}

	public static  Object of(long value) {
		return String.valueOf(value).intern();
	}

	public static Object of(double value) {
		return String.valueOf(value).intern();
	}

	public static Object of(float value) {
		return String.valueOf(value).intern();
	}

	public static Object of(byte value) {
		return String.valueOf(value).intern();
	}

	public static Object of(char value) {
		return String.valueOf(value).intern();
	}

}
