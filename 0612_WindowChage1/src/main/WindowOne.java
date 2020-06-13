package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowOne extends Frame{
	public WindowOne() {
		Button btn = new Button("move Window");
		btn.setBounds(100,100,100,300);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.exit(0); 모든 프로세스를 다종료해야하므로 부분멈춤일떈 이걸 사용하면 안됨
				dispose();//현재 윈도우창만 닫힌다.
				new WindowTwo();
			}
		});
		add(btn);
		setLayout(new FlowLayout());
		setBounds(0,0,640,480);
		setVisible(true);
		setBackground(Color.red);
	}

}
