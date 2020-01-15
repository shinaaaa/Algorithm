package Java;

import java.util.Random;
import java.util.ArrayList;

public class ExSelectionSort {
  public static void main(String[] args) {

    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    Random rand = new Random();

    int range = 10;

    for (int i = 0; i < range; i++) {
      arrayList.add(rand.nextInt(range));
    }
    System.out.println("초기 값 : " + arrayList);

    for (int i = 0; i < arrayList.size(); i++) {
      int lowest_num = arrayList.get(i);
      int lowest_index = i;
      int num = arrayList.get(i);

      for (int j = i + 1; j < arrayList.size(); j++) {
        if (lowest_num > arrayList.get(j)) {
          lowest_num = arrayList.get(j);
          lowest_index = j;
        }
      }
      System.out.println("최소 값 : " + lowest_num);
      arrayList.set(i, lowest_num);
      arrayList.set(lowest_index, num);
      System.out.println(arrayList);
    }
    System.out.println(arrayList);
  }
}