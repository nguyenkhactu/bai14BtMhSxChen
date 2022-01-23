package com.company;

public class SelectionSort {
    static int[] list = {12, 91,36, 48, 57, 65};

    public static void insertionSort(int[] list) {
        int valueAray, roll;
        for (int i = 0; i < list.length; i++) {
            valueAray = list[i];
            roll = i;
            while (roll > 0 && valueAray < list[roll - 1]) {
                list[roll] = list[roll - 1];

                roll--;
            }
            list[roll] = valueAray;
            for (int s = 0; s < list.length; s++) {
                System.out.print(list[s] + ",");
                if (s == list.length - 1) {
                    System.out.println("\t");
                }
            }
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print("\t" + list[i]);
    }
}
