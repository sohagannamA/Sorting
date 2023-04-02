class MainClass{
     public static void  Display(int myarray[]){
          for(int i=0;i<myarray.length;i++){
               System.out.print(myarray[i]+" ");
          }
     }
     public static void main(String[]args){
          int myarray[]={5,4,1,3,2};
          System.out.println("for bubble sort:-");
          BubbleSort Bs=new BubbleSort();
          Bs.BubbleSortFunction(myarray);
          Display(myarray);
          System.out.println("\nfor selection sort:-");
          SelectionSort Ss=new SelectionSort();
          Ss.SelectionSortFunction(myarray);
          Display(myarray);
          System.out.println("\nfor counting sort:-");
          CountingSort Cs=new CountingSort();
          Cs.CountingSortfunc(myarray);
          Display(myarray);

     }
}