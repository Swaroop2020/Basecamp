import java.util.Scanner;

import productmanager.Product;

public class BinarySearching {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of the array :");
		String[] array = new String[scan.nextInt()];
		System.out.println("enter " + array.length + " Strings into the array : ");
		scan.nextLine();
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextLine();
		}
		array = insertionSort(array);
		System.out.println("enter a word u are searching for :");
		String word = scan.nextLine();
		int index = binarySearch(array,word);
		if(index > 0) {
			System.out.println(array[index]+" found at index "+index);
		}else {
			System.out.println("element doesn't exists ");
		}
	}
	
	private static int binarySearch(String[] array, String word) {
		int x = 0, length = array.length - 1;
		while (x <= length) {
			int y = x + (length - 1) / 2;
			int result = word.compareTo(array[y]);

			if (result == 0) {
				return y;
			}
			if (result > 0) {
				x = length + 1;
			} else {
				length = y - 1;
			}
		}
		return -1;
	}
	
	private static String[] insertionSort(String[] array) {
		for(int i=1;i<array.length;i++) {
			String key = array[i];
			int j = i;
			while(j>0 && key.compareTo(array[j-1])<0) {
				array[j] = array[j-1];
				j--;
			}
			array[j] = key;
		}
		return array;
	}

}
