/*Write a java program that will have a class named series which will have two methods, 
 * first 
 * will compute the following series 1^3+4^3+7^3+10^3+…..+N^3 (the value of N will be given by the user) ,
 * and the second method will compute the factorial of all the integers from 1 to N. Call the methods inside the main class. 
 * Write a discussion of this code. */
public class series{
 
  public void method1(int a){
    int sum=0;
    for(int i=1;i<=a;i++){
      sum+=Math.pow(i,3);
    }
  System.out.println("sum of series is "+sum);
  }
  
  public void method2(int a){
    int fac=1;
    for(int i=1;i<=a;i++){
      fac=fac*i;
    }
  System.out.println("the fcactorial of "+a+"is "+fac);
  }
  
  }
  
}/*method1() takes a int as paremeter and print series method2() takes a integer and prints its factorial */
public class Test {
  
  
  public static void main(String[] args) { 
    series a=new series();
     a.method1(10);
  }
 
  
}
