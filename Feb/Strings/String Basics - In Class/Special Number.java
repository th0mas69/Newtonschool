//Given a number N, find out whether it is divisible by 3.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
import java.math.*;


// don't change the name of this class
// you can add inner classes if needed
class Main
{
	// Function to find that number
	// divisible by 3 or not
	static boolean check(String str)
	{
		// Compute sum of digits
		int n = str.length();
		int digitSum = 0;
		for (int i=0; i<n; i++)
			digitSum += (str.charAt(i)-'0');
			//System.out.println(digitSum);
	
		// Check if sum of digits is
		// divisible by 3.
		return (digitSum % 3 == 0);
	}

	// main function
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		if(check(str))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
