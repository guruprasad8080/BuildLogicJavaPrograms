package dsa;

/*
* Question: Given a linked list, determine if it has a cycle.
Approach: Use Floyd's Cycle
Detection Algorithm (Tortoise and Hare).
→ Topic: Linked List, Fast & Slow
Pointers
* */
public class DetectCycleInLinkedList {

    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=head.next;

        if(detectCycle(head)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean detectCycle(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
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
 int val;
 Node next;
 Node(int x){
     val=x;
     next=null;
 }
}

