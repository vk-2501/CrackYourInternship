public class Move_0_to_End {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        
        while(i<nums.length){
            if(nums[i]==0)
            {
                i++;
            }
            else{
                swap(i,j,nums);
                i++;
                j++;
            }
        }
        
    
    }
    
    public void swap(int i,int j,int[] n){
        int temp=n[i];
        n[i]=n[j];
        n[j]=temp;
    }
}
