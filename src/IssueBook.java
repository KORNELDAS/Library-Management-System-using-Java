import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Cursor;

public class IssueBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueBook frame = new IssueBook();
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
	public IssueBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 776);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBConnection db = new DBConnection();
				Connection con = db.getConnect();
				try {
					Statement st = con.createStatement();
					String sql20 ="SELECT * FROM issue WHERE Student_ID = '"+textField.getText()+"'";
					ResultSet rs = st.executeQuery(sql20);
					DefaultTableModel tm=(DefaultTableModel)table1.getModel();
					tm.setRowCount(0);
					while(rs.next())
					{
						Object o[]= {rs.getString("Student_ID"),rs.getString("Name"),rs.getString("Book_ID"),rs.getString("B_Name"),rs.getString("Edition"),rs.getString("Publisher"),rs.getString("I_Date")};
						tm.addRow(o);
						JOptionPane.showMessageDialog(null, "The Book Is Found");
					}
				}
			catch (SQLException e1) 
				{	
				e1.printStackTrace();
				}		
				}
			
		});
		btnSearch.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("Arial", Font.BOLD, 14));
		btnSearch.setBackground(new Color(0, 102, 102));
		btnSearch.setBounds(630, 192, 89, 23);
		contentPane.add(btnSearch);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Arial", Font.BOLD, 14));
		lblStudentId.setBounds(241, 189, 87, 28);
		contentPane.add(lblStudentId);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setFont(new Font("Arial", Font.PLAIN, 13));
		textField.setBounds(407, 190, 184, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(138, 324, 616, 191);
		contentPane.add(scrollPane);
		
		table1 = new JTable();
		table1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Student ID", "Student Name", "Book ID", "Book Name", "Publisher", "Edition", "Issue Date"
			}
		));
		table1.getColumnModel().getColumn(1).setResizable(false);
		scrollPane.setViewportView(table1);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
				IssueBook.this.setVisible(false);
			}
		});
		btnHome.setBackground(new Color(0, 102, 102));
		btnHome.setForeground(Color.WHITE);
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setFont(new Font("Arial", Font.BOLD, 14));
		btnHome.setBounds(106, 598, 89, 23);
		contentPane.add(btnHome);
		
		JButton btnBookDetail = new JButton("Book Detail");
		btnBookDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookDetails bd = new BookDetails();
				bd.setVisible(true);
				IssueBook.this.setVisible(false);
			}
		});
		btnBookDetail.setBackground(new Color(0, 102, 102));
		btnBookDetail.setForeground(Color.WHITE);
		btnBookDetail.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBookDetail.setFont(new Font("Arial", Font.BOLD, 14));
		btnBookDetail.setBounds(241, 598, 124, 23);
		contentPane.add(btnBookDetail);
		
		JButton btnNewbook = new JButton("New Book");
		btnNewbook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewBook nb = new NewBook();
				nb.setVisible(true);
				IssueBook.this.setVisible(false);
			}
		});
		btnNewbook.setBackground(new Color(0, 102, 102));
		btnNewbook.setForeground(Color.WHITE);
		btnNewbook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewbook.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewbook.setBounds(432, 598, 124, 23);
		contentPane.add(btnNewbook);
		
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.setBackground(new Color(0, 102, 102));
		btnIssueBook.setForeground(Color.WHITE);
		btnIssueBook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Issue i = new Issue();
				i.setVisible(true);
				IssueBook.this.setVisible(false);
			}
			
		});
		btnIssueBook.setFont(new Font("Arial", Font.BOLD, 14));
		btnIssueBook.setBounds(629, 598, 113, 23);
		contentPane.add(btnIssueBook);
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Return r = new Return();
				r.setVisible(true);
				IssueBook.this.setVisible(false);
			}
		});
		btnReturnBook.setBackground(new Color(0, 102, 102));
		btnReturnBook.setForeground(Color.WHITE);
		btnReturnBook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReturnBook.setFont(new Font("Arial", Font.BOLD, 14));
		btnReturnBook.setBounds(230, 651, 135, 23);
		contentPane.add(btnReturnBook);
		
		JButton btnStudentRegistration = new JButton("Student Registration");
		btnStudentRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student s = new Student();
				s.setVisible(true);
				IssueBook.this.setVisible(false);
			}
		});
		btnStudentRegistration.setBackground(new Color(0, 102, 102));
		btnStudentRegistration.setForeground(Color.WHITE);
		btnStudentRegistration.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnStudentRegistration.setFont(new Font("Arial", Font.BOLD, 14));
		btnStudentRegistration.setBounds(434, 651, 184, 23);
		contentPane.add(btnStudentRegistration);
		
		JLabel lblIssueBookDetails = new JLabel("Issue Book Details");
		lblIssueBookDetails.setBackground(Color.LIGHT_GRAY);
		lblIssueBookDetails.setVerticalAlignment(SwingConstants.TOP);
		lblIssueBookDetails.setForeground(new Color(0, 102, 102));
		lblIssueBookDetails.setHorizontalAlignment(SwingConstants.CENTER);
		lblIssueBookDetails.setFont(new Font("Lucida Handwriting", Font.BOLD, 40));
		lblIssueBookDetails.setBounds(59, 55, 725, 671);
		contentPane.add(lblIssueBookDetails);
	}

}
