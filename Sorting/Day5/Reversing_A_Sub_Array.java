// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Sol{
    public static boolean check(int[] arr,int n){
        int[] temp=new int[arr.length];
        int i=0;
        for(int v:arr){
            temp[i++]=v;
        }

        Arrays.sort(temp);

        int front=0;
        for(;front<n;front++){
            if(temp[front]!=arr[front]){
                break;
            }
        }

        int back=n-1;
        for(;back>=0;back--){
            if(temp[back]!=arr[back]){
                break;
            }
        }

        if(front>=back){
            return true;
        }

        boolean flag=true;
        for(int j=front+1;j<=back;j++){
            if(arr[j-1]<arr[j]){
                flag= false;
                break;
            }
        }

        if(flag){
            return true;
        }
        else{
            return false;
        }
    }
    
     public static void main(String[] args) {
 
        int arr[] = {1, 2, 4, 5, 8, 7, 10, 9};
        int n = arr.length;
 
        if (check(arr, n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}