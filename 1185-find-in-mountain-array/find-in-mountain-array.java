/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int ind=getPeek(mountainArr);

        int idx1=getELement(target,mountainArr,0,ind,false);
        if(idx1!=-1) return idx1;
        return getELement(target,mountainArr,ind+1,mountainArr.length()-1,true);
        
    }

    public static int getPeek( MountainArray mountainArr){
        int n=mountainArr.length();
        if(mountainArr.get(0)>mountainArr.get(1)) return 0;
        if(mountainArr.get(n-1)>mountainArr.get(n-2)) return n-1;
        int s=1;
        int e=mountainArr.length()-2;

 
       while (s <= e) {
    int mid = s + (e - s) / 2;

    int left = mountainArr.get(mid - 1);
    int curr = mountainArr.get(mid);
    int right = mountainArr.get(mid + 1);

    if (curr > left && curr > right)
        return mid;

    if (curr > left)
        s = mid + 1;
    else
        e = mid - 1;
}
        return -1;
    }
    public static int getELement(int target, MountainArray mountainArr,int start,int end,boolean dsc){

        int s=start;
        int e=end;

        while(s<=e){
            int mid=s+(e-s)/2;
            if(mountainArr.get(mid)==target) return mid;

           if(!dsc){
             if(mountainArr.get(mid)>target) e=mid-1;
            else s=mid+1;
           }

           else{
        if(mountainArr.get(mid)>target) s=mid+1;
            else e=mid-1;
           }
        }
        return -1;
    }
}
