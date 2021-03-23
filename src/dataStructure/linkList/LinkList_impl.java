package dataStructure.linkList;

public class LinkList_impl {





   static  class Node {
        Integer val;
        Node next;

         public Node(Integer val) {
             this.val = val;
         }
     }



    Node start;
    Node end;

    void add(int val){
        Node node=new Node(val);

if(start==null){
    start=node;
}else {

    System.out.println("node address="+System.identityHashCode(node));
    System.out.println("end address="+System.identityHashCode(end));
    System.out.println("end.next address="+System.identityHashCode(end.next));
    end.next=node;
    System.out.println("end.next->node");
    System.out.println("node address="+System.identityHashCode(node));
    System.out.println("end address="+System.identityHashCode(end));
    System.out.println("end.next address="+System.identityHashCode(end.next));
}
    end=node;
    System.out.println("end->node");
    System.out.println("node address="+System.identityHashCode(node));
    System.out.println("end address="+System.identityHashCode(end));
    System.out.println("end.next address="+System.identityHashCode(end.next));
    System.out.println("結束----------------------------------------------------");
    }

    public Integer search(int val) {

        Node node=start;
        if (start == null) return null;

        while (true){
         if(node.next==null) return null;
         if (node.val==val) return node.val;
         node=node.next;
        }
    }

    void remove(int val){
        Node node=start;
        Node target=null;
        Node preNode=null;
        if (start == null) {
            return;
        }

        while (true){
            if(node.next==null) return;
            if(node.val==val){
                target=node;
                break;
            }
            preNode=node;
            node=node.next;
        }
        if(target==start){
            start=target.next;
            return;
        }
        if (target==end){
            end=preNode;
            preNode.next=null;
            return;
        }
        preNode.next=target.next;
        target=null;
    }



    public static void main(String[] args) {
        LinkList_impl list=new LinkList_impl();
        list.add(4);
        list.add(5);
        list.add(21);
        list.add(9);
        System.out.println();
        Integer cc= list.search(21);
        System.out.println(cc);

        list.remove(100);
        System.out.println();
    }



}


