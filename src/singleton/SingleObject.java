package singleton;

public class SingleObject {
	//����һ��SingleObject �Ķ���
	private static SingleObject instance=new SingleObject();
	//���캯��Ϊprivate ����������Ͳ��ܱ�ʵ����
	private SingleObject(){}
	//��ȡΨһ���ö���
	public static SingleObject getInstance(){
		return instance;
	}
	public void message() {
		System.out.println("Hello World");
	}
}
