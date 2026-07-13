class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length-1; 
        int low = 0;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(target == nums[mid]){
                return mid;
            }
             else if (nums[low]<=nums[mid]){
              if(nums[low]<=target && target<= nums[mid]){
                    high = mid - 1;
              }
              else{
                low = mid+1;
              }
             }
              else{
                if(target<= nums[high] && target >= nums[mid]){
                    low = mid+ 1;
                }
                else{
                    high = mid - 1;
                }
              }
        }
        return -1;
        }
    
    }