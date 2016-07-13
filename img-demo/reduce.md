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





##用代码生成图片的小例子
```



```


