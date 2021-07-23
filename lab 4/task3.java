import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Farhan
 */
public class task3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       BufferedReader bf=new BufferedReader(new FileReader(new File("maze.txt")));
       StringTokenizer st=new StringTokenizer(bf.readLine()," ");
       int m=0;
      
       m=Integer.parseInt(st.nextToken());
       int g[][]=new int[m+1][m+1];
      
       while(bf.ready()){
       st=new StringTokenizer(bf.readLine()," ");
       int t1=Integer.parseInt(st.nextToken());
       int t2=Integer.parseInt(st.nextToken());
       g[t1][t2]=1;
       g[t2][t1]=1;
       }
       System.out.println("adj of the maze");
       for(int i=0;i<g[0].length;i++){
         for(int ii=0;ii<g[0].length;ii++){
         System.out.print(g[i][ii]+" ");
         }
         
         System.out.println();
       }
       
       
       
       
       dfs(g,1);
       
    // System.out.println(java.util.Arrays.toString(parent));
      
     System.out.println("path is "+path(9));
       
        System.out.println("Maze solution");
     while(!q.isEmpty()){
       int n=(int)q.poll();
     System.out.print(n);
     if(n==9){System.out.println(".");break;}
     else{System.out.print("-->");}
     }
       
     while(!q.isEmpty()){ q.poll();}
       
       
       
       
       
       
       
       
       
    }
    
    public static String path(int i){
    String a=""+i;
    while(parent[i]!=-1){
    a=parent[i]+"-->"+a;
      i=parent[i];
    }
    return a+"\n";
    }
    
    
    
     public static  int count=0;
  public static int []parent;
  public static int []st;
  public static String color[];
  public static int time=0;
  public static String topology[];
  
  public static int []ft;
  
  
   public static  Queue q;
  
  
  
  
  public static void dfs(int g[][],int s ){
    time=0;
     q=new LinkedList();
    parent=new int[g[0].length];
    st=new int[g[0].length];
    ft=new int[g[0].length];
    topology=new String[g[0].length];
    color=new String[g[0].length];
    for(int i =0;i<parent.length;i++){
      parent[i]=-1;
      color[i]="white";  
    }
    q.add(s);
    for(int i=0;i<g[0].length;i++){
 
      if(color[i].equals("white")){
        
        dfs_visit(g,i,q,false);
      }
      
    }
  }
  public static boolean found=false;
  public static boolean dfs_visit(int g[][],int s  , Queue q,boolean n){
  //System.out.println("farhan"+s);
    color[s]="Grey";
    time++;
    st[s]=time;
    for(int i=0;i<g[0].length;i++){
      if(color[i].equals("white")&&g[s][i]==1){
      
        parent[i]=s;
        if(!n){q.add(i);}
        n=dfs_visit(g,i,q,n);
         if(!n){q.add(i);}
         
      }
    }
    color[s]="black";
    time++;
    ft[s]=time;
  
    topology[count++]=""+s;
    return false;
  }
}