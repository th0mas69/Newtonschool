Input
The first line of the input contains the number of test cases T.

For each test case, the first line of the input contains an integer N denoting the number of elements in the array A. The next line contains N (space separated) elements of A.

Output
For each test case, output the first, second and third maximum elements in the array.


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
				Scanner sc = new Scanner(System.in);
				int test = sc.nextInt();


				while(test-->0){
					int sizeOfarray = sc.nextInt();
					int[] arr = new int[sizeOfarray];
					for(int i=0; i<sizeOfarray; i++){
						arr[i] = sc.nextInt();
					}

					int max1, max2, max3;
					max1= 0;
					max2= 0;
					max3= 0;

					for(int i=0; i<sizeOfarray; i++){
						if(arr[i]> max1){
							max3 = max2;
							max2 = max1;
							max1 = arr[i];

						}
						else if(arr[i]>max2){
							max3 = max2;
							max2 = arr[i];
						}
						else if(arr[i]>max3){
							max3 = arr[i];
						}
					}
					System.out.println(max1+" "+max2+" "+max3);
				}
	}
}
