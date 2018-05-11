package com.hanfang.sort;
//希尔排序基于插入的增量排序
public class ShellSort {
    public static void shellSort(int[] array){
        int outer,inner,temp;
        int length=array.length;
        int h=1;
        while(h<=length/3){
            h=3*h+1;   //cast(calculate) maximal the increment
        }
        while(h>0){
            for(outer=h;outer<length;outer++){
                temp=array[outer];
                inner=outer;
                while(inner>h-1&&array[inner-h]>=temp){
                    array[inner]=array[inner-h];
                    inner-=h;
                }
                array[inner]=temp;
            }
            h=(h-1)/3;   //decrease h until 1
        }
    }
    public static void main(String[] args) {
        int[] array={3,6,4,4,9,2,1,7,5,8};
        shellSort(array);
        for(int i:array){
            System.out.println(i);
        }
    }
}
