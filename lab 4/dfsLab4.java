import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class dfsLab4{
  public static void main(String[] args) throws FileNotFoundException, IOException {
    BufferedReader bf=new BufferedReader(new FileReader(new File("C:\\Users\\Farhan\\Documents\\NetBeansProjects\\lab 4\\text.txt")));
    StringTokenizer stt=new StringTokenizer(bf.readLine()," ");
    int m=0;
    while(stt.hasMoreTokens()){
      m=Math.max(m, Integer.parseInt(stt.nextToken()));
    }
    System.out.println("number of vertex "+m);
    int g[][]=new int[m+1][m+1];
    
    
    while(bf.ready()){
      stt=new StringTokenizer(bf.readLine()," ");
      int t= Integer.parseInt(stt.nextToken());
      int i=0; 
      while(stt.hasMoreTokens()){
        g[t][i++]=Integer.parseInt(stt.nextToken());
      }
    }
    
    for(int i=0;i<g[0].length;i++){
      for(int ii=0;ii<g[0].length;ii++){
        System.out.print(g[i][ii]+" ");
      }
      
      System.out.println();
    }
    
    
    
    dfs( g,1 );
    //System.out.println(java.util.Arrays.toString(parent));
    
    // System.out.println(java.util.Arrays.toString(color));
    
//  System.out.println(java.util.Arrays.toString());
//  
//  
//  System.out.println(java.util.Arrays.toString());
    int a []=sort(st);
    int p[]=sort(ft);
    
    System.out.println("\n\n\nTask 1");
    System.out.println("Discovered Nodes:");
    print(a);     
    System.out.println("Processed Nodes:");
    print(p);  
    //After Topological Sort: Nodes: 1 ? 3 ? 6 ? 2 ? 5 ? 4
    System.out.println("\n\n\nTask 2");
    System.out.println("After Topological Sort: Nodes:");
    
    
    for(int i=0;i<topology.length-1;i++){
     System.out.print(topology[topology.length-1-i]);
     if(st.length-2==i){
        System.out.println(".");
      }else{
        System.out.print("-->");
      }
    }
     System.out.println("Finish Times:");
     for(int i=0;i<topology.length-1;i++){
     System.out.print(ft[topology.length-1-i]);
     if(st.length-2==i){
        System.out.println(".");
      }else{
        System.out.print("  ");
      }
    }
    
    
    
    
    
    
    
  }
  
  public static void print(int a[]){
    for(int i=1;i<a.length;i++){
      System.out.print(a[i]);
      if(st.length-1==i){
        System.out.println(".");
      }else{
        System.out.print(",");
      }
    }
  }
  public static  int count=0;
  public static int []parent;
  public static int []st;
  public static String color[];
  public static int time=0;
  public static String topology[];
  
  public static int []ft;
  
  
  
  
  
  
  
  public static void dfs(int g[][],int s ){
    time=0;
    parent=new int[g[0].length];
    st=new int[g[0].length];
    ft=new int[g[0].length];
    topology=new String[g[0].length];
    color=new String[g[0].length];
    for(int i =0;i<parent.length;i++){
      parent[i]=-1;
      color[i]="white";  
    }
    for(int i=0;i<g[0].length;i++){
      if(color[i].equals("white")){
        
        dfs_visit(g,i);
      }
      
    }
  }
  
  public static void dfs_visit(int g[][],int s ){
    // System.out.println(s);
    color[s]="Grey";
    time++;
    st[s]=time;
    for(int i=0;i<g[0].length;i++){
      if(color[i].equals("white")&&g[s][i]==1){
        parent[i]=s;
        dfs_visit(g,i);
      }
    }
    color[s]="black";
    time++;
    ft[s]=time;
    
    topology[count++]=""+s;
  }
  
  public static int [] sort(int a []){
    int b[]=new int[a.length];
    int aa[]=new int[a.length];
    for(int i=0;i<b.length;i++){
      b[i]=i;
      aa[i]=a[i];
    }
    
    for(int i=0;i<b.length;i++){
      for(int ii=0;ii<b.length;ii++){
        if(aa[ii]>aa[i]){
          int temp=aa[i];
          aa[i]=aa[ii];
          aa[ii]=temp;
          temp=b[i];
          b[i]=b[ii];
          b[ii]=temp;
          
        }
      }
    }
    return b;
  }
  
  
  
  
  
}