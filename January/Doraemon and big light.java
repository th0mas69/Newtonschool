static boolean EqualOrNot(int h1, int h2, int v1,int v2){
//Enter your code here
  if (v2>v1&&(h1-h2)%(v2-v1)==0){
    return true;
    }
  else{
    return false;}

}


/*Since this will be a functional problem, you don't have to take input. You just have to complete the function
EqualOrNot() that takes the integer h1(height of gian), h2(height of suneo), v1(speed of Gian's big light) and v2(speed of Suneo's big light) as parameter.
Return true if their height will become equal at some point (as seen by Doraemon) else return false.*/
