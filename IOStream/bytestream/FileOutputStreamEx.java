package IOStream.bytestream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("eassay.txt");
		fout.write(67);
		fout.close();
		System.out.println("Success...");
	}

}
