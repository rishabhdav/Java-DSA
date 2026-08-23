class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0;
        int j = 0;
        while (i < n) {

            if (nums[j] > 0) {
                ans[i] = nums[j];
                i = i + 2;
            }
            j++;
        }
        i = 1;
        j = 0;
        while (i < n) {

            if (nums[j] < 0) {
                ans[i] = nums[j];
                i = i + 2;
            }
            j++;
        }
        return ans;
    }
}