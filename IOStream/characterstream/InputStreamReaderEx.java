package IOStream.characterstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx {
	
	public static void main(String[] args) throws IOException {
		InputStream stream = new FileInputStream("eassay.txt");
		Reader reader = new InputStreamReader(stream);
		int data = reader.read();
		while(data!=-1) {
			System.out.print((char)data);
			data=reader.read();
		}
		
	}

}
