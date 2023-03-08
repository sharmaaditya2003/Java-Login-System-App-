import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Welcomepage {
	
	JFrame frame= new JFrame();
	JLabel welcomelabel= new JLabel("WELCOME");
	
	Welcomepage(String userId){
		
		welcomelabel.setBounds(0,0,200,35);
		welcomelabel.setFont(new Font(null,Font.PLAIN,25));
		welcomelabel.setText("Hello "+userId);
		
		frame.add(welcomelabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
}
