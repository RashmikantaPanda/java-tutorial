package com.self.practice.Constructor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Constructor1 {
    int roll;
    String name;
    Constructor1() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the roll no. and name of the student : ");
        roll=Integer.parseInt(br.readLine());
        name=br.readLine();

    }
    void display() {
        System.out.println("Roll no. :" +roll);
        System.out.println("Name : "+name);
    }
    public static void main(String args[]) throws IOException
    {
        Constructor1 student1=new Constructor1();
        student1.display();
    }
}
