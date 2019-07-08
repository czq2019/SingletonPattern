package singletonways;
//该方法不支持多线程
public class Singleton1 {
	private static Singleton1 instance;
	//将Singleton1()设为private，该类不能被实例化
	private Singleton1() {}
	public static Singleton1 getInstance() {
		if(instance==null) {
			instance=new Singleton1();
		}
		return instance;
	}
}
