package presentation.topmanagerui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import presentation.mainui.mainui;

public class topmanagerui extends JFrame{
	private String[] args;
	private JButton outjButton;
	private topmanagerJpanel topmanagerJpanel;
	private topmanagerOperationJpanel operationJpanel;
	private JButton b1,b2,b3,b4,b5;
	public topmanagerui(String s,String [] args) {
		// TODO Auto-generated constructor stub
		super(s);
		this.args=args;
		init();
		registListener(this);
	}
	private void init(){
		topmanagerJpanel=new topmanagerJpanel();
		operationJpanel=new topmanagerOperationJpanel(topmanagerJpanel);
		ImageIcon b1Icon=new ImageIcon("picture/工资管理.png");
		ImageIcon b2Icon=new ImageIcon("picture/机构管理.png");
		ImageIcon b3Icon=new ImageIcon("picture/审批单据.png");
		ImageIcon b4Icon=new ImageIcon("picture/统计分析.png");
		ImageIcon b5Icon=new ImageIcon("picture/常量修改.png");
		b1=new JButton(b1Icon); 
		b2=new JButton(b2Icon);
		b3=new JButton(b3Icon);
		b4=new JButton(b4Icon);
		b5=new JButton(b5Icon);
		b1.setContentAreaFilled(false);
		b2.setContentAreaFilled(false);
		b3.setContentAreaFilled(false);
		b4.setContentAreaFilled(false);
		b5.setContentAreaFilled(false);
		b1.setBounds(30, 100,200, 50);
		b2.setBounds(30, 200,200, 50);
		b3.setBounds(30, 300,200, 50);
		b4.setBounds(30, 400,200, 50);
		b5.setBounds(30, 500,200, 50);

		ImageIcon outIcon=new ImageIcon("picture/退出登录.png");
		outjButton=new JButton(outIcon);
		outjButton.setBounds(30, 620,  48,48);
		outjButton.setContentAreaFilled(false);
		 topmanagerJpanel.add(outjButton);
		topmanagerJpanel.add(b1);
		topmanagerJpanel.add(b2);
		topmanagerJpanel.add(b3);
		topmanagerJpanel.add(b4);
		topmanagerJpanel.add(b5);
		topmanagerJpanel.setLayout(null);
		this.add(topmanagerJpanel);
		this.setSize( 1024, 730);
		//居中
		Toolkit kitToolkit =Toolkit.getDefaultToolkit();
		Dimension screenSize=kitToolkit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int windowWidth=this.getWidth();
		int windowHeight=this.getHeight();
		this.setLocation((screenWidth-windowWidth)/2, (screenHeight-windowHeight)/2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//不允许窗口改变大小
		this.setResizable(false);
		this.setVisible(true);
	}
	private void registListener(final topmanagerui topmanagerui){
		outjButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new mainui().main(args);
				topmanagerui.dispose();
				
			}
		});
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new b1topmanagerui("总经理——工资管理", topmanagerui);
				topmanagerui.setVisible(false);
			}
		});
b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new b2topmanagerui("总经理——机构管理", topmanagerui);
				topmanagerui.setVisible(false);
			}
		});
b3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		new b3topmanagerui("总经理——审批单据", topmanagerui);
		topmanagerui.setVisible(false);
	}
});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new b4topmanagerui("总经理——统计分析", topmanagerui);
				topmanagerui.setVisible(false);
				
			}
		});
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new b5topmanagerui("总经理——修改常量", topmanagerui);
				topmanagerui.setVisible(false);
			
			}
		});
	}
}
class topmanagerJpanel extends JPanel{
	private ImageIcon backgroundIcon=new ImageIcon("picture/背景.png");
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(backgroundIcon.getImage(),0,0,null);
     }
   }
class topmanagerOperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	public topmanagerOperationJpanel(topmanagerJpanel topmanagerJpanel) {
		// TODO Auto-generated constructor stub
		init();
		topmanagerJpanel.add(this);
	}
	private void init(){
		this.setBounds(260, 30,730,650);
		this.setOpaque(false);
	}
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}