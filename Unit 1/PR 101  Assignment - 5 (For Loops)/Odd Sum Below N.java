// https://oj.masaischool.com/contest/10085/problem/08

  public static void oddSumBelowN(int num){
    //write your code here
    
    int x = 0;
    for (int i = 1; i <=num; i++ ){
        if (i%2 != 0)
       // System.out.print(i);
        x = x+i;
    }
    System.out.print(x);
  }
