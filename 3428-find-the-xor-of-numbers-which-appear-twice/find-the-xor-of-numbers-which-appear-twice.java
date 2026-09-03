class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int xor=0;
        Set<Integer>set=new HashSet<>();
        for(int i:nums){

            if(set.contains(i)){
                xor=xor^i;
            }
            else set.add(i);
        }
return xor;

    }
}