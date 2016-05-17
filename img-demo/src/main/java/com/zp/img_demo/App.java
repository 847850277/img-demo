package com.zp.img_demo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception{
    	//createImgWithWhiteBackground();
    	createImgWithTransparency();
    }
    
    
    /**
     * 创建一张背景为全白的图片
     */
    public static void createImgWithWhiteBackground() throws Exception{
    	int width = 100;   
        int height = 100;   
        File file = new File("H:/image.jpg");   
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);   
        Graphics2D g2 = (Graphics2D)bi.getGraphics();   
        g2.setBackground(Color.WHITE);//图片背景色
       //g2.setBackground(Color.BLACK);
        ImageIO.write(bi, "jpg", file);   
    }
    
    
    /**
     * 创建背景透明的图片
     */
    public static void createImgWithTransparency() throws Exception{
    	int width = 100;
    	int height = 100;
    	// 创建BufferedImage对象
    	BufferedImage image = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
    	// 获取Graphics2D
    	Graphics2D g2d = image.createGraphics();
    	// ----------   增加下面的代码使得背景透明   -----------------
    	image = g2d.getDeviceConfiguration().createCompatibleImage(width, height, Transparency.TRANSLUCENT);
    	g2d.dispose();
    	g2d = image.createGraphics();
    	// ----------   背景透明代码结束   -----------------


    	// 画图
    	g2d.setColor(new Color(255,0,0));
    	g2d.setStroke(new BasicStroke(1));
    	//g2d.draw(new Rectangle2D());
    	//释放对象
    	g2d.dispose();
    	// 保存文件    
    	ImageIO.write(image, "png", new File("H:/image.jpg"));
    }
    
    
    
    
}
