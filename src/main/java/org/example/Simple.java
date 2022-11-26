package org.example;

import java.util.Scanner;

public class Simple {
  public static void main(String[] args) {
    int sum = 0;
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter("\\D");
    while (scanner.hasNextInt()) {
      int nextNumber = Integer.parseInt(scanner.next());
      sum += nextNumber;
    }
    System.out.print("Сумма чисел в строке = ");
    System.out.print(sum);
  }
}