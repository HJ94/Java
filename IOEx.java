package io;

import java.io.IOException;

/*
 	���
 	-��Ʈ�� : �Ϲ������� ������, ��Ŷ ���� �Ϸ��� ���Ӽ��� ���� �帧�� �ǹ��Ѵ�.(�帣�� ������ - ���� �帧)
 	-�� .��� ��Ʈ�� : �����͸� �а� ���� ������ ���α׷��� ������ �𵨸� �س��� ��.
 	-���� : �����͸� �ӽ������� ��Ƶδ� ����.
 	
 	*�ڹ��� ����� ��Ʈ�� ����
 	-�� �������� �帧.
 	-���۸� ���� �� �ִ�.
 	-FIFO(First In First Out)�� ����
 	-����(Character Stream), ����Ʈ(byte Stream)���� �з���.
 	
 	*����(Character Stream) ���� �ֻ��� ��Ʈ��
 	-Reader Class
 		�Է� ��Ʈ�� : ���� �����͸� �о� ���̴� ��Ʈ��.
 	-Writer Class
 		��� ��Ʈ�� : ���� �����͸� ����ϱ� ���� ��Ʈ��.
 	
 	*����Ʈ(byte Stream)����Ʈ �ֻ��� ��Ʈ��
 	-InputStream Class
 		�Է� ��Ʈ�� : ����Ʈ �����͸� �о� ���̴� ��Ʈ��.
 		(�Է� �ֻ��� ��Ʈ��)
 	-OutputStream Class
 	 	��� ��Ʈ�� : ����Ʈ �����͸� ����ϱ� ���� ��Ʈ��.
 	 	(��� �ֻ��� ��Ʈ��)
 */
public class IOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�Է� : ");
		char c = ' ';
		try {
			c =(char)System.in.read();
		}catch(IOException e){
			e.printStackTrace();
			
		}
		System.out.println("���: " + c);
		
		
	}

}
