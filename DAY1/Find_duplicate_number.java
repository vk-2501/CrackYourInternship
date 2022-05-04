public class Find_duplicate_number {

    //Approach 1 by modifying indexes

    public int findDuplicate(int[] nums) {
        
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int val=Math.abs(nums[i]);
            nums[val]=-nums[val];
            
            if(nums[val]>0){
                ans=Math.abs(nums[i]);
                break;
            }
        }
        
        return ans;
    }


    //using the concept of cycle detection node
    
    public int findDuplicate(int[] nums) {
        int fast=nums[0];
        int slow=nums[0];
          
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(fast!=slow);
          
          slow=nums[0];
          while(fast!=slow){
              fast=nums[fast];
              slow=nums[slow];
          }
          return slow;
          
      }
      
}
