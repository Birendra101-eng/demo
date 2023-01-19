package demo;

public class MySingleton {
	private static volatile MySingleton instance;

	private MySingleton() {
	}

	public static MySingleton getInstance() {
		if (instance != null)
			return instance;

		synchronized (MySingleton.class) {
			if (instance != null)
				return instance;

			instance = new MySingleton();

			return instance;
		}

	}

}
