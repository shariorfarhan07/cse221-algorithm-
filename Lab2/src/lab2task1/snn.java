public class snn extends seles{
  double comissionrate;
  
  
  public ssn(String n,int a,int b,double w){
   super(n,a,b);
   this.comissionrate=w;   
  }
  
  public void determine(ssn a){
    if (a.socialsecuritynumber%10==super.socialsecuritynumber){
    System.out.println("both are same");
    }else{
    System.out.println("are not same");
    }
  }
  
  public double earning(){
    double earning=0.0;
    if(super.seles*this.comissionrate>10000){
     earning=super.seles*this.comissionrate+super.seles*this.comissionrate*(10/100);
    }else if(super.seles>=50&&super.seles<=100){
    earning=super.seles*this.comissionrate;
    }
    return earning;
  }
  

}