package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class MainView extends JFrame implements ActionListener {
	
	
	JTextField FirstInteger;
	JTextField SecondInteger;
	JButton button;
	int result;
	
	public MainView() {
		
	}
	
	public void window() {
		setLayout(null);		

		FirstInteger = new JTextField(20);
		FirstInteger.setBounds(240, 75, 150, 60);
		add(FirstInteger);
		
		SecondInteger = new JTextField(20);
		SecondInteger.setBounds(240, 150, 150, 60);
		add(SecondInteger);
		
		button = new JButton("Button");
		new JButton();
		button.addActionListener(this);
		button.setBounds(240, 250, 150, 60);
		add(button);
		setSize(640, 480);
		setLocation(100, 0);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new ResultView();
		this.dispose();
	}
}
