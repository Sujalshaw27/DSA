class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tgas =0;
        int tcost = 0;
        int rem = 0;
        int start = 0;

        for(int i = 0; i<cost.length; i++){
            tcost+= cost[i];
            tgas += gas[i];
        }

        if(tgas<tcost) return -1;
        
        for(int i = 0; i<gas.length; i++){
        rem += gas[i]-cost[i];
        if(rem<0){
            rem = 0;
            start = i+1;
        }
    }
       
    return start;   
    }
}