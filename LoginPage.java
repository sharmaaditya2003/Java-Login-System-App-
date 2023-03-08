import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class LoginPage implements ActionListener {
	JFrame frame = new JFrame();
	JButton loginb= new JButton ("LOGIN");
	JButton resetb= new JButton ("RESET");
	JTextField UserId= new JTextField();
	JPasswordField userpasswordf= new JPasswordField();
	JLabel userIDlabel= new JLabel("userID: ");
	JLabel passwordlabel= new JLabel("pasasword: ");
	JLabel messageLabel = new JLabel();
	
	
	HashMap <String,String> logininfo= new HashMap<String,String>();
	LoginPage(HashMap <String,String> logininfooriginal){
		logininfo = logininfooriginal;
		
		userIDlabel.setBounds(50,100,75,25);
		passwordlabel.setBounds(50,150,75,25);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.ITALIC,25));
		
		UserId.setBounds(125,100,200,25);
		userpasswordf.setBounds(125,150,200,25);
		
		loginb.setBounds(125,200,100,25);
		loginb.setFocusable(false);
		loginb.addActionListener(this);
		
		resetb.setBounds(225,200,100,25);
		resetb.setFocusable(false);
		resetb.addActionListener(this);
		
		
		
		frame.add(userIDlabel);
		frame.add(passwordlabel);
		frame.add(messageLabel);
		frame.add(UserId);
		frame.add(userpasswordf);
		frame.add(loginb);
		frame.add(resetb);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==resetb){
				UserId.setText("");
				userpasswordf.setText("");
			}
			if(e.getSource()==loginb) {
				String userId= UserId.getText();
				String password = String.valueOf(userpasswordf.getPassword());
				
				if(logininfo.containsKey(userId)) {
					if(logininfo.get(userId).equals(password)) {
						messageLabel.setForeground(Color.green);
						messageLabel.setText("*Login Successful*");
						frame.dispose();
						Welcomepage welcome = new Welcomepage (userId);
						
					}
					else {
						messageLabel.setForeground(Color.red);
						messageLabel.setText("*Wrong Password*");

					}
				}
				
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("*Username not found*");
					
				}
			}
		}

}
