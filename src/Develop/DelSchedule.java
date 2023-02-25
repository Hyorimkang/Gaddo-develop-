package Develop;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DelSchedule extends JFrame {
	private JTextField inputyear;
	private JTextField inputmonth;
	private JTextField inputdate;
	
	public static void main(String[] args) {
		new DelSchedule();
	}//main

	public DelSchedule() {
		setTitle("Delate Schedule");//타이틀
		setSize(900,600);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);
		setVisible(true);//창이 보이게	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		getContentPane().setLayout(null);
		
		
		back();
		delete();
		Image();
	}//DelSchedule
	
	void Image() {
		ImagePanel DelSchedule = new ImagePanel(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\DelSchedule.jpg").getImage());
		DelSchedule.setLocation(0, 0);
		setPreferredSize(DelSchedule.getDim());
		setSize(DelSchedule.getDim());
		getContentPane().add(DelSchedule);
		
	}//Image
	
	void delete() {
		inputyear = new JTextField();
		inputyear.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		inputyear.setBounds(153, 327, 149, 47);
		getContentPane().add(inputyear);
		inputyear.setColumns(10);
		
		inputmonth = new JTextField();
		inputmonth.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		inputmonth.setBounds(366, 327, 80, 47);
		getContentPane().add(inputmonth);
		inputmonth.setColumns(10);
		
		inputdate = new JTextField();
		inputdate.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		inputdate.setColumns(10);
		inputdate.setBounds(500, 327, 80, 47);
		getContentPane().add(inputdate);
		
		JButton enter = new JButton();
		enter.setBounds(347, 464, 181, 51);
		enter.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\deletebt.jpg"));
		getContentPane().add(enter);
		enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String year = inputyear.getText();
				String month = inputmonth.getText();
				String date = inputdate.getText();
				
				try {
					DelSchedule(year, month, date);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "일정을 삭제했습니다.");
			}
		});
	}//delete
	
	void DelSchedule(String year, String month, String date) throws SQLException {
		DBconnect db = new DBconnect();
		StringBuilder sb = new StringBuilder();
		Connection con = db.getConnection();
		Statement stmt = con.createStatement();
		
        String sql = sb.append("delete from lovesick where year = ")
        		.append(year)
        		.append(" AND month = ")
                .append(month)
                .append(" AND date = ") //띄어쓰기를 잘해야하는구나..
                .append(date)
                .append(";")
                .toString();
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }		
		
		
	}//DelSchedule
	
	void back() {
		JButton back = new JButton();
		back.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		back.setBounds(12, 490, 106, 50);
		back.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\Backbt.jpg"));
		getContentPane().add(back);
		
		back.addActionListener(new ActionListener() {
			@Override
	        public void actionPerformed(ActionEvent e) {
				new AllSchedule();
		        setVisible(false); // 창 안보이게 하기 
			}
		});
	}//back
	
	
	
	

}
