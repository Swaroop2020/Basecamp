package printstring;

public class PrintString extends Thread{
	static int i=0;
	String str;
	public PrintString(String name,String str) {
		setName(name);
		this.str = str;
	}
	public void run() {
		this.print(str);
	}

	public synchronized void print(String str) {
		while(i<str.length()) {
			System.out.println(str.charAt(i));
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

