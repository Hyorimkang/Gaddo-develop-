package Develop;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;

public class AllSchedule extends JFrame {
	private JTable table;
	static DBconnect db = new DBconnect();
	static String Table;

	public static void main(String[] args) {
		new AllSchedule();
	}//main
	
	
	public AllSchedule() {
		int num=0;
		initialize();
		button();
		table(num);
		Image();
		
	}//AllSchedule
	
	void Image() {
		ImagePanel AllSchedule = new ImagePanel(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\AllSchedule.jpg").getImage());
		AllSchedule.setLocation(0, 0);
		setPreferredSize(AllSchedule.getDim());
		setSize(AllSchedule.getDim());
		getContentPane().add(AllSchedule);
		
		
	}//Image
	
	void initialize() {
		setTitle("All Schedule");//타이틀
		setSize(900,600);//프레임의 크기
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);
		setVisible(true);//창이 보이게	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
		getContentPane().setLayout(null);
		
	}//initialize
	
	void table(int num) {
		
		String[][] data = getData(num);
		String [] headers = new String[] {"Country", "Area", "Year", "Month", "Date"};
		
		
		
		table = new JTable(data, headers);
		table.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		table.setBounds(133, 103, 615, 400);
		table.setRowHeight(25);
		table.setAlignmentX(0);
		table.setPreferredScrollableViewportSize(new Dimension(615, 400));
		getContentPane().add(table); 
		
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(131, 134, 647, 405);
		getContentPane().add(scrollPane);
		
	}//table
	
	public static String[][] getData(int num){
		try {
			if(num == 1) {
				Table = "lovesick";
			}
			else if(num ==2) {
				Table = "sweetmirage";
			}
		
			Connection con = db.getConnection();
			PreparedStatement insert = con.prepareStatement("Select country, area, year, month, date FROM " + Table);
			ResultSet results = insert.executeQuery();
			ArrayList<String[]> list = new ArrayList<String[]>();
			while(results.next()) {
				list.add(new String[] {
						results.getString("country"),
						results.getString("area"),
						results.getString("year"),
						results.getString("month"),
						results.getString("date")
				});
			}
			System.out.println("데이터 로딩 완료");
			String[][] arr = new String[list.size()][5];
			return list.toArray(arr);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}//getData
	 
	void button() {
		//삭제
		JButton delete = new JButton();
		delete.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		delete.setBounds(12, 409, 106, 50);
		delete.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\delete.jpg"));
		getContentPane().add(delete);
		delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new DelSchedule();
				setVisible(false); // 창 안보이게 하기 
			}
		});
		
		//새테이블 생성
		JButton newTable = new JButton();
		newTable.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		newTable.setBounds(12, 135, 106, 50);
		newTable.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\newTable.jpg"));
		getContentPane().add(newTable);
		
		newTable.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String shortTxt = null;
				new MakeTable(shortTxt);
				setVisible(false); // 창 안보이게 하기 
			}
		});
		
		//검색
		JButton search = new JButton();
		search.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		search.setBounds(13, 228, 106, 50);
		search.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\search.jpg"));
		getContentPane().add(search);
		
		search.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new SearchData();
				setVisible(false); // 창 안보이게 하기 
			}
		});
		
		
		//추가
		JButton add = new JButton();
		add.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		add.setBounds(12, 317, 106, 50);
		add.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\add.jpg"));
		getContentPane().add(add);
		
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new MakeSchedule();
				setVisible(false); // 창 안보이게 하기 
			}
		});
		
		//뒤로가기
		JButton back = new JButton();
		back.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		back.setBounds(12, 490, 106, 50);
		back.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\Backbt.jpg"));
		getContentPane().add(back);
		
		back.addActionListener(new ActionListener() {
			@Override
	        public void actionPerformed(ActionEvent e) {
				new Main();
		        setVisible(false); // 창 안보이게 하기 
			}
		});
		
		//콘서트 선택 버튼
		JButton lovesick = new JButton();
		lovesick.setBounds(268, 60, 154, 64);
		lovesick.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\lovesickbt.jpg"));
		getContentPane().add(lovesick);
		
		lovesick.addMouseListener(new MouseAdapter()  {
			@Override
			public void mousePressed(MouseEvent e) {
				int num = 1;
				table(num);;
		        setVisible(true); 
			}
		});
		
		JButton sweetmirage = new JButton();
		sweetmirage.setBounds(483, 60, 154, 64);
		sweetmirage.setIcon(new ImageIcon("E:\\\\java Project dev.ver\\\\Project\\\\Image Source\\\\sweetmiragebt.jpg"));
		getContentPane().add(sweetmirage);
		
		sweetmirage.addMouseListener(new MouseAdapter()  {
			@Override
			public void mousePressed(MouseEvent e) {
				int num = 2;
				table(num);
		        setVisible(true); 
			}
		});
		
	}//button
}
