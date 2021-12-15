/*
 * @Description: 
 * @Author: Hexon
 * @Date: 2021-12-15 23:14:01
 * @LastEditors: Hexon
 * @LastEditTime: 2021-12-15 23:17:45
 */
public class Homework05 {
  public static void main(String[] args) {
    A05 a05 = new A05(3.9);
    System.out.println("半径3.9的面积: " + a05.area());
    System.out.println("半径3.9的周长: " + a05.circumference());
  }
}

class A05 {
  double radius;
  double PI = 3.1415926;

  public A05(double radius) {
    this.radius = radius;
  }

  public double area() {
    return this.radius * this.radius * PI;
  }

  public double circumference() {
    return 2 * PI * this.radius;
  }
}
