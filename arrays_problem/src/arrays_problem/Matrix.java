package arrays_problem;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter matrix size");
		int size = scan.nextInt();
		float[][] matrix = new float[size][size];
		System.out.println("enter " + size * size + " elements into the matrix");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = scan.nextFloat();
			}
		}
		System.out.println("entered matrix is :");
		display(matrix);
		float sum = firstDiagonalSum(matrix);
		System.out.println("sum of first diagonal : " + sum);
		sum = secondDiagonalSum(matrix);
		System.out.println("sum of second diagonal : " + sum);
		System.out.println("Minimum element in the matrix diagonal is :");
		System.out.println("         min  : " + minimumDiagonal(matrix));

	}

	private static float minimumDiagonal(float[][] matrix) {
		int size = matrix.length;
		float min = matrix[0][0];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == size - j - 1 || i == j) {
					if (min > matrix[i][j]) {
						min = matrix[i][j];
					}
				}
			}
		}
		return min;
	}

	private static float secondDiagonalSum(float[][] matrix) {
		int size = matrix.length;
		float sum = 0;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == size - j - 1) {
					sum += matrix[i][j];
				}
			}
		}

		return sum;
	}

	private static float firstDiagonalSum(float[][] matrix) {
		int size = matrix.length;
		float sum = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j) {
					sum += matrix[i][j];
				}
			}
		}

		return sum;
	}

	public static void display(float[][] matrix) {
		int size = matrix.length;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
