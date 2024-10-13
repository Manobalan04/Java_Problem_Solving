package Problems;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int []arr= {2,6,4,8,2,6};
//		
//		int temp;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
//
//		for (int a : arr) {
//			System.out.println(a);
//		}
		

//		user input method
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of the array");
		int size = sc.nextInt();

		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("enter the elements to the array " + (i + 1));
			int elements = sc.nextInt();
			arr[i] = elements;
		}
		
		int temp;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for (int a : arr) {
			System.out.println(a);
		}
		
		

	}
	
}
