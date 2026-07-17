class Solution {
    public int mostFrequentEven(int[] nums) {
        int maxfreq = Integer.MIN_VALUE;
        int ans = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                if (map.containsKey(num)) {
                    int cnt = map.get(num);
                    cnt++;
                    map.put(num, cnt);
                } else {
                    map.put(num, 1);
                }

                int count2 = map.get(num);

                if (maxfreq < count2||(maxfreq==count2&&ans>num)) {
                    maxfreq = count2;
                    ans = num;
                }
            }
        }
        return ans;
    }
}