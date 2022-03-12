//You are given a string your task is to reverse the given string.
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc = new Scanner(System.in);
					  String x = sc.nextLine();
					  char c;
					  String rev="";
					  for (int i=0;i<x.length();i++){
						  c = x.charAt(i); //extracts each character
						  rev = c+rev; //adds each character in front of the existing string
					  }
					  System.out.print(rev);
					  

	}
}


