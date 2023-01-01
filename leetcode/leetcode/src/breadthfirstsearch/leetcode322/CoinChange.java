package breadthfirstsearch.leetcode322;

public class CoinChange {
    public static int minimumElements(int num[], int x) {
        // Write your code here.

        int n = num.length;
        int ind = n-1;
        int ans =  f(num,x,ind);
        if(ans>=(int)Math.pow(10,9))
            return -1;
        return ans;
    }
    public static int f(int[] num, int x, int ind){

        if(ind==0){
            if(x%num[0]==0)
                return x/num[0];
            else return (int)Math.pow(10,9);
        }
        int nt = f(num,x,ind-1);
        int t = Integer.MAX_VALUE;
        if(num[ind]<=x)
            t = 1+ f(num,x-num[ind],ind);
        return Math.min(nt,t);
    }
}
