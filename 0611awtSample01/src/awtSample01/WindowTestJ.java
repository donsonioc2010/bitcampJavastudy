package awtSample01;

import javax.swing.JFrame;

public class WindowTestJ extends JFrame{
	public WindowTestJ() {
		super("눕웡");
		setSize(800,600);
		setLocation(200,100);
		
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
