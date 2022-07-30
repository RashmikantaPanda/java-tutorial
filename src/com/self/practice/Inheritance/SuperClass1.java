package com.self.practice.Inheritance;

class Animal1
{
    private String name;
    protected void display()
    {
        System.out.println("Animal : ");
    }

}
class Dog extends Animal1
{
    public String name="Dog";
    @Override
    public void display()
    {
        System.out.println("Animal : "+name);
    }
    void DisplayMessage()
    {
        display();
        super.display();
    }
}

public class SuperClass1 {
    public static void main(String[] args) {
        Dog d=new Dog();
        //d.display();
        d.DisplayMessage();

    }

}
