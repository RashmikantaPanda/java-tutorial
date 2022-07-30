package com.self.practice.Collection;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        m1();

    }
    public static void m1(){

        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();


        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list3.add(6);
        list3.add(7);


        for(int i=10; i<20; i++){
            list2.add(i);
        }


        list1.addAll(4,list2);


        for (Integer li1:list1)
        {
            System.out.println(li1);
        }

//


//        for (int li2:list2
//        ){
//            System.out.println(li2);
//        }

    }
}
