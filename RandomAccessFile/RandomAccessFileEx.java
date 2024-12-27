package IOStream.RandomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;


public class RandomAccessFileEx {
	static RandomAccessFile raf;
	static {
		try {
			raf=new RandomAccessFile("eassay.txt","rw");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	static void readFile() throws IOException {
		byte[] data = new byte[10];
		int eof = 0;
		while(eof !=-1) {
			eof=raf.read(data,0,10);
			System.out.println(new String(data,0,eof)+": Reading");
			data = new byte[10];
		}
	}
	
	static void writeFile() throws IOException {
		raf.write("updates this ".getBytes());
	}
	public static void main(String[] args) {
		try {
//			writeFile();
			readFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


}
