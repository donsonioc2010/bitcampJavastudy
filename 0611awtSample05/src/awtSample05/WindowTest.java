package awtSample05;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements WindowListener,ActionListener {
	Label lbl1;
	Button b1,b2;
	public WindowTest() {
		setLayout(null);
		/*
		 	resource(자원) : button,label,textfield -> handle(번호/주소) instance값
		 	
		 */
		lbl1 = new Label("Label1");
		lbl1.setBounds(100,100,300,30);
		add(lbl1);
		
		b1 = new Button();
		b1.setLabel("Button One");
		b1.setBounds(100,160,150,30);
		
		add(b1);
		
		b2 = new Button("Button Two");
		b2.setBounds(300,160,150,30);
		add(b2);
		
		
		setSize(640,480);
		setLocation(0, 0);
		
		setVisible(true);
		
		addWindowListener(this);
		
		b1.addActionListener(this);//addActionListener가 어느클래스에 있는지 넘겨줘야함. 현재는 Test클래스에 있기에 this가 됨
		b2.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	//	JOptionPane.showMessageDialog(null, e.getActionCommand()+" Click");
		
		Button btn =(Button)e.getSource();
		String btnTitle = btn.getLabel();
		
		if(btnTitle.equals("Button One")) {
			JOptionPane.showMessageDialog(null, btnTitle +" Click");
			lbl1.setText(btnTitle +" Click");
		}else if(btnTitle.equals("Button Two")) {
			JOptionPane.showMessageDialog(null, btnTitle +" Click");
			lbl1.setText(btnTitle +" Click");
		}
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
		// TODO Auto-generated method stub
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
