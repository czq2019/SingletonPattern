package singleton;

public class SingleObject {
	//创建一个SingleObject 的对象
	private static SingleObject instance=new SingleObject();
	//构造函数为private ，这样该类就不能被实例化
	private SingleObject(){}
	//获取唯一可用对象
	public static SingleObject getInstance(){
		return instance;
	}
	public void message() {
		System.out.println("Hello World");
	}
}
