class Solution {
    public String makeGood(String s) {
        StringBuilder str=new StringBuilder();

        int i=0;
        int n=s.length();
        while(i<n){
            if(str.isEmpty()) str.append(s.charAt(i));

            else{

                char prev=str.charAt(str.length()-1);
                char next=s.charAt(i);
              if(Math.abs(prev-next)==32){
                str.deleteCharAt(str.length()-1);

              }
              else{
                str.append(s.charAt(i));
              }
               
            }
            i++;
    
        }
        return str.toString();
    }
}