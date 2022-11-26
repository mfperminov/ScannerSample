package org.example;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class File {

  private static final String NEWLINE = System.lineSeparator();

  public static void main(String[] args) {
    StringBuilder channels = new StringBuilder();
    Scanner scanner = null;
    try {
      scanner = new Scanner(new java.io.File(
          "/home/mperminov/IdeaProjects/ScannerSample/src/main/resources/channels"));
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден");
    }
    assert scanner != null;
    while (scanner.hasNext()) {
      String nextChannel = scanner.next();
      channels.append(nextChannel);
      channels.append(NEWLINE);
    }
    scanner.close();
    System.out.println("Все каналы в нашем слаке");
    System.out.println(channels);
  }
}
