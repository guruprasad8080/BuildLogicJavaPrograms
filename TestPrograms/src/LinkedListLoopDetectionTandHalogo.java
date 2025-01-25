public class LinkedListLoopDetectionTandHalogo {

    /*
    *Floyd's Cycle Detection Algorithm (also called the "Tortoise and Hare" approach). Here's how it works:
    1.Use two pointers (slow and fast) to traverse the linked list.
    2.Move the slow pointer one step at a time, and the fast pointer two steps at a time.
    3.If there is a loop in the linked list, the slow and fast pointers will eventually meet.
    4.If the fast pointer reaches the end (null), the linked list does not contain a loop
    * */

    public static void main(String[] args){

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=head.next;

        if(checkLoop(head)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    private static boolean checkLoop(Node head){

        Node slow=head;
        Node fast=head;

        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}