package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx7 {
	// ���Ͽ� ���(�ٿ��� �ٲ�)
	public static void main(String[] args) throws IOException {
		File file = new File("C:/IO/IOtest3.txt");
		FileOutputStream fos = new FileOutputStream(file);
		String str = "ABC";
		byte[] data = str.getBytes(); // ���ڵ����͸� byte�� �ɰ��� �迭�� ����. A B C
		for (int i = 0; i < data.length; i++) { // �ݺ������� ���� ���� �� write�Ѵ�.
			fos.write(data[i]);
		}
		fos.flush(); // flush - �޸�(����)�ȿ� �ִ� �����͸� �������� �ѷ��ִ� ����.(���۸� ����ϰԵǸ� �ʼ��� ����ؾ� �Ѵ�!)
		fos.close(); // �ݱ�

	}

}
