//Take 4 digit number input from user, add 8 to the it and then divide it by 3. Now, the modulus of that number is taken with 5 and then multiply the resultant value by 5. Display the final result.



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
                      Scanner sc = new Scanner(System.in);
                      int num = sc.nextInt();
                      int a = (((num+8)/3)%5)*5;
                      System.out.println(a);
	}
}