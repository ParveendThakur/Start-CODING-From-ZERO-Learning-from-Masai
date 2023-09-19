// https://oj.masaischool.com/contest/10085/problem/07

  public static void evenSumBelowN(int num){
    //write your code here
    int x =0;
    for (int i = 1; i <= num; i++){
        
        if (i%2==0){
           x = x + i;
            //System.out.println(i);
            
        }
            
    }
     System.out.println(x);
  }
