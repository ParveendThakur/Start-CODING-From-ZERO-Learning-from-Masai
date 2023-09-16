// https://oj.masaischool.com/contest/10066/problem/06

public static void  enoughFuelConsumption(int fuel, int distance){
  //write your code here
  int required = fuel*distance;
  
  if (required>50){
      System.out.print("Enough");
  }else{
      System.out.print("Go On");
  }
  
}
