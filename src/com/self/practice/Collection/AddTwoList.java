//Create two list and add them into another list
package com.self.practice.Collection;

import java.util.ArrayList;
import java.util.List;

public class AddTwoList {
    public static void main(String args[]){
        List<String> list1=new ArrayList<String>();
        list1.add("Rashmi");
        list1.add("Sourabha");
        list1.add("Jyoti");
        System.out.println("List1 : "+list1);

        List<String> list2=new ArrayList<String>();
        list2.add("Umakanta");
        list2.add("Ansuman");
        list2.add("Dinesh");
        System.out.println("List : "+list2);

        List<String> mergedList=new ArrayList<String>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        System.out.println("Merged List : "+mergedList);

    }
}
