package Work2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;

public class WindowTest extends Frame implements WindowListener, ActionListener {
	int win,lose,draw;
	Button rock,cissor,paper;
	Label plbl,clbl,coma,resultlbl;
	Panel p1,p2,p3;
	public WindowTest() {
		win = lose = draw= 0;
		rock = new Button("Rock");
		cissor = new Button("Cissor");
		paper = new Button("Paper");

		p1 = new Panel();p2 = new Panel();p3= new Panel();
		p1.add(resultlbl = new Label("Win : "+win+"  Lose : "+lose+"  Draw : "+draw));
		
		
		p2.add(plbl = new Label("Choice"));
		p2.add(coma = new Label(" : "));
		p2.add(clbl = new Label("Choice"));
		
		p3.add(rock);p3.add(cissor);p3.add(paper);
		add(p3);
		setLayout(new GridLayout(3,1));
		add(p1);add(p2);
		setBounds(100, 100, 640, 480);
		setVisible(true);
		addWindowListener(this);
		p3.add(rock);p3.add(cissor);p3.add(paper);
		add(p3);
		rock.addActionListener(this);
		paper.addActionListener(this);
		cissor.addActionListener(this);

	}	
	public void game(String str) {
		int res = dice();
		String result;
		if(res==0) {
			result = "Rock";
		}else if(res==1) {
			result = "Cissor";
		}else if(res==2) {
			result = "Paper";
		}else {
			return;
		}
		getResult(result, str);
		resultlbl.setText("Win : "+win+"  Lose : "+lose+"  Draw : "+draw);
		return;
	}
	public int dice() {
		return (int)(Math.random()*3);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {

		int a = (int)(Math.random()*10);
		plbl.setText(a+"");
		
		game(e.getActionCommand());
		
		
	}
	public void getResult(String result,String player) {
		if(result.equals("Rock")) {//컴퓨터가 주먹일떄
			if(player.equals("Paper")) {//이긴경우
				win++;
			}else if(player.equals("Cissor")) {//진경우
				lose++;
			}else if(player.equals("Rock")){//비긴경우
				draw++;
			}
		}else if(result.equals("Cissor")) { //컴퓨터가 가위일때
			if(player.equals("Rock")) {	//이긴경우
				win++;
			}else if(player.equals("Paper")) {//짐
				lose++;
			}else if(player.equals("Cissor")){//비김
				draw++;
			}
		}else if(result.equals("Paper")){//컴퓨터가 보자기
			if(player.equals("Cissor")) {
				win++;
			}else if(player.equals("Rock")) {
				lose++;
			}else if(player.equals("Paper")){
				draw++;
			}
		}else {
			System.out.println("에러");
		}
		plbl.setText("P:\n"+player);
		clbl.setText("C:\n"+result);
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
