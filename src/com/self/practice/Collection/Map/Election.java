package com.self.practice.Collection.Map;

import java.util.*;



public class Election {
   static class Candidates {
       private  String name;

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public String toString() {

           return "Name : " + name;
       }
   }


    public static void main(String args[]){
        Candidates c1=new Candidates();
        Candidates c2=new Candidates();
        Candidates c3=new Candidates();
        c1.setName("John");
        c2.setName("Alex");
        c3.setName("Jimmy");
        List <Candidates> candidates=new ArrayList<>();
        candidates.add(c1);
        candidates.add(c2);
        candidates.add(c3);
        candidates.add(c2);
        candidates.add(c1);

        int johnCount=0;
        int jimmyCount=0;
        int alexCount=0;
        for (Candidates cname:candidates) {
            if(cname.getName().equalsIgnoreCase("John")){
                johnCount++;
            }
            if(cname.getName().equalsIgnoreCase("alex")){
                alexCount++;
            }
            if(cname.getName().equalsIgnoreCase("jimmy")){
                jimmyCount++;
            }

        }
        System.out.println(jimmyCount);
        Map<Candidates,Integer> people=new HashMap<>();
        people.put(c1,johnCount);
        people.put(c2,alexCount);
        people.put(c3,jimmyCount);



        System.out.println(candidates);
        System.out.println(people);
    }
}
