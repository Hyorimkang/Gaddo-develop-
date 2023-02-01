package Develop;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class User_Menu extends JFrame {


	
	public static void main(String[] args) {
		new User_Menu();
	}

	public User_Menu() {
		
		Main m = new Main();
		m.frame();
		button1();
		button2();
		button3();
		button4();
		
	}
	
	private void button1() {
		JButton b1 = new JButton("1. 현재 투어 위치는 어디인가요?");
		b1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		b1.setBounds(211, 218, 475, 48);
		getContentPane().add(b1);
		
	}//button1

	private void button2() {
		JButton b2 = new JButton("2. 투어 종료까지 며칠이나 남았나요?");
		b2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		b2.setBounds(211, 277, 475, 48);
		getContentPane().add(b2);
	}//button2

	private void button3() {
		JButton b3 = new JButton("3. 지금 현지 시간은 몇시인가요?");
		b3.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		b3.setBounds(211, 340, 475, 48);
		getContentPane().add(b3);
	}//button3
	
	private void button4() {
		JButton b4 = new JButton("4. 전체일정표를 보고싶어요!");
		b4.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		b4.setBounds(211, 406, 475, 48);
		getContentPane().add(b4);
	}//button4
}
