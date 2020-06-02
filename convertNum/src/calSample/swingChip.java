package calSample;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class swingChip extends JFrame {
	public swingChip(String str) {
		super(str);
		
		madeNumLabel();
		frameSetting();

		
	}
	public void madeNumLabel() {
		JButton btn1; JTextField inputNum;
		JLabel lb1;
		setLayout(new FlowLayout());
		lb1 = new JLabel("숫자를입력하세요:");
		inputNum = new JTextField(20);
		btn1 = new JButton("확인");
		add(lb1); add(inputNum);add(btn1);

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton btn1 = (JButton)e.getSource();
				int decNum;
				decNum = Integer.valueOf(inputNum.getText());
				settingLabel(decNum);
			}
		});
	}
	public void frameSetting() {

		setSize(400,400);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void settingLabel(int i) {
		JLabel binlb1,octlb1,hexlb1;
		JTextField bintf1,octtf2,hextf3;
		binlb1 = new JLabel("2진수 변환 값 : ");
		bintf1 = new JTextField(Integer.toBinaryString(i));
		octlb1 = new JLabel("8진수 변환 값 : ");
		octtf2 = new JTextField(Integer.toOctalString(i));
		hexlb1 = new JLabel("16진수 변환 값 : ");
		hextf3 = new JTextField(Integer.toHexString(i));
		
		
		
		add(binlb1);add(bintf1);add(octlb1);add(octtf2);add(hexlb1);add(hextf3);
	}
}
