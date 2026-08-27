class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int s = 1;
        int ans = 0;
        int e = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            e = Math.max(e, piles[i]);
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
          long val=SolveIt(piles, mid);
            if (val <= h) {
                ans = mid;
                e = mid - 1;
            } else
                s = mid + 1;
        }
        return ans;

    }

    public static long SolveIt(int[] piles, int mid) {
        long sum = 0;
        for (int i = 0; i < piles.length; i++) {
            sum = sum + (long) Math.ceil((double) piles[i] / mid);
        }
        return sum;
    }
}