package algorithm.bubleSort;

public class BubleSort {

  static   int array[]={17,9,3,5,1,31,4,21,7};

    static void sortRe(int array[]){
        sort_o(array,array.length-1);
    }

    private static void sort_o(int[] array, int check) {
        if(check==0) return ;
        sort_i(array,check,0);
        sort_o(array, check-1);
    }

    private static void sort_i(int[] array, int check,int success) {
        if(success==check) return;//查詢的次數與check相同
        if(array[success]>array[success+1]) sw(array,success,success+1);
        sort_i(array, check,success+1);
    }


    static void sortArray(int array[]){
    int count=0;
    for (int i = array.length-1; i >0 ; i--) {
        for (int j =0 ; j <i ; j++) {
            count++;
            if(array[j]>array[j+1]) sw(array,j,j+1);
        }
    }
    System.out.println("me="+count);
}

     static void sw(int[] array1, int i, int j) {
    int temp=array1[i];
        array1[i]=array1[i+1];
        array1[i+1]=temp;
    }


    public static void main(String[] args) {

//    BubleSort.sortArray(BubleSort.array);
//        System.out.println();
        BubleSort.sortRe(BubleSort.array);
        System.out.println();
    }
}
