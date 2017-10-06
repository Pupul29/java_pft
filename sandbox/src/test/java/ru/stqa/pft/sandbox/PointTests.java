package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

import static java.lang.Math.sqrt;

public class PointTests {

  @Test

  public void testArea() {


    Point p1 = new Point(2, 5);
    Point p2 = new Point(6, 6);

    assert p1.distance(p2) == 2.23606797749979;
  }
}
