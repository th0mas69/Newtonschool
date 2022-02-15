Input
First line of contains a single integer N, next line contains N space separated integers depicting the values of array.
Output
Print the maximum value of j- i under the given condition, if no pair satisfies the condition print -1.


----------------------------------------------------------------------------------------------------------------------------------



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner in = new Scanner(System.in);
					  int n = in.nextInt(); int arr[] = new int [n]; long max = -1;
					  for (int i=0; i<n; i++){
						  arr[i]=in.nextInt();
					  }

	int LMin[] = new int[n];
	int RMax[] = new int[n];
	LMin[0] = arr[0];
	for (int i=1; i<n; i++){
		LMin[i] = Math.min(arr[i],LMin[i-1]);
	}
	RMax[n-1] = arr [n-1];
	for (int j= n-2; j>=0; --j){
		RMax[j] = Math.max(arr[j], RMax[j+1]);
	}

	int i = 0;
	int j = 0;

	int maxDiff = -1;
	while(j<n && i<n){
		if(LMin[i]<RMax[j])
		{
			maxDiff = Math.max(maxDiff, j-i);
			j = j+1;
		}
		else
			i = i+1;

	}
	System.out.println(maxDiff);
	}
}
