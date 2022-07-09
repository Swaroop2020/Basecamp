package methodreference;

public class AirConditiner {
	
	//constructor reference
	public AirConditiner() {
		System.out.println("AC is Dead ");
	}
	//static reference
	public static void status() {
		System.out.println("AC is working ");
	}
	//instance reference
	public void workStatus() {
		System.out.println("Ac isn't working ");
	}
	
	

	public static void main(String[] args) {
		//static reference
		AC ac = AirConditiner::status;
		ac.status();
		
		//instance reference
		AC aco = new AirConditiner()::workStatus;
		aco.status();
		
		//constructor reference
		AC acr = AirConditiner::new;
		acr.status();
		
	}
}