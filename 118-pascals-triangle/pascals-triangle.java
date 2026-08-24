class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list1 = getList(i);
            list.add(list1);
        }
        return list;

    }

    public static List<Integer> getList(int rows) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        int ans = 1;
        for (int i = 1; i < rows; i++) {
            ans = ans * (rows - i);
            ans = ans / i;
            list.add(ans);
        }
        return list;
    }
}