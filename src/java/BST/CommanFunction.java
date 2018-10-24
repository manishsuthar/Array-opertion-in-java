<<<<<<< HEAD

public class CommanFunction {
     void Print(String str){
         System.out.print(str);
     }
     void printArray(int[] arr){
         for (int i=0;i<arr.length;i++){
             System.out.print(arr[i]+"_");
         }
     }
     boolean CompareArr(int[] arr1,int[] arr2){
         boolean flag = true;
         for (int i = 0;i<arr1.length;i++){
             if(arr1[i] != arr2[i]){
                 flag = false;
                 break;
             }
         }
         return flag;
     }


}
=======

public class CommanFunction {
     void Print(String str){
         System.out.print(str);
     }
     void printArray(int[] arr){
         for (int i=0;i<arr.length;i++){
             System.out.print(arr[i]+"_");
         }
     }
     boolean CompareArr(int[] arr1,int[] arr2){
         boolean flag = true;
         for (int i = 0;i<arr1.length;i++){
             if(arr1[i] != arr2[i]){
                 flag = false;
                 break;
             }
         }
         return flag;
     }


}
>>>>>>> origin/master
