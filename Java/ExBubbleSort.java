package Java;

import java.util.Random;
import java.util.ArrayList;

public class ExBubbleSort {
  public static void main(String[] args) {

    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    Random rand = new Random();

    int range = 10;

    for (int i = 0; i < range; i++) {
      arrayList.add(rand.nextInt(range));
    }
    System.out.println(arrayList);

    for (int i = 0; i < arrayList.size(); i++) {
      for (int j = i + 1; j < arrayList.size(); j++) {
        if (arrayList.get(i) > arrayList.get(j)) {
          int num = arrayList.get(i);
          arrayList.set(i, arrayList.get(j));
          arrayList.set(j, num);
          System.out.println(arrayList);
        }
      }
    }
    System.out.println(arrayList);
  }
}