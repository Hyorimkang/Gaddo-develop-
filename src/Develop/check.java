package Develop;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class check extends JDialog {
	public check(Window parent) {
		super(parent, "Model Practice", ModalityType.APPLICATION_MODAL);
		setSize(400,250);//프레임의 크기
		setLayout(null);
		JLabel lb = new JLabel("관리자 모드에 로그인되었습니다.");
		lb.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		lb.setBounds(100, 60, 100, 50);
		add(lb);
		
	}//check
	 


}
