package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx7 {
	// 파일에 기록(근원지 바뀜)
	public static void main(String[] args) throws IOException {
		File file = new File("C:/IO/IOtest3.txt");
		FileOutputStream fos = new FileOutputStream(file);
		String str = "ABC";
		byte[] data = str.getBytes(); // 문자데이터를 byte로 쪼개서 배열로 만듬. A B C
		for (int i = 0; i < data.length; i++) { // 반복문으로 한자 한자 씩 write한다.
			fos.write(data[i]);
		}
		fos.flush(); // flush - 메모리(버퍼)안에 있는 데이터를 목적지에 뿌려주는 역할.(버퍼를 사용하게되면 필수로 사용해아 한다!)
		fos.close(); // 닫기

	}

}
