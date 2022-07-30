package com.self.practice.ObjectClone;

public class ObjectCloneExample implements Cloneable{

    int roll;
    String name;
    ObjectCloneExample(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }
    void display()
    {
        System.out.println("Roll no : "+roll+" Name : "+name);
    }
    static void ShowHashCode(ObjectCloneExample obj)
    {
        System.out.println("Hashcode of "+obj+" : "+obj.hashCode());
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectCloneExample obj1=new ObjectCloneExample(100,"Jyoti");
        System.out.println("original Message");
        obj1.display();
        ObjectCloneExample obj2=obj1;
        obj2.roll=200;
        System.out.println("Clone Obj2");
        obj2.display();
        System.out.println("Original After clone");
        obj1.display();

        //Deep Copy
        ObjectCloneExample obj3=(ObjectCloneExample)obj2.clone();
        System.out.println("DEEP COPIED OBJECT");
        ShowHashCode(obj2);
        ShowHashCode(obj3);
        obj3.display();
        obj3.name="Rashmikanta";
        obj3.roll=17;
        System.out.println("Obj value changed ");
        obj3.display();
        System.out.println("Original Message");
        obj2.display();
    }
}
