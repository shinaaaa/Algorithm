package Java;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ExBubbleSort
 */

public class ExBubbleSort {
  public static void main(String[] args) {
    Random rand = new Random();
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);

    int range = scan.nextInt();
    scan.close();

    for (int i = 0; i < range; i++) {
      arrayList.add(rand.nextInt(range));
    }
    System.out.print(arrayList);
    for (int i = arrayList.size() - 1; i >= 0; i--) {
    }
  }
}