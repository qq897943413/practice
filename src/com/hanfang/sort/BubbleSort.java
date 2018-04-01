package com.hanfang.sort;
//冒泡排序
//第一个和第二个比  第二个和第三个比  直到最后一个最大 以此类推
public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int length = array.length;
        int temp;
        
        for (int out = length; out > 0; out--) {
            for (int in = 0; in < out - 1; in++) {
                if (array[in] > array[in + 1]) {
                    temp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] array={3,6,4,4,9,2,1,7,5,8};
        bubbleSort(array);
        for(int i:array){
            System.out.println(i);
        }
    }
}
