package io;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

//��Ʈ��ũ���� ��� - �پ��� ��ü Ȱ�� ����(������� ���� ����) 
public class IOEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);  //InputStreamReader-���� ��Ʈ��(���ڿ� �����͸� Ȱ���Ѵٰ� ���� �� )
		BufferedReader br = new BufferedReader(isr);  //Reader ���ڿ��� ���õ� �Է���ġ	
		String data = "";
		while(true) {
			System.out.print("���ڿ� �Է� : ");
			try {
				data = br.readLine();
			}catch(IOException e) {
				e.printStackTrace();
			}
			if(data.equals("end")) {
				System.out.println("���α׷� ����");
				break;
			}
			System.out.println("�Է��� �����ʹ� : " + data + "�Դϴ�.");
		}
		
	}
}
