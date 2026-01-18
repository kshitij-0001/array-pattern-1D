package ArrayPattern;
import java.util.Scanner;
import java.util.Arrays;

/*Check if All Elements Are Unique
 
Problem Statement
Given an array of integers, check whether all elements are unique.
 If any element repeats, print NO, otherwise print YES.*/

public class CheckUniqueElement {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Array Length: ");
		int length=sc.nextInt();
		
		int arr[]=new int [length];
		System.out.println("Enter Array Element: ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		String result="yes";
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					result="No";
					break;
				}
				if(result.equals("No")) {
					break;
				}
			}
		}
		
		System.out.println("Give Array All Elements Unique: "+result);
		
		
	}

}
