package greedy.leetcode621;

/**
 * Done
 * 나중에 다시 공부해야됨!!! 어렵지만 쉽게 풀이한 greedy!
 */
public class TaskScheduler {
  public static void main(String[] args) {
    char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
    int n = 2;
    int ans = leastInterval(tasks, n);
    System.out.println(ans);
  }

  static int leastInterval(char[] tasks, int n) {
    int[] count = new int[26];
    int max = 0;
    int maxCount = 0;

    for (char task : tasks) {
      count[task - 'A']++;  //count of each task.
      if (max == count[task - 'A']) {
        maxCount++;
      } else if (max < count[task - 'A']) {
        max = count[task - 'A'];
        maxCount = 1;
      }
    }

    int partCount = max - 1;     //task 사이 공간 갯수, highest freq task 베이스로 계산.
    int partLength = n - (maxCount - 1);    //task 사이 공간의 길이.
    int emptySlots = partCount * partLength;
    int availableTasks = tasks.length - max * maxCount;
    int idles = Math.max(0, emptySlots - availableTasks);

    return tasks.length + idles;
  }
}