package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileIOEx {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream(new File("essay.txt"))){
		byte data[] = fis.readAllBytes();
		System.out.println(new String(data,Charset.defaultCharset()));
			
		FileOutputStream fos = new FileOutputStream("myfile.txt");
		String d = "This will print into file";
		byte b[] = d.getBytes();
		fos.write(b);
		}catch( IOException e) {
			e.printStackTrace(); 
		}
  
	}

}
