package Window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import dao.BaseBallDao;

public class WindowSelectMenu extends JFrame implements ActionListener {
	Label lbl1;
	JButton[] btn = new JButton[7];
	public WindowSelectMenu() {
		super("야구멤버 WorkFrame 1");
		lbl1 = new Label("BaseBall");
		setLayout(null);
		lbl1.setBackground(Color.yellow);
		lbl1.setBounds(100,30,200,50);
		lbl1.setFont(new Font("돋움",Font.BOLD,20));
		lbl1.setAlignment(Label.CENTER);
		add(lbl1);
		Panel menuPanel  = new Panel();
		
		
		menuPanel.setLayout(new GridLayout(7,1));
		String str[] = {"추가","삭제","검색","수정","전체출력","파일저장","종료"};
		for(int i = 0; i<str.length;i++) {
			btn[i] = new JButton(str[i]);
			menuPanel.add(btn[i]);
			btn[i].addActionListener(this);
		}
		menuPanel.setBounds(50,100,300,400);
		add(menuPanel);
		
		setVisible(true);
		setBounds(0,0,400,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	@Override	
	public void actionPerformed(ActionEvent e) {
		String str = (String)e.getActionCommand();
		BaseBallDao dao = BaseBallDao.getInstance(); 
		//데이터의 저장을 위한 인스턴스 받아오기
		
		switch (str) {
			case "추가":
				new WindowInformation(0);
				break;
			case "삭제":
				new WindowInformation(1);
				break;
			case "검색":
				new WindowInformation(2);
				break;
			case "수정":
				new WindowInformation(3);
				break;
			case "전체출력":
				new WindowInformation(4);
				break;
			case "파일저장":
				new WindowInformation(5);
				break;
			case "종료":
				System.exit(0);
				break;
		}
	}

}
