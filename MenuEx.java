package Bank;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

public class MenuEx extends Frame implements ActionListener {

	public MenuBar mb;
	public Menu m;
	public MenuItem[] mi;
	public FileDialog fd_load, fd_save, fd_save2;
	public TextArea ta;

	public static void main(String[] args) throws IOException {
		new MenuEx();
	}

	public MenuEx() {
		ta = new TextArea();
		ta.setEditable(false); // ��Ȱ��ȭ
		fd_load = new FileDialog(this, "���� ����", FileDialog.LOAD);
		fd_save = new FileDialog(this, "���� ����", FileDialog.SAVE);
		// fd_save2 = new FileDialog(this, "�ٸ� �̸����� ����", FileDialog.);
		mb = new MenuBar();
		m = new Menu("File");
		mi = new MenuItem[5];
		mi[0] = new MenuItem("New File");
		mi[1] = new MenuItem("Open File");
		mi[2] = new MenuItem("Save File");
		mi[3] = new MenuItem("Save As");
		mi[4] = new MenuItem("Exit");

		for (int i = 0; i < mi.length; i++) {
			m.add(mi[i]);
			mi[i].addActionListener(this);
			if (i != 2 && i != (mi.length - 1))
				m.addSeparator();
		}
		mi[1].setEnabled(false);
		mb.add(m);
		setMenuBar(mb);
		add(ta, "Center");
		setSize(500, 500);
		setVisible(true);

//		mi[4].addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//			}
//		});	
	}

	@Override
	public void actionPerformed(ActionEvent r) {
		// TODO Auto-generated method stub
		Object obj = r.getSource();

			// Exit
		if (obj.equals(mi[4])) {
			System.exit(0);
			// New File
		} else if (obj == mi[0]) {
			ta.setEditable(true);
			mi[1].setEnabled(true);

			// Open File
		} else if (obj == mi[1]) {
			fd_load.setVisible(true);
			BufferedWriter bw = null;
			String openfile = fd_load.getDirectory() + fd_load.getFile();

			try {
				File file = new File(openfile); // ���� ��ü ���� �� ��� ����
				InputStream is = new FileInputStream(file); // ���� ��� �־���
				int readByteNo;
				byte[] readBytes = new byte[100]; // ���Ͽ��� �о�� �ؽ�Ʈ�� byte[100]�� ��� ����
				String data = "";

				readByteNo = is.read(readBytes); // �� �о� ���̱�.
				data += new String(readBytes, 0, readByteNo); // �迭�� �ִ� ��� ������ 0���� readByteNo(���Ͽ��� �о�� �ؽ�Ʈ)���� ���ڿ��� �����ϱ�

				ta.setText(data); // textArea�� data���
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			// Save File
		} else if (obj == mi[2]) {
			fd_save.setVisible(true);
			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(new FileWriter(new File("C:/IO/MenuPractice3.txt"))); // �ϳ��� �Է� ���� ��ġ�� ǥ��(���� ǥ��
																								// ����)
				bw.write(ta.getText());
				bw.flush();
				/*
				 * BufferedWriter bw = new BufferedWriter(); 
				 * FileWriter fw = new FileWriter();
				 * File file = new File();
				 * ------------------------------------------------------- new
				 * BufferedWriter(new FileWriter(new File("C:/IO/Menu")));�� ���� ǥ��
				 * 
				 */
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			// Sve As
		} else if (obj == mi[3]) {
			fd_save.setVisible(true);
			fd_save.getDirectory();
			BufferedWriter bw = null;
			String saveasfile = fd_save.getDirectory() + fd_save.getFile();
			try {
				bw = new BufferedWriter(new FileWriter(new File(saveasfile + ".txt")));
				bw.write(ta.getText());
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
