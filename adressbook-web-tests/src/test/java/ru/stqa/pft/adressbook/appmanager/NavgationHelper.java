package ru.stqa.pft.adressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavgationHelper extends HelperBase {


  public NavgationHelper(FirefoxDriver wd) {
    super(wd);
  }
  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }
}

