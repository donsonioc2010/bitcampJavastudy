package awtSample04;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class MyPanel extends Panel{
	public MyPanel() {
		setLayout(new GridLayout(3,1));//3줄 한칸
		setBackground(Color.red);
		
		Label lbl1 = new Label("MyPanel Label1");
		lbl1.setBackground(Color.yellow);
		add(lbl1);
		Label lbl2 = new Label("MyPanel Label2");
		add(lbl2);
		Label lbl3 = new Label("MyPanel Label3");
		lbl3.setBackground(Color.blue);
		add(lbl3);
		
		
	}
}
