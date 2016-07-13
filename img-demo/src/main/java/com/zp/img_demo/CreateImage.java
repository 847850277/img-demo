package com.zp.img_demo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
/**
 * 创建图像类
 * @author Administrator
 *
 */
public class CreateImage {
	public static void main(String[] args) throws Exception{
		//CreateImg();
		setImgBackColor();
		
	}
	
	/**
	 * 创建一个最简单的图片
	 * @throws Exception
	 */
	public static void  CreateImg() throws Exception{
		File file = new File("H:/image.jpg");   
        BufferedImage bi = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);   
        Graphics2D g2 = (Graphics2D)bi.getGraphics();   
        ImageIO.write(bi, "jpg", file);
	}
	
	public static void setImgBackColor() throws Exception{
		File file = new File("H:/image.jpg");   
        BufferedImage bi = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);   
        Graphics2D g2 = (Graphics2D)bi.getGraphics();
		//g2.setBackground(Color.BLUE);
		//g2.setBackground(Color.CYAN);
		g2.setBackground(Color.GREEN);
		//g2.setBackground(Color.red);
		g2.clearRect(0,0,200,200);//设置背景颜色的时候调用此方法
		ImageIO.write(bi, "jpg", file);
	}
	
}
