package api;

public class ObjectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point obj = new Point();
		System.out.println("Ŭ���� �̸�: " + obj.getClass());
		System.out.println("�ؽ� �ڵ�: " + obj.getClass());
		Point obj2 = new Point();
		System.out.println("��ü �� : " + obj.equals(obj2));
		System.out.println("��ü ���ڿ� : : " + obj.toString());
		
	}

}
class Point{
	
}