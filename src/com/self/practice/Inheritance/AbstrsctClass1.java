package com.self.practice.Inheritance;
abstract class A
{
    int dataA1;
    void method1()
    {
        System.out.println("Method1 of class A");
    }
    abstract void method2();

}
class B extends A
{
    int dataB1;
    void method2()
    {
        System.out.println("Method2 of Class A");
    }
}

public class AbstrsctClass1 {
    public static void main(String[] args) {
        B obj=new B();
        obj.method2();
    }
}
