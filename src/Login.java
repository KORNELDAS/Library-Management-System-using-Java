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
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 482);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.BOLD, 14));
		lblUsername.setBounds(140, 130, 84, 27);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.BOLD, 14));
		lblPassword.setBounds(140, 180, 84, 27);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setBounds(280, 130, 145, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		textField_1.setBounds(280, 180, 145, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBConnection db = new DBConnection();
				Connection con = db.getConnect();
				try {
					Statement st = con.createStatement();
					String sql3 ="SELECT * FROM account WHERE Username = '"+textField.getText()+"'";
					ResultSet rs = st.executeQuery(sql3);
					if(rs.next())
					{
						//String sql2 = "INSERT INTO account(Username,Password) VALUES(?,?)";
						//PreparedStatement ps = con.prepareCall(sql2);
						//ps.setString(1, textField.getText());
						//ps.setString(2, textField_1.getText());
						//ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "You Are Logged In");
						Home h = new Home();
						h.setVisible(true);
						Login.this.setVisible(false);
					}
					else
					{
						
						JOptionPane.showMessageDialog(null, "You Have Not Any Account");
						SignUp su = new SignUp();
						su.setVisible(true);
						Login.this.setVisible(false);
						
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//JOptionPane.showMessageDialog(null, "You Have Not Any Acoount");
				
			}
		});
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Arial", Font.BOLD, 14));
		btnLogin.setBackground(new Color(0, 102, 102));
		btnLogin.setBounds(171, 269, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp su = new SignUp();
				su.setVisible(true);
				Login.this.setVisible(false);
			}
		});
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFont(new Font("Arial", Font.BOLD, 14));
		btnSignUp.setBackground(new Color(0, 102, 102));
		btnSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSignUp.setBounds(318, 270, 89, 23);
		contentPane.add(btnSignUp);
		
		JButton btnForgetPassword = new JButton("Forget Password");
		btnForgetPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Forgot f = new Forgot();
				f.setVisible(true);
				Login.this.setVisible(false);
			}
		});
		btnForgetPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnForgetPassword.setForeground(Color.WHITE);
		btnForgetPassword.setFont(new Font("Arial", Font.BOLD, 14));
		btnForgetPassword.setBackground(new Color(0, 102, 102));
		btnForgetPassword.setBounds(105, 364, 158, 23);
		contentPane.add(btnForgetPassword);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(new Color(0, 102, 102));
		lblLogin.setFont(new Font("Lucida Handwriting", Font.BOLD, 40));
		lblLogin.setVerticalAlignment(SwingConstants.TOP);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setBounds(49, 28, 477, 388);
		contentPane.add(lblLogin);
	}

}
