// https://oj.masaischool.com/contest/10066/problem/15

public static void compareSix(int one, int two, int three, int four, int five, int six){
  //write your code here
  
  int sum1 = one +two;
  int sum2 = four +five;
  
  if (sum1 > three && sum2 > six){
      System.out.println("Yes");
  }else {
      System.out.println("No");
  }
  
}
