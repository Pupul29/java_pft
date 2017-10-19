package ru.stqa.pft.adressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    
    @Test
    public void testGroupDeletion() {

        app.getNavgationHelper().gotoGroupPage();
        if (!app.getGroupHelper().wd.findElement(By.name("selected[]")).isSelected()) {
            app.getGroupHelper().selectGroup();
        }
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }


}
