package streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
	public static void main(String[] args) {
		FileWriter fw;
		try {
			fw = new FileWriter("D:/buffer");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Alibaba");
			bw.newLine();
			bw.write("Yan kun lee");
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
