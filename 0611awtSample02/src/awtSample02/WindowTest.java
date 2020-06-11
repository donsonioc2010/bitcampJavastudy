package awtSample02;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements WindowListener{
	public WindowTest() {
		super("Label");
		
		//setSize(640,480);
		//setLocation(0,0);
		setBounds(0, 0, 640, 480); //setLocation+setSize
		
		setVisible(true);
		addWindowListener(this);
		//Label이 한개만 뜨는이유는 Layout

		Label label = new Label();
		label.setText("Hungry");
		add(label);
		Label label1 = new Label("Label입니다");
		add(label1);
		
		//MessageBox
		
		JOptionPane.showMessageDialog(null, "WindowTest()실행");
	
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
