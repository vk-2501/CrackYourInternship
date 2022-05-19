class Solution {
    
    //Moore's Vooting Algo
    public int majorityElement(int[] nums) {
            int val=nums[0];
            int count=1;
            
            for(int i=1;i<nums.length;i++){
                if(nums[i]==val){
                    count++;
                }
                else{
                    count--;
                }
                
                if(count==0){
                    val=nums[i];
                    count=1;
                }
            }
  
        return val;
     
    }
    
    // Using HashMap
        public int majorityElement(int[] nums) {
     HashMap<Integer,Integer> hm =new HashMap<>();
        for(int v:nums){
            hm.put(v,hm.getOrDefault(v,0)+1);
        }
        
        int ans=-1;
        for(int key:hm.keySet()){
            int val=hm.get(key);
            if(val>(int)Math.floor(nums.length/2)){
               ans=key;
            break;
            }
        }
        return ans;
    }
}