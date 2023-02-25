package Develop;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class password extends JFrame {
	private JPasswordField password;
	 

	public static void main(String[] args) {
		new password();
	}

	public password() {
		Image();
		
		//암호화되어 보이는 텍스트필드
		//최대 12글자까지 넣을 수 있도록 설정함
		password = new JPasswordField(12);
		password.setBounds(20, 59, 248, 28);
		getContentPane().add(password);
		
		JButton login = new JButton();
		login.setBounds(280, 58, 91, 28);
		login.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\login.jpg"));
		getContentPane().add(login);
		
	
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//비밀번호 지정
				String pw = "entermanager";
				
				//비밀번호 일치 확인
				if(pw.equals(password.getText())) {
					JOptionPane.showMessageDialog(null, "로그인 되었습니다."); 
					//관리자 메뉴 창으로 넘어가기
					next();
				
				}
				else {
					JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다."); 
				}
			}
		});
		
		JPanel panel = new JPanel();
		
		getContentPane().add(panel);
		
		
		setTitle("Manager Password");//타이틀
		setSize(400,200);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);
		setVisible(true);//창이 보이게	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		getContentPane().setLayout(null);
		
	
		back();
	}//password
	
	void Image() {
		ImagePanel password = new ImagePanel(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\password.jpg").getImage());
		password.setLocation(0, 0);
		setPreferredSize(password.getDim());
		setSize(password.getDim());
		getContentPane().add(password);
	
	}//Iamge
	
	void back() {
		JButton back = new JButton();
		back.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		back.setBounds(31, 110, 100, 30);
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
	
	void next() {
		JButton next = new JButton();
		next.setFont(new Font("맑은 고딕", Font.BOLD, 10));
		next.setBounds(263, 110, 100, 30);
		next.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\Menubt.jpg"));
		getContentPane().add(next);
		
		next.addActionListener(new ActionListener() {
			@Override
	        public void actionPerformed(ActionEvent e) {
				new AllSchedule();
		        setVisible(false); // 창 안보이게 하기 
			}
		});
	}//next
}
