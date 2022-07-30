package com.self.practice.MethodOverriding;

class Bank {
    float getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    float getRateOfInterest() {
        return 6.25f;
    }
}

class IDBI extends Bank {
    float getRateOfInterest() {
        return 7.5f;
    }
}

class AXIS extends Bank {
    float getRateOfInterest() {
        return 8.75f;
    }
}

class BankIntrest {
    public static void main(String args[]) {
        SBI s = new SBI();
        IDBI i = new IDBI();
        AXIS a = new AXIS();
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
        System.out.println("IDBI Rate of Interest: " + i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
    }
}