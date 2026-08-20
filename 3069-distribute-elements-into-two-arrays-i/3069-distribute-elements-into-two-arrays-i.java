class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();

        int n=nums.length;

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        int a=nums[0];
        int b=nums[1];
        for(int i=2;i<n;i++){

            if(a>b){
                a=nums[i];
                arr1.add(a);
                
            }
            else{
                b=nums[i];
                arr2.add(b);   
            }
        }

        arr1.addAll(arr2);

        int res[]=new int[n];

        for(int j=0;j<n;j++){
            res[j]=arr1.get(j);
        }
        return res;
    }
}