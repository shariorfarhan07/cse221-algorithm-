import java.util.*;
import java.io.*;

public class Nowshin {
    static int distance[];
    static int parent[];
    static boolean check[];
    static ArrayList<String> node = new ArrayList<String>();
    static String[] nx;
    static int[][] g ;
    static boolean checkblock[];
  public static void main(String[] args)throws Exception  { 
       BufferedReader bf=new BufferedReader(new FileReader(new File("F:\\221\\arko sir\\lab 221 done till 8\\lab7\\input.txt")));     
       String st = "";
       int vertex=Integer.parseInt(bf.readLine());
       int edge=Integer.parseInt(bf.readLine());
       
       g=new int[vertex+1][vertex+1];
       checkblock=new boolean[vertex+1];
       
       for(int i=0;i<edge;i++){
          StringTokenizer sst = new StringTokenizer(bf.readLine(), ",");
          g[Integer.parseInt(sst.nextToken())][Integer.parseInt(sst.nextToken())]=Integer.parseInt(sst.nextToken());
       }
        for(int i=0;i<g.length;i++){
          for(int ii=0;ii<g.length;ii++){
             
            System.out.print(g[i][ii]+"\t");
          }
          System.out.println();
        }
       int start=Integer.parseInt(bf.readLine());
       int end=Integer.parseInt(bf.readLine());
        
        
        
      StringTokenizer sst= new StringTokenizer(bf.readLine(), ",");
        
        while(sst.hasMoreTokens()){
       checkblock[Integer.parseInt(sst.nextToken())]=true;    
      }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     //  String vertex=st.nextToken();
       
      // String edge=st.nextToken();
      // String end=st.nextToken();
       
      // st=new StringTokenizer(bf.readLine()," ");
     //   city=new String[st.countTokens()];
      // int c=0;
     //  while(st.hasMoreTokens()){
    //   city[c++]=st.nextToken();
      //}
  }
   //int b=Integer.parseInt(st.nextToken());
  /* ADD YOUR CODE HERE */
  
}
