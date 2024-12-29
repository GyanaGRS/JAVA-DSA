class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }

        for(int i=0; i<=haystack.length()-needle.length(); i++){  //loop until there exsist less than one character of  
                                                                // needle in haystack
            if(needle.equals(haystack.substring(i,i+needle.length())))
                return i;
        }

        return -1;
    }
}