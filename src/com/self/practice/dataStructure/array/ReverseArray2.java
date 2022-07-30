package com.self.practice.dataStructure.array;
import java.util.Scanner;
//Reverse an array without using 2nd array(swapping method)

public class ReverseArray2 {
    static void display(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.println("arr["+i+"] : "+arr[i]);
        }
    }

    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        n=sc.nextInt();
        int[] array1=new int[n];

        System.out.println("Enter "+n+" Elemnts of the array");
        for(int i=0; i<array1.length; i++){
            array1[i]= sc.nextInt();
        }
        System.out.println("Displaying the array ");
        display(array1);

        //Reverse the aaray
        int temp;
        for(int i=0,j=array1.length-1; i<j; i++,j--){
            temp=array1[i];
            array1[i]=array1[j];
            array1[j]=temp;
        }
        System.out.println("After reverse , Displaying the array : ");
        display(array1);
    }
}
