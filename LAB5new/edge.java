  public class edge{
  int start;
  int end;
  int w;
  public edge(int s,int e,int ww){
    start=s;
    end=e;
    w=ww;
  
  }
  public String toString(){
  return start+"--"+w+"-->"+end;
  }
  }