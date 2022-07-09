package objectlevellock;

public class MainThread {
	public static void main(String[] args) {
		Table t = new Table();
		Table t10 = new Table();
		Thread1 t1 = new Thread1(10,t);
		Thread1 t2 = new Thread1(100,t10);
		Thread1 t3 = new Thread1(1000,t);
		t1.start();
		t2.start();
		t3.start();
	}
}
