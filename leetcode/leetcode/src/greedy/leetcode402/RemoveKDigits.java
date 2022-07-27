package greedy.leetcode402;

import java.util.Stack;

/**
 * Stack 사용해서 풀어야 하는 문제. Good Example of Stack Usage.
 */
public class RemoveKDigits {

  public static void main(String[] args) {
    String num = "1432219";
    int k = 3;

    String ans = removeKdigits(num, k);
    System.out.println(ans);
  }

  static String removeKdigits(String num, int k) {
    int len = num.length();

    if (k == len) {             //Corner Case: k == num length
      return "0";
    }

    Stack<Character> stack = new Stack();
    int i = 0;
    while (i < num.length()) {
      //Whenever meet a digit which is less than the previous digit, discard the previous one
      while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
        stack.pop();
        k--;
      }
      stack.push(num.charAt(i));
      i++;
    }

    while (k > 0) {             //Corner case like "1111"
      stack.pop();
      k--;
    }

    StringBuilder sb = new StringBuilder();                 //Building stack into string
    while (!stack.isEmpty()) {
      sb.append(stack.pop());
    }
    sb.reverse();

    while (sb.length() > 1 && sb.charAt(0) == '0') {        //remove all the 0 at the head
      sb.deleteCharAt(0);
    }

    return sb.toString();
  }
}