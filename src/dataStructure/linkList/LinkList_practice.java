package dataStructure.linkList;

public class LinkList_practice {

    //不加static就會跑出this物件
     static class Node{
         int val;
         Node next;

         public Node(int val) {
             this.val=val;
         }
     }
    private Node start;
    private Node end;

    public void add(int val){
        Node node =new Node(val);
        if(start==null){
           start=node;
        }else{
            end.next=node;
        }
        end=node;

    }

    public Integer search(int val){
        if(start==null)return null;
        Node node=start;
        while (true){
            if(node.next==null)return null;
            if(node.val==val)return val;
            node=node.next;
        }
    }


    public void remove(int val){

        if(start==null)return;
        Node node=start;
        Node target=null;
        Node preNode=null;

        while (true){
            if(node.next==null)return;
    if (node.val==val){
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
if(target==end){
    end=preNode;
    preNode.next=null;
    return;
}
preNode.next=target.next;
target=null;

    }

    public static void main(String[] args) {
LinkList_practice linkList=new LinkList_practice();
        linkList.add(5);
        linkList.add(7);
        linkList.add(3);
        linkList.add(11);
        System.out.println();
        Integer a=linkList.search(7);
        System.out.println(a);
        linkList.remove(7);
        System.out.println(a);
    }
}
