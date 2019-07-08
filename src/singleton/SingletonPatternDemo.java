package singleton;

public class SingletonPatternDemo {
public static void main(String[] args) {
	//不合法的构造函数，编译时错误，构造函数SingleObject 是不可见的
	//SingleObject object=new SingleObject();
		SingleObject object=SingleObject.getInstance();
		object.message();
	} 
}
