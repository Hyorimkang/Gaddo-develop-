package Develop;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class User_Menu extends JFrame {

	public static void main(String[] args) {
		new User_Menu();
	}

	public User_Menu() {
		Image();
		frame();
		button1();
		button2();
		button3();
		button4();
		back();
	}
	
	void Image() {
		ImagePanel UserPanel = new ImagePanel(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\User_Menu.jpg").getImage());
		UserPanel.setLocation(0, 0);
		setPreferredSize(UserPanel.getDim());
		setSize(UserPanel.getDim());
		getContentPane().add(UserPanel);
	}
	
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
	
	public void frame() {
		setTitle("Gaddo");//타이틀
		setSize(900,600);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);//창이 가운데 나오게
		getContentPane().setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
		setVisible(true);//창이 보이게	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
	}
	
	private void button1() {
		JButton b1 = new JButton();
		b1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		b1.setBounds(211, 218, 475, 48);
		getContentPane().add(b1);
		b1.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\Ub1.jpg"));
		
	}//button1

	private void button2() {
		JButton b2 = new JButton();
		b2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		b2.setBounds(211, 277, 475, 48);
		getContentPane().add(b2);
		b2.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\Ub2.jpg"));
	}//button2

	private void button3() {
		JButton b3 = new JButton();
		b3.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		b3.setBounds(211, 340, 475, 48);
		getContentPane().add(b3);
		b3.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\Ub3.jpg"));
	}//button3
	
	private void button4() {
		JButton b4 = new JButton();
		b4.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		b4.setBounds(211, 406, 475, 48);
		getContentPane().add(b4);
		b4.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\Ub4.jpg"));
		
	}//button4
}
