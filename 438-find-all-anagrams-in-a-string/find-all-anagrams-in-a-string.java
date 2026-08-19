class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length())
            return list;

        int k = p.length();

        for (int i = 0; i < k; i++) {
            arr1[p.charAt(i)-'a']++;
        }

        int i = 0;
        int j = 0;
        int n = s.length();
        while (j < n) {

            arr2[s.charAt(j)-'a']++;

            if (j - i + 1 > k) {
                arr2[s.charAt(i)-'a']--;
                i++;
            }

            if (j - i + 1 == k) {
                if(Arrays.equals(arr1,arr2)) {
                    list.add(i);
                }

            }

            j++;
        }
        return list;

    }

}
