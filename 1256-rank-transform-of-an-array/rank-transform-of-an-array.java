class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int[] temp= arr.clone();
       Arrays.sort(temp);
        Map<Integer,Integer>map=new HashMap<>();
        int cnt=1;
        for(Integer it:temp){
            if(!map.containsKey(it)){
                map.put(it,cnt);
                cnt++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}