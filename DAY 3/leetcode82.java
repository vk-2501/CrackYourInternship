class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        
        while(i>=0 && j>=0){
            if(nums1[i]<=nums2[j]){
                nums1[k]=nums2[j];
                j--;
            }
            else{
                nums1[k]=nums1[i];
                nums1[i]=0;
                i--;
            }
            k--;
        }
        
        if(i<0 && j>=0){
            for(int p=j;p>=0;p--){
                nums1[k]=nums2[p];
                
                k--;
            }
        }
        
        
    }
}