package appEx;

//�޼ҵ�(Method) -> �޼ҵ�� �����Ѵ�!!
	
/*	-[���� ������][������][��ȯ��] �޼ҵ� �� (���ڵ�(�Ű�����-parameter)) {
		���� ����(����);
	}
	*���� ������(Modifiers)
	*	:private, default(friendly),protected, public
	
	*������ : static, final, abstract, native ....
	*��ȯ��(return type) : 
		-�ڹ� ������ �ڷ���(�⺻��, ������) ���� ����� �� ����
		-void : ��ȯ���� ���� �޼ҵ� ���ǽ� ���
	*�޼ҵ�� : �ĺ��ڷ� ������ �̸� ����
	*����(Arguments) : �Ű� ��������ϸ� �޼ҵ� ȣ��� �����͸� �����ϱ� ���� �뵵�� �����
	
	ǥ�� -1)
	public int intA() {
		����;
		return n; // n -> int �⺻ �ڷ����� �´� ������ ��ȯ
	}
	
	ǥ�� -2)
	public void intB(int a, ...) {
		����;
		//return ������ ������� ����
	}
	
	�޼ҵ带 ����ϸ� �ڵ带 �и������ν� �޼ҵ��� ��� �׸��� ���⼺�� ���� �� �ְ� �ʿ��� �� ����� �� �ִ� ������ �ִ�.
*
*/


public class MethodEx1 {
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	
	
	public static int intA() {
		return 10;
	}
	public void intB() {
		intA();
	}

	public static void main(String[] args) {
		int result = sum(10,10);
		System.out.println("�޼ҵ� sum ȣ�� : "+result);
		
		
	}
}
