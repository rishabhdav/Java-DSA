
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long[] diff = new long[n];
        long total = (long) k1 + k2;
        long sum = 0, max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            sum += diff[i];
            max = Math.max(max, diff[i]);
        }

        if (total >= sum) return 0;

        long left = 0, right = max;

        while (left < right) {
            long mid = left + (right - left) / 2;
            long required = 0;

            for (long d : diff) {
                if (d > mid) {
                    required += d - mid;
                }
            }

            if (required <= total) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        long limit = left;
        long remaining = total;
        long answer = 0;

        for (long d : diff) {
            if (d > limit) {
                remaining -= d - limit;
                d = limit;
            }
            answer += d * d;
        }

        // Reduce differences equal to limit by one more
        for (long d : diff) {
            if (remaining == 0) break;

            if (d >= limit && limit > 0) {
                answer -= 2 * limit - 1;
                remaining--;
            }
        }

        return answer;
    }
}
