package com.example.effetivejava;

public class Storage {

    public static void main(String[] args) {

        Car lambo = Car.createCar("람보르기니", 100000);
        Car tico = Car.createNoOilCar("티코");
        System.out.println("lambo = " + lambo);
        System.out.println("tico = " + tico);
    }
}
