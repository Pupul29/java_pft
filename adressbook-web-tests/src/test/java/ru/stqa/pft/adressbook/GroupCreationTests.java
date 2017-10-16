package ru.stqa.pft.adressbook;


import org.testng.annotations.Test;



public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {

    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupDatas("grupka"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
