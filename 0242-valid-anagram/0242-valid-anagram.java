class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!= t.length()){
            return false;
        }

       char[] fstWord = s.toCharArray();
       char[] scndWord= t.toCharArray();

       Arrays.sort(fstWord);
       Arrays.sort(scndWord);

        return Arrays.equals(fstWord, scndWord);
    }
}