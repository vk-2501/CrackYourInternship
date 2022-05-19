// Minimum Moves to Equal Array Elements
class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min) 
                min=nums[i];
        }
        
        int sum=0;
        for(int v:nums) sum+=v;
        
        return sum-nums.length*min;
    }
}