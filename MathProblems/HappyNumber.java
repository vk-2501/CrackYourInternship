public class HappyNumber {
    class Solution {
        public boolean isHappy(int n) {
            HashSet<Integer> hs=new HashSet<>();
            int val=0;
            
            while(true){
                val=0;
                while(n>0){
                    int num=n%10;
                    val+=num*num;
                    n=n/10;
                }
                
                if(val==1)
                    return true;
                
                else if(hs.contains(val))
                    return false;
                
                hs.add(val);
                n=val;
            }
            
            // return false;
        }
    }
}
