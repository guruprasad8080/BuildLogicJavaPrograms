/* Binary Search Tree
*  Left Subtree: All values in the left subtree are smaller than the root node.
*  Right Subtree: All values in the right subtree are greater than the root node.
*  No Duplicates: Each value appears only once in the tree.
*  1.Insert:
To insert a value into a BST:
Start at the root.
If the value is smaller than the current node, go to the left subtree.
If the value is larger, go to the right subtree.
Repeat until you find an empty spot, and insert the value there.
*  2.Preorder Traversal:
Preorder traversal visits nodes in this order:
Visit the current node (root).
Traverse the left subtree.
Traverse the right subtree.
*  3. Search:
To search for a value in a BST:
Start at the root.
Compare the value with the current node:
If the value equals the current node, the search is successful.
If the value is smaller, search in the left subtree.
If the value is larger, search in the right subtree.
Repeat until you find the value or reach a null node (not found)
* */
public class BinarySearchTree {
    BSTNode root;

    BinarySearchTree(){
    }

    void insertNode(int val){
        root=insertRecNode(root,val);
    }

    BSTNode insertRecNode(BSTNode root,int val){
        if(root==null){
            root=new BSTNode(val);
            return root;
        }
            if(val< root.val){
                root.left=insertRecNode(root.left,val);
            }else{
                root.right=insertRecNode(root.right,val);
            }
        return root;
    }

    boolean search(int val){
        return searchBSTRec(root,val);
    }

    boolean searchBSTRec(BSTNode root,int val){
        if(root==null){
            return false;
        }
        if(root.val==val){
            return true;
        }
        if(val<root.val){
            return searchBSTRec(root.left,val);
        }
        return searchBSTRec(root.right,val);
    }

    void inOrder(){
        inorderRec(root);
    }

    void inorderRec(BSTNode root){
        if(root!=null){
            inorderRec(root.left);
            System.out.println(root.val+" ");
            inorderRec(root.right);
        }
    }

    void preOrder(){
        preOrderRec(root);
    }

    void preOrderRec(BSTNode root){
        if(root==null){
            return;
        }
        System.out.println(root.val);
        this.preOrderRec(root.left);
        this.preOrderRec(root.right);
    }

    void postOrder(){
        postOrderRec(root);
    }
    void postOrderRec(BSTNode root){
        if (root==null){
            return;
        }
        this.postOrderRec(root.left);
        this.postOrderRec(root.right);
        System.out.println(root.val);
    }


    public static void main(String[] args){
         BinarySearchTree bst=new BinarySearchTree();
        bst.insertNode(50);
        bst.insertNode(30);
        bst.insertNode(20);
        bst.insertNode(40);
        bst.insertNode(70);
        bst.insertNode(60);
        bst.insertNode(80);

        System.out.println("In Order Traversal:");
        bst.inOrder();

        System.out.println("Pre Order Traversal:");
        bst.preOrder();

        System.out.println("Post Order Traversal:");
        bst.postOrder();

        int searchVal=40;
        System.out.println("Searching for: "+searchVal);
        if(bst.search(searchVal)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}


class BSTNode{
    int val;
    BSTNode left,right;
    public BSTNode(int val){
        this.val=val;
        left=right=null;
    }
}