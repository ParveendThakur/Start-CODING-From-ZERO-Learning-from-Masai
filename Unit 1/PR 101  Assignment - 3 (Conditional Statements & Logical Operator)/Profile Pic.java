// https://oj.masaischool.com/contest/10066/problems
// https://oj.masaischool.com/contest/10066/problem/07

public static void profilePic(int L, int W, int length, int width){
  //write your code here
  if (length >L && width> W){
      System.out.println("Upload");
  }else if (length<L){
      System.out.println("Increase Length");
  }else
  System.out.print("Increase Width");
}
