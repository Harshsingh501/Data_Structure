class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> res = new ArrayList<>();
        int left = 0 , top = 0;
        int bottom = matrix.length -1;
        int right = matrix[0].length -1;

        while( left<= right && top<= bottom){
            int  i = left;
            while( i <= right){
                res.add(matrix[top][i]);
                  i++;
            } 
          
            top++;
            
            i = top ;
            while( i <= bottom ){
                res.add(matrix[i][right]);
                i++;
            }
            
            right--;
            if(top <= bottom){
                i = right;
                while(i >= left){
                    res.add(matrix[bottom][i]);
                    i--;
                }
            }
            bottom--;
            if ( left <= right){
                i = bottom;
                while(i >= top){
                    res.add(matrix[i][left]);
                    i--;
                }
            }
            left++;

        }
        return res;
    }
}