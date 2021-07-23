public class Avenger {
private String name = "";
private String power = "";
  
    public Avenger(){}
    public Avenger(String n){name=n;}
    public Avenger(String n,String p){name=n;power=p;}
    public void setName(String n){name=n;}
    public void setPower(String p){power=p;}
    public void attack(){if(name.equals(""))
      {System.out.println("Super hero name and power need to be set.");
    }
    else {System.out.println(name+" is "+power+"ing.");}
    }
}
