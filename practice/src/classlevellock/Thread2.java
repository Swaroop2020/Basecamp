package classlevellock;

public class Thread2 extends Thread{

	public void run() {
		Table.print(100);
	}
}
