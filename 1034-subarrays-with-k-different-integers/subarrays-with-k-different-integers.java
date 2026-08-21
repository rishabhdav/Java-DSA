class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {

        return getIntegers(nums, k) - getIntegers(nums, k - 1);

    }

    public static int getIntegers(int[] nums, int goal) {
        int right = 0;
        int left = 0;
        int cnt = 0;
        int n=nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        while (right < n) {
            if (map.containsKey(nums[right])) {
                int value = map.get(nums[right]);
                value++;
                map.put(nums[right], value);
            } else {
                map.put(nums[right], 1);
            }
            while (map.size() > goal) {
                int value = map.get(nums[left]);
                value--;
                map.put(nums[left], value);
                if (map.get(nums[left]) == 0)
                    map.remove(nums[left]);
                left++;
            }
            cnt = cnt + (right - left + 1);

            right++;;
        }
        return cnt;
    }
}
