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
import javax.swing.JPasswordField;
import java.awt.SystemColor;
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

public class Forgot extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forgot frame = new Forgot();
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
	public Forgot() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 555);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.BOLD, 14));
		lblUsername.setBounds(133, 119, 147, 32);
		contentPane.add(lblUsername);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Arial", Font.BOLD, 14));
		lblName.setBounds(133, 172, 147, 32);
		contentPane.add(lblName);
		
		JLabel lblSecurityQuestion = new JLabel("Security Question");
		lblSecurityQuestion.setFont(new Font("Arial", Font.BOLD, 14));
		lblSecurityQuestion.setBounds(133, 219, 147, 32);
		contentPane.add(lblSecurityQuestion);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setFont(new Font("Arial", Font.BOLD, 14));
		lblAnswer.setBounds(133, 269, 147, 32);
		contentPane.add(lblAnswer);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewPassword.setBounds(133, 322, 147, 34);
		contentPane.add(lblNewPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Arial", Font.BOLD, 14));
		lblConfirmPassword.setBounds(133, 374, 147, 32);
		contentPane.add(lblConfirmPassword);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setBounds(320, 119, 180, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		textField_1.setBounds(320, 172, 180, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "what is your nick name?", "What is your country?", "What is your favorite movie?", "What is your mother tongue?", "Which site you visit mostly"}));
		comboBox.setBackground(SystemColor.inactiveCaptionBorder);
		comboBox.setBounds(320, 219, 180, 27);
		contentPane.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.inactiveCaptionBorder);
		textField_2.setBounds(320, 269, 180, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(SystemColor.inactiveCaptionBorder);
		passwordField.setBounds(320, 322, 180, 28);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBackground(SystemColor.inactiveCaptionBorder);
		passwordField_1.setBounds(320, 374, 180, 27);
		contentPane.add(passwordField_1);
		
		JButton btnChange = new JButton("Submit");
		btnChange.addActionListener(new ActionListener() {
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
						JOptionPane.showMessageDialog(null, "Your Data Is Changed Successfully");
						Login l = new Login();
						l.setVisible(true);
						Forgot.this.setVisible(false);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//JOptionPane.showMessageDialog(null, "successful");
				
				
			
				//Login l = new Login();
				//l.setVisible(true);
				//Forgot.this.setVisible(false);
			}
		});
		btnChange.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnChange.setForeground(Color.WHITE);
		btnChange.setFont(new Font("Arial", Font.BOLD, 14));
		btnChange.setBackground(new Color(0, 102, 102));
		btnChange.setBounds(183, 454, 89, 27);
		contentPane.add(btnChange);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.setVisible(true);
				Forgot.this.setVisible(false);
			}
		});
		btnCancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Arial", Font.BOLD, 14));
		btnCancel.setBackground(new Color(0, 102, 102));
		btnCancel.setBounds(344, 454, 89, 27);
		contentPane.add(btnCancel);
		
		JLabel lblForgotPassword = new JLabel("Forgot Password");
		lblForgotPassword.setForeground(new Color(0, 102, 102));
		lblForgotPassword.setFont(new Font("Lucida Handwriting", Font.BOLD, 40));
		lblForgotPassword.setVerticalAlignment(SwingConstants.TOP);
		lblForgotPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotPassword.setBounds(35, 11, 550, 494);
		contentPane.add(lblForgotPassword);
	}

}
