package dataStructure.stack;

public class Stack_implByArray {
Integer []arr;
Integer []stack;
Integer i_top=null;

    public Stack_implByArray(Integer[] arr) {
        this.arr = arr;
        init();
    }
    public void init(){
        stack=new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            push(arr[i]);
        }

    }
    private void push(Integer val) {
        if(size()==stack.length) expand_space();

        if(size()==0){
            i_top=0;
        } else {
            i_top++;
        }
        stack[i_top]=val;
    }

    private void expand_space() {
        Integer [] stack_new=new Integer[stack.length*2];
        for (int i = 0; i <stack.length; i++) {
            stack_new[i]=stack[i];
        }
        stack=stack_new;
    }

    private int size() {
        if(i_top==null)return 0;
        return i_top+1;
    }


    Integer pop(){
        if (size()==0)return null;

        int val=stack[i_top];
        stack[i_top]=null;
        if(size()==1) {
            i_top=null;
        } else {
            i_top--;
        }
        return val;
    }

    public static void main(String[] args) {
Integer[] nums=new Integer[]{1,7,19,23,13};
        Stack_implByArray stack=new Stack_implByArray(nums);
        stack.push(31);
        System.out.println();
        stack.pop();
        stack.pop();
        System.out.println();
    }
}
