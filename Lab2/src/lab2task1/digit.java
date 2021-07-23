class digit{
    int b;//this is the global variable
    digit(int b){
        this.b=b;
    }
    public void addmultiply(){// this is the method that contains the variable mul which multiplys all odd values  and sum adds all the even values then prints in the end 
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