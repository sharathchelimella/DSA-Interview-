//3sum using two pointers

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int s = i+1;
            int r = n-1;
            while(s < r){
                int sum = nums[i]+nums[s]+nums[r];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[s],nums[r]));
                    while(s<r && nums[s] == nums[s+1]) s++;
                    while(s<r && nums[r] == nums[r-1]) r--;
                    s++;
                    r--;
                }
                else if(sum > 0){
                    r--;
                }else{
                    s++;
                }
            }
        }
        return res;
        
    }
}