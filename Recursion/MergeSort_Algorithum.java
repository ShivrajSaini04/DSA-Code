package Recursion;

import java.util.Arrays;

public class MergeSort_Algorithum {
    public static void mergearray(int[] arr, int left, int mid, int right) {
        int size1 = mid - left + 1;
        int size2 = right - mid;
        int arr1[] = new int[size1];
        int arr2[] = new int[size2];
        // here copy element in array 1 or 2
        for (int i = 0; i < size1; i++)
            arr1[i] = arr[left + i];
        for (int i = 0; i < size2; i++)
            arr2[i] = arr[mid + 1 + i];
        // merge 1 or 2 array in assending order
        int i = 0, j = 0, k = left;
        while (i < size1 && j < size2) {
            if (arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
            } else
                arr[k++] = arr2[j++];
        }
        // Copy remaining element in array from 1 or 2
        while (i < size1)
            arr[k++] = arr1[i++];
        while (j < size2)
            arr[k++] = arr2[j++];

    }

    public static void mergesort(int[] arr, int i, int j) {
        if (i == j)
            return;
        int mid = (i + j) / 2;
        mergesort(arr, i, mid); // divide left part of array
        mergesort(arr, mid + 1, j); // divide right part of array
        mergearray(arr, i, mid, j); // merge array after divide
    }

    public static void main(String[] args) {
        int[] arr = { 3, 10, 2, -2, 4, 13, 35, 75 };
        System.out.println("Unsorted array   :   ");
        System.out.println(Arrays.toString(arr));
        mergesort(arr, 0, arr.length - 1);
        System.out.println("Sorted array   :   ");
        System.out.println(Arrays.toString(arr));

    }
}
