class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int sum = 0;
        int l = 0;
        int mini = Integer.MAX_VALUE;

        for(int r = 0; r<nums.length; r++){
            sum+= nums[r];
            
            while(sum>=target){ 
                if((r-l+1)<mini){
                mini = r-l+1;

          }
          sum -= nums[l];
          l++;

           
        }
        
    }
    return mini!=Integer.MAX_VALUE? mini: 0;
    }
}