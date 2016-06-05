package com.zp.img_demo;

/**
 * Created by Zhengpeng on 2016/6/5.
 */

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import sun.awt.image.JPEGImageDecoder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

/**
 * 水印工具类
 */
public class ImageUtils {

    public static void main(String[] args) {
       // pressImg("F:/mark_b.png","F:/aaa.jpg",5,5);
        pressText("水印小哥","F:/aaa.jpg",null,0,0,0,0,0);

    }

    /**
     * 图片水印
     * @param pressImg
     * @param targetImg
     * @param x
     * @param y
     */
    public static  void  pressImg(String pressImg,String targetImg,int x,int y){
        try {
            File file = new File(targetImg);
            Image src = ImageIO.read(file);
            int width = src.getWidth(null);
            int height = src.getHeight(null);
            BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);//rgb模式图片
            Graphics g  = image.getGraphics();
            g.drawImage(src,0,0,width,height,null);
            //水印文件
            File file_biao= new File(pressImg);
            Image image_biao = ImageIO.read(file_biao);
            int width_biao = image_biao.getWidth(null);
            int height_biao = image_biao.getHeight(null);
            g.drawImage(image_biao,(width-width_biao),height_biao,null);
            //水印文件结束
            g.dispose();
            FileOutputStream fout = new FileOutputStream(targetImg);
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(fout);
            encoder.encode(image);
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文字水印
     * @param pressText 水印内容
     * @param targetImg 源图片
     * @param fontName 字体名称
     * @param fontStyle 字体样式
     * @param color 字体颜色
     * @param fontSize 字体大小
     * @param x 位置
     * @param y 位置
     */
    public  static void pressText(String pressText,String targetImg,String fontName,int fontStyle,int color,int fontSize,int x,int y){
        try {
            File file = new File(targetImg);
            Image image = ImageIO.read(file);
            int width = image.getWidth(null);
            int height = image.getHeight(null);
            BufferedImage bufferedImage = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);//画布
            Graphics g = bufferedImage.getGraphics();//画笔
            g.drawImage(image,0,0,width,height,null);
            g.setColor(Color.red);
            g.setFont(new Font(fontName,fontStyle,fontSize));

            g.drawString(pressText,width-x,height-fontSize/2-y);//增加文字水印
            g.dispose();
            FileOutputStream out = new FileOutputStream(targetImg);
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
            encoder.encode(bufferedImage);
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
