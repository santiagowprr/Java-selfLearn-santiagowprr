package com.santiago;

public class Main {

    @SuppressWarnings("SpellCheckingInspection")
    public static void main(String[] args) {
        VipCustomer Santiago = new VipCustomer();
        System.out.println("Santiago's mail: " + Santiago.getEmail());

        VipCustomer Natashka = new VipCustomer("Natashka", "Natashka@mail.com");
        System.out.println("Natashka's name: " + Natashka.getName());

        VipCustomer Majkel = new VipCustomer("Majkel", 3000, "Maj@kel.com");
        System.out.println("Majkel's limit: " + Majkel.getCreditLimit());
    }
}
