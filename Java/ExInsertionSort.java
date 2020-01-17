package Java;

/**
 * ExInsertionSort
 */

import java.util.Random;
import java.util.ArrayList;

public class ExInsertionSort {
  public static void main(String[] args) {
    Random rand = new Random();
    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    /*
     * int range = 5; for (int i = 0; i < range; i++) {
     * arrayList.add(rand.nextInt(range)); }
     */
    int range = 5;
    arrayList.add(1);
    arrayList.add(0);
    arrayList.add(4);
    arrayList.add(3);
    arrayList.add(2);
    System.out.println("초기 값 : " + arrayList);
    int i = 0;
    while (i < range) {
      if (arrayList.get(1) < arrayList.get(0)) {
        arrayList.add(0, arrayList.get(1));
        arrayList.remove(2);
      }
      if (i > 1) {
        int j = i;
        while (j >= 0) {
          if (arrayList.get(j - 1) > arrayList.get(i) && arrayList.get(j - 2) < arrayList.get(j)) {

            System.out.println("i : " + arrayList.get(i));
            System.out.println("j-1 : " + arrayList.get(j - 1));
            System.out.println("j-2 : " + arrayList.get(j - 2));

            arrayList.add(j - 1, arrayList.get(i));
            arrayList.remove(i + 1);
          } else {
            j--;
          }
        }
      }
      i++;
    }
    System.out.println("최종 값 : " + arrayList);
  }
}