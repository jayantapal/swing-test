import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MainMenu extends JFrame implements ActionListener {
	
//Add 1
	

	JButton addStudent;
	JButton viewStudent;
	JButton exitBtn;
	Container cnt;
	
	MainMenu(){
		initComponents();
	}
	
	void initComponents()
	{
		setResizable(false);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-400)/2, (screenSize.height-550)/2, 400 , 300);
        cnt= this.getContentPane();
        cnt.setLayout(null);
					
		JLabel lbill=new JLabel("Main Menu");
		lbill.setBounds(215,30,100,30);
	    lbill.setForeground(Color.red);
	    cnt.setBackground(Color.DARK_GRAY);
	    cnt.add(lbill);
		
		
	    addStudent=new JButton("Add Student");
	    addStudent.setBounds(50,60,120,30);
	    addStudent.addActionListener(this);
		cnt.add(addStudent);
		
		viewStudent=new JButton("View Student");
		viewStudent.setBounds(50,90,120,30);
		viewStudent.addActionListener(this);
		cnt.add(viewStudent);
		
		exitBtn=new JButton("Exit");
		exitBtn.setBounds(50,120,120,30);
		exitBtn.addActionListener(this);
		cnt.add(exitBtn);
		
		
	}

	
	
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
	}

}
