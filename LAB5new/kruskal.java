import java.util.PriorityQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class kruskal{
//  public class edge{
//  int start;
//  int end;
//  int w;
//  public edge(int s,int e,int ww){
//    start=s;
//    end=e;
//    w=ww;
//  
//  }
//  }
  public static void main(String arg [])throws FileNotFoundException, IOException {
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
    c=0;
    for(int i=0;i<g[0].length;i++){
      for(int ii=0;ii<g[0].length;ii++){
        if(g[i][ii]!=0)c++;
      }
    }
    edge e[]=new edge[c];
    
    c=0;
    
    
    PriorityQueue q=new  PriorityQueue();
    for(int i=0;i<g[0].length;i++){
      for(int ii=0;ii<g[0].length;ii++){
        if(g[i][ii]!=0){
          e[c++]=new edge(i,ii,g[i][ii]);
          q.add(g[i][ii]);
        }
      }
    }
    
    c=0;
    int parent[]=new int [city.length];
    boolean visit[]=new boolean [city.length];
    int dist[]=new int [city.length];
    
    for(int i=0;i<g[0].length;i++){
      parent[i]=-1;
      
      dist[i]=100000;
      
      
    }
    
    
    c=0;
//    for(int i=0;i<e.length;i++){
//    System.out.println(e[i]);
//    }
    while(!q.isEmpty()&&c<city.length){
      int rr=(int)q.remove();
      int r=-1;
    
      for(int a=0;a<e.length;a++){
        
        if(e[a].w==rr){
          r=a;
           
           break;
        }else{
          r=-1;
        }
      }
      if(r!=-1&&dist[e[r].end]>e[r].w&&!visit[e[r].start]){
        visit[e[r].end]=true;
        parent[e[r].end]=e[r].start;
        dist[e[r].end]=e[r].w;
        e[r].w=0;
        c++;
        
   
        
        
        
      }
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
   System.out.println(path(city,parent));
    
    
  }
  
   public static String path(String city[],int parent[]){
   String a="";
   for(int i =1;i<parent.length;i++){
   a+="("+city[parent[i]]+","+city[i]+")";
   
   }
   return a;
 }
  
  
  
  
}