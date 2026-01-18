package ArrayPattern;
import java.util.Scanner;
import java.util.Arrays;

/*Count Positive, Negative and Zero Elements
Problem Statement
You are given an array of integers representing daily profit and loss values.*/

public class CountPositiveNegativeZeroElement {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Array Length: ");
		int length=sc.nextInt();
		
		int arr[]=new int[length];
		int p=0, n=0, z=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
			if(arr[i]>0) {
				p++;
				
			}
			else if(arr[i]<0) {
				n++;
			}
			else {
				z++;
			}
		}
		System.out.println("positive Count is :"+p);
		System.out.println("Negative Count is :"+n);
		System.out.println("Zero Count is :"+z);
	}

}
