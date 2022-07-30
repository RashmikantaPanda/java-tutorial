package com.self.practice.StringClass;


import java.nio.charset.StandardCharsets;
import java.sql.Wrapper;
import java.util.Locale;

public class StringMethods{
    public static void main(String[] args) {
        String s1 = "Rashmikanta";
        System.out.println(s1);
        int i = 0;
        char[] name = s1.toCharArray();
        while (i < name.length)
        {
            System.out.println(name[i]);
            i++;
        }
        String s2=new String(name);
        System.out.println(s2);
        System.out.println(s2.getBytes(StandardCharsets.UTF_8));
        System.out.println(s2.getBytes());
        System.out.println(s2.getBytes());
        System.out.println(s2.getBytes());
        System.out.println(s2.toLowerCase(Locale.ROOT));
        System.out.println(s2.toLowerCase());
        System.out.println(s2.length());
        System.out.println(s2.toCharArray());
        System.out.println(s2.hashCode());
        System.out.println(s2.intern());


//        System.out.println(s2.);

        String s3=new String(name,2,5);
        System.out.println(s3);

        int[] intArr ={48,97,98,45,1,6,52};
        String s4=new String(intArr,0,7);
        System.out.println(s4);

        byte[] byteArr={2,4,100,44,48,98};
        String s5=new String(byteArr,0,6);
        System.out.println(s5);

        StringBuffer ss1=new StringBuffer("Rashmikanta");
        System.out.println(ss1);
        ss1.append("Panda");
        System.out.println(ss1);

        Object o=s1.getClass();
        System.out.println(o);

        Integer int1=12;
        System.out.println(int1.toString());

        System.out.println(int1.hashCode());



        int a=2;
        System.out.printf("Value is : %d",a);
    }
}
