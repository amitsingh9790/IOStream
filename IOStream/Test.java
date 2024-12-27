package IOStream;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		
		File f = new File("/home/administrator/eclipse-workspace/abc");
		String[] s = f.getAbsolutePath().split("/home/administrator/eclipse-workspace");
		
		String loc = "/home/administrator/Downloads/eclipse-workspace2";
		System.out.println(s[0]);
		System.out.println(loc+s[1]);
		
	}
}
