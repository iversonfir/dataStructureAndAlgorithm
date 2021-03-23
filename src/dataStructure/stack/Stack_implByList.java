package dataStructure.stack;

public class Stack_implByList {
Integer [] ary;
Node node_top;

    static class Node {
        Integer val;
        Node next;

        public Node(Integer val) {
            this.val = val;
        }
    }

    public Stack_implByList(Integer[] ary) {
        this.ary = ary;
        init();
    }

    void init(){
        for (int i = 0; i < ary.length; i++) {
            push(ary[i]);
        }

    }

    private void push(Integer val) {

        Node node =new Node(val);
        if(node_top!=null){
        node.next=node_top;
        }
        node_top=node;
    }

    Integer pop(){
        if(node_top==null)return null;
        Integer val=node_top.val;
        node_top=node_top.next;
        return  val;
    }

    public static void main(String[] args) {
        Integer [] nums=new Integer[]{1,5,7,19,23,13};
        Stack_implByList stack=new Stack_implByList(nums);
        System.out.println();
        stack.push(31);
        System.out.println();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println();
    }
}
