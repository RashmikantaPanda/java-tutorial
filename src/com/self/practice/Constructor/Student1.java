package com.self.practice.Constructor;

public class Student1
{
    int roll;
    String name;
    int age;
    public Student1(int rollNo,String sname, int sage)
    {
        roll=rollNo;
        name=sname;
        age=sage;
    }
    void displayStudent()
    {
        System.out.println("\t-----STUDENT DETAILS-----");
        System.out.println("Roll : "+roll);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
    public static void main(String args[])
    {
        Student1 s1=new Student1(17,"rk",22);
        s1.displayStudent();
    }
}
