package api;

import java.util.regex.Pattern;

//계좌번호 패턴 (정규식)]
public class PatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 
		  (02|010)   :   02또는 010
		   -         :   - 포함
		  \d{3,4}    :   3자리 또는 4자리 숫자
		   -         :   - 포함
		  \d{4}      :   4자리 숫자
		  
		  
		  
		 */
		
		
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";  
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		/* (\은 특수문자 적용하는 것)
		 \w+         : 한개 이상의 알파벳 또는 숫자
		 @           : @
		 \w+         : 한개 이상의 알파벳 또는 숫자
		 \.          : .
		 \w+         : 한개 이상의 알파벳 또는 숫자
		(\.\w+)?     : \.\w+이 없거나 한번더 올 수 있음  
		 */
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.com.co.kr";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		
	}

}
