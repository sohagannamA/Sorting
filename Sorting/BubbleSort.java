public class BubbleSort {
     public int[] BubbleSortFunction(int myarray[]){
          for(int i=0;i<myarray.length;i++){
               for(int j=0;j<myarray.length-i-1;j++){
                    if(myarray[j]>myarray[j+1]){
                         int temp=myarray[j];
                         myarray[j]=myarray[j+1];
                         myarray[j+1]=temp;
                    }
               }
          }
          return myarray;
     }
}
