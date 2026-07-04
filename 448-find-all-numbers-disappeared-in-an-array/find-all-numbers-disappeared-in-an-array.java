class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer>list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else i++;
        }
        
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k+1) list.add(k+1);
        }
        return list;
    }

    public static void swap(int[] nums,int s,int e){
        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
    }
}