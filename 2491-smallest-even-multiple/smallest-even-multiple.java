class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2!=0){
            return n*2;
        }
        
        int total=0;
            for(int i=2;i<=n;i++){
                if(i%n==0&&i%2==0){
                    total=i;
                }
            }
        
        return total;
    }
}