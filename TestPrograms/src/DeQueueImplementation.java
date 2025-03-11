/*  DeQueue (Double Ended Queue)
    Node Class: Represents a node in the doubly linked list. Each node contains data,
                a pointer to the previous node, and a pointer to the next node.
    Deque Class: Contains methods to add and remove elements from both the front and rear of the deque.
    Main Class: Demonstrates the usage of the Deque class with basic operations and displays the result.
* */
public class DeQueueImplementation {
    DeNode front;
    DeNode rear;

    static public class DeNode{
        DeNode previous;
        DeNode next;
        int data;
        DeNode(int data){
            this.data=data;
            this.next=null;
            this.previous=null;
        }

    }

    //Inserting the node front of the DeQueue.
    public void insertFirst(DeNode node) throws Exception {
        if(node==null){
            throw new Exception("Null Cannot be inserted");
        }else{
            if(this.front==null){
                front=rear=node;
            }else{
                front.previous=node;
                node.next=front;
                front=node;
            }
        }
    }

    //Inserting the node End or Rear of the DeQueue.
    public void insertLast(DeNode node) throws Exception {
        if (node==null){
            throw new Exception("Null Cannot be inserted");
        }else{
            if(this.rear==null){
                front=rear=node;
            }else{
                rear.next=node;
                node.previous=rear;
                rear=node;
            }
        }
    }

    //Deleting the node Front of the DeQueue.
    public DeNode deleteFirst() throws Exception {
        if(this.front==null){
            throw new Exception("DeQueue is Empty");
        }else {
            DeNode tempNode=front;
            front=front.next;
            if(front==null){
                rear=null;
            }else {
                front.previous=null;
            }
            return tempNode;
        }
    }

    //Deleting the node End or Rear of the DeQueue.
    public DeNode deleteLast() throws Exception {
        if (this.rear==null){
            throw new Exception("DeQueue is Empty");
        }else{
            DeNode tempNode=rear;
            rear=rear.previous;
            if (rear==null){
                front=null;
            }else{
                rear.next=null;
            }
            return tempNode;
        }
    }

    public DeNode getFirst(){
        return front;
    }

    public DeNode getLast(){
        return rear;
    }

    //To Print the Nodes of Dequeue
    public void print(){
        DeNode tempNode=front;
        if(tempNode==null){
            System.out.println("DeQueue is Empty");
        }else{
            while (tempNode!=null){
                System.out.println(tempNode.data+" ");
                tempNode=tempNode.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)throws Exception {
        DeQueueImplementation dqi=new DeQueueImplementation();
        DeNode n1= new DeNode(1);
        DeNode n2= new DeNode(2);
        DeNode n3= new DeNode(3);
        DeNode n4= new DeNode(4);

        dqi.insertFirst(n4);
        dqi.insertLast(n2);
        dqi.insertLast(n3);
        dqi.insertLast(n1);
        dqi.print();

        dqi.deleteFirst();
        dqi.deleteLast();
        dqi.deleteFirst();
        dqi.print();

        System.out.println(dqi.getFirst().data);
        System.out.println(dqi.getLast().data);
    }
}


