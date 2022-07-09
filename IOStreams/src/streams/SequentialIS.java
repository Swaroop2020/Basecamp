package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;

public class SequentialIS {

	public static void main(String[] args) {
		try {
			FileOutputStream fos1 = new FileOutputStream("D:/input1");
			FileOutputStream fos2 = new FileOutputStream("D:/input2");
			FileInputStream fis1 = new FileInputStream("D:/input1");
			FileInputStream fis2 = new FileInputStream("D:/input2");
			FileOutputStream fos = new FileOutputStream("D:/output");

			String str1 = "Welcome To Mindtree ";
			String str2 = "Welcome to possible ";
			String str3 = " 1##2+3##4";
			byte[] b1 = str1.getBytes();
			byte[] b2 = str2.getBytes();
			byte[] b3 = str3.getBytes();
			fos1.write(b1);
			fos2.write(b2);
			fos2.write(b3);

			SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
			
			PushbackInputStream pis = new PushbackInputStream(sis);
			System.out.println();
			System.out.println("----------------------");
			
			int j=0;
			while((j=pis.read())!=-1) {
				if(j=='#') {
					int k=0;
					if((k=pis.read())=='#') {
						System.out.print('*');
					}else {
						pis.unread(k);
						System.out.print((char)j);
					}
				}else {
					System.out.print((char)j);
				}
			}

			int i = 0;
			while ((i = sis.read()) != -1) {
				fos.write(i);
				System.out.print((char)i);
			}
			
			
			fos.close();
			fos1.close();
			fos2.close();
			fis1.close();
			fis2.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
