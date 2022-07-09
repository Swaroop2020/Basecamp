package classlevellockreturns;

public class MainThread {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1(10);
		Thread1 t2 = new Thread1(100);
		Thread1 t3 = new Thread1(1000);
		t1.start();
		t2.start();
		t3.start();
	}
}
