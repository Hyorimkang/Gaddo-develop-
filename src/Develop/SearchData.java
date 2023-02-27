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

public class SearchData extends JFrame {
	private JTextField inputyear;
	private JTextField inputmonth;
	private JTextField inputdate;

	public static void main(String[] args) {
		new SearchData();
	}//main
	
	public SearchData() {
		initialize();
		search();
		Image();
		button();
		}//SearchData

	private void initialize() {
		setTitle("Search Data");//타이틀
		setSize(600,400);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);
		setVisible(true);//창이 보이게	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		getContentPane().setLayout(null);
	}//initialize
	
	private void Image() {
		ImagePanel SearchData = new ImagePanel(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\SearchData.jpg").getImage());
		SearchData.setLocation(0, 0);
		setPreferredSize(SearchData.getDim());
		setSize(SearchData.getDim());
		getContentPane().add(SearchData);
		
	}//Image
	
	private void button() {
		//뒤로가기
		JButton back = new JButton();
		back.setBounds(12, 294, 106, 50);
		getContentPane().add(back);
		back.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		back.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\Backbt.jpg"));
		
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AllSchedule();
		        setVisible(false); // 창 안보이게 하기 
			}
		});
		
		//검색
		JButton searchbt = new JButton();
		searchbt.setBounds(200, 284, 181, 51);
		searchbt.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\searchbt.jpg"));
		getContentPane().add(searchbt);
		
				
	}//button
	
	void search() {
		inputyear = new JTextField();
		inputyear.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		inputyear.setBounds(40, 196, 157, 50);
		getContentPane().add(inputyear);
		inputyear.setColumns(10);
		
		inputmonth = new JTextField();
		inputmonth.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		inputmonth.setColumns(10);
		inputmonth.setBounds(250, 196, 96, 50);
		getContentPane().add(inputmonth);
		
		inputdate = new JTextField();
		inputdate.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		inputdate.setColumns(10);
		inputdate.setBounds(396, 196, 96, 50);
		getContentPane().add(inputdate);
	}//search
}
