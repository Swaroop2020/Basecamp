package streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serilization {
	public static void main(String[] args) {
		Laptop lap = new Laptop(123,"HP",70000);
		
		try {
			FileOutputStream fout = new FileOutputStream("D:/objectFile");
			ObjectOutputStream oout = new ObjectOutputStream(fout); 
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("D:/objectFile"));
			oout.writeObject(lap);
			
			Laptop lappy = (Laptop) oin.readObject();
			System.out.println(lappy.getId());
			System.out.println(lappy.getPrice());
			System.out.println(lappy.getBrand());
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
