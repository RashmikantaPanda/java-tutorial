package com.self.practice.dataStructure.array;
import java.util.Scanner;
//reverse an array using another array

public class ReverseArray1 {
     static void display(int arr[])
    {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Elemets of the array -:  "+"arr[" + i + "]: " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr1[] = new int[5];
        int arr2[] = new int[arr1.length];
        System.out.println("size of array1 " + arr1.length);
        System.out.println("size of array2 " + arr2.length);

        //System.out.println("Size of the array : " + arr.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elemets of the array : ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
//        arr2 = arr;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Elemets of the array are arr[" + i + "]: " + arr2[i]);
//
        display(arr1);
        System.out.println("\nAfter Reverse\n");
        //Reverse
//        for (int i = arr.length - 1; i >= 0; i--) {
//            System.out.println("Elemets of the array are arr[" + i + "]: " + arr[i]);
//        }

        int i, j;
        //copy
        for (i = 0, j = arr2.length - 1; i <= arr1.length && j >= 0; i++, j--) {
            arr2[j] = arr1[i];
        }

        display(arr2);


    }
}