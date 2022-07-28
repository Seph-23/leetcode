package greedy.leetcode397;

/**
 * Done. bit operation greedy.
 */
public class IntegerReplacement {

  public static void main(String[] args) {
//    int n = 7;  //4
    int n = 1234; //14
    System.out.println(integerReplacement(n));
  }

  static int integerReplacement(int n) {
    int operation = 0;
    while(n != 1){
      if ((n & 1) == 0) {
        n >>>= 1;
      } else if (n == 3 || ((n >>> 1) & 1) == 0) {
        n--;
      } else {
        n++;
      }
      operation++;
    }
    return operation;
  }
}
