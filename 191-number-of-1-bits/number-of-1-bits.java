class Solution {
    public int hammingWeight(int n) {
        int result=0;
        while(n>0){
            int i=n%2;
            if(i==1){
                result++;
            }
            n=n/2;
        }
        return result;
    }
}