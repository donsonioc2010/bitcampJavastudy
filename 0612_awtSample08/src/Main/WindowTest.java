package Main;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class WindowTest extends JFrame{
	/*
	 	select option 
	 	swing ->JcomboBox
	 */
	Choice choice;
	JLabel label;
	public WindowTest() {
		setLayout(new FlowLayout());
		choice = new Choice();
		choice.add("사과");
		choice.add("바나나");
		choice.add("포도");
		choice.add("귤");
		choice.add("배");
		choice.add("오렌지");
		label = new JLabel();
		choice.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				label.setText(choice.getSelectedItem());
				
				
			}
		});
		add(choice);
		add(label);
		
		setBounds(0,0,640,480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
