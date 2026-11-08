class Solution {
    public boolean checkGoodInteger(int n) {
        int total=0;
        int result=0;
        while(n>0){
            int i=n%10;
            result=result+i;
            total=total+i*i;
            n=n/10;
        }
        if((total-result)>=50){
            return true;
        }
        return false;
    }
}