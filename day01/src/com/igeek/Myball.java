package com.igeek;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

/**
 * @author zx
 * @date 2019年7月1日
 * @version 1.0 @description： 模拟小球移动
 * 
 * 1. myball extends JFrame
 * 2. 重写paint方法
 * 3. 实现KeyListener 接口，重写抽象方法
 * 
 * java的事件委派处理机制
 * 
 */
public class Myball extends JFrame /*implements KeyListener*/ {
	
	/*
	 * 
	 */
	
	//成员属性
	int x = 40;
	int y = 40;
	int speed = 10;
	
	//构造函数
	public Myball() throws HeadlessException {
		super();
		setVisible(true);
		setSize(500, 500);
		setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//注册监听
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					y += speed;
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					y -= speed;
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					x -= speed;
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					x += speed;
				}
				//重新绘制
				repaint();
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	/**
	   * 方法的重写；方法的重载
	   * Graphics:画笔
	 */
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		//设置颜色
		g.setColor(Color.red);
		//画圆
		g.drawOval(x, y, 100, 100);
	}
	
//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void keyPressed(KeyEvent e) {
//		System.out.println(e.getKeyCode());
//
//		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
//			y += speed;
//		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
//			y -= speed;
//		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//			x -= speed;
//		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//			x += speed;
//		}
//		//重新绘制
//		repaint();
//
//	}
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//		// TODO Auto-generated method stub
//
//	}
	
	public static void main(String[] args) {
		Myball myball = new Myball();
		System.out.println(myball);
	}

}
