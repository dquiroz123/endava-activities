package com.endava.interns.session1.approach3;

public class Main {

    public static void printInformation(Premium premium){
        System.out.println(premium.getInformation());
    }
    public static void main(String[] arg){
        Premium premium = new Premium();
        printInformation(premium);
        System.out.println(premium.applyDiscount(300));
    }
}
