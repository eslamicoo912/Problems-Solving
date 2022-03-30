package fun.with.lists.lastindexof;

public class FunWithListsLastIndexOf {

    public static void main(String[] args) {
        
    }
    
    class LinkedList{
        class Node{
            public Object data;
            public Node next;
        }
        
        Node head = null;
        
        static int lastIndexOf(Node head, Object value) {
            int index = -1 , count = 0;
            Node ptr = head;
            while(ptr!=null){
                if(ptr.data==value){
                    index = count;
                }
                count++;
                ptr = ptr.next;
            }
            return index;
        }
    }
    
}
