class Solution {
    public int[] plusOne(int[] digits) {

        //for last digit 9
        for(int i= digits.length-1; i>=0; i--) {
            if(digits[i]<9) {
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }     

        //for all digits are 9
        int[] newDigits= new int[digits.length+1];
        newDigits[0]=1;
        return newDigits;
    }
}