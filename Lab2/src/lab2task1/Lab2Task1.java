/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2task1;

/**
 *
 * @author Farhan
 */
public class Lab2Task1 {
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int aa[]={9,8,7,6,5,4,3,2,1};
     System.out.println(java.util.Arrays.toString(aa));
    int aaa[]={1,3,4,5,7,9};
    int aaaa[]={2,4,6,8,10};
    MyArray a=new MyArray(aa);
     System.out.println(java.util.Arrays.toString(aa));
    System.out.println(java.util.Arrays.toString(a.MargeSort(aa)));
    MyArray b=new MyArray(aa);
    b.insertionSort();
    b.print();
    MyArray c=new MyArray(aa);
    c.quickSortR();
    c.print();
    MyArray d=new MyArray(aa);
    d.quickSort();
    d.print();
    System.out.println(a.findk(5));
    //System.out.println(java.util.Arrays.toString());
    
    
    
    //c.print();
  
  
  }
  
}
