class Solution {
    public int averageValue(int[] nums) {
        int n=nums.length;
        int result=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0&&nums[i]%3==0){
                    result=result+nums[i];
                    count++;
            }
        }
        if(count==0){
            return 0;
        }
        return result/count;
    }
}