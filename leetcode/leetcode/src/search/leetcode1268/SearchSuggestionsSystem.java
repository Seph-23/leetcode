package search.leetcode1268;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class SearchSuggestionsSystem {

  public static void main(String[] args) {
    String[] products = {"mobile", "mouse", "moneypot", "monitor", "mousepad"};
    String searchWord = "mouse";

    List<List<String>> ans = suggestedProducts(products, searchWord);
//    System.out.println(ans);
  }

    static List<List<String>> suggestedProducts(String[] products, String searchWord) {
      Arrays.sort(products);
      List<List<String>> list = new ArrayList<>();

      for (int i = 0; i < searchWord.length(); i++) {
        String prefix = searchWord.substring(0, i + 1);
        int insert = Arrays.binarySearch(products, prefix);
//        System.out.println("j = insert before = " + insert);
        if (insert < 0) {
          insert = -insert - 1;
        }
//        System.out.println("j = insert after = " + insert);
        List<String> suggestions = new ArrayList<>();
        for (int j = insert;
          suggestions.size() < 3 && j < products.length && products[j].startsWith(prefix); j++) {
          suggestions.add(products[j]);
        }
//        System.out.println(suggestions);
        list.add(suggestions);
      }
      return list;
    }
}
