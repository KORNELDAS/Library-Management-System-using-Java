import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Return extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JTextField t8;
	private JTextField t9;
	private JTextField t10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Return frame = new Return();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Return() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1151, 861);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton JButton5 = new JButton("Issue Book");
		JButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Issue i = new Issue();
				i.setVisible(true);
				Return.this.setVisible(false);
			}
		});
		JButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton5.setForeground(Color.WHITE);
		JButton5.setBackground(new Color(0, 102, 102));
		JButton5.setFont(new Font("Arial", Font.BOLD, 14));
		JButton5.setBounds(591, 770, 111, 25);
		contentPane.add(JButton5);
		
		JButton JButton3 = new JButton("Home");
		JButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
				Return.this.setVisible(false);
			}
		});
		JButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton3.setForeground(Color.WHITE);
		JButton3.setBackground(new Color(0, 102, 102));
		JButton3.setFont(new Font("Arial", Font.BOLD, 14));
		JButton3.setBounds(214, 770, 89, 25);
		contentPane.add(JButton3);
		
		JButton JButton4 = new JButton("Book Details");
		JButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookDetails bd = new BookDetails();
				bd.setVisible(true);
				Return.this.setVisible(false);
			}
		});
		JButton4.setForeground(Color.WHITE);
		JButton4.setBackground(new Color(0, 102, 102));
		JButton4.setFont(new Font("Arial", Font.BOLD, 14));
		JButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton4.setBounds(385, 770, 128, 25);
		contentPane.add(JButton4);
		
		JButton JButton6 = new JButton("Issue Book Details");
		JButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBook ib = new IssueBook();
				ib.setVisible(true);
				Return.this.setVisible(false);
			}
		});
		JButton6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton6.setForeground(Color.WHITE);
		JButton6.setBackground(new Color(0, 102, 102));
		JButton6.setFont(new Font("Arial", Font.BOLD, 14));
		JButton6.setBounds(763, 771, 163, 24);
		contentPane.add(JButton6);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Arial", Font.BOLD, 14));
		lblStudentId.setBounds(390, 112, 87, 24);
		contentPane.add(lblStudentId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Arial", Font.BOLD, 14));
		lblName.setBounds(390, 178, 87, 24);
		contentPane.add(lblName);
		
		t1 = new JTextField();
		t1.setBackground(SystemColor.inactiveCaptionBorder);
		t1.setBorder(null);
		t1.setFont(new Font("Arial", Font.PLAIN, 13));
		t1.setBounds(545, 115, 205, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(SystemColor.inactiveCaptionBorder);
		t2.setBorder(null);
		t2.setFont(new Font("Arial", Font.PLAIN, 13));
		t2.setBounds(545, 178, 205, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		JLabel lblBookId = new JLabel("Book ID");
		lblBookId.setFont(new Font("Arial", Font.BOLD, 14));
		lblBookId.setBounds(390, 237, 104, 24);
		contentPane.add(lblBookId);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblName_1.setBounds(390, 303, 104, 24);
		contentPane.add(lblName_1);
		
		JLabel lblNewLabel = new JLabel("Edition");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(390, 366, 104, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblPublisher = new JLabel("Publisher");
		lblPublisher.setFont(new Font("Arial", Font.BOLD, 14));
		lblPublisher.setBounds(390, 429, 104, 24);
		contentPane.add(lblPublisher);
		
		JLabel lblPrice = new JLabel("Author");
		lblPrice.setFont(new Font("Arial", Font.BOLD, 14));
		lblPrice.setBounds(390, 488, 104, 24);
		contentPane.add(lblPrice);
		
		JLabel lblPages = new JLabel("Pages");
		lblPages.setFont(new Font("Arial", Font.BOLD, 14));
		lblPages.setBounds(390, 548, 104, 24);
		contentPane.add(lblPages);
		
		JLabel lblDateOfIssue = new JLabel("Date Of Issue");
		lblDateOfIssue.setFont(new Font("Arial", Font.BOLD, 14));
		lblDateOfIssue.setBounds(390, 605, 104, 24);
		contentPane.add(lblDateOfIssue);
		
		t3 = new JTextField();
		t3.setBackground(SystemColor.inactiveCaptionBorder);
		t3.setBorder(null);
		t3.setFont(new Font("Arial", Font.PLAIN, 13));
		t3.setBounds(545, 241, 205, 20);
		contentPane.add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBackground(SystemColor.inactiveCaptionBorder);
		t4.setBorder(null);
		t4.setFont(new Font("Arial", Font.PLAIN, 13));
		t4.setBounds(545, 307, 205, 20);
		contentPane.add(t4);
		t4.setColumns(10);
		
		t5 = new JTextField();
		t5.setBackground(SystemColor.inactiveCaptionBorder);
		t5.setBorder(null);
		t5.setFont(new Font("Arial", Font.PLAIN, 13));
		t5.setBounds(545, 370, 205, 20);
		contentPane.add(t5);
		t5.setColumns(10);
		
		t6 = new JTextField();
		t6.setBackground(SystemColor.inactiveCaptionBorder);
		t6.setBorder(null);
		t6.setFont(new Font("Arial", Font.PLAIN, 13));
		t6.setBounds(545, 433, 205, 20);
		contentPane.add(t6);
		t6.setColumns(10);
		
		t7 = new JTextField();
		t7.setBackground(SystemColor.inactiveCaptionBorder);
		t7.setBorder(null);
		t7.setFont(new Font("Arial", Font.PLAIN, 13));
		t7.setBounds(545, 492, 205, 20);
		contentPane.add(t7);
		t7.setColumns(10);
		
		t8 = new JTextField();
		t8.setBackground(SystemColor.inactiveCaptionBorder);
		t8.setBorder(null);
		t8.setFont(new Font("Arial", Font.PLAIN, 13));
		t8.setBounds(545, 552, 205, 20);
		contentPane.add(t8);
		t8.setColumns(10);
		
		t9 = new JTextField();
		t9.setBackground(SystemColor.inactiveCaptionBorder);
		t9.setBorder(null);
		t9.setFont(new Font("Arial", Font.PLAIN, 13));
		t9.setBounds(545, 609, 205, 20);
		contentPane.add(t9);
		t9.setColumns(10);
		
		JLabel lblReturnDate = new JLabel("Return Date");
		lblReturnDate.setFont(new Font("Arial", Font.BOLD, 14));
		lblReturnDate.setBounds(390, 653, 89, 24);
		contentPane.add(lblReturnDate);
		
		t10 = new JTextField();
		t10.setFont(new Font("Arial", Font.PLAIN, 13));
		t10.setBackground(SystemColor.inactiveCaptionBorder);
		t10.setBorder(null);
		t10.setBounds(545, 656, 128, 20);
		contentPane.add(t10);
		t10.setColumns(10);
		
		JButton JButton1 = new JButton("Return");
		JButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBConnection db = new DBConnection();
				Connection con = db.getConnect();
				try {
					Statement st = con.createStatement();
					String sql15 ="SELECT * FROM returns WHERE Student_ID = '"+t1.getText()+"'";
					ResultSet rs = st.executeQuery(sql15);
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "The Book Is Not Returned");
					}
					else
					{
					
						String sql16 = "INSERT INTO returns(Student_ID, Name, Book_ID, B_Name, Edition, Publisher, Author, Pages, I_Date, R_Date) VALUES(?,?,?,?,?,?,?,?,?,?)";
						PreparedStatement ps = con.prepareCall(sql16);
						ps.setString(1, t1.getText());
						ps.setString(2, t2.getText());
						ps.setString(3, t3.getText());
						ps.setString(4, t4.getText());
						ps.setString(5, t5.getText());
						ps.setString(6, t6.getText());
						ps.setString(7, t7.getText());
						ps.setString(8, t8.getText());
						ps.setString(9, t9.getText());
						ps.setString(10, t10.getText());
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "The Book Returned Successfully");
						Home h = new Home();
						h.setVisible(true);
						Return.this.setVisible(false);
						
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		JButton1.setForeground(Color.WHITE);
		JButton1.setBackground(new Color(0, 102, 102));
		JButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton1.setFont(new Font("Arial", Font.BOLD, 14));
		JButton1.setBounds(415, 725, 89, 23);
		contentPane.add(JButton1);
		
		JButton JButton2 = new JButton("Cancel");
		JButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
				Return.this.setVisible(false);
			}
		});
		JButton2.setForeground(Color.WHITE);
		JButton2.setBackground(new Color(0, 102, 102));
		JButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton2.setFont(new Font("Arial", Font.BOLD, 14));
		JButton2.setBounds(584, 725, 89, 23);
		contentPane.add(JButton2);
		
		JLabel lblReturnPanel = new JLabel("Return Book");
		lblReturnPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblReturnPanel.setBackground(Color.CYAN);
		lblReturnPanel.setFont(new Font("Lucida Handwriting", Font.BOLD, 40));
		lblReturnPanel.setVerticalAlignment(SwingConstants.TOP);
		lblReturnPanel.setBounds(23, 28, 1087, 783);
		contentPane.add(lblReturnPanel);
	}
}
