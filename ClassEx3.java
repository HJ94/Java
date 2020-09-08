package appEx;

public class ClassEx3 {

	public static void main(String[] args) {
		
		Accounts ac = new Accounts();
		
		System.out.println("°èÁÂ¹øÈ£ : "+ac.AccountNum);
		System.out.println("ÀÜ°í : "+ac.AccountBalance);
		System.out.println("°èÁÂ¸íÀÇ : "+ac.AccountName);
		
		/*ac.deposit();
		System.out.println("°èÁÂ¹øÈ£ : "+ac.AccountNum);
		System.out.println("ÀÜ°í : "+ac.AccountBalance);
		System.out.println("°èÁÂ¸íÀÇ : "+ac.AccountName);
		
		ac.withdraw();
		System.out.println("°èÁÂ¹øÈ£ : "+ac.AccountNum);
		System.out.println("ÀÜ°í : "+ac.AccountBalance);
		System.out.println("°èÁÂ¸íÀÇ : "+ac.AccountName);
		*/
		
		Accounts ac2 = new Accounts(1234, 20000, "DSDFSD" );
		
		System.out.println("°èÁÂ¹øÈ£ : "+ac2.AccountNum);
		System.out.println("ÀÜ°í : "+ac2.AccountBalance);
		System.out.println("°èÁÂ¸íÀÇ : "+ac2.AccountName);
		
		
		Accounts ac3 = new Accounts(3720, 10000, "DH");
		
		System.out.println("°èÁÂ¹øÈ£ : "+ac3.AccountNum);
		System.out.println("ÀÜ°í : "+ac3.AccountBalance);
		System.out.println("°èÁÂ¸íÀÇ : "+ac3.AccountName);
	
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
	
	
	//¿¹±İ
	public void deposit(){
		AccountBalance += 1000;
	}	
	//Ãâ±İ
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
