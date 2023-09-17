// https://oj.masaischool.com/contest/10066/problem/13

public static void twoSum(int one, int two, int three, int four, int five){
  //write your code here
  
  int sum1 = one + two;
  int sum2 = three + four;
  
  if (sum1 > five && sum2 > five){
      System.out.println("Yes");
  }else {
      System.out.println("No");
  }
}

