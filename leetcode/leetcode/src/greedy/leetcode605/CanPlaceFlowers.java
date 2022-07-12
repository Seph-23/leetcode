package greedy.leetcode605;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {0,0,1,0,0};        //0,0,1,0,1,   1,0,1,0,1,0,0
        int n=1;

        boolean ans = canPlaceFlowers(flowerbed, n);
        System.out.println(ans);
    }

    static boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean ans = false;
        int totalPlanted=0;

        for(int i=0; i<=flowerbed.length-1; i++) {
            if(flowerbed[i]==0) {
                boolean emptyLeft = false;
                if (i == 0 || flowerbed[i - 1] == 0) {
                    emptyLeft = true;
                }
                boolean emptyRight = false;
                if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                    emptyRight = true;
                }
                if (emptyLeft && emptyRight) {
                    totalPlanted++;
                    flowerbed[i] = 1;
                }
            }
        }

        if (totalPlanted >= n) {
            ans = true;
        }

        return ans;
    }
}
