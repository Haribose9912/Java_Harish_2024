package Harish;

import java.util.Scanner;

public class count_num_occurance {

	public static void main(String[] args) {
		
		int n=9910101;
		int count =0;
		System.out.println("Enter the digit that you want to count the occurances in a given number: ");
		Scanner sc = new Scanner(System.in);
		int k =sc.nextInt();
		
		while(n>0) {
			int res=n%10; // extract last digit
			if(res==k) {
				count++;  
			}
			n=n/10; //remove last digit -> increment/decrement
		}
		
		
		System.out.println("no.of occurances of a given number: "+count);
	}
	
	
}
