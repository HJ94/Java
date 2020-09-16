package appEx;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
  GUI Programming�̶�
  -GUI�� ���ſ� ����Ͽ��� DOS(CUI)�� ���� ����� Text��� OS�� �ƴ� Grapic�� �ӿ��Ͽ� 
   User�� Program ���� ��ȣ�ۿ��� �� �� �ֵ��� ���ִ� Interface�� �ǹ��Ѵ�.
   Java���� �̷��� Graphic Programming�� �����ϱ� ���� ���� ���� �ٷ� AWT�̴�.
   
  	<<�н� ����>>
  	-AWT ���� �� ����
  	-�ڹٿ��� �����ϴ� Component �� Container
  	-Layout Manager
  	-�̺�Ʈ
  	-Graphic
  	
  	AWT�� �⺻ ����
  	AWT(Abstract Window Toolkit)�� GUI Programming�� �����ϱ� ���� Java���� �����ϴ� Library�� ��Ƴ��� ���̴�.
  	AWT�� ��� GUI Program�� ���Ǵ� Component �� Toolkit�� �����ϰ� ������ ���Ŀ��� JFC�� ���� Swing �� Java2D�� ���°� �Ǵ� �����̴�.
  	AWT�� OS�� ���ع��� �ʰ� �� �� �ֵ��� OS�� ���� �״�� ������� �ʰ� �������̰� �⺻���� Component���� �߻�ȭ���� �����Ѵ�.
  	
   	���� - Java.awt ~
   	
   	�ֻ���  
   	
   	
   								  Button
   			  Component				
   								  Lable
   	
   	Object	-	               -  List				- Panel        -  	Applet
  										   (�⺻ ��ġ�����ڰ� flow layout)	
  								  Container
  											
  								  Choice			  Scrollpane
  			  MenuComponent		
  			  					  Checkbox			  Window	   -   	Dialog      -FileDialog  			  				
 																		Frame
								  TextComponent		  TextArea
								  
								  ScrollBar			  Text
								  
								  Canvas
								  
								  */
//�������� �����̳�, ������Ʈ�� �����̳� ������ �� ������.(�����̳ʴ� ������Ʈ ������ �� �� ����.)
public class GuiEx extends Frame{
	public GuiEx(){
		//�г�
		Panel p = new Panel();
		//��ư
		Button b = new Button("��ư");
		b.setLabel("����� ��");
		//üũ �ڽ�
		Checkbox ch1 = new Checkbox("üũ �ڽ�", true);
		Checkbox ch2 = new Checkbox("üũ �ڽ�", false);
		Checkbox ch3 = new Checkbox("üũ �ڽ�", false);
		//üũ �ڽ�(���� ��ư)
		CheckboxGroup ch = new CheckboxGroup();
		Checkbox ch4 = new Checkbox("���� ��ư", true, ch);
		Checkbox ch5 = new Checkbox("���� ��ư", false, ch);
		Checkbox ch6 = new Checkbox("���� ��ư", false, ch);
		//���̽�(�޺� �ڽ�)
		Choice cho = new Choice();
		cho.add("�г� ����");
		cho.add("1�г�");
		cho.add("2�г�");
		cho.add("3�г�");
		cho.add("4�г�");
		
		//��, ����Ʈ
		Label la = new Label("�ڹ� ������");
		List ls = new List(5);
		ls.add("List 1");
		ls.add("List 2");
		ls.add("List 3");
		ls.add("List 4");
		ls.add("List 5");
		ls.add("List 6");

		//��ũ�ѹ� HORIZONTAL
		Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 200, 100, 0 ,255);
		//��ũ�ѹ� VERTICAL
		Scrollbar sb2 = new Scrollbar(1, 200, 100, 0 ,255);
		//�ؽ�Ʈ�ʵ�(�� ����)
		TextField tf = new TextField("TextField",50);
		//�ؽ�Ʈ �����(���� ����)
		TextArea ta = new TextArea("TextArea",20, 10, 0);
		//������ ��ü���� panel�� ���̱�
		p.add(ch1);
		p.add(ch2);
		p.add(ch3);
		p.add(cho);
		p.add(ch4);
		p.add(ch5);
		p.add(ch6);
		p.add(b);
		p.add(la);
		p.add(ls);
		p.add(sb);
		p.add(sb2);
		p.add(tf);
		p.add(ta);
		//�����ӿ� ���̱� (this. �� ���� �Ǿ�����)
		add(p);

		//�����̳�
		setSize(500, 500);
		setVisible(true);
		
		//�ݱ�(����)
		addWindowListener(new WindowAdapter() { //����Ͽ��� ���� ���(���� �͸�)
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	
	
	}

	
	public static void main(String[] args) {
		new GuiEx();
	}
}
