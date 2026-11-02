class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
             while(nums[i]>0){
                int j=nums[i]%10;
                if(j==digit){
                    count++;
                }
                nums[i]=nums[i]/10;
             }
        }
        return count;
    }
}