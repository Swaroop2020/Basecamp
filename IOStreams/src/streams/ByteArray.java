package streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteArray {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:/ByteArrayFile");
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			fos.write(67);
			bos.write(68);
			bos.writeTo(fos);
			FileInputStream fis = new FileInputStream("D:/ByteArrayFile");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
