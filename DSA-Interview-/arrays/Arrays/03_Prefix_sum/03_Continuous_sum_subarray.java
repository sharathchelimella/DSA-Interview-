//523. Continuous Subarray Sum

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,-1);
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int rem = sum%k;
            if(map.containsKey(rem)){
                if(2 <= i-map.get(rem)){
                    return true;
                }
            }else{
                map.put(rem,i);
            };
        }
        return false;
        
    }
} 
