// https://oj.masaischool.com/contest/10062/problem/13
public static void CompareArea(int L1,int B1,int L2,int B2){
  //write your code here
  
  int area1 = L1*B1;
  int perimeter1 = 2*(L1+B1);
  
  
  int area2 = L2*B2;
  int perimeter2 = 2*(L2+B2);
  
  if (area1>area2){
      System.out.println("true");
      
  }else {
      System.out.println("false");
  }
  
  if (perimeter1>perimeter2){
      System.out.println("true");
      
  }else {
      System.out.println("false");
  }
 
  
}
