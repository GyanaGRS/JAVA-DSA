class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int track=nums[0];
        int count=1;

        for(int i=1; i<nums.length; i++){
            if(nums[i]==track){
                count++;
            }else{
                if(count> nums.length/2){
                    return track;
                }
                track=nums[i];
                count=1;
            }
        }
        if(count> nums.length/2){
            return track;
        }

        return -1;
    }
}