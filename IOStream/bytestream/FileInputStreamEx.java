package IOStream.bytestream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("eassay.txt");
		int i=0;
		while((i=fin.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
