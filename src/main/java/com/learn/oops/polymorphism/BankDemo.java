package com.learn.oops.polymorphism;

public class BankDemo {

    public static void main(String[] args) {
        Bank bank = new Bank();

        Sbi sbi = new Sbi();
        Hdfc hdfc = new Hdfc();
        Icici icici = new Icici();

        System.out.println(bank.getRateOfInterest()); //4
        System.out.println(sbi.getRateOfInterest()); //5
        System.out.println(hdfc.getRateOfInterest()); //6
        System.out.println(icici.getRateOfInterest()); //7
    }
}
