// https://oj.masaischool.com/contest/10085/problem/10

  public static void divisibleByK(int num,int k){
    //write your code here
    int x = 0;
    for (int i = 1; i <num; i++){
       if( i%k == 0)
       x=x+i;
        // System.out.print(x);
    }
    System.out.print(x);
  }
