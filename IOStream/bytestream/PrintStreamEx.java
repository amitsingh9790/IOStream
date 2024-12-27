package IOStream.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fout = new FileOutputStream("eassay.txt");
		PrintStream pout = new PrintStream(fout);
		pout.println(2016);
		pout.println("Hello Java");
		pout.println("Welcom to Java");
		
		System.out.println("Success");
	}

}
