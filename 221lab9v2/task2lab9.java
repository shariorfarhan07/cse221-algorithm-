 import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Stack;
public class task2lab9{
public static  Stack q=new Stack();
public static void main(String[] args) throws FileNotFoundException, IOException {
    BufferedReader bf=new BufferedReader(new FileReader(new File("input2.txt")));
    StringTokenizer st=new StringTokenizer(bf.readLine()," ");
    int t =Integer.parseInt(st.nextToken());
    for(int count =0;count<t;count++){
    st=new StringTokenizer(bf.readLine()," ");
    int n =Integer.parseInt(st.nextToken());
    int b[]=new int[n+1];
    int co[]=new int[n+1];
    st=new StringTokenizer(bf.readLine()," ");
    int cap=0;
    for(int c=1;c<b.length;c++){
     n =Integer.parseInt(st.nextToken());
     b[c]=n;
     co[c]=n;
     cap+=n;
    }
  //  System.out.println(java.util.Arrays.toString(b));
  //  System.out.println(java.util.Arrays.toString(co));
    // System.out.println(cap);
    knap( cap/2,co.length-1, co, b);
     
   
     // Karim: 2 3, Rahim: 5, difference: 0
    System.out.print(" Karim: "+gets(b,cap/2));
     knap( cap/2,co.length-1, co, b);
    System.out.print(" Rahim: "+getss(b,cap/2));
    df(b);
    
     
    
    
    
    
    
    
    
  
    } 
    
    }
public static void df(int b[]){
  String a =" ";
  for(int i =0;i<b.length;i++){
  if(b[i]!=0)a+=b[i]+" ";
  }
  if(a.equals(" "))a="0";
 System.out.println(" Difference:"+a+".");
}

public static String gets(int b[],int cap){
   String a="";
   int aa=0;
   while(!q.isEmpty()){
   int n =(int)q.pop();
   aa=b[n]+aa;
   if(aa<=cap){a=b[n]+","+a;
   //a+=n+" ";
   b[n]=0;
   }else if(cap==aa)break;
   }
  return a;
}
public static String getss(int b[],int cap){
   String a="";
   int aa=0;
   while(!q.isEmpty()){
   int n =(int)q.pop();
   aa=b[n]+aa;
   if(aa<=cap+1){a=b[n]+","+a;
   //a+=n+" ";
  if(aa<=cap) b[n]=0;
   }else if(cap==aa)break;
   }
  return a;
}


public static int m[][];
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
           if(!q.contains(j)) {q.add(j);}
           }else{
            m[j][ww]=m[j-1][ww];
           }
         
         
         
         
         }
     }
     }

}





}

