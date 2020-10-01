package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class IOEx6 {
	public static void main(String[] args) throws IOException {

		File file = new File("C:/IO/IOtest2.txt");
		InputStream is = new FileInputStream(file); // 파일 경로 넣어줌.
		int readByteNo;
		byte[] readBytes = new byte[3]; // 파일에서 읽어온 걸 담는 역할
		String data = "";
		readByteNo = is.read(readBytes); // 다 읽어들여라.

		data += new String(readBytes, 0, readByteNo); // 배열에 있는 모든 값들을 읽어와서 문자열로 만들어라.
		System.out.print(data);
		is.close();
	}
}