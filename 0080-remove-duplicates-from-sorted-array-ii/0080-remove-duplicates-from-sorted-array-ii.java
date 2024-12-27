class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;

        int j=2;
        for(int i=2; i<nums.length; i++){
            if(nums[i]!=nums[j-2]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}