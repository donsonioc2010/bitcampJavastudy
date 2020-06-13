package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WindowTest extends JFrame {
	JTextField textField;
	JTextArea textArea;
	JButton btn1,btn2;
	
	
	
	
	public WindowTest() {
		super("텍스트필드");
		
		setBounds(0,0,640,480);
		JPanel panel = new JPanel();
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		
		JScrollPane scrPane= new JScrollPane(textArea);
		scrPane.setPreferredSize(new Dimension(400,300));
		
		panel.add(scrPane);
		
		textField = new JTextField(20);
	
		
		JPanel botpan = new JPanel();
		btn1 = new JButton("next Insert");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().trim().equals("")) {
					String msg = textField.getText()+"\n";
					textArea.append(msg);
					textField.setText("");
				}
			}
		});
		
		btn2 = new JButton("prev insert");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					textArea.insert(textField.getText()+"\n", 
							textArea.getLineStartOffset(0));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		botpan.add(textField);
		botpan.add(btn1);
		botpan.add(btn2);
		
		java.awt.Container contentPane = getContentPane();
		
		contentPane.add(panel,BorderLayout.CENTER);
		contentPane.add(botpan,BorderLayout.SOUTH);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
