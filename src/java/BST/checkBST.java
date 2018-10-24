import java.util.Scanner;

/**
 * Created by Manish on 10/24/2018.
 */
public class checkBST {
    CommanFunction cf = new CommanFunction();
    int size;
    Scanner sc = new Scanner(System.in);
    public int[] takeInput(){
        cf.Print("Enter Array Size");
        int arraySize = sc.nextInt();
        size = arraySize;
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
    int[] inOrder = new int[size];
    int[] preOrder = new int[size];
    int[] postOrder = new int[size];
    int i = 0,j=0,k=0;
    void inorder()
    {
        inorder(root);
    }
    void preorder(){
        preorder(root);
    }
    void postorder(){
        postorder(root);
    }
    void inorder(BSTFunction root){
        if (root != null)
        {
            inorder(root.getLeft());
            inOrder[i] = root.getData();
            i++;
            inorder(root.getRight());
        }
    }

    void preorder(BSTFunction root){
        if (root != null)
        {
            preOrder[j] = root.getData();
            j++;
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }
    void postorder(BSTFunction root){
        if (root != null)
        {
            postorder(root.getLeft());
            postorder(root.getRight());
            postOrder[k] = root.getData();
            k++;
        }
    }


    public static void main(String[] args){
        checkBST ckbt = new checkBST();
        CommanFunction cf = new CommanFunction();
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int[] ArraytoCheck = ckbt.takeInput();
        int[] tempArray = ArraytoCheck;
        for (int i=0;i<tempArray.length;i++){
            ckbt.insertData(tempArray[i]);
        }
        ckbt.inOrder = new int[ArraytoCheck.length];
        ckbt.preOrder = new int[ArraytoCheck.length];
        ckbt.postOrder = new int[ArraytoCheck.length];
        ckbt.inorder();
        ckbt.preorder();
        ckbt.postorder();
        System.out.println("");
        cf.printArray(ckbt.inOrder);
        System.out.println("");
        cf.printArray(ckbt.preOrder);
        System.out.println("");
        cf.printArray(ckbt.postOrder);
        System.out.println("");
        cf.Print("Select Order of Array \n 1.In-order \n2.Pre-Order \n3.Post-order");
        int option = sc.nextInt();
        switch (option){
            case 1:
                flag = cf.CompareArr(ckbt.inOrder,ArraytoCheck);
                break;
            case 2:

                flag = cf.CompareArr(ckbt.preOrder,ArraytoCheck);
                break;
            case 3:

                flag = cf.CompareArr(ckbt.postOrder,ArraytoCheck);
                break;
             default:
                 System.out.print("Hello");

        }
        if(flag){
            cf.Print("TRUE");
        }else{
            cf.Print("FALSE");
        }
    }

}
