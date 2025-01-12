class Solution {
    public int getLucky(String s, int k) {
        if (s.length() <= 0) {
            return 0;
        }
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        String value = "";
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < alphabets.length; j++) {
                if (s.charAt(i) == alphabets[j]) {
                    value += (j + 1); 
                    break;
                }
            }
        }

        
        while (k > 0) {
            sum = 0;
            for (int i = 0; i < value.length(); i++) {
                sum += value.charAt(i) - '0'; 
            }
            value = Integer.toString(sum); 
            k--;
        }

        return sum;
    }
}
