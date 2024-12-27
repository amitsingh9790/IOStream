package IOStream.bytestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {
	public static void main(String[] args) throws IOException {
//		FileOutputStream os = new FileOutputStream("eassay.txt");
//		byte b[] = {65,66,67,68,69,70};
//		os.write(b);
//		os.flush();
//		for(int i=71;i<75;i++) {
//			os.write(i);
//		}
//		os.flush();
		
		OutputStream fout = new FileOutputStream("eassay.txt");
		fout.write(69);
		fout.close();
		System.out.println("Success...");
	}
}
