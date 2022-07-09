package printstring;

public class MainClass {

	public static void main(String[] args) {
		String str = "Hello Bro";
		new PrintString("Thread1",str).start();;
		new PrintString("Thread2",str).start();;
		new PrintString("Thread3",str).start();;
	}
}
