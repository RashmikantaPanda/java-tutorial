package com.self.practice.AccessModifier;

class NameClass {
    private String name1="Rashmikanta";
    public String name2="Jyoti";
    String name3="Sourav";
    protected String name4="Benjamin";

    protected void DisplayName()
    {
        System.out.println("Name1 = "+name1);
        System.out.println("Name2 = "+name2);
        System.out.println("Name3 = "+name3);
        System.out.println("Name4 = "+name4);

    }

}
public class AccessModifierEx1{
    public static void main(String args[]){
        NameClass nameClass=new NameClass();
        nameClass.DisplayName();
        //System.out.println(nameClass.name1);   accessing a private data
        //System.out.println(nameClass.name1);   accessing a private data

    }
}
