class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==1){
            if(target== nums[0])
                return 0;
            else if(target<nums[0])
                return 0;
            else if(target>nums[0])
                return 1;
                
        }

        for(int i=0; i<nums.length; i++) {
            if(nums[i]==target)
                return i;

            else if(target> nums[nums.length-1])
                return nums.length;

            else if(nums[i]<target && nums[i+1]>target){
                return i+1;

            }
        }
        return 0;
    }
}