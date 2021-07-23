package lab2task1;
/**
 *
 * @author Farhan
 */
public class MyArray {
  int a[];
  public MyArray(int aa[]){
   int n[]=new int[aa.length];
    for(int i=0;i<aa.length;i++){ 
      
      n[i]=aa[i];
  }
    a=n;
  }
  
  
  public void print(){
    for(int i =0;i<a.length;i++){
      System.out.print(a[i]+" ");
      
    }System.out.println();
  }
  
  public int[] MargeSort(){
   return MargeSort(a);
  }
  public int[] MargeSort(int input[]){
    if(input.length<2)return input;
    int mid=input.length/2;
    int a[]=new int[mid];
    int b[];
    if(input.length%2==0){
      b=new int[mid];
    }else{
      b=new int[mid+1];
    }
    int count=0;
    for(int i=0;i<a.length;i++ ){
      a[i]=input[count++];
    }
    
    for(int i=0;i<b.length;i++ ){
      b[i]=input[count++];
    }
    a=MargeSort(a);
    b=MargeSort(b);
    int aa[]= marge(a,b);  

    return aa;
  }
  
  
  public int [] marge(int a[],int b[]){
    int c []=new int[a.length+b.length];
    int bb=0;
    int aa=0;
    for(int i=0;i<c.length;i++ ){
      if(aa<a.length&&bb<b.length){
        if(a[aa]<=b[bb]){c[i]=a[aa++];}
        else {c[i]=b[bb++];  }
      }else if(aa<a.length){
        c[i]=a[aa++];
      }else{
        c[i]=b[bb++];
      }
    }
    
    
    return c;
  }
  
  
  public void insertionSort(){
    
    for(int j=1;j<a.length;j++){
      int i =j-1;
      int key=a[j];
      while(i>=0&&a[i]>key){
        a[i+1]=a[i];
        i=i-1;
      }
      a[i+1]=key;
    }
    
  }
  public int partition(int a[],int start,int end){
      int pivot=a[end];
      int i =start-1;
      int j=start;
      while(j<end){
      if(a[j]<pivot){
        int temp =a[j];
        a[j]=a[i+1];
        a[i+1]=temp;
        i++;
      }j++;
      }
      a[end]=a[i+1];
      a[i+1]=pivot;
      return i+1;
  }
      
      
      public int partitionR(int a[],int start,int end){
      int pivot=a[(int)Math.random()%a.length];
      int i =start-1;
      int j=start;
      while(j<end){
      if(a[j]<pivot){
        int temp =a[j];
        a[j]=a[i+1];
        a[i+1]=temp;
        i++;
      }j++;
  }
      a[end]=a[i+1];
      a[i+1]=pivot;
      return i+1;
      
      }
      
      
   public void quickSort(){
   quickSort(a, 0 ,a.length-1);
   }
    public void quickSortR(){
   quickSort(a, 0 ,a.length-1);
   }
   
     public void quickSortR(int a[],int start ,int end){
       if(end-start<2)return;
      int partition=partitionR(a,start,end);
      quickSort(a,start,partition-1);
      quickSort(a,partition+1,end);
  
  }
   
  public void quickSort(int a[],int start ,int end){
       if(end-start<2)return;
      int partition=partition(a,start,end);
      quickSort(a,start,partition-1);
      quickSort(a,partition+1,end);
  
  }
   public int  findk(int k){
    return findk(a,0 ,a.length-1, k);
   }
  public int  findk(int a[],int start ,int end,int k){
  //if(end-start<2)return -1;
  int partition =partition(a,start,end);
  if(k==partition) return a[k];
  if(partition<k) return findk( a,partition+1,end ,k);
  else  return findk( a,start,partition-1,k);
  
  }
}
