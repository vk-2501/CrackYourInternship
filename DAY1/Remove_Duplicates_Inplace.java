class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int n=nums.length;
        for(int j=1;j<n;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];public class Remove_Duplicates_Inplace {
                    
                }
                
            }
        }
        
        return i+1;
    }
}