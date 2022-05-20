package Day5;
import java.util.*;

public class Valid_Square {
    //using space
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        HashSet<Integer> hs=new HashSet<>();;
        hs.add(ds(p1,p2));
        hs.add(ds(p1,p3));
        hs.add(ds(p1,p4));
        hs.add(ds(p2,p3));
        hs.add(ds(p2,p4));
        hs.add(ds(p3,p4));
        
        if(!hs.contains(0) && hs.size()==2) return true;
        return false;
        
       
    }
    
    //Using sorting 
    public boolean validSquare_2(int[] p1, int[] p2, int[] p3, int[] p4) {
      
        int[] arr={ds(p1,p2),ds(p1,p3),ds(p1,p4),ds(p2,p3),ds(p2,p4),ds(p3,p4)};
        Arrays.sort(arr);
        
        return arr[0]>0 && arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3] && arr[4]==arr[5]; 
        
    }
    
    public int ds(int a[],int[] b){
        return ((a[0]-b[0])*(a[0]-b[0])+(a[1]-b[1])*(a[1]-b[1]));
    }
}


