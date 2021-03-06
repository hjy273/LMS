package presentation.icclerkui;

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

public class icclerkui extends JFrame{
	private String[] args;
	private JButton outjButton;
	private icclerkJpanel icclerkJpanel;
	private icclerkOperationJpanel operationJpanel;
	private JButton b1,b2,b3,b4,b5,b6;
	public icclerkui(String s,String [] args) {
		// TODO Auto-generated constructor stub
		super(s);
		this.args=args;
		init();
		registListener(this);
	}
	private void init(){
		icclerkJpanel=new icclerkJpanel();
		operationJpanel=new icclerkOperationJpanel(icclerkJpanel);
		ImageIcon putongkuaidiIcon=new ImageIcon("picture/普通快递.png");
		ImageIcon tekuaikuaidiIcon=new ImageIcon("picture/特快快递.png");
		ImageIcon zhongzhuanjieshoudanIcon=new ImageIcon("picture/中转接受单创建.png");
		ImageIcon loaddocumentIcon=new ImageIcon("picture/装车单创建1.png");
		ImageIcon jingjikuaidiIcon=new ImageIcon("picture/经济快递.png");
		ImageIcon danjufankuiIcon=new ImageIcon("picture/单据反馈.png");
	b1=new JButton(zhongzhuanjieshoudanIcon); 
	b2=new JButton(loaddocumentIcon);
	b3=new JButton(putongkuaidiIcon);
	b4=new JButton(tekuaikuaidiIcon);
	b5=new JButton(jingjikuaidiIcon);
	b6=new JButton(danjufankuiIcon);
	b1.setContentAreaFilled(false);
	b2.setContentAreaFilled(false);
	b3.setContentAreaFilled(false);
	b4.setContentAreaFilled(false);
	b5.setContentAreaFilled(false);
	b6.setContentAreaFilled(false);


	b1.setBounds(30, 50,200, 50);
	b2.setBounds(30, 150,200, 50);
	b3.setBounds(30, 250,200, 50);
	b4.setBounds(30, 350,200, 50);
	b5.setBounds(30, 450,200, 50);
	b6.setBounds(30, 550, 200, 50);
	ImageIcon outIcon=new ImageIcon("picture/退出登录.png");
	outjButton=new JButton(outIcon);
	outjButton.setBounds(30, 620,  48,48);
	outjButton.setContentAreaFilled(false);
	 icclerkJpanel.add(outjButton);
	icclerkJpanel.add(b1);
	icclerkJpanel.add(b2);
	icclerkJpanel.add(b3);
	icclerkJpanel.add(b4);
	icclerkJpanel.add(b5);
	icclerkJpanel.add(b6);

	icclerkJpanel.setLayout(null);

	this.add(icclerkJpanel);
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
	private void registListener(final icclerkui icclerkui){
		outjButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				new mainui().main(args);
				icclerkui.dispose();
			}
		});
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new documentreplyui("中转中心业务员——单据反馈",icclerkui);
				icclerkui.setVisible(false);
			}
		});
	}
}
class icclerkJpanel extends JPanel{
	private ImageIcon backgroundIcon=new ImageIcon("picture/背景.png");
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(backgroundIcon.getImage(),0,0,null);
     }
   }
class icclerkOperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	public icclerkOperationJpanel(icclerkJpanel icclerkJpanel) {
		// TODO Auto-generated constructor stub
		init();
		icclerkJpanel.add(this);
	}
	private void init(){
		this.setBounds(260, 30, 730,650);
		this.setOpaque(false);
	}
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}