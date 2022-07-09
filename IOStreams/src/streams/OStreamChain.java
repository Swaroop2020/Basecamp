package streams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.OutputStream;

public class OStreamChain {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("D:/OSChain");
			FileWriter fw = new FileWriter("D:/OSChain");
			PrintWriter pw = new PrintWriter(fout);
			fout.write(100);
			pw.write(100);
//			pw.print(new Laptop(101,"Dell",40000));
			pw.flush();
			pw.close();
			FileReader fr = new FileReader("D:/OSChain");
		    int i=0;
		    while((i=fr.read())!=-1) {
		    	System.out.print((char)i);
		    }
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
