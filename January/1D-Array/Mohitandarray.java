/* Mohit has an array of N integers containing all elements from 1 to N, somehow he lost one element from the array.
Given N-1 elements your task is to find the missing one.

 Input
First line of input contains a single integer N, the next line contains N-1 space separated integers.

Output
Print the missing element


*/







import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  int n;
					  //getting input from user
					  Scanner sc = new Scanner (System.in);
					  n = sc.nextInt();
					  //changing into array and gets array inputs
					  int arr[] = new int[n];
					  for (int i=1; i< arr.length; i++){
						  arr[i] = sc.nextInt();
					  }
					  int sum1 = 0;
					  for (int i=1; i< arr.length; i++){
						  sum1=sum1+arr[i];
						  // incrementing total of array from length

					  }
					  int sum2 = 0;
					  for (int i=1; i<=n; i++){
						  sum2 = sum2+i;
						  // incrementing total of given  array elements 
					  }

					  System.out.println(sum2-sum1);
					  //subtracting both to find the missing value


	}
}