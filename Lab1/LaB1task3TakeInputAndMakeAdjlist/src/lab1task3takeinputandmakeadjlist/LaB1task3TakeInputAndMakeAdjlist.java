
package lab1task3takeinputandmakeadjlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Farhan
 */
public class LaB1task3TakeInputAndMakeAdjlist {
    public static void main(String[] args) throws IOException {
        BufferedReader r = null;
    try{
       r=new BufferedReader(new FileReader(new File("H:\\lab 221 done till 8\\Lab1\\lab1task2takeGraphInput\\src\\lab1task2takegraphinput\\input.txt")));
       }catch(FileNotFoundException e){
       System.out.println("File was not read");
       }
       StringTokenizer st=new StringTokenizer(r.readLine());
       int size=Integer.parseInt(st.nextToken());
       ArrayList [] node=new ArrayList[size];
       ArrayList [] Dnode=new ArrayList[size];
       int[][]graphd=new int[size][size];
       int[][]graph=new int[size][size];
       for(int i=0;i<node.length;i++){
       node[i]=new ArrayList();
       Dnode[i]=new ArrayList();
       }
       while(r.ready()) {
           st=new StringTokenizer(r.readLine()," ");
           int t1=Integer.parseInt(st.nextToken());
           int t2=Integer.parseInt(st.nextToken());
           //for link list;
           node[t1].add(t2);
           node[t2].add(t1);
           Dnode[t1].add(t2);
           
           // for matrix
           graphd[t1][t2]=1;
           graph[t2][t1]=1;
           graph[t1][t2]=1;
       }
        System.out.println("\nList for undirected graph\n  ");
         System.out.print(" ");
         for(int i=0;i<graph.length;i++)
         System.out.print(" "+i);
         System.out.println();
        for(int i=0;i<graph.length;i++){
         System.out.print(i+" ");
        
        for(int ii=0;ii<graph.length;ii++){
                System.out.print(graph[i][ii]+" ");
        }                System.out.println();

        }
       
       
        System.out.println("\nList for undirected graph");
        for (int i =0;i<node.length;i++) {
            Iterator ii =node[i].iterator();
            System.out.print(i);
            while(ii.hasNext()){
            System.out.print("-->"+ii.next());
            }
            System.out.println();
        }
        
        System.out.println("\nDegree of undirected graph");
        for(int i =0;i<Dnode.length;i++){
        Iterator ii =node[i].iterator();
            System.out.print(i+"-->");
            int count=0;
            while(ii.hasNext()){
                ii.next();
            
            count++;
            }
            System.out.println(count);
            
        }
        System.out.println("\nList for directed graph\n");
          System.out.print(" ");
         for(int i=0;i<graphd.length;i++)
         System.out.print(" "+i);
         System.out.println();
        for(int i=0;i<graphd.length;i++){
         System.out.print(i+" ");
        
        for(int ii=0;ii<graphd.length;ii++){
                System.out.print(graphd[i][ii]+" ");
        }                System.out.println();

        }
        
        
        
        
       System.out.println("\nList for directed graph");
        for (int i =0;i<node.length;i++) {
            Iterator ii =Dnode[i].iterator();
            System.out.print(i);
            while(ii.hasNext()){
            System.out.print("-->"+ii.next());
            }
            System.out.println();
        }
         
        System.out.println("\nDegree of directed graph");
        int inorder[]=new int[size];
        
        int outorder[]=new int[size];
        
       for (int i =0;i<Dnode.length;i++) {
            Iterator ii =Dnode[i].iterator();
              
            while(ii.hasNext()){
                int a=(Integer) ii.next();
                inorder[a]++;
                outorder[i]++;
               // System.out.println(i+"  "+a);          
            }
        
        }
       for(int i =0;i<inorder.length;i++){
       System.out.println(i+"-->"+outorder[i]+'/'+inorder[i]);
       }
        
        
        
        
        
}
}
