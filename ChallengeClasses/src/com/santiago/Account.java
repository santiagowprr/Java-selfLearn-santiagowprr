package com.santiago;

public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public Account() {   //   THIS IS THE CONSTRUCTOR (no void, or type, just 'public' access modifier). we can insert some default fields
        this(56789, 2.50, "default name", "default address", 0000000); // 'this' constructor has to be the first one to be executed in a constructor
        System.out.println("Empty constructor called!");

    }

    //  Below is another constructor, used when we're creating the object passing parameters
    public Account(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;  //  general rule of thumb: don't call setters or any other methods other than another constructor within those constructors
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, int phoneNumber) { // this constructor needs only 3 parameters. Balance and accnum are set by fefault
        this(99999, 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // GETTERS:
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    // SETTERS:
    public void setAccountNumber(int bankAccount) {
        this.accountNumber = bankAccount;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // ADDITIONAL METHODS:
    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("You have deposited " + depositAmount + ". your balance: " + this.balance + ".");
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (this.balance - withdrawalAmount >= 0) {
            this.balance -= withdrawalAmount;
            System.out.println("You have withdrawn " + withdrawalAmount + ". your balance: " + this.balance + ".");
        } else {
            System.out.println("Amount exceeds balance.");
        }
    }


}
