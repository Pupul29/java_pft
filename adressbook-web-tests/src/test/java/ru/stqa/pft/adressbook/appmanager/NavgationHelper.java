package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavgationHelper {
  private FirefoxDriver wd;

  public NavgationHelper(FirefoxDriver wd) {
    this wd. = wd;
  }
  public void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }
}

