package com.self.practice.AbstractClass;

abstract class Claculator{
    abstract void display();
    int a=50,b=10;
    int result;
}
class Addition extends Claculator{
   void display(){
       result=a+b;
       System.out.println("a + b : "+result);
   }

}
class Subtraction extends Claculator{

    void display() {
        result=a-b;
        System.out.println("a - b : "+result);
    }
}

public class AbstractClassEx1 {
    public static void main(String[] args) {
        Claculator add=new Addition();
        add.display();
        Claculator sub=new Subtraction();
        sub.display();
    }

}
