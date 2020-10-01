package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class IOEx6 {
	public static void main(String[] args) throws IOException {

		File file = new File("C:/IO/IOtest2.txt");
		InputStream is = new FileInputStream(file); // ���� ��� �־���.
		int readByteNo;
		byte[] readBytes = new byte[3]; // ���Ͽ��� �о�� �� ��� ����
		String data = "";
		readByteNo = is.read(readBytes); // �� �о�鿩��.

		data += new String(readBytes, 0, readByteNo); // �迭�� �ִ� ��� ������ �о�ͼ� ���ڿ��� ������.
		System.out.print(data);
		is.close();
	}
}