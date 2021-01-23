package com.santiago;

public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account(1235019, 0, "Bob Brown", "myemail@bob.com", 811147141);
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());

//        Account defaultAccount = new Account(); //    no parameters
//        System.out.println(defaultAccount.getAccountNumber());
//        System.out.println(defaultAccount.getBalance());


//        Account bobsAccount = new Account(); // 'new Account' is actually a contructor that is calling the class
//        bobsAccount.withdrawFunds(100.0);      // manually adding parameters
//        bobsAccount.depositFunds(50);
//        bobsAccount.withdrawFunds(10);

        Account timsAccount = new Account("Tim", "tim@mail.com", 123123123);
        System.out.println(timsAccount.getAccountNumber());

    }


}
