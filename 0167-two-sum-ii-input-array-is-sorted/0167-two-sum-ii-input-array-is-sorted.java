class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int l = 0;
        int r = numbers.length-1;
        int sum;
        int[] res = new int[2];
        ArrayList<Integer> arr = new ArrayList<>();
        while(l<r){
            sum = numbers[l] + numbers[r];
            if(sum == target){
                arr.add(l+1);
                arr.add(r+1);
                
                res[0] = arr.get(0);
                res[1] = arr.get(1);
                return res;
            }
            else if( sum < target){
                l++;
            }
            else{
                r--;
            }
        }
        return res;
        
    }
}