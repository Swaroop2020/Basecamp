package streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamClass {
	public static void main(String[] args) {

		try {
			FileOutputStream os= new FileOutputStream("D:/raspberry");
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeInt(32);
			dos.writeFloat(23.98F);
			dos.writeUTF("This String is written using DataStream");
			os.close();
			
			FileInputStream is = new FileInputStream("D:/raspberry");
			DataInputStream dis = new DataInputStream(is);
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
