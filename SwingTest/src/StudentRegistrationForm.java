import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class StudentRegistrationForm extends JFrame implements ActionListener{
	
	
	
	JTextField userName;
	JPasswordField password;

	JButton submitBtn;
	JButton exitBtn;
	Container cnt;
	
	StudentRegistrationForm(){
		super("Student");
		initComponents();
	}
	
	void initComponents()
	{
		setResizable(false);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-400)/2, (screenSize.height-550)/2, 400 , 300);
        cnt= this.getContentPane();
        cnt.setLayout(null);
					
		JLabel lbill=new JLabel("Login Screen");
		lbill.setBounds(215,30,100,30);
	    lbill.setForeground(Color.red);
	    cnt.setBackground(Color.DARK_GRAY);
	    cnt.add(lbill);
		
		JLabel lname=new JLabel("Enter User Name");
		lname.setBounds(35,100,120,20);
		lname.setForeground(Color.white);
		cnt.add(lname);
		
		userName=new JTextField(10);
		userName.setText("admin");
		userName.setBounds(160,100,100,20);
		cnt.add(userName);
		
		JLabel passwordLbl=new JLabel("Enter Password");
		passwordLbl.setBounds(35,130,100,20);
		passwordLbl.setForeground(Color.white);
		cnt.add(passwordLbl);
		
		password=new JPasswordField();
		password.setBounds(160,130,100,20);
		password.setEchoChar('*');
		cnt.add(password);
		
		
		exitBtn=new JButton("Exit");
		exitBtn.setBounds(50,190,80,30);
		exitBtn.addActionListener(this);
		cnt.add(exitBtn);
		
		submitBtn=new JButton("Login");
		submitBtn.setBounds(140,190,80,30);
		submitBtn.addActionListener(this);
		cnt.add(submitBtn);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(submitBtn))
		{
			String uName=userName.getText();
			String pass=password.getText();
			boolean msg=new StudentService().saveUser(uName, pass);
			
			if(msg)
			{
				
					new MainMenu().show();
					this.dispose();
			}
			else{
				JOptionPane.showMessageDialog(new JFrame(), "Invalid Username and Password", "Dialog",
				        JOptionPane.ERROR_MESSAGE);
			
			}
			
		}
			
		
		if(e.getSource().equals(exitBtn))
			this.dispose();
		
	}
}
