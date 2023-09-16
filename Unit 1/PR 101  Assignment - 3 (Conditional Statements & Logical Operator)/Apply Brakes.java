// https://oj.masaischool.com/contest/10066/problem/05

public static void applyBreak(int distance, int time){
  //write your code here
  int speed= distance/time;
  
  if (speed>40){
      System.out.println("Apply Brake");
  }else{
      System.out.println("Keep Going");
  }
}
