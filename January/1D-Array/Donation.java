//Input - The first line contains n, the total number of people donating. The next line contains n space separated integers denoting the amount of money paid by the people. The amounts are mentioned in the order in which the people paid.
//Output - The first line contains the extra money that each student has to pay after their teacher applied the rule. The second line contains the total amount collected by the teacher at the end.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr[] = new int[n];
			long max=0,cnt=0;
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
				max = Math.max(arr[i],max);
				System.out.print(max-arr[i]+" ");
				cnt += max-arr[i];
				cnt += arr[i];

			}
			System.out.println();
			System.out.print(cnt + " ");
	}
}
