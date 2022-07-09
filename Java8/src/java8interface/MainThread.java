package java8interface;

public class MainThread implements Drone{
	
//	public void function() {
//		fly();
//	}
	public static void main(String[] args) {
		MainThread t = new MainThread();
		t.fly();
		Drone.move();
		
	}
}
