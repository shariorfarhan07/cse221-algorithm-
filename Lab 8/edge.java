public class edge{
  public int u;
  public int v;
  public int w;
  public edge(int uu,int vv,int ww){
    u=uu;
    v=vv;
    w=ww;
  }
  public String toString(){
  return u+"--"+w+"--> "+ v;
  }
  public static void sort(edge[]a,int s){
    int c=0;
    for(int i =0;i<a.length;i++){
      if(a[i].u==s-1){
        edge temp=a[c];
        a[c]=a[i];
        a[i]=temp;
        c++;
      }
    }
  }
}