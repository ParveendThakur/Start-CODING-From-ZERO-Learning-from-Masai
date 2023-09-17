// https://oj.masaischool.com/contest/10066/problem/09

public static void nzVsEng(int nzScore, int nzSuperOver, int nzFours, int engScore, int engSuperOver, int engFours){
  //write your code here
  if (nzScore > engScore){
      System.out.println("New Zealand");
  }else if (nzScore < engScore){
      System.out.println("England");
  }else if (nzSuperOver > engSuperOver){
      System.out.println("New Zealand");
  }else if (nzSuperOver < engSuperOver){
      System.out.println("England");
  }else if (nzFours > engFours){
      System.out.println("New Zealand");
  }else if (nzFours < engFours){
      System.out.println("England");
  }
}
