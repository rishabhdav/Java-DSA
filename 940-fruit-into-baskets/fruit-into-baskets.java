class Solution {
    public int totalFruit(int[] fruits) {


        Map<Integer, Integer> map = new HashMap<>();

        int maxlen = 0;
        int n = fruits.length;
    
        int l = 0;
        int r = 0;

        while (r < n) {
            if (map.containsKey(fruits[r])) {
                int cnt = map.get(fruits[r]);
                cnt++;
                map.put(fruits[r], cnt);
            } else {
                map.put(fruits[r], 1);
            }

            if (map.size() > 2) {
                while (map.size() > 2) {
                    int cnt = map.get(fruits[l]);
                    cnt--;
                    if (cnt == 0)
                        map.remove(fruits[l]);
                    else
                        map.put(fruits[l], cnt);
                    l++;
                }
            }

            if (map.size() <= 2) {
                maxlen = Math.max(maxlen, r - l + 1);
            }
            r++;

        }
        return maxlen;
    }
}