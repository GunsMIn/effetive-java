package com.example.effetivejava;

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


    /**
     * 정적 펙토리 메서드 도입전 생성자
     * */
//    public Car(String name, int oil) {
//        this.name = name;
//        this.oil = oil;
//    }
//
//    public Car(String name){
//        this.name = name;
//        this.oil = 0;
//    }
}
