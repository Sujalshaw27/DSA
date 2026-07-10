class Solution {
    public int maxArea(int[] height) {
        
      
        int maxi = Integer.MIN_VALUE;
        int l = 0;
        int r = height.length-1;
        while(l<r){
            if(height[l] <= height[r]){
               int area = (height[l]*(r-l));
               maxi = Math.max(maxi,area);
               l++;
            }
            else{
                int area = (height[r]*(r-l));
               maxi = Math.max(maxi,area);
               r--;

            }
        }
        return maxi;
        
    }
}