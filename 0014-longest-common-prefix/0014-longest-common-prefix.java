class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);

        String fstStr= strs[0];
        String lstStr= strs[strs.length-1];

        int index=0;
        while(index< fstStr.length()){
            if(fstStr.charAt(index)==lstStr.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        if(index==0){
            return "";
        }else{
            return fstStr.substring(0,index);
        }
    }
}