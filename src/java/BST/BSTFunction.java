/**
 * Created by Manish on 10/23/2018.
 */
public class BSTFunction {
        BSTFunction left,right;
        int data;
    BSTFunction(){
        left = null;
        right = null;
        data = 0;
    }
    BSTFunction(int n){
        left = null;
        right = null;
        data = n;
    }
    void setLeft(BSTFunction num){
        left = num;
    }
    void setRight(BSTFunction num){
        right = num;
    }
    BSTFunction getLeft(){
        return left ;
    }
    BSTFunction getRight(){
        return right ;
    }
    void setData(int num){
        data = num;
    }
    int getData(){
        return data;
    }
}
