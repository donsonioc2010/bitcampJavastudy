package awtSample04;

import java.awt.*;
import java.awt.event.*;

public class WindowTest extends Frame implements WindowListener {
	public WindowTest() {
		super("panel");
		/*
		 	Panel : Frame(Window) 위에 Frame
		 */
		setLayout(new GridLayout(3,1));
		Label lbl1 = new Label("label");
		add(lbl1);
		
		//Panel
		Panel panel = new Panel();
		panel.setBackground(Color.blue);
		panel.setLayout(new GridLayout(1,3));
		add(panel);
		
		
		
		Button b1,b2,b3;
		
		b1 = new Button("1");
		b1.setBackground(Color.gray);
		b2 = new Button("2");
		b2.setBackground(Color.yellow);
		b3 = new Button("3");
		b3.setBackground(Color.red);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		add(new MyPanel());
		
		
		Dimension a = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0,0,a.width/4,a.height/2);
		
		
		
		setVisible(true);
		addWindowListener(this);
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

}
