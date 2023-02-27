package Develop;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class D_day extends JFrame {

	public static void main(String[] args) {
		new D_day();
	}//main

	
	public D_day() {
		Image();
		initialize();
	}//D_day
	
	void Image() {
		ImagePanel D_day = new ImagePanel(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\D_day.jpg").getImage());
		D_day.setLocation(0, 0);
		setPreferredSize(D_day.getDim());
		setSize(D_day.getDim());
		getContentPane().add(D_day);
		
	}//Image
	
	void initialize() {
		setTitle("D-day");//타이틀
		setSize(600,400);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);
		setVisible(true);//창이 보이게	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		getContentPane().setLayout(null);
		
	}//initialize

}
