import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

//reverse sorting 

//54821 -> 4
//
//45
class Main {

    static void bubbleSort(int arr[]){
        int m = arr.length;
        //int iterations = 0;
        //boolean doesSwappingHappened;
        for (int i=0;i<m-1;i++){ //keeping track of how many iterations u need to do the same process
            //doesSwappingHappened = false;
            for(int j=0; j<m-i-1;j++){ // for doing that process
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    //doesSwappingHappened = true;
                }
            }
            //iterations++;
            //if(!doesSwappingHappened){
               // break;
            //}
            //System.out.println(iterations);
        }
    }
	public static void main (String[] args) {
                      // Your code here

        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
		int arr[] = new int[n];
        
		for (int i=0; i< n; i++){
			arr[i] = c.nextInt();
		}

        //for(int i=0; i<n; i++){
            //System.out.print(arr[i]+" ");
        //}
        bubbleSort(arr);
        //System.out.println();
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
	}
}
