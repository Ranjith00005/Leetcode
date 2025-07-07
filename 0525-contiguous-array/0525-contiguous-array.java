class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        map.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
            sum += nums[i];
            if (map.containsKey(sum)) {
                if (count < i - map.get(sum)) {
                    count = i - map.get(sum);
                }
            } else {
                map.put(sum, i);
            }
        }
        return count;
    }
}