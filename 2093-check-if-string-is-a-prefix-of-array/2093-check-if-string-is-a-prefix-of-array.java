class Solution {
    public boolean isPrefixString(String s, String[] words) {
        
        String prefix= "";
        for(String str: words){
            prefix= prefix.concat(str);

            if(prefix.equals(s)){
                return true;
            }
        }
        return false;
    }
}