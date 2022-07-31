package com.self.practice.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Student {
    int id;
    String name;
    int age;
    String city;

    Student(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static void main(String name[]) {
        Student s1 = new Student(100, "Rashmikanta", 22, "Kendrapara");
        Student s2 = new Student(101, "JyotiBikash", 22, "Puri");
        Student s3 = new Student(102, "Jitesh", 23, "Balasore");
        Student s4 = new Student(103, "Mitesh", 17, "Ganjam");
        Student s5 = new Student(104, "Umakanta", 18, "Cuttack");
        Student s6 = new Student(106, "Stitam", 16, "Cuttack");
        Student s7 = new Student(107, "Barenya", 21, "Bhubaneswar");
        Student s8 = new Student(108, "Subham", 24, "Bhubaneswar");
        Student s9 = new Student(109, "Madhusmita", 17, "Cuttack");
        Student s10 = new Student(110, "Sourabha", 16, "Kendrapara");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);

        for (Student stud : students) {
            System.out.println("ID : " + stud.id);
            System.out.println("Name : " + stud.name);
            System.out.println("Age : " + stud.age);
            System.out.println("City : " + stud.city);
            System.out.println("--------------------------------------------");
        }

//        for(Student stud:students){
//            if(stud.city.contentEquals("Cuttack"))
//            {
//                System.out.println(stud.name+"  "+stud.city);
//            }
//            else{
//                continue;
//            }
//      }

//        Iterator <Student> itr=students.iterator();
//        int i=0;
//        System.out.println("Student whose are from city Cuttack are : ");
//        while (itr.hasNext())
//        {
//            //2nd method
//            Student stu=itr.next();
//            if(i==(stu.city).compareToIgnoreCase("Cuttack"))
//            {
//            System.out.println(stu.name);
//            }
//
        //3rd Method
//            String ciitty=stu.city;
//            if(ciitty=="Cuttack")
//            {
//                System.out.println(stu.name+"  "+stu.city);
//            }

        //4th method
//            String city=stu.city;
//            if(city.compareTo("Cuttack")==1);


//            if(1==students.get(0).city.compareTo("Cuttack"));
//            {
//            System.out.println(students.get(i));
//            }
//            i++;

//
//        }
    }
}
