class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int minimumDiff= Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++){
            int diff= arr[i]-arr[i-1];
            if(diff<minimumDiff){
                minimumDiff= diff;
            }
        }

        List<List<Integer>> totalArray= new ArrayList<>();
       
        for(int i=1; i<arr.length; i++){
            int diff= arr[i]-arr[i-1];
            if(diff==minimumDiff){
            List<Integer> pairs= new ArrayList<>();
            pairs.add(arr[i-1]);
            pairs.add(arr[i]);
            totalArray.add(pairs);
            }    
        }
        return totalArray;
    }
}