package appEx;

//�����ε�� �����ڸ� �پ��ϰ� �����ڸ� ���(����)�� �� �ְ� ����� ���� ��.
//������(������ �ʱ�ȭ ����)
//�������� �̸��� Ŭ������ �̸��� �����ϴ�.(��ü�� �����Ǿ����� �����ڴ� �����Ǿ�����.)

public class ConstructorEx {
	int a;
	
	public ConstructorEx() {  //������ ���� , �޼ҵ�ó�� ���� ��밡��(���� X)
		a = 10;
		//System.out.println("������ ����");
	}
	public ConstructorEx(int a) {
		a=50;
	}
	
	public ConstructorEx(String a) {
		//a=50;
	}
	
	public void a() {}
	public void a(int a) {}
	public void a(String a) {}
	
	
	public static void main(String[] args) {
		ConstructorEx obj1 = new ConstructorEx();
		ConstructorEx obj2 = new ConstructorEx(10);
		ConstructorEx obj3 = new ConstructorEx("A");
	}

}
