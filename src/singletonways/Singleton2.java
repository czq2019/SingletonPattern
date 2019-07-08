package singletonways;

public class Singleton2 {
	//创建一个Singleton2的对象
	private static Singleton2 instance;
	private Singleton2() {}
	public static synchronized  Singleton2 getInstance() {
		if(instance==null) {
			instance=new Singleton2();
		}
		return instance;
	}
}
