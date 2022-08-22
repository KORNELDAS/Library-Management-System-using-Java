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
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 629);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.BOLD, 14));
		lblUsername.setBounds(157, 128, 141, 25);
		contentPane.add(lblUsername);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Arial", Font.BOLD, 14));
		lblName.setBounds(157, 182, 141, 25);
		contentPane.add(lblName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 14));
		lblPassword.setBounds(157, 236, 141, 25);
		contentPane.add(lblPassword);
		
		JLabel lblSecurityQuestion = new JLabel("Security Question");
		lblSecurityQuestion.setFont(new Font("Arial", Font.BOLD, 14));
		lblSecurityQuestion.setBounds(157, 284, 141, 25);
		contentPane.add(lblSecurityQuestion);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Arial", Font.BOLD, 14));
		lblAnswer.setBounds(157, 330, 141, 25);
		contentPane.add(lblAnswer);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number");
		lblMobileNumber.setFont(new Font("Arial", Font.BOLD, 14));
		lblMobileNumber.setBounds(157, 380, 141, 25);
		contentPane.add(lblMobileNumber);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setBounds(336, 129, 236, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		textField_1.setBounds(336, 183, 236, 25);
		contentPane.add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(SystemColor.inactiveCaptionBorder);
		passwordField.setBounds(336, 236, 236, 23);
		contentPane.add(passwordField);
		passwordField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "what is your nick name?", "What is your country?", "What is your favorite movie?", "What is your mother tongue?", "Which site you visit mostly"}));
		comboBox.setBackground(SystemColor.inactiveCaptionBorder);
		comboBox.setBounds(336, 287, 236, 20);
		contentPane.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.inactiveCaptionBorder);
		textField_2.setBounds(336, 333, 236, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.inactiveCaptionBorder);
		textField_3.setBounds(336, 383, 236, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBConnection db = new DBConnection();
				Connection con = db.getConnect();
				try {
					Statement st = con.createStatement();
					String sql ="SELECT * FROM account WHERE Username = '"+textField.getText()+"'";
					ResultSet rs = st.executeQuery(sql);
					if(rs.next())
					{
						JOptionPane.showConfirmDialog(null, "User Already Exist");
					}
					else
					{
						String sql1 = "INSERT INTO account(Username,Name,Password,Sec_Q,Answer,M_Number) VALUES(?,?,?,?,?,?)";
						PreparedStatement ps = con.prepareCall(sql1);
						ps.setString(1, textField.getText());
						ps.setString(2, textField_1.getText());
						ps.setString(3, passwordField.getText());
						ps.setString(4, comboBox.getSelectedItem().toString());
						ps.setString(5, textField_2.getText());
						ps.setString(6, textField_3.getText());
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "Your Data Inserted");
						Login l = new Login();
						l.setVisible(true);
						SignUp.this.setVisible(false);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//JOptionPane.showMessageDialog(null, "successful");
				
				
			}
		});
		btnSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFont(new Font("Arial", Font.BOLD, 14));
		btnSignUp.setBackground(new Color(0, 102, 102));
		btnSignUp.setBounds(227, 465, 103, 37);
		contentPane.add(btnSignUp);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.setVisible(true);
				SignUp.this.setVisible(false);
			}
		});
		btnCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Arial", Font.BOLD, 14));
		btnCancel.setBackground(new Color(0, 102, 102));
		btnCancel.setBounds(437, 465, 103, 37);
		contentPane.add(btnCancel);
		
		JLabel lblSignUp = new JLabel("Sign Up");
		lblSignUp.setFont(new Font("Lucida Handwriting", Font.BOLD, 40));
		lblSignUp.setForeground(new Color(0, 102, 102));
		lblSignUp.setVerticalAlignment(SwingConstants.TOP);
		lblSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignUp.setBounds(66, 24, 641, 528);
		contentPane.add(lblSignUp);
	}
}
