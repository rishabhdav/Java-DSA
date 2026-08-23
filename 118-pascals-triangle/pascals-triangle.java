class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> list1 = getList(i);
            list.add(list1);
        }
        return list;

    }

    public static List<Integer> getList(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long ans = 1;
     
        list.add(1);
        for (int i = 1; i < rowIndex; i++) {
            ans = ans * (rowIndex - i);
            ans = ans / i;
            list.add((int) ans);
        }
        return list;

    }
}