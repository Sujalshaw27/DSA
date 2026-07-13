class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> rem = new HashMap<>();
       rem.put(0,-1);
       int sum = 0;
       for(int i = 0; i<nums.length; i++){
        sum+= nums[i];
        int fact = sum%k;
        if(rem.containsKey(fact)){
            if(i-rem.get(fact)>1){
                    return true;
                }
            }
            else{
                rem.put(fact,i);
            }
        } 
    return false;
    }

}