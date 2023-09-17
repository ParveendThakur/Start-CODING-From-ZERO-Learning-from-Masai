// https://oj.masaischool.com/contest/10066/problem/17

public static void oddEvenOrBoth(int one, int two){
  //write your code here
  if (one%2==0 && two%2==0){
      System.out.print("Even");
  }else if (one%2!=0 && two%2!=0){
      System.out.print("Odd");
  }else{
      System.out.print("Even-Odd");
  }
}
