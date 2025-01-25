public class LinkedListPalindrome {

/*Explained below:
    1.Find the Middle of the Linked List: Use the fast and slow pointer technique to find the midpoint.
    2.Reverse the Second Half: Reverse the second half of the list from the midpoint.
    3.Compare Both Halves: Compare the first half and the reversed second half to check for palindrome properties.
    4.Restore the List (Optional): Reverse the second half back to its original order if needed.
* */
    public static void main(String[] args){
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(1);


        if(isPalindrome(head)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean isPalindrome(ListNode head){
        if(head==null||head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHalf=reverseList(slow);

        ListNode firstHalfIter=head;
        ListNode secondHalfIter=secondHalf;
        while(secondHalfIter!=null){
            if (firstHalfIter.val!=secondHalfIter.val){
                return false;
            }
            firstHalfIter=firstHalfIter.next;
            secondHalfIter=secondHalfIter.next;
        }

        return true;
    }

    private static ListNode reverseList(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
       return prev;
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(){
    }
    ListNode(int val){
        this.val=val;
    }

}