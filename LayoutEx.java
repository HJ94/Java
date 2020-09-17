package appEx;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class LayoutEx extends Frame implements AdjustmentListener {
//	Frame f = new Frame();
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	
	public TextField tf;
	public Label la1,la2,la3,la4,la5,la6,la7,la8,la9,la10;
	public Scrollbar sb1, sb2, sb3;
	public TextArea ta;
	
	public LayoutEx() {
		//텍스트필드(한 문장)
		
		//라벨(공백)
		la1 = new Label(" ");
		la2 = new Label(" ");
		la3 = new Label(" ");
		la4 = new Label("현재 색상 ");
		la5 = new Label(" ");
		la6 = new Label(" ");
		la7 = new Label(" ");
		la8 = new Label(" ");
		la9 = new Label(" ");
		la10 = new Label(" ");

		
		//스크롤바 HORIZONTAL
		sb1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0 ,265);
		sb2 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0 ,265);
		sb3 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0 ,265);
		
		
		tf = new TextField("",30);		
		ta = new TextArea("",20, 10, 0);
		
		
		
		p1.setLayout(new GridLayout(10,1));
		p1.add(la1);
		p1.add(sb1);
		p1.add(la2);
		p1.add(sb2);
		p1.add(la3);
		p1.add(sb3);
		p1.add(la4);
		p1.add(tf);
		p1.add(la5);
		
	
		p2.setLayout(new BorderLayout());
		p2.add(la6, "East");
		p2.add(ta, "Center");
		p2.add(la7, "West");
		p2.add(la8, "North");
		p2.add(la9, "South");
		
		setLayout(new GridLayout(1,2));
		add(p1);
		add(p2);
		
		//이벤트 감청자 등록(움직임을 감지하여 알려줌) 
		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
		sb3.addAdjustmentListener(this);
		
		
		setSize(500,500);
		setVisible(true);
	
		// 닫기(종료)
		addWindowListener(new WindowAdapter() { // 모바일에서 많이 사용(내부 익명)
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override	
	public void adjustmentValueChanged(AdjustmentEvent e) {
		ta.setBackground(new Color(sb1.getValue(),sb2.getValue(),sb3.getValue()));
		tf.setText("R: " + sb1.getValue() + " G: " + sb2.getValue() + " B: " + sb3.getValue());
		
		
//		int r=0, g=0, b=0;
//		r = sb1.getValue();
//		g = sb2.getValue();
//		b = sb3.getValue();
//		
//		Color color = new Color(r,g,b);
//		ta.setBackground(color);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LayoutEx();
	}




}
