package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Sample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:/output");
			
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
