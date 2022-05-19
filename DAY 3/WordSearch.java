class Solution {
    public boolean exist(char[][] board, String word) {
        
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        int n=board.length;
        int m=board[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]!=word.charAt(0)){
                    continue;
                }
                boolean res=backtrack(board,i,j,0,word,dir);
                if(res) return true;
                
            }
        }
        return false;
    }
    
    
    
    public boolean backtrack(char[][] board,int i,int j,int idx, String word,int[][] dir){
        
        if(idx==word.length()){
            return true;
        }
         if(i<0 || j<0 || i==board.length || j==board[0].length || word.charAt(idx)!=board[i][j]) return false;
        
         char myval=board[i][j];
                board[i][j]='@';
   
//         boolean res=backtrack(board,i+1,j,idx+1,word)||
//                     backtrack(board,i-1,j,idx+1,word) ||
//                     backtrack(board,i,j-1,idx+1,word)||
//                     backtrack(board,i,j+1,idx+1,word);
        
        // boolean res;
        for(int d=0;d<dir.length;d++){
            int r=i+dir[d][0];
            int c=j+dir[d][1];
            boolean res=backtrack(board,r,c,idx+1,word,dir);
            
            if(res==true){
                // board[r][c]=myval;
                return true;
            }
        }
        
        board[i][j]=myval;
        return false;
    }
}