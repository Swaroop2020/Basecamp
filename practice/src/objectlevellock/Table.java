package objectlevellock;

public class Table {
	public synchronized void print(int i) {
		for(int j=0;j<10;j++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i*j);
		}
	}
}
