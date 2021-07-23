import java.util.Scanner;
public class lab10{
  public static void main(String arg[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter String 1");
    //String a=sc.nextLine();
     String b="nahraf";
    System.out.println("Enter String 2");
    //String b=sc.nextLine();
     String a="farhan";
    System.out.println(lcs( a, b,0,0));
  }
  public static int dp[][];
  public static int lcsR(String a,String b,int aa,int bb){
  if(aa>=a.length()||bb>=b.length()) return 0;
  if(dp[aa][bb]!=-1) return dp[aa][bb];
  int ret1=0,ret2=0;
  if(a.charAt(aa)==b.charAt(bb)){
    //System.out.println(aa+"   "+bb);
   dp[aa][bb]=1+lcsR( a,b,aa+1, bb+1);
    
    return dp[aa][bb];
  }else{
    //System.out.println(aa+"   "+bb);
  ret1=lcsR( a,b,aa, bb+1);
  ret2=lcsR( a,b,aa+1, bb);
  }
   dp[aa][bb]=Math.max(ret1,ret2);
   return dp[aa][bb];
  }
  public static int lcs(String a,String b,int aa,int bb){
    dp=new int[a.length()+1][b.length()+1];
    for(int i=0;i<dp.length;i++){
      for(int ii=0;ii<dp[0].length;ii++){
        dp[i][ii]=-1;
      }
    }
    return lcsR( a, b, aa, bb);
  }
}