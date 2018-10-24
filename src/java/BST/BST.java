import java.util.Scanner;

public class BST {
    CommanFunction cf = new CommanFunction();
    Scanner sc = new Scanner(System.in);
    public int[] takeInput(){
        cf.Print("Enter Array  Size");
        int arraySize = sc.nextInt();
        int[] arrToBST = new int[arraySize];
        cf.Print("Enter Element in Array");
        for (int i=0;i<arraySize;i++){
            int temp = sc.nextInt();
            arrToBST[i] = temp;
        }
        return arrToBST;
    }
    BSTFunction root;
    void insertData(int data){
        root =insertData(root,data);
    }
    BSTFunction insertData(BSTFunction node,int data){

        if (node == null)
            node = new BSTFunction(data);
        else
        {
            if (data <= node.getData())
                node.left = insertData(node.left, data);
            else
                node.right = insertData(node.right, data);
        }
        return node;
    }

    void inorder()
    {
        inorder(root);
    }
    void preOrder(){
        preOrder(root);
    }
    void postOrder(){
        postOrder(root);
    }
    void inorder(BSTFunction root){
        if (root != null)
        {
            inorder(root.getLeft());
            cf.Print(root.getData()+"_");
            inorder(root.getRight());
        }
    }

    void preOrder(BSTFunction root){
        if (root != null)
        {
            cf.Print(root.getData()+"_");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
    void postOrder(BSTFunction root){
        if (root != null)
        {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            cf.Print(root.getData()+"_");
        }
    }


    public static void main(String[] args) {
        CommanFunction cf = new CommanFunction();
        BST bst = new BST();
        int arr [] = bst.takeInput();
        for (int i=0;i<arr.length;i++){
           bst.insertData(arr[i]);
        }
        bst.inorder();
        System.out.println("");
        bst.preOrder();
        System.out.println("");
        bst.postOrder();
    }
}
