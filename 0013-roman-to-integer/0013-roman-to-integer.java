class Solution {
    public int romanToInt(String s) {
        int total= 0;
        int prevVal= 0;

        for(int i=s.length()-1; i>=0; i--){
            int currentVal= getValue(s.charAt(i));
            if(currentVal<prevVal){
                total-=currentVal;
            }
            else{
                total+=currentVal;
            }

            prevVal= currentVal;
        }

        return total;
    }
    private int getValue(char roman){
            switch(roman){
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default : return 0;
            }
        }
}