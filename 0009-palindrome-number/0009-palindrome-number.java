class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int tem= x;
        int fc= 0;
        while (x>0){
            int rem = x%10;
            fc= (fc*10)+rem;
            x /=10;
        }

        if(fc==tem){
            return true;
        }  
        
        return false;
        

    }
}