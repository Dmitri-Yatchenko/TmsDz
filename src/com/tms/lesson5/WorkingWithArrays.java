package com.tms.lesson5;

public class WorkingWithArrays {

    public static void sortingAnArray(int[] arr){

        for (int out = arr.length - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(arr[in] > arr[in + 1]){
                    int dummy = arr[in];
                    arr[in] = arr[in+1];
                    arr[in+1] = dummy;
                }
            }
        }
    }

    public static int maximumArrayElement(int[] arr){
        int max = 0;

        for (int number : arr) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }


    public static int arrayElementNumberByValue(int[] arr, int element){
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                index = i;
                break;
            }
        }
        return index;
    }

}
