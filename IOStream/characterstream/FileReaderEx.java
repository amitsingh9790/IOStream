package IOStream.characterstream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("eassay.txt");
		int i;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		fr.close();
	}

}