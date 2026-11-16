class Solution {
    public int digitFrequencyScore(int n) {
        int result=0;
        while(n>0){
            int i=n%10;
            result=result+i;
            n=n/10;
        }
        return result;
    }
}