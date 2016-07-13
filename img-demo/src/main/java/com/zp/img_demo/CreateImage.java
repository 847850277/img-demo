package com.zp.img_demo;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * 创建图像类
 * @author Administrator
 *
 */
public class CreateImage {
	public static void main(String[] args) {
		BufferedImage bi = new BufferedImage(200, 200, BufferedImage.TYPE_3BYTE_BGR);
		Graphics2D graphics2D =  (Graphics2D)bi.getGraphics();
	}
}
