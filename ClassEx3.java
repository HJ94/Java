package appEx;

public class ClassEx3 {

	public static void main(String[] args) {
		
		Accounts ac = new Accounts();
		
		System.out.println("���¹�ȣ : "+ac.AccountNum);
		System.out.println("�ܰ� : "+ac.AccountBalance);
		System.out.println("���¸��� : "+ac.AccountName);
		
		/*ac.deposit();
		System.out.println("���¹�ȣ : "+ac.AccountNum);
		System.out.println("�ܰ� : "+ac.AccountBalance);
		System.out.println("���¸��� : "+ac.AccountName);
		
		ac.withdraw();
		System.out.println("���¹�ȣ : "+ac.AccountNum);
		System.out.println("�ܰ� : "+ac.AccountBalance);
		System.out.println("���¸��� : "+ac.AccountName);
		*/
		
		Accounts ac2 = new Accounts(1234, 20000, "DSDFSD" );
		
		System.out.println("���¹�ȣ : "+ac2.AccountNum);
		System.out.println("�ܰ� : "+ac2.AccountBalance);
		System.out.println("���¸��� : "+ac2.AccountName);
		
		
		Accounts ac3 = new Accounts(3720, 10000, "DH");
		
		System.out.println("���¹�ȣ : "+ac3.AccountNum);
		System.out.println("�ܰ� : "+ac3.AccountBalance);
		System.out.println("���¸��� : "+ac3.AccountName);
	
	}

}

class Accounts{
	int AccountNum;
	int AccountBalance;
	String AccountName;
	
	public Accounts() {
		AccountNum = 1111;
		AccountBalance = 100000000;
		AccountName = "AAA";
	}
	
	
	//����
	public void deposit(){
		AccountBalance += 1000;
	}	
	//���
	public void withdraw() {
		AccountBalance -= 2000;
	}
	public Accounts(String n) {
		AccountNum = 1111;
		AccountBalance = 1000000;
		AccountName = "JP";
	}
	
	
	public Accounts(int a, int b, String n) {
		AccountNum = a;
		AccountBalance = b;
		AccountName = n;
	}
	
	
}
