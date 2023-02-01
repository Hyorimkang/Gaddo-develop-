package Develop;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import static javax.swing.JOptionPane.*;

public class password extends JFrame {
	
	private String password = "enterpassword";
	private JPasswordField pf;

	public static void main(String[] args) {
		new password();
	}

	public password() {
		setTitle("Gaddo");//타이틀
		setSize(900,600);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);
		setVisible(true);//창이 보이게	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		getContentPane().setLayout(null);
		
		back();
		label();
		enter();
		
	}//password
	
	void label() {
		JLabel lblNewLabel = new JLabel("비밀번호를 입력하세요 (12자)");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 45));
		lblNewLabel.setBounds(141, 104, 617, 89);
		getContentPane().add(lblNewLabel);
		
		JLabel click = new JLabel("클릭하세요");
		click.setHorizontalAlignment(SwingConstants.CENTER);
		click.setFont(new Font("맑은 고딕", Font.BOLD, 32));
		click.setBounds(110, 219, 674, 89);
		getContentPane().add(click);
		
		
	}//label
	
	private void enter() {
		pf = new JPasswordField();
		pf.setFont(new Font("맑은 고딕", Font.PLAIN, 54));
		pf.setBounds(110, 219, 681, 89);
		pf.setEchoChar('●');
		getContentPane().add(pf);
		
		
		JButton fin = new JButton("로그인");
		fin.setFont(new Font("맑은 고딕", Font.PLAIN, 34));
		fin.setBounds(282, 322, 313, 53);
		getContentPane().add(fin);
		
		
		String psw = "";
		String login = "";
		try {
			//비밀번호 String으로 변환하기
			char[] pw = pf.getPassword(); //배열에 저장
			for(char tmp : pw) {
				Character.toString(tmp); //char값 String으로 변환
				psw += (psw.equals("")) ? ""+tmp+"" : ""+tmp+""; //psw에 저장, psw에 값이 비었으면 저장, 값이 있으면 저장
			}
			
			//비밀번호 일치 확인
			if(pw.equals(password)) {
	        //로그인성공!
				login = "성공";
	        }
	        
		}catch(Exception errmsg) {
			errmsg.printStackTrace();
		}
		
		//일치하면 Manager_menu넘어가기
		if(login.equals("성공")) {
			showMessageDialog(null,"관리자 모드로 로그인합니다.", "로그인 성공!",DEFAULT_OPTION);
		}
		else {
			showMessageDialog(null, "비밀번호 오류","ERROR_MESSAGE", ERROR_MESSAGE);
		}
		
		
	}//enter
	
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

}
