package appEx;

//메소드(Method) -> 메소드는 실행한다!!
	
/*	-[접근 제어자][수정자][반환형] 메소드 명 (인자들(매개변수-parameter)) {
		실행 구문(구현);
	}
	*접근 제어자(Modifiers)
	*	:private, default(friendly),protected, public
	
	*수정자 : static, final, abstract, native ....
	*반환형(return type) : 
		-자바 데이터 자료형(기본형, 참조형) 전부 사용할 수 있음
		-void : 반환형이 없는 메소드 정의시 사용
	*메소드명 : 식별자로 임의의 이름 정의
	*인자(Arguments) : 매개 변수라고하며 메소드 호출시 데이터를 전달하기 위한 용도로 사용함
	
	표현 -1)
	public int intA() {
		구현;
		return n; // n -> int 기본 자료형에 맞는 데이터 변환
	}
	
	표현 -2)
	public void intB(int a, ...) {
		구현;
		//return 구문을 사용하지 않음
	}
	
	메소드를 사용하면 코드를 분리함으로써 메소드의 기능 그리고 복잡성을 줄일 수 있고 필요할 때 사용할 수 있는 장점이 있다.
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
		System.out.println("메소드 sum 호출 : "+result);
		
		
	}
}
