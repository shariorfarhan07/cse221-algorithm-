public class Midterm {
public static void main (String[] args){    
        Avenger tony = new Avenger();
tony.setName("Iron Man");
tony.setPower("blast");    
        Avenger natasha = new Avenger("Black Widow");
natasha.setPower("shoot");
        Avenger bruce = new Avenger("Hulk", "smash");
        Avenger steve = new Avenger("Captain America", "punch");
System.out.println("*****************");
tony.attack();
natasha.attack();
bruce.attack();
steve.attack();
    }   
}
