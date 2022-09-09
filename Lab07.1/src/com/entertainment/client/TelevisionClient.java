package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionClient {

  public static void main(String[] args) {

    Television tv1 = new Television();
    tv1.setBrand("Samsung");
    tv1.setVolume(32);
    tv1.turnOn();
    tv1.turnOff();

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv2 = new Television("Sony", 50);
    tv2.turnOn();
    tv2.turnOff();

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv3 = new Television("Toshiba");
    tv3.turnOn();
    tv3.turnOff();

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    System.out.println(tv1);
    System.out.println(tv2);
    System.out.println(tv3);



  }

}
