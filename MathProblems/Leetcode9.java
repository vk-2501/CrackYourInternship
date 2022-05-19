public class Leetcode9 {
    class Solution {
        public boolean isPalindrome(int x) {
            String st=x+"";
            
            int i=0;
            int j=st.length()-1;
            while(i<j){
                char ch=st.charAt(i);
                char ch1=st.charAt(j);
                if(ch!=ch1)
                    return false;
                i++;
                j--;
                
            }
            return true;
        }
    }
}
