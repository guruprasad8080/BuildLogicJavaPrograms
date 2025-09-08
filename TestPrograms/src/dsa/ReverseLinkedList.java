package dsa;


/*Question: Reverse a singly linked list.
Follow-up: Do it both iteratively and recursively.
→ Topic: Linked Lists, Pointers
* */
public class ReverseLinkedList {

    //Iterative Method
    public static ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nextTemp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextTemp;
        }
        return prev;
    }

    //Recursive Method
    public static ListNode reverseListRecursive(ListNode head){
        ListNode newHead;
        if(head==null||head.next==null)
            return head;
        newHead=reverseListRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    public static void printList(ListNode head){
        ListNode curr=head;
        while(curr!=null){
            System.out.println(curr.val+" ");
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(3);
        head.next.next=new ListNode(5);
        head.next.next.next=new ListNode(7);

        System.out.println("Original Linked List");
        printList(head);

        ListNode reveredRecursive=reverseListRecursive(head);
        System.out.println("Reversed Linked List (Recursive) ");
        printList(reveredRecursive);

        ListNode reversedIterative=reverseList(reveredRecursive);
        System.out.println("Reversed Linked List (Iterative):");
        printList(reversedIterative);

        }
}

//Iterative Method

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
}
