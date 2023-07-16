package com.example.effetivejava;

import lombok.ToString;

@ToString
public class Car {
    private  String name;
    private  int oil;

    public Car(String name, int oil) {;}


    /**
     * 정적 펙토리 메서드 도입
     * */
    public static Car createCar(String name , int oil) {
        return new Car(name, oil);
    }

    public static Car createNoOilCar(String name) {
        return new Car(name, 0);
    }

    public static void main(String[] args) {

        Car 벤츠 = new Car("벤츠", 10);
        Car lambo = Car.createCar("람보르기니", 100000);
        Car tico = Car.createNoOilCar("티코");
        System.out.println("lambo = " + lambo);
        System.out.println("tico = " + tico);
        System.out.println("벤츠 = " + 벤츠);
    }

}
