class Solution {
    public int lengthOfLastWord(String s) {

        int track=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==' ' && track==0){
                continue;
            }
            if (s.charAt(i)!=' '){
                track++;
            }else{
                break;
            }
        }
        return track;
    }
}