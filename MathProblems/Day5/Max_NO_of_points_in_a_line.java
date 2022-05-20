package Day5;
import java.util.*;

public class Max_NO_of_points_in_a_line {
    // BruteForce
     public int maxPoints(int[][] points) {
        int n=points.length;
        if(n<=2) return n;
        
        int max=2;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int tot=2;
                for(int k=0;k<n;k++){
                    if(k!=i && k!=j){
                        if((points[j][1]-points[i][1])*(points[i][0]-points[k][0]) == (points[i][1]-points[k][1])*(points[j][0]-points[i][0]))tot++;
                            
                    }
                    
                }
                max=Math.max(max,tot);
            }
        }
        return max;
    }

    //Optimised Sol using HashMap
    public int maxPoints_2(int[][] points) {
        int n=points.length;
        if(n<=2) return n;
       int res=0;
        
        for(int i=0;i<n;i++){
            HashMap<Double,Integer> hm=new HashMap<>();
            int same=0;//this will keep count of duplicates
            int count=1;
            
            for(int j=0;j<n;j++){
                if(i!=j){
                int firstX=points[i][0];
                int firstY=points[i][1];
                
                int secondX=points[j][0];
                int secondY=points[j][1];
                
                //If two points are duplicate simply just increment the same and continue
                if(firstX==secondX && firstY==secondY)
                {
                    same++;
                    continue;
                }

                //If x is same for two points that means it is parallel to y-axis having slope infinity
                else if(firstX==secondX){
                    count++;
                    continue;
                }
                else{
                    double k=(double)(secondY-firstY)/(double)(secondX-firstX);
                    hm.put(k,hm.getOrDefault(k,1)+1);
                    res=Math.max(hm.get(k)+same,res);
                }
            }
            }
              res=Math.max(res,count);
            
        }
      return res;
    }
}
