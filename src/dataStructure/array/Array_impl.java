package dataStructure.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Array_impl {

    Integer [] array;
    int i_end;
    public Array_impl(int size) {
        this.array = new Integer[size];
        i_end=-1;
    }

    public void add_by_index(int i_add, int val){
        /**
        step1.
        判斷包包是否已裝滿
        如果相等表示空間已滿
        array.length 表示包包可以裝多少物品
        i_end+1      表示包包內的物品數量
         舉例:包包可以裝多少顆球
         創建一個可以裝5顆球的包包
         包包內有5個小袋子編號是0~4
         當包包滿了就要擴充包包的空間
        */
        if(array.length==i_end+1) expand();

        /**
         * step2
         * 而想要在包包內放置的位置 不能小於0或是 超過最後一位的下個位置
         * 舉例來說
         * 1.不可能有-1的位置
         * 2.若不指定位置只能新增在最後一位的下一位
         * 現在最後一位在2號位置
         * 最後一位的下一位就是3號位置
         * 超過3號位置去選擇4號就意味著類費了3號位置的空間
         */
        if(i_add<0||i_add>i_end+1) return;
        /**
         * 備註 step1和step2的i_end+1意義不同
         * step1的i_end+1表示目前包包有多少物品
         * step2的i_end+1表示最後一位置的下一個位置
         */


        /**
         * step3.
         * 把空間讓出來才能將物品放入
         * 從最後面一位i_end開始直到>=i_add
         * 不要用>i_add-1結果是一樣的但解讀不值觀
         */
        for (int i = i_end; i >= i_add; i--) {
            array[i+1]=array[i];
            array[i]=null;
        }
        /**
        * step4.
         * 塞入值
        * */
        array[i_add]=val;
        /**
         * step5.
         * 物品加入後
         * 最後一個物品的位置就會變到下一位
         * */
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
        for (int i = 0; i <=i_end ; i++) {
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
        for (int i = 0; i <= i_end; i++) {
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
        array_impl.remove_by_val(100);
        System.out.println();



  List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();

  Map<String,Object> map=new HashMap<String,Object>();
  map.put("a",162);
  Map<String,Object> map1=new HashMap<String,Object>();
  map1.put("b",8);

  Map<String,Object> map2=new HashMap<String,Object>();
  map2.put("c",56);
  Map<String,Object> map3=new HashMap<String,Object>();
  map3.put("d",7);
  list.add(map);
  list.add(map1);
  list.add(map2);
  list.add(map3);
  Map<String,Object> map4=new HashMap<String,Object>();
  map4.put("e",21);
 list.add(2,map4);
  list.remove(0);
  System.out.println();

  Integer [] aca=new Integer[5];

 }

}
