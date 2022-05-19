class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int v:nums) sum+=v;
        
        int tsum=(nums.length*(nums.length+1))/2;
        return tsum-sum;
        
        
    }
}