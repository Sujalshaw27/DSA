class Solution {
    public int jump(int[] nums) {
        int maxi = 0;
        int end = 0;
         int jumps = 0;
         for(int i = 0; i<nums.length-1; i++){
            
             maxi = Math.max(maxi , nums[i]+ i);
             
             if(i == end){
                jumps++;
                end = maxi;
             }
         }
         return jumps;
    }
}