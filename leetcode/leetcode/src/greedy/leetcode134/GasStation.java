package greedy.leetcode134;

public class GasStation {

  public static void main(String[] args) {
//        int[] gas = {1, 2, 3, 4, 5};
//        int[] cost = {3, 4, 5, 1, 2};
    int[] gas = {2, 3, 4};
    int[] cost = {3, 4, 3};
    int output = canCompleteCircuit(gas, cost);
    System.out.println(output);
  }

  static int canCompleteCircuit(int[] gas, int[] cost) {
    int currRemaining = 0;
    int totalRemaining = 0;
    int station = 0;

    for (int i = 0; i < gas.length; i++) {
      int remaining = gas[i] - cost[i];

      if (currRemaining < 0) {
        currRemaining = remaining;
        station = i;
      } else {
        currRemaining += remaining;
      }
      totalRemaining += remaining;
    }

    if (totalRemaining >= 0) {
      return station;
    } else {
      return -1;
    }
  }
}
