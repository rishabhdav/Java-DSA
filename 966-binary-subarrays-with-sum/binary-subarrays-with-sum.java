class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

return getSolved(nums,goal)-getSolved(nums,goal-1);

    }

    public static int getSolved(int[] nums, int goal) {
        if(goal==-1) return 0;
        int l = 0;
        int r = 0;
        int n = nums.length;

        int sum = 0;
        int count = 0;
        while (r < n) {

            sum = sum + nums[r];

            if (sum > goal) {
                while (l<n&&sum > goal) {
                    sum = sum - nums[l];
                    l++;
                }
            }
            if (sum <= goal) {
                count=count+(r-l+1);
            }
            r++;

        }
        return count;

    }
}
