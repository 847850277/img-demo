package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

/**
 * 替换DataTable的jquery标签
 * @author Administrator
 *
 */
public class ConvertJquery {
	public static void main(String[] args) {
		String filePath = "F://Jquery-Plugin/DataTables-1.10.12/DataTables-1.10.12/examples/test.html";
		String jqueryPath = "../js/jquery-1.12.3.min.js";
		//testReplaceJquery(filePath, jqueryPath);
		iterFileFolder("F://Jquery-Plugin/DataTables-1.10.12");
		
		//cpFolder("F://Jquery-Plugin/DataTables-1.10.12","F://dataTable");
		//cpFolderAndConvertJquerySrc("F://Jquery-Plugin/DataTables-1.10.12","F://dataTable");
	}
	
	/**
	 * 单独文件测试替换jquery标签
	 */
	public static void testReplaceJquery(String filePath , String jqueryPath){
		String testPath = "F://Jquery-Plugin/DataTables-1.10.12/DataTables-1.10.12/examples/index.html";
		try {
			File file = new File(filePath);
			String oldJqueryPath = "//code.jquery.com/jquery-1.12.3.min.js";//原来的jqueryPath路径
			String temp ;
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			
			File testFile = new File(testPath);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(testFile)));
			
			while( (temp = reader.readLine()) != null){
				if(temp.contains(oldJqueryPath)){//包含标签
					temp = temp.replaceAll(oldJqueryPath, jqueryPath);//替换
					
				}
				writer.write(temp);//写
				writer.newLine();
			}
			reader.close();
			writer.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	/**
	 * 遍历文件夹下面的所有子文件
	 * @param FileName 文件夹或者文件名称
	 */
	private static int q = 0;
	public static void iterFileFolder(String fileName){
		
		File file = new File(fileName);
		if(file.isFile()){
			return;
		}
		File[] fileList = file.listFiles();
		//遍历
		for (int i = 0; i < fileList.length; i++) {
			File cFile = fileList[i];
			System.out.println((q++) +"文件夹名称：" + cFile );
			String fileAbsoulutePath  = cFile.getAbsolutePath();
			iterFileFolder(fileAbsoulutePath);
		}
	}
	
	
	/**
	 * 拷贝文件夹及文件夹所有文件
	 * @param fileName 文件夹或者文件名称
	 */
	public static void cpFolder(String fileName,String targetPath){
		File file = new File(fileName);
		if(file.isFile()){//是文件的时候就拷贝文件
			try {
				
				String temp ;
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

				File testFile = new File(targetPath);
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(testFile)));
				
				while( (temp = reader.readLine()) != null){
					writer.write(temp);//写
					writer.newLine();
				}
				reader.close();
				writer.close();
				
				return;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//是文件夹就生成文件夹
		File targetFileFolder = new File(targetPath);
		if(!targetFileFolder.exists()){
			targetFileFolder.mkdirs();
		}
		
		File[] fileList = file.listFiles();
		//遍历
		for (int i = 0; i < fileList.length; i++) {
			File cFile = fileList[i];
			System.out.println((q++) +"文件夹名称：" + cFile );
			String fileAbsoulutePath  = cFile.getAbsolutePath();
			String thisFileName  = cFile.getName();
			//
			String targetFilePath =  targetPath +File.separator+ thisFileName;
			cpFolder(fileAbsoulutePath,targetFilePath);
		}
	}
	
	/**
	 * 拷贝文件夹
	 * 替换掉每一个html文件的jquery引用地址
	 * @param fileName
	 * @param targetPath
	 */
	private static String oldJqueryPath = "//code.jquery.com/jquery-1.12.3.min.js";//原来的jqueryPath路径
	private static String newJqueryPath = "./DataTables-1.10.12/js/jquery-1.12.3.min.js";
	public static void cpFolderAndConvertJquerySrc(String fileName,String targetPath){
		File file = new File(fileName);
		if(file.isFile()){//是文件的时候就拷贝文件
			try {
				
				String temp ;
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

				File testFile = new File(targetPath);
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(testFile)));
				
				if(file.getName().endsWith(".html")){
					while( (temp = reader.readLine()) != null){
						if(temp.contains(oldJqueryPath)){//包含标签
							temp = temp.replaceAll(oldJqueryPath, newJqueryPath);//替换
							
						}
						writer.write(temp);//写
						writer.newLine();
					}
				}else{
					while( (temp = reader.readLine()) != null){
						writer.write(temp);//写
						writer.newLine();
					}
				}	
				
				reader.close();
				writer.close();
				
				return;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//是文件夹就生成文件夹
		File targetFileFolder = new File(targetPath);
		if(!targetFileFolder.exists()){
			targetFileFolder.mkdirs();
		}
		
		File[] fileList = file.listFiles();
		//遍历
		for (int i = 0; i < fileList.length; i++) {
			File cFile = fileList[i];
			System.out.println((q++) +"文件夹名称：" + cFile );
			String fileAbsoulutePath  = cFile.getAbsolutePath();
			String thisFileName  = cFile.getName();
			//
			String targetFilePath =  targetPath +File.separator+ thisFileName;
			cpFolderAndConvertJquerySrc(fileAbsoulutePath,targetFilePath);
		}
	}
	
	
	
}
