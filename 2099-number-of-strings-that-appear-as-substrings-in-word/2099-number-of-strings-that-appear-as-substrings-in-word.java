class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        // Iterate over each pattern in the array
        for (String str : patterns) {
            // Check if the pattern is a substring of the word
            if (word.contains(str)) {
                count++;
            }
        }

        return count;
    }
}
