package com.self.practice.Collection.Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static class Student{
        int roll;
        String name;

//        public Student(String name){
//            this.name=name;
//        }
        public Student(int roll,String name){
            this.roll=roll;
            this.name=name;
        }
    }

    public static void main(String args[]){
        Student student=new Student(1,"Rashmikanta");


    }

    public static void m1() throws IOException {
        Map<Integer, String> hashMap = new HashMap<>();
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter the number of entry you want to insert : ");
//        int count=Integer.parseInt(br.readLine());
//        System.out.println("Enter <Key,Value > :");
//        int key;
//        String value;
//        for (int i=0; i<count; i++){
//            System.out.println("Key : ");
//            key=Integer.parseInt(br.readLine());
//            System.out.println("Value : ");
//            value = br.readLine();
//            hashMap.putIfAbsent(key,value);
//        }
        hashMap.put(1,"Rashmikanta");
        hashMap.put(2,"Sourav");
        hashMap.put(4,"Jitesh");
        hashMap.put(3,"Jitesh");
        hashMap.put(5,"Jyoti");


        System.out.println(hashMap);
        System.out.println(hashMap.containsValue("Rashmikanta"));
        System.out.println(hashMap.hashCode());


    }
}
