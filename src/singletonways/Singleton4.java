package singletonways;
//Ë«¼ìËø/Ë«ÖØĞ£ÑéËø£¨DCL£¬¼´ double-checked locking£©
public class Singleton4 {
	private static Singleton4 instance;
	private Singleton4() {}
	public static Singleton4 getInstance() {
		if(instance==null) {
			synchronized (Singleton4.class) {
				if(instance==null) {
					return instance;
				}
			}
		}
		return instance;
	}
}
