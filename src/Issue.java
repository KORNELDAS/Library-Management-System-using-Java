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

public class Issue extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt6;
	private JTextField txt3;
	private JTextField t1;
	private JTextField t2;
	private JTextField txt5;
	private JTextField txt4;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Issue frame = new Issue();
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
	public Issue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1146, 836);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIssueBookDetails = new JButton("Issue Book Details");
		btnIssueBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBook ib = new IssueBook();
				ib.setVisible(true);
				Issue.this.setVisible(false);
			}
		});
		btnIssueBookDetails.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIssueBookDetails.setForeground(Color.WHITE);
		btnIssueBookDetails.setBackground(new Color(0, 102, 102));
		btnIssueBookDetails.setFont(new Font("Arial", Font.BOLD, 14));
		btnIssueBookDetails.setBounds(892, 725, 168, 29);
		contentPane.add(btnIssueBookDetails);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
				Issue.this.setVisible(false);
			}
		});
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setForeground(Color.WHITE);
		btnHome.setBackground(new Color(0, 102, 102));
		btnHome.setFont(new Font("Arial", Font.BOLD, 14));
		btnHome.setBounds(104, 725, 89, 29);
		contentPane.add(btnHome);
		
		JButton btnStudentRegistration = new JButton("Student Registration");
		btnStudentRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student s = new Student();
				s.setVisible(true);
				Issue.this.setVisible(false);
			}
		});
		btnStudentRegistration.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnStudentRegistration.setForeground(Color.WHITE);
		btnStudentRegistration.setBackground(new Color(0, 102, 102));
		btnStudentRegistration.setFont(new Font("Arial", Font.BOLD, 14));
		btnStudentRegistration.setBounds(248, 724, 198, 30);
		contentPane.add(btnStudentRegistration);
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Return r = new Return();
				r.setVisible(true);
				Issue.this.setVisible(false);
			}
		});
		btnReturnBook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReturnBook.setForeground(Color.WHITE);
		btnReturnBook.setBackground(new Color(0, 102, 102));
		btnReturnBook.setFont(new Font("Arial", Font.BOLD, 14));
		btnReturnBook.setBounds(690, 724, 131, 30);
		contentPane.add(btnReturnBook);
		
		JButton btnBookDetails = new JButton("Book Details");
		btnBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookDetails bd = new BookDetails();
				bd.setVisible(true);
				Issue.this.setVisible(false);
			}
		});
		btnBookDetails.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBookDetails.setForeground(Color.WHITE);
		btnBookDetails.setBackground(new Color(0, 102, 102));
		btnBookDetails.setFont(new Font("Arial", Font.BOLD, 14));
		btnBookDetails.setBounds(501, 725, 131, 29);
		contentPane.add(btnBookDetails);
		
		JLabel lblNewLabel = new JLabel("Book ID");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(401, 245, 88, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Arial", Font.BOLD, 14));
		lblName.setBounds(401, 298, 88, 29);
		contentPane.add(lblName);
		
		JLabel lblEdition = new JLabel("Edition");
		lblEdition.setFont(new Font("Arial", Font.BOLD, 14));
		lblEdition.setBounds(401, 350, 88, 29);
		contentPane.add(lblEdition);
		
		JLabel lblPublisher = new JLabel("Publisher");
		lblPublisher.setFont(new Font("Arial", Font.BOLD, 14));
		lblPublisher.setBounds(401, 402, 88, 29);
		contentPane.add(lblPublisher);
		
		JLabel lblPrice = new JLabel("Author");
		lblPrice.setFont(new Font("Arial", Font.BOLD, 14));
		lblPrice.setBounds(401, 452, 88, 29);
		contentPane.add(lblPrice);
		
		JLabel lblPages = new JLabel("Pages");
		lblPages.setFont(new Font("Arial", Font.BOLD, 14));
		lblPages.setBounds(401, 505, 88, 29);
		contentPane.add(lblPages);
		
		txt1 = new JTextField();
		txt1.setBackground(SystemColor.inactiveCaptionBorder);
		txt1.setBorder(null);
		txt1.setFont(new Font("Arial", Font.PLAIN, 13));
		txt1.setBounds(562, 250, 198, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBackground(SystemColor.inactiveCaptionBorder);
		txt2.setBorder(null);
		txt2.setFont(new Font("Arial", Font.PLAIN, 13));
		txt2.setBounds(562, 303, 198, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txt6 = new JTextField();
		txt6.setBackground(SystemColor.inactiveCaptionBorder);
		txt6.setBorder(null);
		txt6.setFont(new Font("Arial", Font.PLAIN, 13));
		txt6.setBounds(562, 355, 198, 20);
		contentPane.add(txt6);
		txt6.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBackground(SystemColor.inactiveCaptionBorder);
		txt3.setBorder(null);
		txt3.setFont(new Font("Arial", Font.PLAIN, 13));
		txt3.setBounds(562, 407, 198, 20);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Arial", Font.BOLD, 14));
		lblStudentId.setBounds(401, 135, 88, 22);
		contentPane.add(lblStudentId);
		
		JLabel lblName_1 = new JLabel("Name");
		lblName_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblName_1.setBounds(401, 195, 88, 22);
		contentPane.add(lblName_1);
		
		t1 = new JTextField();
		t1.setBackground(SystemColor.inactiveCaptionBorder);
		t1.setBorder(null);
		t1.setFont(new Font("Arial", Font.PLAIN, 13));
		t1.setBounds(562, 137, 202, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(SystemColor.inactiveCaptionBorder);
		t2.setBorder(null);
		t2.setFont(new Font("Arial", Font.PLAIN, 13));
		t2.setBounds(562, 197, 202, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		txt5 = new JTextField();
		txt5.setBackground(SystemColor.inactiveCaptionBorder);
		txt5.setBorder(null);
		txt5.setFont(new Font("Arial", Font.PLAIN, 13));
		txt5.setBounds(562, 510, 202, 20);
		contentPane.add(txt5);
		txt5.setColumns(10);
		
		txt4 = new JTextField();
		txt4.setBackground(SystemColor.inactiveCaptionBorder);
		txt4.setBorder(null);
		txt4.setFont(new Font("Arial", Font.PLAIN, 13));
		txt4.setBounds(562, 457, 202, 20);
		contentPane.add(txt4);
		txt4.setColumns(10);
		
		JLabel lblIssueDate = new JLabel("Issue Date");
		lblIssueDate.setFont(new Font("Arial", Font.BOLD, 14));
		lblIssueDate.setBounds(401, 560, 88, 29);
		contentPane.add(lblIssueDate);
		
		textField_13 = new JTextField();
		textField_13.setBorder(null);
		textField_13.setBackground(SystemColor.inactiveCaptionBorder);
		textField_13.setFont(new Font("Arial", Font.PLAIN, 13));
		textField_13.setBounds(562, 565, 141, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		JButton btnIssue = new JButton("Issue");
		btnIssue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBConnection db = new DBConnection();
				Connection con = db.getConnect();
				try {
					Statement st = con.createStatement();
					String sql10 ="SELECT * FROM issue WHERE Student_ID = '"+t1.getText()+"'";
					ResultSet rs = st.executeQuery(sql10);
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "The Book Is Already Issued");
					}
					else
					{
					
						String sql11 = "INSERT INTO issue(Student_ID, Name, Book_ID, B_Name, Edition, Publisher, Author, Pages, I_Date) VALUES(?,?,?,?,?,?,?,?,?)";
						PreparedStatement ps = con.prepareCall(sql11);
						ps.setString(1, t1.getText());
						ps.setString(2, t2.getText());
						ps.setString(3, txt1.getText());
						ps.setString(4, txt2.getText());
						ps.setString(5, txt6.getText());
						ps.setString(6, txt3.getText());
						ps.setString(7, txt4.getText());
						ps.setString(8, txt5.getText());
						ps.setString(9, textField_13.getText());
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "The Book Issued Successfully");
						Home h = new Home();
						h.setVisible(true);
						Issue.this.setVisible(false);
						
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		});
		btnIssue.setForeground(Color.WHITE);
		btnIssue.setBackground(new Color(0, 102, 102));
		btnIssue.setFont(new Font("Arial", Font.BOLD, 14));
		btnIssue.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIssue.setBounds(386, 652, 89, 29);
		contentPane.add(btnIssue);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
				Issue.this.setVisible(false);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(0, 102, 102));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(587, 652, 89, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblIssuePanel = new JLabel("Issue Book");
		lblIssuePanel.setForeground(new Color(0, 102, 102));
		lblIssuePanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblIssuePanel.setFont(new Font("Lucida Handwriting", Font.BOLD, 40));
		lblIssuePanel.setVerticalAlignment(SwingConstants.TOP);
		lblIssuePanel.setBounds(28, 11, 1060, 774);
		contentPane.add(lblIssuePanel);
	}
}
