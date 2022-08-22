import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Cursor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class NewBook extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField txt5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewBook frame = new NewBook();
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
	public NewBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1205, 656);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton JButton6 = new JButton("Issue Book Details");
		JButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBook ib = new IssueBook();
				ib.setVisible(true);
				NewBook.this.setVisible(false);
			}
		});
		
		JComboBox c6 = new JComboBox();
		c6.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		c6.setBackground(SystemColor.inactiveCaptionBorder);
		c6.setBounds(559, 228, 167, 29);
		contentPane.add(c6);
		JButton6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton6.setForeground(Color.WHITE);
		JButton6.setBackground(new Color(0, 102, 102));
		JButton6.setFont(new Font("Arial", Font.BOLD, 14));
		JButton6.setBounds(689, 545, 177, 29);
		contentPane.add(JButton6);
		
		JButton JButton7 = new JButton("Book Details");
		JButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookDetails bd = new BookDetails();
				bd.setVisible(true);
				NewBook.this.setVisible(false);
			}
		});
		JButton7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton7.setForeground(Color.WHITE);
		JButton7.setBackground(new Color(0, 102, 102));
		JButton7.setFont(new Font("Arial", Font.BOLD, 14));
		JButton7.setBounds(924, 545, 122, 29);
		contentPane.add(JButton7);
		
		JButton JButton4 = new JButton("Issue Book");
		JButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Issue i = new Issue();
				i.setVisible(true);
				NewBook.this.setVisible(false);
			}
		});
		JButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton4.setForeground(Color.WHITE);
		JButton4.setBackground(new Color(0, 102, 102));
		JButton4.setFont(new Font("Arial", Font.BOLD, 14));
		JButton4.setBounds(298, 545, 122, 29);
		contentPane.add(JButton4);
		
		JButton JButton5 = new JButton("Return Book");
		JButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Return r = new Return();
				r.setVisible(true);
				NewBook.this.setVisible(false);
			}
		});
		JButton5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton5.setForeground(Color.WHITE);
		JButton5.setBackground(new Color(0, 102, 102));
		JButton5.setFont(new Font("Arial", Font.BOLD, 14));
		JButton5.setBounds(493, 545, 135, 29);
		contentPane.add(JButton5);
		
		JButton JButton3 = new JButton("Home");
		JButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
				NewBook.this.setVisible(false);
			}
		});
		JButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton3.setForeground(Color.WHITE);
		JButton3.setBackground(new Color(0, 102, 102));
		JButton3.setFont(new Font("Arial", Font.BOLD, 14));
		JButton3.setBounds(137, 545, 89, 29);
		contentPane.add(JButton3);
		
		JLabel lblNewLabel = new JLabel("Book ID");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(401, 125, 78, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Arial", Font.BOLD, 18));
		lblName.setBounds(401, 180, 78, 29);
		contentPane.add(lblName);
		
		JLabel lblNewLabel_1 = new JLabel("Edition");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(401, 228, 78, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPublishir = new JLabel("Publisher");
		lblPublishir.setFont(new Font("Arial", Font.BOLD, 18));
		lblPublishir.setBounds(401, 277, 103, 29);
		contentPane.add(lblPublishir);
		
		JLabel lblPrice = new JLabel("Author");
		lblPrice.setFont(new Font("Arial", Font.BOLD, 18));
		lblPrice.setBounds(401, 326, 63, 29);
		contentPane.add(lblPrice);
		
		JLabel lblPages = new JLabel("Pages");
		lblPages.setFont(new Font("Arial", Font.BOLD, 18));
		lblPages.setBounds(401, 377, 78, 29);
		contentPane.add(lblPages);
		
		txt1 = new JTextField();
		txt1.setBorder(null);
		txt1.setBackground(SystemColor.inactiveCaptionBorder);
		txt1.setFont(new Font("Arial", Font.PLAIN, 13));
		txt1.setBounds(559, 125, 167, 29);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBorder(null);
		txt2.setBackground(SystemColor.inactiveCaptionBorder);
		txt2.setFont(new Font("Arial", Font.PLAIN, 13));
		txt2.setBounds(559, 181, 167, 29);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txt3 = new JTextField();
		txt3.setBorder(null);
		txt3.setBackground(SystemColor.inactiveCaptionBorder);
		txt3.setFont(new Font("Arial", Font.PLAIN, 13));
		txt3.setBounds(559, 278, 167, 29);
		contentPane.add(txt3);
		txt3.setColumns(10);
		
		txt4 = new JTextField();
		txt4.setBorder(null);
		txt4.setBackground(SystemColor.inactiveCaptionBorder);
		txt4.setFont(new Font("Arial", Font.PLAIN, 13));
		txt4.setBounds(559, 327, 167, 29);
		contentPane.add(txt4);
		txt4.setColumns(10);
		
		txt5 = new JTextField();
		txt5.setBorder(null);
		txt5.setBackground(SystemColor.inactiveCaptionBorder);
		txt5.setFont(new Font("Arial", Font.PLAIN, 13));
		txt5.setBounds(559, 378, 167, 29);
		contentPane.add(txt5);
		txt5.setColumns(10);
		
		JButton JButton1 = new JButton("Add");
		JButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBConnection db = new DBConnection();
				Connection con = db.getConnect();
				try {
					Statement st = con.createStatement();
					String sql4 ="SELECT * FROM book WHERE Book_ID = '"+txt1.getText()+"'";
					ResultSet rs = st.executeQuery(sql4);
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null, "The Book Is Already Added");
						
					}
					else
					{
					
						String sql5 = "INSERT INTO book(Book_ID, Name, Edition, Publisher, Author, Pages) VALUES(?,?,?,?,?,?)";
						PreparedStatement ps = con.prepareCall(sql5);
						ps.setString(1, txt1.getText());
						ps.setString(2, txt2.getText());
						ps.setString(3, c6.getSelectedItem().toString());
						ps.setString(4, txt3.getText());
						ps.setString(5, txt4.getText());
						ps.setString(6, txt5.getText());
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "This Book Is Successfully Added");
						Home h = new Home();
						h.setVisible(true);
						NewBook.this.setVisible(false);
						
						
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
		JButton1.setBorder(null);
		JButton1.setFont(new Font("Arial", Font.BOLD, 14));
		JButton1.setBounds(434, 464, 89, 31);
		contentPane.add(JButton1);
		
		JButton JButton2 = new JButton("Cancel");
		JButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
				NewBook.this.setVisible(false);
			}
		});
		JButton2.setForeground(Color.WHITE);
		JButton2.setBackground(new Color(0, 102, 102));
		JButton2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		JButton2.setBorder(null);
		JButton2.setFont(new Font("Arial", Font.BOLD, 14));
		JButton2.setBounds(592, 465, 89, 30);
		contentPane.add(JButton2);
		
		JLabel lblNewBook = new JLabel("Add New Book");
		lblNewBook.setForeground(new Color(0, 102, 102));
		lblNewBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewBook.setFont(new Font("Lucida Handwriting", Font.BOLD, 40));
		lblNewBook.setVerticalAlignment(SwingConstants.TOP);
		lblNewBook.setBounds(53, 23, 1034, 580);
		contentPane.add(lblNewBook);
	}
}
