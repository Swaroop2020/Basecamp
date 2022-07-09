package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class FileInput {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("D:/Cjango");
			//writes one byte 
			os.write(68);
//			byte[] array = new byte[] {1,2,3,4};
//			//writes array of byte
//			os.write(array);
			
			String str = "Java is Simple";
			byte[] arr = str.getBytes();
			
			//writes all the bytes
			os.write(arr);
			InputStream is = new FileInputStream("D:/Django");
			System.out.println(is.available());
//			reads one by one byte
//		    int a=is.read();
//		    
//			System.out.println((char)a);
			
			int i=0;
			while((i=is.read())!=-1) {
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
