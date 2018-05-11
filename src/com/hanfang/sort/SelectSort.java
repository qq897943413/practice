package com.hanfang.sort;
//选择排序 假设第一个为最小 选择最小的一个数和第一个交换 以此类推
public class SelectSort {
    public static void selectSort(int[]array){
        int length=array.length;
        int min,temp;
        for(int out=0;out<length-1;out++){
             min=out;
            for(int in=out+1;in<length;in++){
                if(array[in]<array[min]){
                    min=in;
                }
            }
            temp=array[out];
            array[out]=array[min];
            array[min]=temp;
        }
    }

    public static void main(String[] args) {
        int[] array={3,6,4,4,9,2,1,7,5,8};
        selectSort(array);
        for(int i:array){
            System.out.println(i);
        }
    }
}
