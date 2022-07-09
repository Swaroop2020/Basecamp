package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputString {
	public static void main(String[] args) throws IOException {
		FileOutputStream os = new FileOutputStream("D:/Django");
		String str = "Orchard Learning Program";
		byte[] array = str.getBytes();
		os.write(array);
		os.close();
		FileInputStream is = new FileInputStream("D:/Django");
		
		int i=0;
		while((i=is.read())!=-1) {
			System.out.print((char)i);
		}
		is.close();
		
	}
}
