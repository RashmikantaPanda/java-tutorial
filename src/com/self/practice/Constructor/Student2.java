package com.self.practice.Constructor;

public class Student2 {
    int roll;
    String name;
    int age;

    public Student2(int sroll, String sname,int sage)
    {
        roll=sroll;
        name=sname;
        age=sage;
    }
    public Student2(Student2 st1)
    {
        roll=st1.roll;
        name=st1.name;
        age=st1.age;
    }
    void display()
    {
        System.out.println("\t-----STUDENT DETAILS-----");
        System.out.println("Roll :  "+roll+" Name : "+name+" Age : "+age);
    }

    public static void main(String[] args) {
        Student2 st1=new Student2(17,"Rashmikanta",22);
        Student2 st2=new Student2(st1);
        st1.display();
        st2.display();

    }
}
