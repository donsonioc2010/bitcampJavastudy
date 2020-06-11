package awtSample03;

import java.awt.*;
import java.awt.event.*;

public class WindowTest extends Frame implements WindowListener{
	public WindowTest() {
		super("레이아웃을 Araboja");
		

		Dimension a =	Toolkit.getDefaultToolkit().getScreenSize();//모니터해상도따오기
		setBounds(0,0,a.width,a.height);
		//setLayout(new FlowLayout());
		//First Root LayOut Setting
		
		//setLayout(new GridLayout());
		//Second Root Layout Setting
		
		setLayout(null);
		//Third Root Layout Setting
		//한개한개 내가 위치를 잡아줘야함
		
		//Label
		Label lbl1 = new Label("label 1");
		lbl1.setBackground(new Color(255,0,0));
		lbl1.setBounds(150,30,50,30);
		
		//Label
		Label lbl2 = new Label("label 2" );
		lbl2.setBackground(Color.blue);
		lbl2.setBounds(150,80,50,30);//setBound(x,y,폭,높이)
		
		
		//Button
		Button b1 = new Button("Push");//String 들어감
		b1.setLabel("zzz");//버튼레이블변경
		b1.setBounds(130, 150,50, 30);
		add(lbl1);add(lbl2);add(b1);
		
		
		
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
