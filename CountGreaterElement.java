package ArrayPattern;
import java.util.Scanner;
import java.util.Arrays;

/*Count Elements Greater Than First Element
 
Problem Statement
You are given an array of integers.
 Write a Java program to count how many elements are greater than the first element of the array.*/

public class CountGreaterElement {
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Array Length: ");
			int length=sc.nextInt();
			
			int arr[]=new int [length];
			System.out.println("Enter Array Element: ");
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			
			int count=0;
			int firstElement=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(firstElement<arr[i]) {
					count++;
				}
			}
			System.out.println(count);
			
			
		}
}
