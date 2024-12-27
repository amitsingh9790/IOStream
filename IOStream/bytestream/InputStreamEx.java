package IOStream.bytestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {

	public static void main(String[] args) throws IOException {
		InputStream input = new FileInputStream("eassay.txt");
		
		int i;
		while((i=input.read())!=-1) {
			System.out.print((char)i);
		}
	}

}
