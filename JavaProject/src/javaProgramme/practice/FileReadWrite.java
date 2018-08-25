package javaProgramme.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {
	
	FileInputStream fis;
	FileOutputStream fos;
	BufferedInputStream bis;
	BufferedOutputStream bos;
	
	public FileReadWrite(String fileName) {
		
		try {
			fis =new FileInputStream(System.getProperty("user.dir")+"\\"+fileName);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		bis = new BufferedInputStream(fis);
		
		try {
			fos = new FileOutputStream(System.getProperty("user.dir")+"\\"+fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bos = new BufferedOutputStream(fos);
		
		
	}
	
	public void readfile() throws IOException
	{
		System.out.println("-----File Content are as follows-----");
		
		 int ch1;
		while((ch1 = bis.read())!=-1)
		{
			System.out.print((char)ch1);
		}
		
		
		bis.close();
	}
	
	public void writeFile() throws IOException
	{
		System.out.println("-----Enter the file Content until @-----");
		
		char ch;
		DataInputStream dis = new DataInputStream(System.in);
		
		while((ch = (char) dis.read()) != '@')
		{
			bos.write(ch);
		}
	
		bos.close();
		
		
	}
	
	public void fileOperation()
	{
		File file = new File("E:\\TestFile");
		if(file.exists())
		{
			System.out.println("Directory allready exists");
			System.out.println("isDirectory = "+file.isDirectory());
			System.out.println("isfile = "+file.isFile());
			System.out.println("Path = "+file.getPath());
			System.out.println("Absolute path = "+file.getAbsolutePath());
		}else
		{
			file.mkdir();
			System.out.println("Directory Created");
			System.out.println("isDirectory = "+file.isDirectory());
			System.out.println("isfile = "+file.isFile());
			System.out.println("Path = "+file.getPath());
			System.out.println("Absolute path = "+file.getAbsolutePath());
		}
		
		System.out.println("File/Directory deleted Successfully = "+file.delete());
	}

}
