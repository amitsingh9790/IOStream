package IOStream.bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInputStreamEx {
	public static void main(String[] args) {
		try {
		FileInputStream fin = new FileInputStream("eassay.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		int i;
		while((i=bin.read())!=-1) {
			System.out.print((char)i);
		}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}

}
