class Solution {
    public int differenceOfSums(int n, int m) {
        int result=0;
        int total=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
               result=result+i;
            }
            else{
                total=total+i;
            }
        }
        return total-result;
    }
}