package Twopointers;
//11. Container With Most Water
class Solution {
    public int maxArea(int[] height) {

        int st  = 0;
        int end = height.length-1;
        int Max = 0;
        while(st<end){
            int min = Math.min(height[st],height[end]);
            int l = end - st;
            int area = min*l;
            Max = Math.max(Max,area);
            if(height[st] < height[end]){
                st++;
            }else{
                end--;
            }
        }
        return Max;
        
    }
}