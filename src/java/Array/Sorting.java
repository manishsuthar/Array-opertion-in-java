
public class Sorting {
    public static void SortingFunction(int type, int[] Values){
        switch (type){
            case 1:
                 Main.MyPrint("Bubble Sort");
                 Main.ArrayPrint(Sort.BubbleSort(Values));
                 Main.MyPrint("Sorting Success Fully Done !!!");
                 Main.InitalFunction();
                 break;
            case 2:
                Main.MyPrint("Insertion Sort");
                Sort.InsertionSort(Values);
                Main.ArrayPrint(Values);
                Main.MyPrint("Sorting Success Fully Done !!!");
                Main.InitalFunction();
                break;
            case 3:
                Main.MyPrint("Selection Sort");
                Sort.SelectionSort(Values);
                Main.ArrayPrint(Values);
                Main.MyPrint("Sorting Success Fully Done !!!");
                Main.InitalFunction();
                break;
            case 4:
                Main.MyPrint("Marge Sort");
                MargingSort ms = new MargingSort();
                ms.MargeSort(Values,0, Values.length-1);
                Main.ArrayPrint(Values);
                Main.MyPrint("Sorting Success Fully Done !!!");
                Main.InitalFunction();
                break;
            case 5:
                Main.MyPrint("Heap Sort");
                Heaping hs = new Heaping();
                hs.HeapSort(Values);
                Main.ArrayPrint(Values);
                Main.MyPrint("Sorting Success Fully Done !!!");
                Main.InitalFunction();
                break;
            case 6:
                Main.MyPrint("Quick Sort");
                QuickSorting qs = new QuickSorting();
                qs.QuickSort(Values, 0, Values.length-1);
                Main.ArrayPrint(Values);
                Main.MyPrint("Sorting Success Fully Done !!!");
                Main.InitalFunction();
                break;
        }
    }
}
