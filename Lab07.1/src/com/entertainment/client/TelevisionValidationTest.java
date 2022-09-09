package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionValidationTest {

  public static void main(String[] args) {
    Television tv1 = new Television();

    tv1.setBrand("Sony");
    System.out.println(tv1.getBrand()); //should print Sony.

    tv1.setBrand("LG");
    System.out.println(tv1.getBrand());

    tv1.setBrand("RCA");
    System.out.println(tv1.getBrand());

    tv1.setBrand("Zenith");
    System.out.println(tv1.getBrand());

    tv1.setVolume(Television.MIN_VOLUME);
    System.out.println(tv1.getVolume());

    tv1.setVolume(Television.MAX_VOLUME);
    System.out.println(tv1.getVolume());

    tv1.setVolume(Television.MIN_VOLUME - 1);
    System.out.println(tv1.getVolume());

    tv1.setVolume(Television.MAX_VOLUME + 1);
    System.out.println(tv1.getVolume());

  }

}
