import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDetails extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		JTable table = new JTable();
		Object [] columns = {"Book ID","Book Name","Author","Edition","Publisher","Course","Branch"};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		table.setBackground(Color.lightGray);
		table.setForeground(Color.white);
		Font font = new Font ("",1,22);
		table.setFont(font);
		table.setRowHeight(10);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookDetails frame = new BookDetails();
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
	public BookDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 643);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
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
					String sql20 ="SELECT * FROM book WHERE Book_ID = '"+textField.getText()+"'";
					ResultSet rs = st.executeQuery(sql20);
					DefaultTableModel tm=(DefaultTableModel)table_1.getModel();
					tm.setRowCount(0);
					while(rs.next())
					{
						Object o[]= {rs.getString("Book_ID"),rs.getString("Name"),rs.getString("Edition"),rs.getString("Publisher"),rs.getString("Author"),rs.getString("Pages")};
						tm.addRow(o);
						JOptionPane.showMessageDialog(null, "The Book Is Found");
						
					}
				
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}				
				
				}
		});
		
		JLabel lblSearchByBook = new JLabel("Search By Book ID");
		lblSearchByBook.setFont(new Font("Arial", Font.BOLD, 14));
		lblSearchByBook.setBounds(126, 145, 158, 34);
		contentPane.add(lblSearchByBook);
		btnSearch.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setBackground(new Color(0, 102, 102));
		btnSearch.setBounds(502, 173, 89, 23);
		contentPane.add(btnSearch);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setFont(new Font("Arial", Font.PLAIN, 13));
		textField.setBounds(320, 152, 138, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAddNewBook = new JButton("Add New Book");
		btnAddNewBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewBook nb = new NewBook();
				nb.setVisible(true);
				BookDetails.this.setVisible(false);
			}
		});
		btnAddNewBook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAddNewBook.setForeground(Color.WHITE);
		btnAddNewBook.setBackground(new Color(0, 102, 102));
		btnAddNewBook.setFont(new Font("Arial", Font.BOLD, 14));
		btnAddNewBook.setBounds(625, 168, 138, 33);
		contentPane.add(btnAddNewBook);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(166, 250, 481, 239);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setBackground(SystemColor.inactiveCaptionBorder);
		scrollPane.setViewportView(table_1);
		table_1.setFont(new Font("Arial", Font.BOLD, 14));
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Book ID", "Book Name", "Publisher", "Edition", "Author", "Pages"
			}
		));
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.setVisible(true);
				BookDetails.this.setVisible(false);
			}
		});
		btnHome.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHome.setForeground(Color.WHITE);
		btnHome.setBackground(new Color(0, 102, 102));
		btnHome.setFont(new Font("Arial", Font.BOLD, 14));
		btnHome.setBounds(88, 520, 89, 33);
		contentPane.add(btnHome);
		
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Issue i = new Issue();
				i.setVisible(true);
				BookDetails.this.setVisible(false);
			}
		});
		btnIssueBook.setBackground(new Color(0, 102, 102));
		btnIssueBook.setForeground(Color.WHITE);
		btnIssueBook.setFont(new Font("Arial", Font.BOLD, 14));
		btnIssueBook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIssueBook.setBounds(235, 520, 124, 33);
		contentPane.add(btnIssueBook);
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Return r = new Return();
				r.setVisible(true);
				BookDetails.this.setVisible(false);
			}
		});
		btnReturnBook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReturnBook.setForeground(Color.WHITE);
		btnReturnBook.setBackground(new Color(0, 102, 102));
		btnReturnBook.setFont(new Font("Arial", Font.BOLD, 14));
		btnReturnBook.setBounds(414, 520, 124, 34);
		contentPane.add(btnReturnBook);
		
		JButton btnIssuedBookDetails = new JButton("Issued Book Details");
		btnIssuedBookDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBook ib = new IssueBook();
				ib.setVisible(true);
				BookDetails.this.setVisible(false);
			}
		});
		btnIssuedBookDetails.setFont(new Font("Arial", Font.BOLD, 14));
		btnIssuedBookDetails.setForeground(Color.WHITE);
		btnIssuedBookDetails.setBackground(new Color(0, 102, 102));
		btnIssuedBookDetails.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIssuedBookDetails.setBounds(574, 519, 189, 34);
		contentPane.add(btnIssuedBookDetails);
		
		JLabel lblBookDetail = new JLabel("Book Detail");
		lblBookDetail.setBackground(Color.LIGHT_GRAY);
		lblBookDetail.setForeground(new Color(0, 102, 102));
		lblBookDetail.setFont(new Font("Lucida Handwriting", Font.BOLD, 40));
		lblBookDetail.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookDetail.setVerticalAlignment(SwingConstants.TOP);
		lblBookDetail.setBounds(60, 46, 738, 547);
		contentPane.add(lblBookDetail);
		
		
	
	}
}
