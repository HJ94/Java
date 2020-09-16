package appEx;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
  GUI Programming이란
  -GUI는 과거에 사용하였던 DOS(CUI)와 같은 방식의 Text기반 OS가 아닌 Grapic을 ㅣ용하여 
   User와 Program 간의 상호작용을 할 수 있도록 해주는 Interface를 의미한다.
   Java에서 이러한 Graphic Programming을 지원하기 위해 나온 것이 바로 AWT이다.
   
  	<<학습 목차>>
  	-AWT 개념 및 구조
  	-자바에서 제공하는 Component 와 Container
  	-Layout Manager
  	-이벤트
  	-Graphic
  	
  	AWT의 기본 개념
  	AWT(Abstract Window Toolkit)은 GUI Programming을 제작하기 위해 Java에서 제공하는 Library를 모아놓은 것이다.
  	AWT는 모든 GUI Program에 사용되는 Component 및 Toolkit을 제공하고 있으며 향후에는 JFC와 같은 Swing 및 Java2D의 모태가 되는 개념이다.
  	AWT는 OS에 구해받지 않고 쓸 수 있도록 OS의 것을 그대로 사용하지 않고 공통적이고 기본적인 Component들을 추상화시켜 제공한다.
  	
   	구조 - Java.awt ~
   	
   	최상위  
   	
   	
   								  Button
   			  Component				
   								  Lable
   	
   	Object	-	               -  List				- Panel        -  	Applet
  										   (기본 배치관리자가 flow layout)	
  								  Container
  											
  								  Choice			  Scrollpane
  			  MenuComponent		
  			  					  Checkbox			  Window	   -   	Dialog      -FileDialog  			  				
 																		Frame
								  TextComponent		  TextArea
								  
								  ScrollBar			  Text
								  
								  Canvas
								  
								  */
//프레임은 컨테이너, 컴포넌트는 컨테이너 역할을 할 수없다.(컨테이너는 컴포넌트 역할을 할 수 있음.)
public class GuiEx extends Frame{
	public GuiEx(){
		//패널
		Panel p = new Panel();
		//버튼
		Button b = new Button("버튼");
		b.setLabel("변경된 라벨");
		//체크 박스
		Checkbox ch1 = new Checkbox("체크 박스", true);
		Checkbox ch2 = new Checkbox("체크 박스", false);
		Checkbox ch3 = new Checkbox("체크 박스", false);
		//체크 박스(라디오 버튼)
		CheckboxGroup ch = new CheckboxGroup();
		Checkbox ch4 = new Checkbox("라디오 버튼", true, ch);
		Checkbox ch5 = new Checkbox("라디오 버튼", false, ch);
		Checkbox ch6 = new Checkbox("라디오 버튼", false, ch);
		//초이스(콤보 박스)
		Choice cho = new Choice();
		cho.add("학년 선택");
		cho.add("1학년");
		cho.add("2학년");
		cho.add("3학년");
		cho.add("4학년");
		
		//라벨, 리스트
		Label la = new Label("자바 수강생");
		List ls = new List(5);
		ls.add("List 1");
		ls.add("List 2");
		ls.add("List 3");
		ls.add("List 4");
		ls.add("List 5");
		ls.add("List 6");

		//스크롤바 HORIZONTAL
		Scrollbar sb = new Scrollbar(Scrollbar.HORIZONTAL, 200, 100, 0 ,255);
		//스크롤바 VERTICAL
		Scrollbar sb2 = new Scrollbar(1, 200, 100, 0 ,255);
		//텍스트필드(한 문장)
		TextField tf = new TextField("TextField",50);
		//텍스트 에어리어(여러 문장)
		TextArea ta = new TextArea("TextArea",20, 10, 0);
		//생성한 객체들을 panel에 붙이기
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
		//프레임에 붙이기 (this. 이 생략 되어있음)
		add(p);

		//컨테이너
		setSize(500, 500);
		setVisible(true);
		
		//닫기(종료)
		addWindowListener(new WindowAdapter() { //모바일에서 많이 사용(내부 익명)
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	
	
	}

	
	public static void main(String[] args) {
		new GuiEx();
	}
}
