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

    void inorder(){
        inorderRec(root);
    }

    void inorderRec(BSTNode root){
        if(root!=null){
            inorderRec(root.left);
            System.out.println(root.val+" ");
            inorderRec(root.right);
        }
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
        bst.inorder();

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