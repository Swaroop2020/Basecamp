package streams;

import java.io.FileInputStream;
import java.io.IOException;

public class ErrorClass {
	public static void main(String[] args) throws IOException {
		System.err.println("This is an error message");
		int i=System.in.read();
		//prints the ascii value of the first character
		System.out.println(i);
		
	}

}
