package com.self.practice.MethodOverloading;

public class MethodOverLoading1 {
    static int Addition(int a,int b){
        return a+b;
    }
    static int Addition(int a, int b, int c){
        return a+b+c;
    }
    static float Addition(float a,float b){
        return a+b;
    }
    static float Addition(float a, float b, float c){
        return a+b+c;
    }
    static char Addition(char a, char b){
        return (char) (a+b);
    }
    public static void main(String args[]){
        int a=5,b=10, c=30;
        float x=20.01f,y=25.45f, z=33.33f;
        System.out.println(Addition(a,b));
        System.out.println(Addition(a,b,c));
        System.out.println(Addition(x,y));
        System.out.println(Addition(a,y,z));
        System.out.println(Addition('A',98));
    }
}
