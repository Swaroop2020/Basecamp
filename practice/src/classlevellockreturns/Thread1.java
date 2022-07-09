package classlevellockreturns;

import classlevellock.Table;

public class Thread1 extends Thread{
	int i;
	
	public Thread1(int i) {
		super();
		this.i = i;
	}

	public void run() {
		Table.print(i);
	}
}
