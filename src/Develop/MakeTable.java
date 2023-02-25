package Develop;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MakeTable extends DBconnect {

	private JFrame jf = new JFrame();
	private JTextField fullName;
	private JTextField shortName;
	public static void main(String[] args) {
		String shortTxt = null;
		new MakeTable(shortTxt);
	}
	
	void Image() {
		ImagePanel MakeTable = new ImagePanel(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\MakeTable.jpg").getImage());
		MakeTable.setLocation(0, 0);
		jf.setPreferredSize(MakeTable.getDim());
		jf.setSize(MakeTable.getDim());
		jf.getContentPane().add(MakeTable);
	
	}//Image
	
	void initialize() {
		jf.setTitle("Make Table");//타이틀
		jf.setSize(900,600);//프레임의 크기
		jf.setResizable(false);//창의 크기를 변경하지 못하게
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);//창이 보이게	
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		jf.getContentPane().setLayout(null);
	}//initialize
	
	void frame() {
		fullName = new JTextField();
		fullName.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		fullName.setBounds(77, 271, 715, 59);
		jf.getContentPane().add(fullName);
		fullName.setColumns(10);
		
		shortName = new JTextField();
		shortName.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		shortName.setColumns(10);
		shortName.setBounds(77, 408, 715, 59);
		jf.getContentPane().add(shortName);
		
		JButton enter = new JButton();
		enter.setBounds(347, 480, 181, 51);
		enter.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\insertbt.jpg"));
		jf.getContentPane().add(enter);
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String fullTxt = fullName.getText();
				String shortTxt = shortName.getText();
				
				DBconnect db = new DBconnect();
				try {
						Connection con = db.getConnection();
						PreparedStatement insert = con.prepareStatement(""
								+ "INSERT INTO concertname"
								+ "(name)"
								+ "VALUE"
								+ "('"+fullTxt+"')");
						insert.executeUpdate();
				}catch(Exception e) {
						System.out.println(e.getMessage());
				}
				
				createTable(shortTxt);
				JOptionPane.showMessageDialog(null, "새로운 콘서트 일정을 추가했습니다.");
				 
				 
			}
		});
		
	}//frame

	public MakeTable(String shortTxt) {
		Image();
		initialize();
		frame();
		createTable(shortTxt);
		back();
	}//MakeTable
	
	void createTable(String shortTxt) {
		try {
			Connection con = getConnection();
			String tableName = shortTxt;
			PreparedStatement create = con.prepareStatement(
					"CREATE TABLE " + tableName 
					+ " (country varchar(30) not null, "
					+ "area varchar(30) not null,"
					+ "year varchar(30) not null, "
					+ "month varchar(30) not null, "
					+ "date varchar(30) not null)");
			create.execute();
			System.out.println("테이블 생성 성공!");
		} catch (Exception e) { //예외처리
			System.out.println("테이블 생성 실패 이유 : " + e.toString());
		}
	}//createTable
	
	void back() {
		JButton back = new JButton();
		back.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		back.setBounds(12, 490, 106, 50);
		back.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\Backbt.jpg"));
		jf.getContentPane().add(back);
		
		
		back.addActionListener(new ActionListener() {
			@Override
	        public void actionPerformed(ActionEvent e) {
				new AllSchedule();
		        jf.setVisible(false); // 창 안보이게 하기 
			}
		});
	}//back
}
