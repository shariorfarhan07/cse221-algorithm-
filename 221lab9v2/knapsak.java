import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class knapsak{
public static int m[][];
public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader bf=new BufferedReader(new FileReader(new File("input.txt")));
        int item=Integer.parseInt(bf.readLine());
        int capacity=Integer.parseInt(bf.readLine());
        int []w=new int[item+1];
        int []b=new int[item+1];
        int c =0;
        StringTokenizer st=new StringTokenizer(""," ");
        while(bf.ready()){
            st=new StringTokenizer(bf.readLine()," ");
            c=Integer.parseInt(st.nextToken());
            b[c]=Integer.parseInt(st.nextToken());
            w[c]=Integer.parseInt(st.nextToken());
            
        }
      for(int i =0;i<b.length;i++){
     System.out.println(i+"  "+w[i]+" "+b[i]);
}    
      knap(capacity,item, w,  b);
      
      System.out.println("Array print");
      for(int i =0;i<m.length;i++){
      for(int ii =0;ii<m[0].length;ii++){
        System.out.print(m[i][ii]+"\t");
      }
        System.out.println();
      }
  
    }

public static void knap(int cap,int n,int w[], int b[]){
     m=new int[n+1][cap+1];
     for(int j=1;j<=n;j++){
       for(int ww=1;ww<=cap;ww++){
         if(w[j]>ww){
         m[j][ww]=m[j-1][ww];
         }  else{
         // m[j][ww]=Math.max(b[j]+m[j-1][ww-w[j]],m[j-1][ww]);
           if(b[j]+m[j-1][ww-w[j]]>m[j-1][ww]){
           m[j][ww]=b[j]+m[j-1][ww-w[j]];
           }else{
            m[j][ww]=m[j-1][ww];
           }
         }
     }
     }

}

}