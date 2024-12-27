package IOStream.characterstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterEx {
	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("eassay.txt");
		BufferedWriter br = new BufferedWriter(fr);
		
		br.write("Welcome to java");
		br.newLine();
//		br.flush();
		br.write("This is only trial...");
//		br.flush();
		br.close();
		fr.close();
	}
}
