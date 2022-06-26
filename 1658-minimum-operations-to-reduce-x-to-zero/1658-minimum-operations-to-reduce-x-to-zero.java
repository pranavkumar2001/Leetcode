class Solution {
    public int minOperations(int[] nums, int x) {
        int s = 0;
        for(int i =0;i<nums.length;i++){
            s+=nums[i];
        } // Getting the sum of the entire array
        int subarraysum = s-x; // sum of the entire array - target value
        if(subarraysum==0){ // if entire array is equal to target
            return nums.length;
        }
        if(subarraysum<0){ // if entire array is less than target
            return -1;
        }
        int windowstart = 0;
        int maxm = 0;
        int windowsum = 0;
        for(int i =0;i<nums.length;i++){ // sliding window to find the new target = subarraysum
            windowsum+=nums[i];
            while(windowsum>subarraysum){
                windowsum-=nums[windowstart];
                windowstart++;
            }
            if(windowsum==subarraysum && maxm<(i-windowstart+1)){
                maxm = i-windowstart+1; // taking the maximum length whose sum is equal to subarraysum
            }
        }
        if(maxm==0){ // if not such subarray found 
            return -1;
        }
        else{
            return nums.length-maxm; // ans is the length of array apart from the subarray as that would be equal to target value
        }
    }
}