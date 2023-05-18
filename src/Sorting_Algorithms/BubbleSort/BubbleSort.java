package Sorting_Algorithms.BubbleSort;

public class BubbleSort {

    public static void bubbleSort(int arr[]) {
        //swap var mı yok mu ? varsa diğer döngüye geçeceğim
        boolean swapped = false;

        do {
            swapped = false;
            for (int i = 1; i < arr.length; i++) {
                //iki sayıyı karşılaştıracağız, soldaki eleman sağdaki elemandan büyükse swap yap
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;

                    swapped = true;
                }

            }


        } while (swapped);


    }
}
