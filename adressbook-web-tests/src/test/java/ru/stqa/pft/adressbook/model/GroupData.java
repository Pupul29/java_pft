package ru.stqa.pft.adressbook.model;

public class GroupData {
  private final String name1;
  private final String header1;
  private final String footer1;

  public GroupData(String name1, String header1, String footer1) {
    this.name1 = name1;
    this.header1 = header1;
    this.footer1 = footer1;
  }

  public String getName1() {
    return name1;
  }

  public String getHeader1() {
    return header1;
  }

  public String getFooter1() {
    return footer1;
  }
}
