//ASCII value
package my.basic.programs;

import java.util.Scanner;

public class FindASCII {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch1=sc.next().charAt(0);
        int asciiVal=ch1;
        System.out.println("ASCII value  : "+asciiVal);

        System.out.println("Enter ASCII value : ");
        int asciiVal2=sc.nextInt();
        char ch2= (char) asciiVal2;
        System.out.println("Character value is : "+ch2);
    }
}
