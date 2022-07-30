package com.self.practice.Inheritance;
class Animal{
    void eat()
    {
        System.out.println("Eating...");
    }
}
class Cow extends Animal{
    void eat()
    {
        System.out.println("Cow eats grass");
    }
}
public class Inheritance1 {
    public static void main(String args[]){
        Animal a1=new Cow();
        a1.eat();
    }

}
