package com.sist.main;
import javax.swing.*;
import java.awt.*;
public class NewsMain extends JFrame{
	NewsForm nf=new NewsForm();
	public NewsMain()  // �ʱ�ȭ
	{
		add("Center",nf);
		setSize(1200,800);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewsMain();
	}

}
