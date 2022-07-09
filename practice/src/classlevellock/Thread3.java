package classlevellock;

public class Thread3 extends Thread{

	public void run() {
		Table.print(1000);
	}
}
