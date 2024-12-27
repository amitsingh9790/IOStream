package IOStream;

import java.io.File;

public class FileOpterations {

	public static void main(String[] args) {
		File f = new File("/home/administrator/eclipse-workspace/CoreJava/src");
		scanFolder(f);
		System.out.println("Operation finished!!");

	}
	public static void scanFolder(File f) {
		if(f.isDirectory()) {
			File files[] = f.listFiles();
			for(File ff:files) {
				System.out.println(f.getAbsolutePath());
				scanFolder(ff);
			}
		}
		else {
			System.out.println(f.getAbsolutePath());
			
		}
	}

}
