package Window;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import dao.BaseBallDao;
import dto.Human;


public class WindowInformation extends Frame implements ItemListener,ActionListener{
	Panel panel;
	TextArea ta = new TextArea();
	CheckboxGroup cbg1;
	Checkbox pitbox,batbox; 
	TextField sename,name,age,height,a,b,c;
	Label selbl,namelbl,agelbl,heightlbl,albl,blbl,clbl;
	Button commit;
	int pos;
	
	
	public WindowInformation(int i) {
		super("Information BM");
		panel = new Panel();
		panel.setLayout(new FlowLayout());
		add(panel);
		
		switch (i) {
			case 0:
				insertBM();
				break;
			case 1:
				deleteBM();
				break;
			case 2:
				searchBM();
				break;
			case 3:
				updateBM();
				break;
			case 4:
				allPrintBM();
				break;
			case 5:
				saveFileBM();
				break;
		}
		panel.setBounds(100,100, 400,600);
		//panel.setBackground(Color.yellow);
		CheckboxGroup cb1 = new CheckboxGroup();
		
		setBounds(0,0,640,480);
		setVisible(true);
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void insertBM(){
		
		//cbg position ChoicBox
		cbg1 = new CheckboxGroup();
		
		pitbox = new Checkbox("투수",cbg1,true);
		batbox = new Checkbox("타자",cbg1,false);
		
		panel.add(pitbox);
		panel.add(batbox);
		
		//pitbox 선택시 레이아웃꾸미기
		pitbox.addItemListener(this);

		//batbox 선택시 레이아웃 꾸미기
		batbox.addItemListener(this);
		
		name = new TextField(20);
		age = new TextField(5);
		height = new TextField(10);
		a = new TextField(10);
		b = new TextField(10);
		c = new TextField(10);
		
		namelbl = new Label("이름 :");
		agelbl = new Label("나이 :");
		heightlbl = new Label("신장:");
		albl = new Label("승");
		blbl = new Label("패");
		clbl = new Label("방어율");
		commit = new Button("추가");
		
		commit.addActionListener(this);
		panel.add(namelbl);panel.add(name);
		panel.add(agelbl);panel.add(age);
		panel.add(heightlbl);panel.add(height);
		panel.add(albl);panel.add(a);
		panel.add(blbl);panel.add(b);
		panel.add(clbl);panel.add(c);
		panel.add(commit);

	}
	public void deleteBM() {
		name = new TextField(20);
		namelbl = new Label("삭제할 선수명 : ");
		commit = new Button("삭제");
		
		commit.addActionListener(this);
		
		panel.add(namelbl); panel.add(name);
		panel.add(commit); panel.add(ta);
	}
	public void searchBM() {
		name = new TextField(20);
		namelbl = new Label("검색할 선수명 : ");
		commit = new Button("찾기");
		
		commit.addActionListener(this);
		
		panel.add(namelbl); panel.add(name);
		panel.add(commit);	panel.add(ta);
		
	}
	public void updateBM() {
		commit = new Button("확인");
		
		commit.addActionListener(this);
		Button updatebtn = new Button("수정");
		updatebtn.addActionListener(this);
		name = new TextField(20);
		age = new TextField(5);
		height = new TextField(10);
		a = new TextField(10);
		b = new TextField(10);
		c = new TextField(10);
		
		namelbl = new Label("이름 :");
		agelbl = new Label("나이 :");
		heightlbl = new Label("신장:");
		albl = new Label("승");
		blbl = new Label("패");
		clbl = new Label("방어율");
		
		commit.addActionListener(this);
		selbl = new Label("수정할 선수명");
		sename = new TextField(20);
		name.setEnabled(false);
		age.setEnabled(false);
		height.setEnabled(false);
		updatebtn.setEnabled(false);
		
		panel.add(selbl); panel.add(sename);
		panel.add(commit);
		
		panel.add(namelbl);panel.add(name);
		panel.add(agelbl);panel.add(age);
		panel.add(heightlbl);panel.add(height);
		panel.add(albl);panel.add(a);
		panel.add(blbl);panel.add(b);
		panel.add(clbl);panel.add(c);
		
		panel.add(updatebtn);
	}
	public void allPrintBM() {
		panel.add(ta);
		BaseBallDao da = BaseBallDao.getInstance();
		for(int i = 0; i<da.HumanList.size();i++) {
			ta.append(da.HumanList.get(i).toString());
		}
	}
	//작업계쏙해야함
	public void saveFileBM() {
		panel.add(ta);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object obj = e.getSource();
		
		if(obj == pitbox) {
			Checkbox cb = (Checkbox)obj;
			if(cb.getState()==true) {
				albl.setText("승: ");
				blbl.setText("패: ");
				clbl.setText("방어율: ");
				pos=1;
			}
		}else if(obj == batbox) {
			Checkbox cb = (Checkbox)obj;
			if(cb.getState()==true) {
				albl.setText("타수: ");
				blbl.setText("안타수: ");
				clbl.setText("타율: ");
				pos = 2;
			}
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		BaseBallDao da = BaseBallDao.getInstance();
		
		String select = (String)e.getActionCommand();
		if(select.equals("추가")) {
			String daoName = name.getText();
			int daoAge = Integer.parseInt(age.getText());
			double daoHeight = Double.parseDouble(height.getText());
			int daoa = Integer.parseInt(a.getText());
			int daob = Integer.parseInt(b.getText());
			double daoc = Double.parseDouble(c.getText());
			
			da.insert(pos, daoName, daoAge, daoHeight, daoa, daob, daoc);
			
		}else if(select.equals("삭제")) {
			String daoName = name.getText();
			ta.append(da.delete(daoName));
		}else if(select.equals("찾기")) {
			String daoName = name.getText();
			ta.append(da.select(daoName));
		}else if(select.equals("확인")) {//update
			
		}else if(select.equals("수정")) {
			
		}
		
		
		
	}
	
	
}
