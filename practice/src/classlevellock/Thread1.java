package classlevellock;

public class Thread1 extends Thread{
	public void run() {
		Table.print(10);
	}
}
