class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        int right=people.length-1;
        int left=0;
        int boat=0;
        while(right>=left){
            if(people[left]+people[right]<=limit){
                left++;
            }
            right--;
            boat++;
            


        }
        return boat;
    }
}