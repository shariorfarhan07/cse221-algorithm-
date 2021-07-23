public class circle{
  private double radius;
  public static int numberofobjects=0;
  
  public circle(){
  radius=1;
  numberofobjects++; 
  }
  public static int howManyCircle(){
  return numberofobjects;
  }
  public double area(circle a){
    if (this.radius==a.radius){
    return 3.1416*this.radius*this.radius;
    }
    return this.radius*2;
  }
  public void setradius(double a ){ radius=a;}

}
/*
 * construstor without parameter(circle()) will assign 1 to radius and
 * increment the static value numberofobjects because it will tell us
 * nummber of class we created 
 */