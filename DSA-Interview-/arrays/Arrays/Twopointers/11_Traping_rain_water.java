// 42. Trapping Rain Water

class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int answer  = 0;
        int max_left = height[0];
        int max_right =height[right];

        while(left < right){
            if(max_left < max_right){
                left++;
                max_left = Math.max(max_left, height[left]);
                answer += max_left - height[left];
            }else{
                right--;
                max_right = Math.max(max_right, height[right]);
                answer +=  max_right - height[right];
            }
        }
        return answer;
        
    }
}   