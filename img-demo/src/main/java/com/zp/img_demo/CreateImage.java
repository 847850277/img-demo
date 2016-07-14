package com.zp.img_demo;

import java.awt.*;
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
		//setImgBackColor();
		//setFontImg();
		//createPngImg();
		//createGifImg();
		//createTransparentImg();
		//createTransparentImg("测试透明背景增加文字");
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

	/**
	 * 设置背景颜色
	 * @throws Exception
     */
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

	/**
	 * 设置文字
	 * @throws Exception
     */
	public static  void setFontImg() throws  Exception{

		File file = new File("H:/image.jpg");
		BufferedImage bi = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = (Graphics2D)bi.getGraphics();
		g2.setBackground(Color.BLACK);
		g2.clearRect(0,0,200,200);//设置背景颜色的时候调用此方法
		Font font = new Font("宋体", Font.PLAIN, 12);
		g2.setFont(font);
		g2.setColor(Color.red);//设置文字颜色，前景色
		g2.drawString("helloWorld",50,50);//写入文字的方法
		ImageIO.write(bi, "jpg", file);

	}


	/**
	 * 创建png图片
	 * @throws Exception
     */
	public static  void createPngImg() throws  Exception{

		File file = new File("H:/image.png");
		BufferedImage bi = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = (Graphics2D)bi.getGraphics();
		g2.setBackground(Color.MAGENTA);//背景色为紫色
		g2.clearRect(0,0,200,200);
		ImageIO.write(bi, "png", file);

	}


	/**
	 * 创建gif图片
	 * @throws Exception
     */

	public static void createGifImg() throws Exception{

		File file = new File("H:/image.gif");
		BufferedImage bi = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = (Graphics2D)bi.getGraphics();
		g2.setBackground(Color.MAGENTA);//背景色为紫色
		g2.clearRect(0,0,200,200);
		ImageIO.write(bi, "gif", file);


	}


	/**
	 * 创建背景透明图片，png和gif图片支持背景透明,而jpg不支持背景透明
	 */

	public static void createTransparentImg() throws Exception{

		File file = new File("H:/image.png");
		BufferedImage image = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = image.createGraphics();
		// ---------- 增加下面的代码使得背景透明 -----------------
		image = g2.getDeviceConfiguration().createCompatibleImage(200, 200, Transparency.TRANSLUCENT);
		g2 = image.createGraphics();
		// ---------- 背景透明代码结束 -----------------
		g2.drawRect(0, 0, 0 , 0 );//设置背景为透明的时候得调用此方法
		ImageIO.write(image, "png", file);


	}


	/**
	 * 透明背景增加文字
	 * @param text 文字
	 * @throws Exception
     */

	public static void createTransparentImg(String text) throws Exception{

		File file = new File("H:/image.png");
		BufferedImage image = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = image.createGraphics();
		// ---------- 增加下面的代码使得背景透明 -----------------
		image = g2.getDeviceConfiguration().createCompatibleImage(200, 200, Transparency.TRANSLUCENT);
		g2 = image.createGraphics();
		// ---------- 背景透明代码结束 -----------------
		Font font = new Font("宋体", Font.PLAIN, 12);
		g2.setFont(font);
		g2.setColor(Color.red);//设置文字颜色，前景色
		g2.drawRect(0, 0, 0 , 0 );//设置背景为透明的时候得调用此方法
		g2.drawString(text,50,50);
		ImageIO.write(image, "png", file);


	}

}
