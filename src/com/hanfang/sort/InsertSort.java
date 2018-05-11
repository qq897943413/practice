package com.hanfang.sort;
//插入排序 左边有序 右边的第一个为标志位
public class InsertSort {
    public static void insertSort(int[] array){
        int length=array.length;
        for(int out=1;out<length;out++){
            int in=out;
            int temp=array[out];
            while(in>0&&array[in-1]>temp){
                array[in]=array[in-1];
                in--;
            }
            array[in]=temp;
        }
    }
    public static void main(String[] args) {
        int[] array={3,6,4,4,9,2,1,7,5,8};
        insertSort(array);
        for(int i:array){
            System.out.println(i);
        }
    }
}
