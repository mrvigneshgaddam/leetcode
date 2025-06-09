class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] value= new int[2]; 
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    value[0]=i;
                    value[1]=j;
                    break;
                }
            }
        }
        return value;
    }
}