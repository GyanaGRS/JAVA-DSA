class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> seenNumbers= new HashSet<>();

        while(n != 1){
            if(seenNumbers.contains(n)){
                return false;
            }
            seenNumbers.add(n);
            n= sumOfDigits(n);
        }
        return true;
    }
    public static int sumOfDigits(int num){
                int sum=0;
                while(num>0){
                    int dgt= num%10;
                    sum= sum+(dgt*dgt);
                    num= num/10;
                }
                return sum;
            }
}