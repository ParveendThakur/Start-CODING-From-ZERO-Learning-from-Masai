// https://oj.masaischool.com/contest/10066/problem/06_optional_1

public static void equalsFive(int x, int y){
  //write your code here
  int sum = x+y;
  
  if (sum>5){
      System.out.print("Above 5");
  }else if(sum<5){
      System.out.print("Below 5");
  }else
  System.out.print ("Equal 5");
}
