package com.santiago;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(){
        this.name = "Santi default name";
        this.creditLimit = 1000;
        this.email = "Santi@defaultmail.com";
    }

    public VipCustomer(String name, String email) {
        this.name = name;
        this.creditLimit = 2000;
        this.email = email;
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
