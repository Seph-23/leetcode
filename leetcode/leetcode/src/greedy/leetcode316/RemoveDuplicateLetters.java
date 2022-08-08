package greedy.leetcode316;

import java.util.Stack;

public class RemoveDuplicateLetters {

  public static void main(String[] args) {
    String s = "bcabc";
    System.out.println(removeDuplicateLetters(s));
  }

  static String removeDuplicateLetters(String s) {
    Stack<Character> stack = new Stack<>();
    int[] count = new int[26];
    char[] arr = s.toCharArray();

    for (char c : arr) {                        //each alphabet count
      count[c-'a']++;
    }

    boolean[] visited = new boolean[26];        //default value is false

    for (char c : arr) {
      count[c - 'a']--;
      if (visited[c - 'a']) {
        continue;
      }
      while (!stack.isEmpty() && stack.peek() > c && count[stack.peek() - 'a'] > 0) {
        visited[stack.peek()-'a'] = false;
        stack.pop();
      }
      stack.push(c);
      visited[c - 'a'] = true;
    }


    StringBuilder sb = new StringBuilder();
    for (char c : stack) {
      sb.append(c);
    }
    return sb.toString();
  }
}
