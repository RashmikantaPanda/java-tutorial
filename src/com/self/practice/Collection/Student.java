package com.self.practice.Collection;

import java.util.*;

public class Student {
    private int id;
    private String name;
    private int age;
    private String city;

    Student(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static Comparator<Student> StuCityComparator = new Comparator<Student>() {

        public int compare(Student x, Student y) {
            String StudentCity1 = x.getCity().toUpperCase();
            String StudentCity2 = y.getCity().toUpperCase();

            //ascending order
            return StudentCity1.compareTo(StudentCity2);

            //descending order
            //return StudentCity2.compareTo(StudentCity1);
        }
    };
    public static Comparator<Student> StuAgeComparator = new Comparator<Student>() {

        public int compare(Student x, Student y) {

            int age1 = x.getAge();
            int age2 = y.getAge();

            return age2-age1;
        }
    };

    public String toString() {
        return "[ id : " + id + ", name : " + name + ", age : " + age + ", city : " + city + " ]";
    }


    public static void main(String name[]) {
        Student s1 = new Student(100, "Rashmikanta", 22, "Kendrapara");
        Student s2 = new Student(101, "JyotiBikash", 22, "Puri");
        Student s3 = new Student(102, "Jitesh", 23, "Balasore");
        Student s4 = new Student(103, "Mitesh", 17, "Ganjam");
        Student s5 = new Student(104, "Umakanta", 18, "Cuttack");
        Student s6 = new Student(106, "Sritam", 16, "Cuttack");
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

        //Display Students
//        for (Student stud : students) {
//            //System.out.println(stud);
//            System.out.println("ID : " + stud.id);
//            System.out.println("Name : " + stud.name);
//            System.out.println("Age : " + stud.age);
//            System.out.println("City : " + stud.city);
//            System.out.println("--------------------------------------------");
//          }



        System.out.println("Normal Sorting : ");
        for (Student stu : students) {
            System.out.println(stu);
        }

        System.out.println("City wise sorting");
        Collections.sort(students, Student.StuCityComparator);
        for (Student stu : students) {
            System.out.println(stu);
//                System.out.println("ID : " + stu.id);
//                System.out.println("Name : " + stu.name);
//                System.out.println("Age : " + stu.age);
//                System.out.println("City : " + stu.city);
//                System.out.println("--------------------------------------------");
        }


        System.out.println("Age wise sorting in ReverseOrder");
        Collections.sort(students, Student.StuAgeComparator);
        for (Student stu : students) {
            System.out.println(stu);
        }

        System.out.println("\nDispaly the students whose city is cuttack and 10<age<18 ");
        for (Student stud : students) {
            if (stud.city.contentEquals("Cuttack") && (stud.age > 10 && stud.age < 18)) {
                System.out.println(stud);
//                System.out.println("ID : " + stud.id);
//                System.out.println("Name : " + stud.name);
//                System.out.println("Age : " + stud.age);
//                System.out.println("City : " + stud.city);
//                System.out.println("--------------------------------------------");
            }
        }

        //Remove student whose age is greater than 18
        System.out.println("\nDelete Student Records whose age > 18.");
//        for (Student stu:students) {
//            if(stu.age<18){
//                students.remove(stu);
//                continue;
//            }
//            System.out.println(stu);
//        }

        Iterator<Student> stud=students.iterator();
        while (stud.hasNext()){
            Student s=stud.next();
            if (s.age>18) {
                stud.remove();
                continue;
            }
            System.out.println(s);

        }

        //Compare two students by age


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
