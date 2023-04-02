public class SelectionSort {
     public int[] SelectionSortFunction(int myarray[]){
          for(int i=0;i<myarray.length-1;i++){
               int min=i;
               for(int j=i+1;j<myarray.length;j++){
                    if(myarray[j]<myarray[min]){
                         min=j;
                    }
               }
               int temp=myarray[i];
               myarray[i]=myarray[min];
               myarray[min]=temp;
          }
          return myarray;
     }    
}
