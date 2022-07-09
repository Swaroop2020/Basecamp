package arrays_problem;

public class Sample {
	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4,5};
		int a = 10;
		change(array,a);
		//System.out.println(a);
//		for(int i:array) {
//			System.out.println(i);
//		}
		
		Xyz obj = new Xyz();
	    
		changeOb(obj);
		System.out.println(obj.a);
		
	}

	private static void changeOb(Xyz obj) {
		obj.a++;
		
	}

	private static void change(int[] array,int a) {
		array[0]=array[0]+1;
		a++;
		
	}
	

}
