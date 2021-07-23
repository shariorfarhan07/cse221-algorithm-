/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1task2takegraphinput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

/**
 *
 * @author Farhan
 */
public class Lab1task2takeGraphInput {
    public static void main(String[] args) throws IOException {
    try{
        BufferedReader r=new  BufferedReader(new FileReader(new File("H:\\lab 221 done till 8\\Lab1\\lab1task2takeGraphInput\\src\\lab1task2takegraphinput\\input.txt")));
        String s ;
        while(null!=(s=r.readLine())){
         System.out.println(s);       
        }
    
        
    }catch(FileNotFoundException e){
           System.out.println("error has occer!!");
         //  } 
   }
 }
}
    

