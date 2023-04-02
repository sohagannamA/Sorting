public class CountingSort {
     public int[] CountingSortfunc(int myarray[]){
          int maxvalue=Integer.MIN_VALUE;
          for(int i=0;i<myarray.length;i++){
               maxvalue=Math.max(myarray[i], maxvalue);
          }
          int count[]=new int[maxvalue+1];
          for(int i=0;i<myarray.length;i++){
               count[myarray[i]]++;
          }
          int track=0;
          for(int i=0;i<count.length;i++){
               while(count[i]>0){
                    myarray[track]=i;
                    count[i]--;
                    track++;
               }
          }
          return myarray;
     }
}
