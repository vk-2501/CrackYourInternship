public class Permutations_In_Array {
    public boolean isPossible(long a[], long b[], long n, long k) {
        // Your code goes here
        Arrays.sort(a);
        Arrays.sort(b);
        
        int i=0;
        int j=b.length-1;
        
        while(i<j){
            if(a[i++]+b[j--]>=k){
                continue;
            }
            
            return false;
        }
        return true;
    }
}
