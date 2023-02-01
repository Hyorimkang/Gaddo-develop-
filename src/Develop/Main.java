package Develop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class Main extends JFrame {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		frame();
		b_User();
		b_Manager();
		
	}//Main
	
	public void frame() {
		setTitle("Gaddo");//타이틀
		setSize(900,600);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);//창이 가운데 나오게
		getContentPane().setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
		setVisible(true);//창이 보이게	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
	}
	
	public void b_User() {
		JButton user = new JButton("사용자 모드");
		user.setFont(new Font("맑은 고딕", Font.BOLD, 47));
		user.setBounds(113, 338, 309, 144);
		getContentPane().add(user);
		
	}//b_User
	
	public void b_Manager() {
		JButton manager = new JButton("관리자 모드");
		manager.setFont(new Font("맑은 고딕", Font.BOLD, 47));
		manager.setBounds(456, 338, 309, 144);
		getContentPane().add(manager);
	}//b_Manager
}
