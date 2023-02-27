package Develop;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		Image();
		initialize();
		button();
		
	}//Main
	
	private void Image() {
		ImagePanel MainPanel = new ImagePanel(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\Main.jpg").getImage());
		MainPanel.setLocation(0, 0);
		setPreferredSize(MainPanel.getDim());
		setSize(MainPanel.getDim());
		getContentPane().add(MainPanel);
	}//Image
	
	private void initialize() {
		setTitle("Gaddo");//타이틀
		setSize(900,600);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);//창이 가운데 나오게
		getContentPane().setLayout(null);//레이아웃을 내맘대로 설정가능하게 해줌.
		setVisible(true);//창이 보이게	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		
	}//initialize
	
	private void button() {
		//사용자 모드 버튼
		JButton user = new JButton();
		user.setBounds(133, 418, 254, 118);
		getContentPane().add(user);
		user.setFont(new Font("맑은 고딕", Font.BOLD, 47));
		user.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\Main_user.jpg"));
		
		//User_Menu로 넘어가기
		user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new User_Menu();
                setVisible(false); // 창 안보이게 하기 
            }
        });
		
		//관리자 모드 버튼
		JButton manager = new JButton();
		manager.setFont(new Font("맑은 고딕", Font.BOLD, 47));
		manager.setBounds(503, 418, 254, 118);
		getContentPane().add(manager);
		manager.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\Main_manager.jpg"));
				
		
		//비밀번호 입력 창로 넘어가기
		manager.addActionListener(new ActionListener() {
		     @Override
		     public void actionPerformed(ActionEvent e) {
		    	 new password();
		     	setVisible(false); // 창 안보이게 하기 
		     }
		});
	}//button
	

}
