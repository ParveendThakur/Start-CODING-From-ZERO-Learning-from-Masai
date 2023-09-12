  public static void printCharReverse(int n, String str){
    //write your code here
    int x = str.length();
    for (int i = x-1; i>=0; i--){
        char y = str.charAt(i);
        System.out.println(y);
    }
  }
