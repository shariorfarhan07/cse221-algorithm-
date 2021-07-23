import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class lab5{
 public static void main(String[] args) throws FileNotFoundException, IOException {
       BufferedReader bf=new BufferedReader(new FileReader(new File("graph.txt")));
       StringTokenizer st=new StringTokenizer(bf.readLine()," ");
       String city[]=new String[st.countTokens()];
       int c=0;
       while(st.hasMoreTokens()){
       city[c++]=st.nextToken();
       }
       int g[][]=new int[city.length][city.length];
       c=0;
       while(bf.ready()){
       st=new StringTokenizer(bf.readLine()," ");
       int cc=0;
       while(st.hasMoreTokens()){
       g[c][cc++]=Integer.parseInt(st.nextToken());
       }c++;
       }    
       
       for(int i=0;i<g[0].length;i++){
       System.out.print(city[i]+' ');
       }
       System.out.println();
       for(int i=0;i<g[0].length;i++){
       for(int ii=0;ii<g[0].length;ii++){
       System.out.print(g[i][ii]+"   \t");
       }
       System.out.println();
       }
       
       
       
       
       prims_mst( g,0);
       
//       System.out.println(java.util.Arrays.toString(parent));
//       System.out.println(java.util.Arrays.toString(key));
       System.out.println(path(city));
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
 
 public static String path(String city[]){
   String a="";
   for(int i =1;i<parent.length;i++){
   a+="("+city[parent[i]]+","+city[i]+")";
   
   }
   return a;
 }
 
 
  public static int parent[];
  public static int key[];
  public static boolean visit[];
  public static void prims_mst(int g[][],int s){
    key=new int[g[0].length];
    parent=new int[g[0].length];
    visit=new boolean[g[0].length];
    for(int i=0;i<key.length;i++){
      key[i]=Integer.MAX_VALUE;
      parent[i]=-1; 
    }
    key[s]=0;
    PriorityQueue p=new PriorityQueue();
    p.add(key[s]);
    
    while(!p.isEmpty()){
      int u=(Integer)p.poll();
      int t=-8;
      
      for(int i=0;i<key.length;i++){
        if(u==key[i]){
         t=i;
        }
      }
      if(t!=-8){
       
      for(int i =0;i<g[0].length;i++){
        
        if(!visit[i]&&!visit[t]&&g[t][i]!=0&&key[i]>g[t][i]){
         
        visit[t]=true;
        parent[i]=t;
        
        key[i]=g[t][i];
        p.add(key[i]);
        }
      }
      }
    }
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}