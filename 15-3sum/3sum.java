class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while (i < n) {
        if(i>0&&nums[i]==nums[i-1]){i++; continue;};
            int j = i + 1;
            int k = n - 1;
            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    list.add(ans);
                

                int val1 = nums[j];
             
                while (j < k && nums[j] == val1)
                    j++;

                int val2 = nums[k];
            
                while (j<k && nums[k] == val2)
                    k--;
                }
            }
            i++;
       
        }
        return list;
    }

}