package BlackJackWindow;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class BJWindow extends JFrame implements WindowListener{
	Button b1;
	JLabel img1;
	Image image;
	
	public BJWindow() {
		super("BlackJack");
		setBounds(100,100,1080,720);
		setVisible(true);
		setLayout(new FlowLayout());
		b1 = new Button("randomNumber;");
		add(b1);
		img1 = new JLabel("이미지레이블");
		add(img1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int CardNumber = (int)(Math.random()*52); //%13 = 12 == k
				GetImg(getCardImg(CardNumber));

			}
		});
		
		
		
		addWindowListener(this);
		
		
	}
	public void GetImg(String path) {
		path= "src\\img\\"+path+".png";
		//File imagePath = new File(path);
		BufferedImage imgbuf = null;
		try {
			imgbuf = ImageIO.read(new File(path));
			imgbuf.getScaledInstance(50,50,Image.SCALE_DEFAULT);
		} catch (Exception e) {
			e.printStackTrace();
		}
		img1.setIcon(new ImageIcon(imgbuf));
		img1.setText("");
		
	}
	
	public String getCardImg(int i) {
		int getNumber = (i%13)+1;
		int getMark = i/13;
		String CardName = null;
		if(getMark==0) {//스페이드
			CardName = "S_";
		}else if(getMark==1) { //다이아
			CardName = "D_";
		}else if(getMark==2) { //클로버
			CardName = "C_";
		}else if(getMark==3) { //하트
			CardName = "H_";
		}
		
		
		if(getNumber>=1 && getNumber<=9) {
			CardName = CardName+"0"+getNumber;
		}else if(getNumber >=10) {
			CardName = CardName+getNumber;	
		}
		return CardName;
		
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
