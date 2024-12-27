package IOStream.bytestream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {
	public static void main(String[] args) throws IOException {
		FileOutputStream file = new FileOutputStream("eassay.txt");
		DataOutputStream data = new DataOutputStream(file);
		data.write(65);
		data.flush();
		
		System.out.print("Success");
	}

}
