import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

//LOGIC - REMOVE FIRST LETTERS FROM 2 STRINGS
//FIND SUM OF THE TWO STRINGS
//FIND REMINDER OF SUM WITH VALUE 6

class Main {
	public static void main (String[] args) {
                      // Your code here

		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		//str1 = str1.substring(2);
		//str2 = str2.substring(2); 
		
		int count1[]=new int[26];
		int count2[]=new int[26];

		for(int i=0;i<str1.length();i++){
			count1[str1.charAt(i)-'a']++;
		}

		for(int i=0;i<str2.length();i++){
			count2[str2.charAt(i)-'a']++;
		}

		int sum=0;
		for(int i=0;i<26;i++){
			sum+=Math.abs(count2[i]-count1[i]);
		}
		
	
		
		int flames = sum%6;
		

		if (flames==0){
			System.out.println("Siblings");
		}
		else if (flames==1){
			System.out.println("Friends");
		}
		else if (flames==2){
			System.out.println("Love");

		}
		else if (flames==3){
			System.out.println("Affection");
		}
		else if (flames==4){
			System.out.println("Marriage");
		}
		else if (flames==5){
			System.out.println("Enemy");
		}

	

		
	}
}
