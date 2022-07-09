package java8interface;

public interface Drone {
	default void fly() {
		System.out.println("the drone is flying ");
	}
	
	static void move() {
		System.out.println("the drone is moving ");
	}

}
