package dataStructure.array;

public class Array_practice {
   Integer [] array;
    int i_end;
    public Array_practice(int size) {
        this.array = new Integer[size];
        i_end=-1;
    }

    public void add_by_index(int i_add, int val){
        if(array.length==i_end+1) expand();
        if(i_add<0||i_add>i_end+1) return;
        for (int i = i_end; i >= i_add; i--) {
            array[i+1]=array[i];
            array[i]=null;
        }
        array[i_add]=val;
        i_end++;
   }

    public void add_by_value(int val){
        add_by_index(i_end+1,val);
   }

    private void expand() {
        Integer []new_array=new Integer[array.length*2];
        for (int i = 0; i < i_end+1; i++) {
            new_array[i]=array[i];
        }
        array=new_array;
    }

    public Integer search_by_index(int index){
        if(index<0||index>i_end)return null;
        return array[index];
    }
    public Integer search_by_val(int val){
       for (int i = 0; i <i_end+1 ; i++) {
           if(array[i]==val)return val;
       }
       return null;
    }



    public void remove_by_index(int index){
    if(index<0||index>i_end)return;
    array[index]=null;

            for (int i = index+1; i <=i_end ; i++) {
            array[i-1]=array[i];
            array[i]=null;
            }
            i_end--;
    }
public  void  remove_by_val(int val){
    for (int i = 0; i < i_end+1; i++) {
        if(array[i]==val){
            remove_by_index(i);
            return;
        }
    }
}

    public static void main(String[] args) {
        Array_impl array_impl=new Array_impl(5);
        array_impl.add_by_value(1);
        array_impl.add_by_value(3);
        array_impl.add_by_value(5);
        array_impl.add_by_value(7);
        array_impl.add_by_value(9);
        array_impl.add_by_index(1,17);
        System.out.println();
        Integer a= array_impl.search_by_val(5);
        Integer b=array_impl.search_by_val(100);
        Integer c=array_impl.search_by_index(2);
        Integer d=array_impl.search_by_index(20);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        array_impl.remove_by_index(2);
        array_impl.remove_by_val(17);
        System.out.println();
    }

}
