/*Write a java program named AI that has two members, A1 and B1, an empty constructor that will assign empty values to the members, 
 * and a parameterized constructor that will assign values to the members. It has a method named experiment that will use
 * method overloading. The first experiment method will determine if the first member is a multiple of second member. 
 * The second experiment method will calculate the following expression A1^(B1+C1). Call the experiment method inside the main class, 
 * Write a discussion of the above code. */
public class AI{
  double A1;
  double B1;
  public AI(){
    A1=0;
    B1=0;
   }
  public AI(double a, double b){
    A1=a;
    B1=b;

  }
  
  public void experiment(){
    if(A1%B1==0){
    System.out.println("first member is multiple of secound");
    }
    else{
     System.out.println("first member is not a multiple of secound member");
    }
  }
  public double experiment(double C1){
   return Math.pow(A1,C1+B1); 
  }
    public static void main(String arg[]){
    
    AI test1=new AI();
    test1.experiment();
    
    AI test2=new AI(10.0,5.0);
    test2.experiment();
     System.out.println(test2.experiment(1));
  
    
    
    
    
  
  }
  

}
