package singletonways;
/*���������ַ�ʽ�Ƚϳ��ã������ײ�����������
�ŵ㣺û�м�����ִ��Ч�ʻ���ߡ�
ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ档*/
public class Singleton3 {
	private static Singleton3 instance;
	private  Singleton3() {}
	public static Singleton3 getInstance() {
		return instance;
	}
}
