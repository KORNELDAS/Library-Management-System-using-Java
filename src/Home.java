import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1471, 688);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\KORNEL\\Downloads\\library-icon3.png"));
		label.setBounds(0, 0, 138, 152);
		contentPane.add(label);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setForeground(new Color(75, 0, 130));
		lblWelcome.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 60));
		lblWelcome.setBounds(148, 21, 341, 80);
		contentPane.add(lblWelcome);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setForeground(new Color(75, 0, 130));
		lblTo.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 30));
		lblTo.setBounds(515, 77, 42, 36);
		contentPane.add(lblTo);
		
		JLabel lblLibraryManagementSystem = new JLabel("Library Management System");
		lblLibraryManagementSystem.setForeground(new Color(0, 255, 255));
		lblLibraryManagementSystem.setFont(new Font("Arial", Font.BOLD, 46));
		lblLibraryManagementSystem.setBounds(577, 98, 636, 54);
		contentPane.add(lblLibraryManagementSystem);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\KORNEL\\Downloads\\Books-1-icon6.png"));
		label_2.setBounds(1206, 11, 236, 174);
		contentPane.add(label_2);
		
		JButton JButton1 = new JButton("Book Details");
		JButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookDetails db = new BookDetails();
				db.setVisible(true);
				Home.this.setVisible(false);
			}
		});
		JButton1.setForeground(Color.WHITE);
		JButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton1.setFont(new Font("Tahoma", Font.BOLD, 24));
		JButton1.setBackground(new Color(0, 102, 102));
		JButton1.setBounds(230, 325, 186, 36);
		contentPane.add(JButton1);
		
		JButton JButton2 = new JButton("Issue Book");
		JButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Issue i = new Issue();
				i.setVisible(true);
				Home.this.setVisible(false);
			}
		});
		JButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton2.setForeground(Color.WHITE);
		JButton2.setFont(new Font("Tahoma", Font.BOLD, 24));
		JButton2.setBackground(new Color(0, 102, 102));
		JButton2.setBounds(652, 325, 186, 36);
		contentPane.add(JButton2);
		
		JButton JButton3 = new JButton("Return Book");
		JButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Return r = new Return();
				r.setVisible(true);
				Home.this.setVisible(false);
			}
		});
		JButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton3.setFont(new Font("Tahoma", Font.BOLD, 24));
		JButton3.setBackground(new Color(0, 102, 102));
		JButton3.setForeground(Color.WHITE);
		JButton3.setBounds(1068, 325, 186, 36);
		contentPane.add(JButton3);
		
		JButton JBottun4 = new JButton("New Book");
		JBottun4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewBook nb = new NewBook();
				nb.setVisible(true);
				Home.this.setVisible(false);
			}
		});
		JBottun4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JBottun4.setBackground(new Color(0, 102, 102));
		JBottun4.setForeground(Color.WHITE);
		JBottun4.setFont(new Font("Tahoma", Font.BOLD, 24));
		JBottun4.setBounds(447, 434, 172, 36);
		contentPane.add(JBottun4);
		
		JButton JButton5 = new JButton("Add Student");
		JButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student s = new Student();
				s.setVisible(true);
				Home.this.setVisible(false);
			}
		});
		JButton5.setForeground(Color.WHITE);
		JButton5.setFont(new Font("Tahoma", Font.BOLD, 24));
		JButton5.setBackground(new Color(0, 102, 102));
		JButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton5.setBounds(859, 434, 193, 36);
		contentPane.add(JButton5);
		
		JButton JButton6 = new JButton("Issued Book Details");
		JButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBook ib = new IssueBook();
				ib.setVisible(true);
				Home.this.setVisible(false);
			}
		});
		JButton6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton6.setFont(new Font("Tahoma", Font.BOLD, 24));
		JButton6.setBackground(new Color(0, 102, 102));
		JButton6.setForeground(Color.WHITE);
		JButton6.setBounds(599, 526, 290, 36);
		contentPane.add(JButton6);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.setVisible(true);
				Home.this.setVisible(false);
			}
		});
		btnLogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogOut.setForeground(Color.WHITE);
		btnLogOut.setFont(new Font("Arial", Font.BOLD, 14));
		btnLogOut.setBackground(new Color(0, 102, 102));
		btnLogOut.setBounds(1308, 202, 89, 23);
		contentPane.add(btnLogOut);
	}
}
