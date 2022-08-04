package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortingHashMapByValue {
  public static void main(String[] args) {
    HashMap<Integer, Integer> map = new HashMap<>();
    LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
    ArrayList<Integer> list = new ArrayList<>();
    for (
      Map.Entry<Integer, Integer> entry : map.entrySet()) {    //sorting HashMap by value
      list.add(entry.getValue());
    }
    Collections.sort(list, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return (o1).compareTo(o2);
      }
    });
    for (Integer a : list) {
      for (Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue().equals(a)) {
          sortedMap.put(entry.getKey(), a);
        }
      }
    }                                                             //sorting HashMap by value end
    System.out.println(sortedMap);
  }
}
