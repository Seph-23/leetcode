package greedy.leetcode409;

public class SolutionPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        int ans = longestPalindrome(s);
        System.out.println(ans);
    }

    /**
     * Success.
     * @param s
     * @return length of longest Palindrome
     */
    static int longestPalindrome(String s){
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int length = 0;
        for (int a : count){
            length += a / 2 * 2;
            if(a%2==1 && length%2==0){
                length++;
            }
        }

        return length;
    }
}
