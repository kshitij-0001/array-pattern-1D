package ArrayPattern;
import java.util.Scanner;
import java.util.Arrays;

/*Check if Array is Palindrome

Problem Statement
An array is said to be a palindrome if it reads the same from left to right and right to left.
 Write a Java program to check whether the given array is a palindrome.*/

public class CheckArrayIsPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Array Length: ");
		int length=sc.nextInt();
		int arr[]=new int[length];
		
		System.out.println("Enter the array element: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		
		int i,j;
		for(i=0,j=length-1;i<=j;i++,j--) {
			if(arr[i]!=arr[j]) {
				System.out.println("Array is Not Palindrome!");
				break;
			}
			
		}
		if(i>j) {
			System.out.println("Arry Is Palinedrome!");
		}
		

	}

}
