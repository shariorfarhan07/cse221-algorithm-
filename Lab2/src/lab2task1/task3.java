/*Write a java program which will add all the members 
 * from the array a={45,23,12,19,20,22, 48,52,68, 120, 100}. If the result of the summation is even,
 * then it will add two multidimensional array and print the value **/

public class task3{
  public static void main(String age[]){
   int a[]={45,23,12,19,20,22, 48,52,68, 120, 100};
   int sum=0;
   for(int i =0;i<a.length;i++){
    sum=sum+a[i];
   }
   System.out.println("sum is"+sum);
   if(sum%2==0){
   for(int i =0;i<a.length;i++){
    a[i]=a[i]+sum;
   }
    for(int i =0;i<a.length;i++){
     System.out.println(a[i]);
   }
   }
  }
}