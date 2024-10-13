package Problems;

import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner s= new Scanner(System.in);
System.out.println("enter value");
int num1=s.nextInt();

int num=num1;
int count=0;

if(num>1) {
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println("It is Prime Number");
	}else {
		System.out.println("It is not a Prime Number");
	}
	
}else {
	System.out.println("Not valid Number or It is Natural number");
}
}
}
