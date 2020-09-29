package io;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//네트워크에서 사용 - 다양한 객체 활용 가능(포장되지 않은 상태) 
public class IOEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);  //InputStreamReader-필터 스트림(문자열 데이터를 활용한다고 했을 때 )
		BufferedReader br = new BufferedReader(isr);  //Reader 문자열에 관련된 입력장치	
		String data = "";
		while(true) {
			System.out.print("문자열 입력 : ");
			try {
				data = br.readLine();
			}catch(IOException e) {
				e.printStackTrace();
			}
			if(data.equals("end")) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("입력한 데이터는 : " + data + "입니다.");
		}
		
	}
}
