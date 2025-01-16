class Solution {
    public int minTimeToType(String word) {
        
        char currChar= 'a';
        int totalTime= 0;

        for(char target: word.toCharArray()){
            int clockWiseDist= Math.abs(currChar- target);
            int antiClockDist= 26- clockWiseDist;
            int minDist= Math.min(clockWiseDist, antiClockDist);

            totalTime+= minDist+1; //1sec for type the target char
            currChar= target;
        }
        return totalTime;
    }
}