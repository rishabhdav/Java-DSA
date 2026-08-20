class Solution {
    public int maxScore(int[] cardPoints, int k) {
int i=0;
int n=cardPoints.length;
int j=n-1;
int sum=0;
int maxsum=0;

for(int l=0;l<k;l++){ 
sum=sum+cardPoints[l];
}
i=k-1;

maxsum=Math.max(sum,maxsum);

while(i>=0){
    sum=sum-cardPoints[i];
    sum=sum+cardPoints[j];
    maxsum=Math.max(sum,maxsum);
    i--;
    j--;

}
return maxsum;
    }
}