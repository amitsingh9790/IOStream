package IOStream.bytestream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {
	public static void main(String[] args) throws IOException {
		BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("eassay.txt"));
		String s = "Welcom to Java.";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush(); 
		System.out.println("Success");
		
	}

}
