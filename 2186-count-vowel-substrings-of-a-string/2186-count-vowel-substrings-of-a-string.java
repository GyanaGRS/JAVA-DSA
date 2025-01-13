class Solution {
    public int countVowelSubstrings(String word) {
        Set<Character> vowel= new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');

        int count=0;
        for(int i=0; i<word.length(); i++){
            Set<Character> seen= new HashSet<>();
            for(int j=i; j<word.length(); j++){
                if(!vowel.contains(word.charAt(j))){
                    break;
                }
               
                seen.add(word.charAt(j));
                
                if(seen.size()==5){
                    count ++;
                }
            }
        }
        return count;
    }
}