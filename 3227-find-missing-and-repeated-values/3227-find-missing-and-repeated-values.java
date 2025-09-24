class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        //HashSet<Integer> map= new HashSet<>();
        int len=n*n;
        int arr[]=new int[len+1];
        int res[]=new int[2];

        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int a=grid[i][j];
                if(arr[a]==1){
                    res[0]=a;
                    
                }
                else{
                    arr[a]=1;
                }

            }
        }

        for(int i=1;i<=len;i++){
            if(arr[i]==0){
                res[1]=i;
                break;
            }
        }
            
    return res;
    }
}