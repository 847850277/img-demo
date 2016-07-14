#java的java.awt.image包详解
---
>java.awt.image包能做什么?
>提供创建和修改图像的各种类，摘自jdk的api。

重要的类:BufferedImage(生成图像的类)
>常用字段:

<table>
   <tr>
	  <td>类型</td>
      <td>字段</td>
      <td>属性含义</td>
   </tr>
   <tr>
	  <td>public static final int</td>
      <td>TYPE_3BYTE_BGR</td>
      <td>表示具有8位(位数越高图像分辨率越好，越占内存)的图像,RGB三原色表示图像。</td>  
   </tr>
	<tr>
	  <td>public static final int</td>
      <td>TYPE_4BYTE_ABGR</td>
      <td> 表示一个具有 8 位 RGBA 颜色分量的图像，具有用 3 字节存储的 Blue、Green 和 Red 颜色以及 1 字节的 alpha。</td>  
   </tr>
	<tr>
      <td>public static final int</td>
      <td>TYPE_4BYTE_ABGR_PRE</td>
      <td> 表示一个具有 8 位 RGBA 颜色分量的图像，具有用 3 字节存储的 Blue、Green 和 Red 颜色以及 1 字节的 alpha。</td>  
   </tr>
   <tr>
      <td>public static final int</td>
      <td>TYPE_BYTE_BINARY</td>
      <td>表示一个不透明的以字节打包的 1、2 或 4 位图像。</td>  
   </tr>
   <tr>
      <td>public static final int</td>
      <td>TYPE_BYTE_GRAY</td>
      <td>表示无符号 byte 灰度级图像（无索引）。</td>  
   </tr>
   <tr>
      <td>public static final int</td>
      <td>TYPE_BYTE_INDEXED</td>
      <td>表示带索引的字节图像。</td>  
   </tr>
   <tr>
      <td>public static final int</td>
      <td>TYPE_CUSTOM</td>
      <td>没有识别出图像类型，因此它必定是一个自定义图像。</td>  
   </tr>
   <tr>
      <td>public static final int</td>
      <td>TYPE_INT_ARGB</td>
      <td> 表示一个图像，它具有合成整数像素的 8 位 RGBA 颜色分量。</td>  
   </tr>
   <tr>
      <td>public static final int</td>
      <td>TYPE_INT_BGR</td>
      <td>表示一个具有 8 位 RGB 颜色分量的图像，对应于 Windows 或 Solaris 风格的 BGR 颜色模型，具有打包为整数像素的 Blue、Green 和 Red 三种颜色。</td>  
   </tr>
   <tr>
      <td>public static final int</td>
      <td>TYPE_INT_RGB</td>
      <td>表示一个图像，它具有合成整数像素的 8 位 RGB 颜色分量。</td>  
   </tr>
   <tr>
      <td>public static final int</td>
      <td>TYPE_USHORT_555_RGB</td>
      <td>表示一个具有 5-5-5 RGB 颜色分量（5 位 red、5 位 green、5 位 blue）的图像，不带 alpha。</td>  
   </tr>
   <tr>
      <td>public static final int</td>
      <td>TYPE_USHORT_565_RGB</td>
      <td>表示一个具有 5-6-5 RGB 颜色分量（5 位 red、6 位 green、5 位 blue）的图像，不带 alpha。</td>  
   </tr>
   <tr>
      <td>public static final int</td>
      <td>TYPE_USHORT_GRAY</td>
      <td>表示一个无符号 short 灰度级图像（无索引）。</td>  
   </tr>
</table>

>方法：

<table>
	<tr>
	  <td>返回值</td>
	  <td>方法</td>
      <td>解释</td>
	</tr>
	<tr>
	  <td>void</td>
	  <td>addTileObserver(TileObserver to)</td>
      <td>添加一个 tile observer。</td>
	</tr>
	<tr>
	  <td>void</td>
	  <td>coerceData(boolean isAlphaPremultiplied)</td>
      <td>强制该数据与 isAlphaPremultiplied 变量中指定的状态相匹配。</td>
	</tr>
	<tr>
	  <td>WritableRaster</td>
	  <td>copyData(WritableRaster outRaster)</td>
      <td>计算 BufferedImage 的一个任意矩形区域，并将其复制到指定的 WritableRaster。</td>
	</tr>
	<tr>
	  <td>Graphics2D</td>
	  <td>createGraphics()</td>
      <td>创建一个 Graphics2D，可以将它绘制到此 BufferedImage 中。</td>
	</tr>
	<tr>
	  <td>WritableRaster</td>
	  <td>getAlphaRaster()</td>
      <td>返回一个 WritableRaster，它使用支持单独空间 alpha 通道的 ColorModel 对象（比如 ComponentColorModel 和 DirectColorModel）表示 BufferedImage 对象的 alpha 通道。</td>
	</tr>
	<tr>
	  <td>ColorModel</td>
	  <td>getColorModel()</td>
      <td>返回 ColorModel。</td>
	</tr>
	<tr>
	  <td>Raster</td>
	  <td>getData()</td>
      <td>以一个大 tile 的形式返回图像。</td>
	</tr>
	<tr>
	  <td>Raster</td>
	  <td>getData(Rectangle rect)</td>
      <td>计算并返回 BufferedImage 的一个任意区域。</td>
	</tr>
	<tr>
	  <td>Graphics</td>
	  <td>getGraphics()</td>
      <td>此方法返回 Graphics2D，但此处是出于向后兼容性的考虑。</td>
	</tr>
	<tr>
	  <td>int</td>
	  <td>getHeight()</td>
      <td>返回 BufferedImage 的高度。</td>
	</tr>
	<tr>
	  <td>int</td>
	  <td>getHeight(ImageObserver observer)</td>
      <td>返回 BufferedImage 的高度。</td>
	</tr>
	<tr>
	  <td>int</td>
	  <td>getMinTileX()</td>
      <td>返回 x 方向的最小 tile 索引。</td>
	</tr>
	<tr>
	  <td>int</td>
	  <td>getMinTileY()</td>
      <td>返回 y 方向的最小 tile 索引。</td>
	</tr>
	<tr>
	  <td>int</td>
	  <td>getMinX()</td>
      <td>返回此 BufferedImage 的最小 x 坐标。</td>
	</tr>
	<tr>
	  <td>int</td>
	  <td>getMinY()</td>
      <td>返回此 BufferedImage 的最小 y 坐标。</td>
	</tr>
	<tr>
	  <td>int</td>
	  <td>getNumXTiles() </td>
      <td>返回 x 方向的 tile 数。</td>
	</tr>
	<tr>
	  <td>int</td>
	  <td>getNumYTiles()</td>
      <td>返回 y 方向的 tile 数。</td>
	</tr>
	<tr>
	  <td>Object</td>
	  <td>getProperty(String name)</td>
      <td> 按名称返回图像的属性。</td>
	</tr>
	<tr>
	  <td>Object</td>
	  <td>getProperty(String name, ImageObserver observer)</td>
      <td> 按名称返回图像的属性。</td>
	</tr>
	<tr>
	  <td>String[]</td>
	  <td>getPropertyNames()</td>
      <td>返回由 getProperty(String) 识别的名称数组；如果没有识别出属性名，则返回 null。</td>
	</tr>
	<tr>
	  <td>WritableRaster</td>
	  <td>getRaster() </td>
      <td>返回 WritableRaster。</td>
	</tr>
	<tr>
	  <td> int</td>
	  <td>getRGB(int x, int y) </td>
      <td>返回默认 RGB 颜色模型 (TYPE_INT_ARGB) 和默认 sRGB 颜色空间中的整数像素。</td>
	</tr>
	<tr>
		<td>int[]</td>
		<td>getRGB(int startX, int startY, int w, int h, int[] rgbArray, int offset, int scansize) </td>
		<td>从图像数据的某一部分返回默认 RGB 颜色模型 (TYPE_INT_ARGB) 和默认 sRGB 颜色空间中整数像素数组。</td>
	</tr>
	<tr>
		<td>SampleModel</td>
		<td>getSampleModel()</td>
		<td>返回与此 BufferedImage 关联的 SampleModel。</td>
	</tr>
	<tr>
		<td>ImageProducer</td>
		<td>getSource() </td>
		<td>返回生成该图像像素的对象。</td>
	</tr>
	<tr>
		<td> Vector<RenderedImage></td>
		<td>getSources()</td>
		<td>返回 RenderedImage 对象的 Vector，该对象是此 BufferedImage 图像数据的直接来源，而不是这些直接来源的来源。</td>
	</tr>
	<tr>
		<td>BufferedImage</td>
		<td>getSubimage(int x, int y, int w, int h) </td>
		<td>返回由指定矩形区域定义的子图像。</td>
	</tr>
	<tr>
		<td>Raster</td>
		<td>getTile(int tileX, int tileY)</td>
		<td>返回 tile (tileX, tileY)。</td>
	</tr>
	<tr>
		<td>int</td>
		<td>getTileGridXOffset()</td>
		<td>返回 tile 网格相对于原点的 x 偏移量（例如，tile (0, 0) 位置的 x 坐标）。</td>
	</tr>
	<tr>
		<td>int</td>
		<td>getTileGridYOffset()</td>
		<td>返回 tile 网格相对于原点的 y 偏移量（例如，tile (0, 0) 位置的 y 坐标）。</td>
	</tr>
	<tr>
		<td>int</td>
		<td>getTileHeight() </td>
		<td>返回 tile 高度（以像素为单位）。</td>
	</tr>
	<tr>
		<td>int</td>
		<td>getTileWidth()</td>
		<td>返回 tile 宽度（以像素为单位）。</td>
	</tr>
	<tr>
		<td>int</td>
		<td>getTransparency()</td>
		<td>返回透明度。</td>
	</tr>
	<tr>
		<td>int</td>
		<td>getType()</td>
		<td>返回图像类型。</td>
	</tr>
	<tr>
		<td>int</td>
		<td>getWidth()</td>
		<td>返回 BufferedImage 的宽度。</td>
	</tr>
	<tr>
		<td>int</td>
		<td>getWidth(ImageObserver observer)</td>
		<td>返回 BufferedImage 的宽度。</td>
	</tr>
	<tr>
		<td>WritableRaster</td>
		<td>getWritableTile(int tileX, int tileY)</td>
		<td>为写入签出一个 tile。</td>
	</tr>
	<tr>
		<td>Point[]</td>
		<td>getWritableTileIndices()</td>
		<td>返回 Point 对象的数组，它指示为写入签出了哪些 tile。</td>
	</tr>
	<tr>
		<td>boolean</td>
		<td>hasTileWriters() </td>
		<td>返回是否有为写入签出的 tile。</td>
	</tr>
	<tr>
		<td>boolean</td>
		<td>isAlphaPremultiplied()</td>
		<td>返回是否已预乘以 alpha。</td>
	</tr>
	<tr>
		<td>boolean</td>
		<td>isTileWritable(int tileX, int tileY</td>
		<td>返回当前是否为写入签出 tile。</td>
	</tr>
	<tr>
		<td>void</td>
		<td>releaseWritableTile(int tileX, int tileY)</td>
		<td>放弃写入一个 tile 的权限。</td>
	</tr>
    <tr>
		<td>void</td>
		<td>removeTileObserver(TileObserver to)</td>
		<td>移除一个 tile observer。</td>
	</tr>
    <tr>
		<td>void</td>
		<td>setData(Raster r)</td>
		<td>将图像的矩形区域设置为指定 Raster r 的内容，假定该区域与 BufferedImage 处于相同的坐标空间。</td>
	</tr>
    <tr>
		<td>void</td>
		<td>setRGB(int x, int y, int rgb)</td>
		<td>将此 BufferedImage 中的像素设置为指定的 RGB 值。</td>
	</tr>
    <tr>
		<td>void</td>
		<td>setRGB(int startX, int startY, int w, int h, int[] rgbArray, int offset, int scansize)</td>
		<td>将默认 RGB 颜色模型 (TYPE_INT_ARGB) 和默认 sRGB 颜色空间中的整数像素数组设置为图像数据的一部分。</td>
	</tr>
    <tr>
		<td>String</td>
		<td>toString()</td>
		<td> 返回此 BufferedImage 对象及其值的 String 表示形式。</td>
	</tr>
</table>



**最简单的生成图片的代码**
---
```

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
        
        File file = new File("H:/image.jpg");   
        BufferedImage bi = new BufferedImage(200, 200, BufferedImage.TYPE_INT_RGB);   
        Graphics2D g2 = (Graphics2D)bi.getGraphics();   
        ImageIO.write(bi, "jpg", file);
           
	}
}
```

**设置图片的背景色**

**API中Graphics2D的setBackground方法：**
>设置 Graphics2D 上下文的背景色。背景色用于清除区域。当为 Component 构建 Graphics2D 时，可以从 Component 继承背景色。设置 Graphics2D 上下文中的背景色仅影响后续 clearRect 调用，不影响该 Component 的背景色。要更改 Component 的背景，请使用该 Component 的相应方法。 

>参数：
>color - 在对 clearRect 的后续调用中所用的背景色

**Graphics类（Graphics2D父类）的clearRect方法:**
>通过使用当前绘图表面的背景色进行填充来清除指定的矩形。此操作不使用当前绘图模式。 
从 Java 1.1 开始，离屏图像的背景色可能与系统相关。应用程序应该使用 setColor，然后使用 fillRect，以确保离屏图像被清除为指定颜色。 


>参数：
x - 要清除矩形的 x 坐标。
y - 要清除矩形的 y 坐标。
width - 要清除矩形的宽度。
height - 要清除矩形的高度。

```

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


```

**在图片上面写入文字:**
>java的字体类，以便在 Graphics 对象和 Component 对象上呈现字形序列。

>设计字体显示效果 Font  font = new Font(String 字体，int 风格，int 字号);

>字体：TimesRoman, Courier, Arial等

>风格：三个常量 lFont.PLAIN, Font.BOLD, Font.ITALIC

>字号：字的大小（磅数）

>设置组件当前使用的字体：setFont(Font fn)

>获取组件当前使用的字体：getFont()

```

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
```


**创建png图片**

```

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


```

**创建gif图片:**


```

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

```


**创建背景透明的图片**
>Graphics类的drawRect方法:

>public void drawRect(int x,
                     int y,
                     int width,
                     int height)绘制指定矩形的边框。矩形的左边缘和右边缘分别位于 x 和 x + width。上边缘和下边缘分别位于 y 和 y + height。使用图形上下文的当前颜色绘制该矩形。 

>参数：
x - 要绘制矩形的 x 坐标。
y - 要绘制矩形的 y 坐标。
width - 要绘制矩形的宽度。
height - 要绘制矩形的高度。


```

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

```


**背景透明图片增加图片水印:**

>Image类:

>抽象类 Image 是表示图形图像的所有类的超类。必须以特定于平台的方式获取图像。 

>Graphics类的drawImage方法:

>public abstract boolean drawImage(Image img,
                                  int x,
                                  int y,ImageObserver observer)

>绘制指定图像中当前可用的图像。图像的左上角位于该图形上下文坐标空间的 (x, y)。图像中的透明像素不影响该处已存在的像素。 
此方法在任何情况下都立刻返回，甚至在图像尚未完整加载，并且还没有针对当前输出设备完成抖动和转换的情况下也是如此。 

>如果图像已经完整加载，并且其像素不再发生更改，则 drawImage 返回 true。否则，drawImage 返回 false，并且随着更多的图像可用或者到了绘制动画另一帧的时候，加载图像的进程将通知指定的图像观察者。 



>参数：
img - 要绘制的指定图像。如果 img 为 null，则此方法不执行任何操作。
x - x 坐标。
y - y 坐标。
observer - 转换了更多图像时要通知的对象。 
返回：
如果图像像素仍在更改，则返回 false；否则返回 true。


```

/**
 * 背景透明的图片增加水印
 * @param file2 水印图片
 * @throws Exception
 */

public static void createTransparentImg(File file2) throws  Exception{

	File file = new File("H:/image.png");
	File source_file = file2;
	Image src_img = ImageIO.read(source_file);//水印图片文件
	BufferedImage image = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
	Graphics2D g2 = image.createGraphics();
	// ---------- 增加下面的代码使得背景透明 -----------------
	image = g2.getDeviceConfiguration().createCompatibleImage(200, 200, Transparency.TRANSLUCENT);
	g2 = image.createGraphics();
	// ---------- 背景透明代码结束 -----------------
	g2.drawRect(0, 0, 0 , 0 );//设置背景为透明的时候得调用此方法

	g2.drawImage(src_img,50,50,100,100,null);//把水印图片增加到当天图片上
	ImageIO.write(image, "png", file);



}

```











