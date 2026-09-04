class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        long neg=Math.abs((long)n);
        while(neg>0){
            if(neg%2==1){
                ans=ans*x;
                neg=neg-1;
            }
            else{
                x=x*x;
                neg=neg/2;
            }
        }
        if(n<0) return 1.0/ans;
        else  return ans;
    }
}