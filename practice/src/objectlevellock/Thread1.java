package objectlevellock;

public class Thread1 extends Thread{
	int i;
	Table t;
	
	public Thread1(int i,Table t) {
		super();
		this.t=t;
		this.i = i;
	}

	public void run() {
		t.print(i);
	}
}