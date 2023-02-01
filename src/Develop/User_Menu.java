package Develop;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class User_Menu extends JFrame {


	
	public static void main(String[] args) {
		new User_Menu();
	}

	public User_Menu() {
		frame();
		button1();
		button2();
		button3();
		button4();
		back();
	}
	
	void back() {
		JButton back = new JButton("돌아가기");
		back.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		back.setBounds(12, 490, 106, 50);
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
