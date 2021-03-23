package dataStructure.queue;

public class QueueByArray {

    Integer [] ary;
    Integer [] queue;
    Integer i_front=null;
    Integer i_end=null;

    public QueueByArray(Integer[] ary) {
         queue =new Integer[ary.length];
         init();
    }

    private void init() {
        for (int i = 0; i < ary.length; i++) {
            push(ary[i]);
        }
    }

    private void push(Integer val) {
        if(size()==queue.length)return expand_space();
        if(size()==0){
            i_front=0;
            i_end=0;
        }else {
            i_end++;
            i_end%=queue.length;
        }
        queue[i_end]=val;
    }

    private int size() {
        if(i_front==null&&i_end==null){
            return 0;
        }
        else if(i_end>=i_front) {
            return i_end-i_front+1;
        }
        else if(i_end<i_front){
            return  queue.length-i_front+i_end+1;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
