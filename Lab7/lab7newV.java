import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class lab7newV{
  public static String city[];
 public static void main(String[] args) throws FileNotFoundException, IOException {
       BufferedReader bf=new BufferedReader(new FileReader(new File("graph.txt")));     
       StringTokenizer st=new StringTokenizer(bf.readLine()," ");
       String start=st.nextToken();
       String end=st.nextToken();
       st=new StringTokenizer(bf.readLine()," ");
        city=new String[st.countTokens()];
       int c=0;
       while(st.hasMoreTokens()){
       city[c++]=st.nextToken();
       }
       
       
       
       
       
       
       
       int g[][]=new int[city.length][city.length];
       
       while(bf.ready()){
       st=new StringTokenizer(bf.readLine()," ");  
       int q=index(st.nextToken());
       
       int w=index(st.nextToken());
       int b=Integer.parseInt(st.nextToken());
       g[q][w]=b;
       g[w][q]=b;
       }    
       
       for(int i=0;i<g[0].length;i++){
       System.out.print(city[i]+"\t");
       }
       System.out.println();
       for(int i=0;i<g[0].length;i++){
       for(int ii=0;ii<g[0].length;ii++){
       System.out.print(g[i][ii]+" \t");
       }
       System.out.println();
       }
       
       
       
       
       prims_mst( g,13);
       
       System.out.println("\n"+path(index(start)));
      System.out.println(java.util.Arrays.toString(dist));
       System.out.println(java.util.Arrays.toString(parent));
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
 public static int index(String a){
   for(int i=0;i<city.length;i++){
     
   if(a.equals(city[i])) return i;
   }
   return -8;
 }
 public static String path(int i){
   String a=""+city[i];
   while(parent[i]!=-1){
   a+="-->"+city[parent[i]];
   i=parent[i];
   }
   return a;
 }
 
 
  public static int parent[];
  public static int dist[];
  public static boolean visit[];
  public static void prims_mst(int g[][],int s){
    dist=new int[g[0].length];
    parent=new int[g[0].length];
    visit=new boolean[g[0].length];
    for(int i=0;i<dist.length;i++){
      dist[i]=1000;
      parent[i]=-1; 
    }
    dist[s]=0;
    PriorityQueue p=new PriorityQueue();
    p.add(dist[s]);
    
    while(!p.isEmpty()){
      int u=(Integer)p.poll();
      int t=-8;
      
      for(int i=0;i<dist.length;i++){
        if(u==dist[i]){
         t=i;
        }
      }
      if(t!=-8){
       
      for(int i =0;i<g[0].length;i++){
        
        if(!visit[i]&&!visit[t]&&g[t][i]!=0&&dist[i ]>g[t][i]+dist[t]){
         
        visit[t]=true;
        parent[i]=t;
        
        dist[i]=g[t][i]+dist[t];
        p.add(dist[i]);
        }
      }
      }
    }
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}