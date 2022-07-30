package com.self.practice.ObjectClone;

public class CloneMethod1 implements Cloneable {
    int roll;
    String name;
    public CloneMethod1(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }
    void display()
    {
        System.out.println("[Roll ,Name ]: ["+ roll+","+name+" ]");
    }

    public static void main(String args[]) throws CloneNotSupportedException {
//        CloneMethod1 clon1=new CloneMethod1(100,"Rashmikanta") ;
//        //CloneMethod1 clone100=new CloneMethod1(200,"Mitesh");
//        CloneMethod1 clon2=clon1;
//        clon1.display();
//        clon2.display();
//        System.out.println("hash code of clon1 : "+clon1.hashCode());
//        System.out.println("hash code of clon2 : "+clon2.hashCode());
//        clon2.roll=102;
//        clon2.name="jyoti";
//        System.out.println("hash code of clon2 : "+clon2.hashCode());
//        clon1.display();
//        clon2.display();




        CloneMethod1 clon3=new CloneMethod1(101,"sourav");
        CloneMethod1 clon4= (CloneMethod1) clon3.clone();
        clon3.display();
        clon4.display();
        System.out.println("hash code of clon3: "+clon3.hashCode());
        System.out.println("hash code of clon4: "+clon4.hashCode());

        clon4.roll=105;
        clon4.name="Umakanta";
        clon3.display();
        clon4.display();
        System.out.println("hash code of clon3: "+clon3.hashCode());
        System.out.println("hash code of clon4: "+clon4.hashCode());
/*

*/
    }
}








