package streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterReader {
	public static void main(String[] args) {
		try {
			FileWriter fileW = new FileWriter("D:/writer");
			fileW.write("Amazing zing zing");
			fileW.close();
			FileReader fileR = new FileReader("D:/writer");
			int i=0;
			while((i=fileR.read())!=-1) {
				System.out.println((char)i);
			}
			fileR.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
