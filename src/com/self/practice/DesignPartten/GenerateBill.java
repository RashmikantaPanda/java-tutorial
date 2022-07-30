package com.self.practice.DesignPartten;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args)throws Exception {
        GetPlan plan1=new GetPlan();
        System.out.println("Enter the name of paln for which the bill will be generated : ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String planName=br.readLine();
        System.out.println("Enter the units : ");
        int units=Integer.parseInt(br.readLine());

        Plan p=plan1.getPlan(planName);
        p.getRate();

        System.out.println("Bill amount for "+planName+" of "+units+ " is : ");
        p.calculateBill(units);


    }
}
