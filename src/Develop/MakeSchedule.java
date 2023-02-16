package Develop;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MakeSchedule extends JFrame {
	private JTextField inputcountry;
	private JTextField inputarea;
	private JTextField inputyear;
	private JTextField inputmonth;
	private JTextField inputdate;

	public static void main(String[] args) {
		new MakeSchedule();
	
	}
	
	void Image() {
		ImagePanel MakeSchedule = new ImagePanel(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\MakeSchedule.jpg").getImage());
		MakeSchedule.setLocation(0, 0);
		setPreferredSize(MakeSchedule.getDim());
		setSize(MakeSchedule.getDim());
		getContentPane().add(MakeSchedule);
	
	
	}//Image
	
	public static void createCustomer(JTextField country, JTextField area, JTextField year, JTextField month, JTextField date) {
		DBconnect db = new DBconnect();
		try {
			Connection con = db.getConnection();
			PreparedStatement insert = con.prepareStatement(""
					+ "INSERT INTO customer"
					+ "(country, area, year, month, date)"
					+ "VALUE"
					+ "('"+country+"','"+area+"','"+year+"','"+month+"','"+date+"')");
			insert.executeUpdate();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}//createCustomer

	public MakeSchedule() {
		setTitle("Make Schedule");//타이틀
		setSize(900,600);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);
		setVisible(true);//창이 보이게	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		getContentPane().setLayout(null);
		
		createCustomer(inputcountry, inputarea, inputyear, inputmonth, inputdate);
		back();
		Image();

		//나라입력
		inputcountry = new JTextField();
		inputcountry.setBounds(399, 229, 294, 46);
		getContentPane().add(inputcountry);
		inputcountry.setColumns(10);
		
		//지역 입력
		inputarea = new JTextField();
		inputarea.setColumns(10);
		inputarea.setBounds(399, 304, 294, 46);
		getContentPane().add(inputarea);
		
		//연도 입력
		inputyear = new JTextField();
		inputyear.setBounds(385, 389, 108, 21);
		getContentPane().add(inputyear);
		inputyear.setColumns(10);
		
		//월 입력
		inputmonth = new JTextField();
		inputmonth.setBounds(547, 389, 60, 21);
		getContentPane().add(inputmonth);
		inputmonth.setColumns(10);
		
		//날짜 입력
		inputdate = new JTextField();
		inputdate.setBounds(654, 389, 52, 21);
		getContentPane().add(inputdate);
		inputdate.setColumns(10);
		
		//추가버튼
		JButton enter = new JButton();
		enter.setFont(new Font("굴림", Font.PLAIN, 32));
		enter.setBounds(347, 464, 181, 51);
		enter.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\insertbt.jpg"));
		getContentPane().add(enter);
//		if(inputdate != null) {
//			JOptionPane.showMessageDialog(null, "정보를 추가하시겠습니까?"); 
//			//관리자 메뉴 창으로 넘어가기
//			createCustomer(inputcountry, inputarea, inputyear, inputmonth, inputdate);
//		
//		}
		
		//콘서트 선택
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(399, 168, 294, 28);
		getContentPane().add(comboBox);
		
		
	}//Make_schedule
	
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
