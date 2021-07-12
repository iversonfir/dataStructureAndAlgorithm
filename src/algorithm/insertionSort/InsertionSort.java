package algorithm.insertionSort;


public class InsertionSort {
   static int[] array={17,9,3,5,1,31,4,21,7};


    public static void insertion_sort(int[] nums) {
        int count=0;
        for (int i_start = 0; i_start < nums.length; i_start++) {
            for (int j_run = i_start - 1; j_run >= 0; j_run--) {
                if (nums[j_run + 1] > nums[j_run]) {
                    swap(nums,j_run + 1, j_run);
                }else {
                    break;
                }
                count++;
            }
        }
        System.out.println("teacher="+count);
    }

   static void  myInsertionSort(int[] array){
       int count=0;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if(array[j]>array[j-1])break;
                swap(array,j,j-1);
                count++;
            }
        }
       System.out.println("my="+count);
    }

    static void  myInsertionSortRe(int[] array){
       insertionSort_o(array,1);
    }

   static void insertionSort_o(int[] array,int round){
       if(round==array.length)return;

       insertionSort_i(array,round,round);
       insertionSort_o(array,round+1);
    }
    static void insertionSort_i(int[] array,int round,int check){
            if(0==check)return;
            if(array[check]>array[check-1])return;
            swap(array,check,check-1);
        insertionSort_i(array,round,check-1);
    }
    private static void swap(int[] array, int left, int right) {
        int temp=array[right];
        array[right]=array[left];
        array[left]=temp;
    }

    public static void main(String[] args) {
//        InsertionSort.myInsertionSort(InsertionSort.array);
//        System.out.println();
//        InsertionSort.myInsertionSortRe(InsertionSort.array);
//        System.out.println();
        InsertionSort.insertion_sort(InsertionSort.array);
        System.out.println();
    }
}
