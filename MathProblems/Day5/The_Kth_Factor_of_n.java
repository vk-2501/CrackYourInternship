package Day5;
import java.util.*;

public class The_Kth_Factor_of_n {
    //Brute Force--> Space Comp-> 0(n)
    class Solution {
        public int kthFactor(int n, int k) {
            ArrayList<Integer> al=cal(n);
            if(al.size()<k)
                return -1;
            
            int ans=al.get(k-1);
            return ans;
        }
        
        public ArrayList<Integer> cal(int n){
    
            ArrayList<Integer> al=new ArrayList<>();
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    al.add(i);
            }
            return al;
        }
    }

    //Optimised-> Witout using Extra Space
    public int kthFactor_2(int n, int k) {
        
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0 && ++c==k)
                return i;
        }
        return -1;
    }
}
