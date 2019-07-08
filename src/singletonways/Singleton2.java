package singletonways;

public class Singleton2 {
	//����һ��Singleton2�Ķ���
	private static Singleton2 instance;
	private Singleton2() {}
	public static synchronized  Singleton2 getInstance() {
		if(instance==null) {
			instance=new Singleton2();
		}
		return instance;
	}
}
