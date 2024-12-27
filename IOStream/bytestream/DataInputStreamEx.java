package IOStream.bytestream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreamEx {

	public static void main(String[] args) throws IOException {
		InputStream i = new FileInputStream("eassay.txt");
		DataInputStream inst = new DataInputStream(i);
		int count = i.available();
		byte[] arr = new byte[count];
		inst.read(arr);
		for(byte bt:arr) {
			char k = (char)bt;
			System.out.print(k);
		}
		
	}

}
