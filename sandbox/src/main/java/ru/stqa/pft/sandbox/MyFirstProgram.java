package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello ("world");
    hello ("user");
    hello ("Wojtek");

    Square s = new Square(5);

    s.l = 5;
    System.out.println("powierzchnia boku kwadratu " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);


    System.out.println("powierzchnia prostokąta " + r.a + " i " + r.b +" = " + r.area());
  }

  public static void hello (String somebody) {

    System.out.println("Hello, " + somebody + "!");
  }


  }
  public static double area (Rectangle r) {

  return r.a * r.b;
  }

}