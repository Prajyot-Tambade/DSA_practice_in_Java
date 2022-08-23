// import java.util.*;

public class sorting {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = { 7, 8, 3, 1, 2 };

        // bubble sort
        // time complexity -> O(n^2)
        // for (int i = 0; i < arr.length - 1; i++) {

        // for (int j = 0; j < arr.length - i - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // // swap
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }

        // }
        // }

        // Selection sort
        // for (int i = 0; i < arr.length - 1; i++) {

        // int smallest = i;

        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[smallest] > arr[j]) {
        // smallest = j;
        // }

        // }
        // // swap
        // int temp = arr[smallest];
        // arr[smallest] = arr[i];
        // arr[i] = temp;
        // }

        // Insertion sort
        for (int i = 1; i < arr.length; i++) {
            int currrnt = arr[i];
            int j = i - 1; // j for sorted part

            // loop till j = 0 i.e from last element of sorted part till the zeroth element
            // of sorted part
            // also checking - is current less than sorted element
            // if true then push sorted element for lower element
            while (j >= 0 && currrnt < arr[j]) {
                // pushing elements forward for lower element
                arr[j + 1] = arr[j];
                j--;
            }

            // placement of lower element
            arr[j + 1] = currrnt;
        }

        printArray(arr);
    }

}