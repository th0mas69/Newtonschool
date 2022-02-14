/* Given a number N for each i (1 < = i < = N), you have to print the number except :-
For each multiple of 3, print "Newton" instead of the number.
For each multiple of 5, print "School" instead of the number.
For numbers that are multiples of both 3 and 5, print "NewtonSchool" instead of the number. */

static void NewtonSchool(int n){
    for (int i=1;i<=n;i++){
        if(i%3==0 && i%5==0)
        {System.out.print("NewtonSchool ");}
        else if(i%5==0)
        {System.out.print("School ");}
        else if(i%3==0)
        {System.out.print("Newton ");}
        else
        {System.out.print(i+" ");}
    }
    
}


