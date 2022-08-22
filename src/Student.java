import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Student extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
	private JTextField t5;
	private JTextField t4;
	private JTextField t3;
	private JTextField t6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
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
	public Student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1062, 851);
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
				Student.this.setVisible(false);
			}
		});
		JButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton5.setForeground(Color.WHITE);
		JButton5.setBackground(new Color(0, 102, 102));
		JButton5.setFont(new Font("Arial", Font.BOLD, 14));
		JButton5.setBounds(427, 766, 130, 24);
		contentPane.add(JButton5);
		
		JButton JButton3 = new JButton("Home");
		JButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
				Student.this.setVisible(false);
			}
		});
		JButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton3.setForeground(Color.WHITE);
		JButton3.setBackground(new Color(0, 102, 102));
		JButton3.setFont(new Font("Arial", Font.BOLD, 14));
		JButton3.setBounds(80, 767, 89, 23);
		contentPane.add(JButton3);
		
		JButton JButton6 = new JButton("Return Book");
		JButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Return r = new Return();
				r.setVisible(true);
				Student.this.setVisible(false);
			}
		});
		JButton6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton6.setForeground(Color.WHITE);
		JButton6.setFont(new Font("Arial", Font.BOLD, 14));
		JButton6.setBackground(new Color(0, 102, 102));
		JButton6.setBounds(627, 766, 130, 24);
		contentPane.add(JButton6);
		
		JButton JButton4 = new JButton("Book Details");
		JButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookDetails bd = new BookDetails();
				bd.setVisible(true);
				Student.this.setVisible(false);
			}
		});
		JButton4.setFont(new Font("Arial", Font.BOLD, 14));
		JButton4.setForeground(Color.WHITE);
		JButton4.setBackground(new Color(0, 102, 102));
		JButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton4.setBounds(231, 766, 130, 24);
		contentPane.add(JButton4);
		
		JButton JButton7 = new JButton("Issue Book Details");
		JButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBook ib = new IssueBook();
				ib.setVisible(true);
				Student.this.setVisible(false);
			}
		});
		JButton7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton7.setForeground(Color.WHITE);
		JButton7.setBackground(new Color(0, 102, 102));
		JButton7.setFont(new Font("Arial", Font.BOLD, 14));
		JButton7.setBounds(804, 767, 179, 23);
		contentPane.add(JButton7);
		
		t6 = new JTextField();
		t6.setBackground(SystemColor.inactiveCaptionBorder);
		t6.setBounds(529, 619, 173, 24);
		contentPane.add(t6);
		t6.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Arial", Font.BOLD, 18));
		lblAddress.setBounds(300, 477, 103, 20);
		contentPane.add(lblAddress);
		
		JLabel lblParentsName = new JLabel("Parents Name");
		lblParentsName.setFont(new Font("Arial", Font.BOLD, 18));
		lblParentsName.setBounds(300, 234, 130, 25);
		contentPane.add(lblParentsName);
		
		JLabel lblStudeentId = new JLabel("Student ID");
		lblStudeentId.setFont(new Font("Arial", Font.BOLD, 18));
		lblStudeentId.setBounds(300, 129, 162, 25);
		contentPane.add(lblStudeentId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Arial", Font.BOLD, 18));
		lblName.setBounds(300, 184, 85, 25);
		contentPane.add(lblName);
		
		JLabel lblNewLabel = new JLabel("Course");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(300, 285, 85, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setFont(new Font("Arial", Font.BOLD, 18));
		lblBranch.setBounds(300, 335, 89, 25);
		contentPane.add(lblBranch);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Arial", Font.BOLD, 18));
		lblYear.setBounds(300, 383, 85, 25);
		contentPane.add(lblYear);
		
		JLabel lblSemester = new JLabel("Semester");
		lblSemester.setFont(new Font("Arial", Font.BOLD, 18));
		lblSemester.setBounds(300, 428, 103, 25);
		contentPane.add(lblSemester);
		
		JLabel lblMobileNo = new JLabel("Mobile Number");
		lblMobileNo.setFont(new Font("Arial", Font.BOLD, 18));
		lblMobileNo.setBounds(300, 619, 141, 25);
		contentPane.add(lblMobileNo);
		
		t1 = new JTextField();
		t1.setBorder(null);
		t1.setBackground(SystemColor.inactiveCaptionBorder);
		t1.setFont(new Font("Arial", Font.PLAIN, 13));
		t1.setBounds(529, 129, 173, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBorder(null);
		t2.setBackground(SystemColor.inactiveCaptionBorder);
		t2.setFont(new Font("Arial", Font.BOLD, 13));
		t2.setBounds(529, 184, 173, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"---Select---", "B.Tech", "BBA", "BCA", "BE", "M.Tech", "MBA", "MCA"}));
		c1.setBorder(null);
		c1.setBackground(SystemColor.inactiveCaptionBorder);
		c1.setFont(new Font("Arial", Font.PLAIN, 13));
		c1.setBounds(529, 288, 173, 20);
		contentPane.add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"---Select---", "1", "2", "3", "4"}));
		c2.setBorder(null);
		c2.setBackground(SystemColor.inactiveCaptionBorder);
		c2.setFont(new Font("Arial", Font.PLAIN, 13));
		c2.setBounds(529, 386, 173, 20);
		contentPane.add(c2);
		
		JComboBox c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"---Select---", "1", "2", "3", "4", "5", "6", "7", "8"}));
		c3.setBorder(null);
		c3.setBackground(SystemColor.inactiveCaptionBorder);
		c3.setFont(new Font("Arial", Font.PLAIN, 13));
		c3.setBounds(529, 431, 173, 20);
		contentPane.add(c3);
		
		t5 = new JTextField();
		t5.setBorder(null);
		t5.setBackground(SystemColor.inactiveCaptionBorder);
		t5.setFont(new Font("Arial", Font.PLAIN, 13));
		t5.setBounds(529, 479, 173, 104);
		contentPane.add(t5);
		t5.setColumns(10);
		
		JButton JButton1 = new JButton("Register");
		JButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBConnection db = new DBConnection();
				Connection con = db.getConnect();
				try {
					Statement st = con.createStatement();
					String sql4 ="SELECT * FROM student WHERE Student_ID = '"+t1.getText()+"'";
					ResultSet rs = st.executeQuery(sql4);
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "The Student Is Already Exists");
						
					}
					else
					{
					
						String sql5 = "INSERT INTO student(Student_ID, Name, P_Name,Course, Branch, Year, Semester, Address, M_Number) VALUES(?,?,?,?,?,?,?,?,?)";
						PreparedStatement ps = con.prepareCall(sql5);
						ps.setString(1, t1.getText());
						ps.setString(2, t2.getText());
						ps.setString(3, t3.getText());
						ps.setString(4, c1.getSelectedItem().toString());
						ps.setString(5, t4.getText());
						ps.setString(6, c2.getSelectedItem().toString());
						ps.setString(7, c3.getSelectedItem().toString());
						ps.setString(8, t5.getText());
						ps.setString(9, t6.getText());
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "This Student Is Successfully Registered");
						Home h = new Home();
						h.setVisible(true);
						Student.this.setVisible(false);
						
						
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
		JButton1.setBounds(360, 697, 103, 34);
		contentPane.add(JButton1);
		
		JButton JButton2 = new JButton("Cancel");
		JButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
				Student.this.setVisible(false);
			}
		});
		JButton2.setBackground(new Color(0, 102, 102));
		JButton2.setForeground(Color.WHITE);
		JButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton2.setFont(new Font("Arial", Font.BOLD, 14));
		JButton2.setBounds(545, 697, 89, 34);
		contentPane.add(JButton2);
		
		t4 = new JTextField();
		t4.setBackground(SystemColor.inactiveCaptionBorder);
		t4.setBorder(null);
		t4.setFont(new Font("Arial", Font.PLAIN, 13));
		t4.setBounds(529, 339, 173, 20);
		contentPane.add(t4);
		t4.setColumns(10);
		
		t3 = new JTextField();
		t3.setBackground(SystemColor.inactiveCaptionBorder);
		t3.setBorder(null);
		t3.setFont(new Font("Arial", Font.PLAIN, 13));
		t3.setBounds(529, 234, 173, 20);
		contentPane.add(t3);
		t3.setColumns(10);
		
		JLabel lblNewStudent = new JLabel("New Student Registration");
		lblNewStudent.setForeground(new Color(0, 102, 102));
		lblNewStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewStudent.setFont(new Font("Lucida Handwriting", Font.BOLD, 40));
		lblNewStudent.setVerticalAlignment(SwingConstants.TOP);
		lblNewStudent.setBounds(10, 11, 1026, 790);
		contentPane.add(lblNewStudent);
	}
}
