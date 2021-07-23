class digit{
    int b;//this is the global variable
    digit(int b){
        this.b=b;
    }
    public void addmultiply(){// addmultiply() method that contains the variable mul which multiplys all odd values  and sum adds all the even values then prints in the end 
        int sum=0;
        int mul=1;
        for (int i = 1; i <= b; i++) {
        if(i%2==0){
           sum+=i;
        }
        else{
            mul*=i;
        }
            
    }
        System.out.println("sum of the integer is : "+sum);
        System.out.println("multiplycation of the integer is : "+mul);
    }}

public class question1 {
    public static void main(String[] args) {
        digit d1=new digit(5);//creating object 1`
        digit d2=new digit(10);//creating object 2`
        digit d3=new digit(20);//creating object 3`
        d1.addmultiply();//multyplying the object 1
        d2.addmultiply();//multyplying the object 2
        d3.addmultiply();//multyplying the object 3
    }
    
}


       