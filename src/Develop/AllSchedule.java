package Develop;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class AllSchedule extends JFrame {

	
	public static void main(String[] args) {
		new AllSchedule();
	}
	
	void Image() {
		ImagePanel AllSchedule = new ImagePanel(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\AllSchedule.jpg").getImage());
		AllSchedule.setLocation(0, 0);
		setPreferredSize(AllSchedule.getDim());
		setSize(AllSchedule.getDim());
		getContentPane().add(AllSchedule);
		
			
	}//Image
	
	public AllSchedule() {
		setTitle("All Schedule");//타이틀
		setSize(900,600);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);
		setVisible(true);//창이 보이게	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(209, 187, 518, 39);
		getContentPane().add(comboBox);


		Image();
		back();
	}//AllSchedule
	
	void back() {
		JButton back = new JButton();
		back.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		back.setBounds(12, 490, 106, 50);
		back.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\Backbt.jpg"));
		getContentPane().add(back);
		
		back.addActionListener(new ActionListener() {
			@Override
	        public void actionPerformed(ActionEvent e) {
				new M_menu();
		        setVisible(false); // 창 안보이게 하기 
			}
		});
	}//back
}
