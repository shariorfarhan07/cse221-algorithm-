    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package lab1task1;

    import java.util.Stack;

    /**
     *
     * @author Farhan
     */
    public class Lab1task1 {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
           try{
               Stack<Integer> s =new Stack();
            //push 10, push 5, push 6, pop, push 9, push 3, push 2, pop, pop

            System.out.println("Pushing 10...");
            s.push(10);
            System.out.println("Printing top:");
            System.out.println(s.peek());
            System.out.println("Pushing 5...");
            s.push(5);
            System.out.println("Printing top:");
           System.out.println(s.peek());
            System.out.println("Pushing 6...");
            s.push(6);
            System.out.println("Printing top:");
           System.out.println(s.peek());
            System.out.println("popping");
            System.out.println(s.pop());
            System.out.println("Printing top:");
           System.out.println(s.peek());
            System.out.println("Pushing 9...");
            s.push(9);
            System.out.println("Printing top:");
           System.out.println(s.peek());
            System.out.println("Pushing 3...");
            s.push(3);
            System.out.println("Printing top:");
           System.out.println(s.peek());
            System.out.println("Pushing 2...");
            s.push(2);
            System.out.println("Printing top:");
           System.out.println(s.peek());
            System.out.println("popping");
            System.out.println(s.pop());
            System.out.println("Printing top:");
           System.out.println(s.peek());
            System.out.println("popping");
            System.out.println(s.pop());
            System.out.println("Printing top:");
           System.out.println(s.peek());

           }catch(Exception e){
           System.out.println("error has occer!!");
           } 




        }

    }
