public class testcircle{
  public static void main(String arg[]){
  circle c1=new circle();
  circle c2=new circle();
  System.out.println(c1.area(c2));
  c2.setradius(5.0);
  System.out.println(c1.area(c2));
  c2.setradius(5.0);
  c1.setradius(5.0);
  System.out.println(c1.area(c2));
  System.out.println("number of circle object"+circle.howManyCircle());
  }
}