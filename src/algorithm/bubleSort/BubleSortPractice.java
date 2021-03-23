package algorithm.bubleSort;

public class BubleSortPractice {
   static int [] array={12,3,7,15,21,6,31,19,8,31,5,75,95,101,211,87,35,49,66,78,54};


    static void  bubleSort(int[] array){
        for (int j = array.length-1; j >0; j--) {
            for (int i = 0; i < j; i++) {
                if(array[i]>array[i+1]){
                    swag(array,i,i+1);
                }
            }
        }
    }
static void bubleSortRe(int[] array){
        bubleSort_o(array,array.length-1);

}

    private static void bubleSort_o(int[] array, int round) {
    if(round==0)return;
        bubleSort_i(array,round,0);
        bubleSort_o(array,round-1);
    }

    private static void bubleSort_i(int[] array, int round, int check) {
        if(check==round)return;
        if(array[check]>array[check+1]){
            swag(array,check,check+1);
        }
        bubleSort_i(array,round,check+1);
    }

    private static void swag(int[] array, int i, int i1) {
        int temp=array[i];
        array[i]=array[i+1];
        array[i+1]=temp;
    }

    public static void main(String[] args) {
        long a=System.currentTimeMillis();
        BubleSortPractice.bubleSort(BubleSortPractice.array);
        long b=System.currentTimeMillis();

        BubleSortPractice.bubleSortRe(BubleSortPractice.array);
        long c=System.currentTimeMillis();
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("迴圈spend="+(b-a)+"毫秒");
        System.out.println("遞迴spend="+(c-b)+"毫秒");
    }
}
