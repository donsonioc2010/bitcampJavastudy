package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ResultView extends JFrame implements ActionListener {

	
	public ResultView() {
		super("결과 값");
		MainView mainview = new MainView();
		
		setLayout(null);
		String a = mainview.FirstInteger.getText();
		String b = mainview.SecondInteger.getText();
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		
		JLabel label = new JLabel();
		
		
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("바탕", Font.BOLD, 48));
		label.setBounds(100, 0, 200, 50);				
		add(label);
		
		setSize(320, 240);
		setLocation(100, 0);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*String name = FirstInteger.getText();
		int age = Integer.parseInt(textField[1].getText());
		double height = Double.parseDouble(textField[2].getText());
		int win = Integer.parseInt(textField[3].getText());
		int lose = Integer.parseInt(textField[4].getText());
		double defence = Double.parseDouble(textField[5].getText());
		
		human = new Pitcher(0, name, age, height, win, lose, defence)	;		
		
		boolean b = ball.insert(human);
		
		JTextField();
		JLabel label = new JLabel();
		FirstInteger.setText(  );
		label.setFont(new Font("돋움", Font.BOLD, 18));
		label.setBounds(30, 50 + 40 * i, 100, 30);
		*/
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
