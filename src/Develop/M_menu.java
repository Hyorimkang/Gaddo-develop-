package Develop;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class M_menu extends JFrame {
	public static void main(String[] args) {
		new M_menu();
	}

	public M_menu() {
		setTitle("Manager Menu");//타이틀
		setSize(900,600);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);
		setVisible(true);//창이 보이게	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		getContentPane().setLayout(null);
		
		Image();
		b1();
		b2();
		b3();
		b4();
		back();
	}
	
	void Image() {
		ImagePanel ManagerPanel = new ImagePanel(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\M_menu.jpg").getImage());
		ManagerPanel.setLocation(0, 0);
		setPreferredSize(ManagerPanel.getDim());
		setSize(ManagerPanel.getDim());
		getContentPane().add(ManagerPanel);
	
	}//Image
	
	void b1() {
		JButton b1 = new JButton();
		b1.setBounds(157, 207, 260, 123);
		getContentPane().add(b1);
		b1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		getContentPane().add(b1);
		b1.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\b1.jpg"));
	}//b1
	
	void b2() {
		JButton b2 = new JButton();
		b2.setBounds(483, 205, 260, 123);
		getContentPane().add(b2);
		b2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		b2.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\b2.jpg"));
		
		//일정 추가하는 창으로 넘어가기
		b2.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	new MakeSchedule();
		    	setVisible(false); // 창 안보이게 하기 
		    }
		});
	}//b2
	
	void b3() {
		JButton b3 = new JButton();
		b3.setBounds(483, 355, 260, 123);
		getContentPane().add(b3);
		b3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		b3.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\b3.jpg"));
		
	}//b3
	
	void b4() {
		JButton b4 = new JButton();
		b4.setBounds(157, 356, 260, 123);
		getContentPane().add(b4);
		b4.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		b4.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\b4.jpg"));
		
		//전체일정 확인하는 창으로 넘어가기
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AllSchedule();
				setVisible(false); // 창 안보이게 하기 
			}
		});
	}//b4

	
	void back() {
		JButton back = new JButton();
		back.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		back.setBounds(12, 490, 106, 50);
		back.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\Backbt.jpg"));
		getContentPane().add(back);
		
		back.addActionListener(new ActionListener() {
			@Override
	        public void actionPerformed(ActionEvent e) {
				new Main();
		        setVisible(false); // 창 안보이게 하기 
			}
		});
	}//back
}
