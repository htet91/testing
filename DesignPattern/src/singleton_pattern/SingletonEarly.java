package singleton_pattern;

public class SingletonEarly {
	private static SingletonEarly obj = new SingletonEarly();// Early, instance will be created at load time

	private SingletonEarly() {
	}

	public static SingletonEarly getA() {
		return obj;
	}

	public void doSomething() {
		// write your code
	}
}
