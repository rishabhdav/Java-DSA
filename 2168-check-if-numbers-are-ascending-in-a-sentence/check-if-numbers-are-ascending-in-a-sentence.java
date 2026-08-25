class Solution {
    public boolean areNumbersAscending(String s) {
        int i=0;
        int n=s.length();
        int prevele=-1;
        while(i<n){
         if(s.charAt(i)-'0'>=0&&s.charAt(i)-'0'<=9){
            int val=s.charAt(i)-'0';
            int j=i+1;
            while(j<n&&(s.charAt(j)-'0'>=0&&s.charAt(j)-'0'<=9)){
                val=val*10+s.charAt(j)-'0';
                j++;

            }
            System.out.println(val);
            if(val<=prevele) return false;
            prevele=val;
            i=j;

         }
         else i++;
         
        }

        return true;
    }


}