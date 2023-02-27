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
import javax.swing.JTextField;

public class getLocation extends JFrame {
	private JTextField year;
	private JTextField month;
	private JTextField date;

	
	public static void main(String[] args) {
		new getLocation();
	}//main

	
	public getLocation() {
		Image();
		initialize();
		button();
		textfield();
	}//getLodation
	
	void Image() {
		ImagePanel getLocation = new ImagePanel(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\getLocation.jpg").getImage());
		getLocation.setLocation(0, 0);
		setPreferredSize(getLocation.getDim());
		setSize(getLocation.getDim());
		getContentPane().add(getLocation);
	}//Image
	
	void initialize() {
		setTitle("현재 위치 검색");//타이틀
		setSize(900,600);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);
		setVisible(true);//창이 보이게	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		getContentPane().setLayout(null);
		
	}//initialize
	
	private void button() {
		JButton back = new JButton();
		back.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		back.setBounds(12, 490, 106, 50);
		back.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\Backbt.jpg"));
		getContentPane().add(back);
		
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AllSchedule_User();
			    setVisible(false); // 창 안보이게 하기 
			}
		});
		
		//검색
		JButton searchbt = new JButton();
		searchbt.setBounds(200, 284, 181, 51);
		searchbt.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\searchbt.jpg"));
		getContentPane().add(searchbt);
		
	
	}//button
	
	void textfield() {
		year = new JTextField();
		year.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		year.setBounds(141, 240, 153, 53);
		year.setColumns(10);
		getContentPane().add(year);
		
		month = new JTextField();
		month.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		month.setColumns(10);
		month.setBounds(380, 240, 112, 53);
		getContentPane().add(month);
		
		date = new JTextField();
		date.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		date.setColumns(10);
		date.setBounds(569, 240, 112, 53);
		getContentPane().add(date);
		
	}//textfield



}
