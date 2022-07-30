package com.self.practice.Inheritance;
class College
{
    College()
    {
        System.out.println("College");
    }
    College(String cName)
    {
        System.out.println("College Name : "+cName);
    }
    College(String cName,String cAddr)
    {
        System.out.println("College Name : "+cName+" Address : "+cAddr);
    }
}
class Department extends College
{
    int id=10;
    Department()
    {
        //super("Utkal University");
        super("Utkal University","BBSR");
        System.out.println("Department");
    }
}
class Course extends Department {
    Course()
    {
       // super("utkal");
        System.out.println("course");
    }
}

public class SuperClass2 {
    public static void main(String[] args) {
        Department d1=new Department();
        Course c1=new Course();
    }
}
