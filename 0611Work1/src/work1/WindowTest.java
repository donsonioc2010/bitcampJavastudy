package work1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

public class WindowTest extends Frame implements WindowListener,ActionListener{
	Label lbl1;
	public WindowTest() {

		lbl1 = new Label("0");
		Button b1 = new Button("+"), b2= new Button("-"),b3=new Button("Reset");
		Panel panel = new Panel();

		
		//640*480
		setLayout(new GridLayout(3,1));
		lbl1.setBackground(Color.yellow);
		add(lbl1);
		panel.add(b1);
		panel.add(b2);
		add(panel);
		add(b3);
		
		
		setBounds(100,100,640,480);
		setVisible(true);
		addWindowListener(this);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str = (String)e.getActionCommand();
		int a = Integer.parseInt(lbl1.getText());
		if(str.equals("+")) {
			a++;
			lbl1.setText(a+"");
		}else if(str.equals("-")) {
			
			if(a==0) {
				JOptionPane.showMessageDialog(null,"0이하는 내려갈수 없습니다");
			}else {
				a--;
				lbl1.setText(a+"");
			}
		}else if(str.equals("Reset")) {
			a = 0;
			lbl1.setText(a+"");
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
