package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

  //fields - go above the constructors
  private double rate;
  private double hours;

  //constructors
  public HourlyEmployee() {
  }

  public HourlyEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
    this(name, hireDate);
    setRate(rate);
    setHours(hours);

  }

  public void pay(){
    //private fields are not accessible directly, so use getName()
    System.out.printf("%s is paid hourly for a total of %,.2f%n", getName(), getHours() * getRate());
  }

  public void setRate(double rate) {
    this.rate = rate;
  }
  public double getRate() {
    return rate;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }
  public double getHours() {
    return hours;
  }




  public String toString() {
//    return super.toString() + "hours=" + getHours() + "rate=" + getRate();
    return String.format("%s, rate=%.2f, hours%.1f", super.toString(), getHours(), getRate());
  }
}
