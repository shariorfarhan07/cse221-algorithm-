import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class task2knapsack{
  public static void  main(String arg[]) throws FileNotFoundException, IOException{
  BufferedReader bf=new BufferedReader(new FileReader(new File("D:\\arko sir\\input2.txt")));
        int []w=new int[0];
        int []b=new int[0];
        int test=Integer.parseInt(bf.readLine());
        
        for(int i =0;i<test;i++){
       
        
        StringTokenizer st=new StringTokenizer(""," ");
   
        int v;
        while(bf.ready()){
        int capacity=Integer.parseInt(bf.readLine());
        w=new int[capacity+2];
        b=new int[capacity+2];
            st=new StringTokenizer(bf.readLine()," ");
            for(int ii =1;ii<capacity;ii++){
            v=Integer.parseInt(st.nextToken());
            
            b[ii]=v;
           
            w[ii]=v;
             System.out.println(ii+"  "+w[ii]+" "+b[ii]);
            
            }
        }
        
 
      
      
      
      
      
      
      
      
        }   
    }
}
