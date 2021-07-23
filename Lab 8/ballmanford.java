import java.util.*;
import java.io.*  ;
public class ballmanford{
  public static void main(String[] args) throws FileNotFoundException, IOException {
    BufferedReader bf=new BufferedReader(new FileReader(new File("C:\\Users\\Farhan\\Documents\\NetBeansProjects\\successfull lab 8\\graph.txt")));
    StringTokenizer i=new StringTokenizer(bf.readLine()," ");
    int v=Integer.parseInt(i.nextToken());
    int e=Integer.parseInt(i.nextToken());
    edge[]ed=new edge[e];
    for(int ii =0;ii<e;ii++){
      i=new StringTokenizer(bf.readLine()," ");
      ed[ii]=new edge(Integer.parseInt(i.nextToken()),Integer.parseInt(i.nextToken()),Integer.parseInt(i.nextToken()));
    } 
    for(int ii =0;ii<e;ii++){
      System.out.println(ed[ii]);
    }
    
    
    for(int i2 =1;i2<v;i2++){
      System.out.print("\t\t"+i2);
    }System.out.println();
    for(int a=1;a<=v;a++){
      bel(ed,a,v);
      
      
      System.out.print(a);
      for(int i2 =0;i2<v;i2++){
        System.out.print("\t\t"+dist[i2]);
      } System.out.println();
    }
    
    
    
    
    
    
    
    
    
    System.out.println();
    
//    System.out.println(java.util.Arrays.toString(parent));
//    System.out.println(java.util.Arrays.toString(dist));
  }
  
  
  
  public static int dist[];
  public static int parent[];
  
  
  public static void bel(edge a[],int s,int ver ){
    dist=new int[ver];
    parent=new int[ver];
    for(int i=0;i<parent.length;i++){
      dist[i]=10000;
      parent[i]=-1;
    }
    dist[s-1]=0;
    
    
    for(int i=0;i<ver;i++ ){
      for(int i1=0;i1<a.length;i1++ ){
        if(dist[a[i1].v-1]>dist[a[i1].u-1]+a[i1].w){
          dist[a[i1].v-1]=dist[a[i1].u-1]+a[i1].w;
          parent[a[i1].v-1]=a[i1].u-1;
        }
      }
    }
    for(int i1=0;i1<a.length;i1++ ){
      if(dist[a[i1].v-1]>dist[a[i1].u-1]+a[i1].w){
        System.out.println("Negetive cycle found");
        break;
      }
      
      
    }
    
    
  }
}