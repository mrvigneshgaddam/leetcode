class Solution {
    public int minimumArrayLength(int[] nums) {
        int min = Integer.MAX_VALUE, cnt = 0;
        for (int val : nums) { 
            if (val < min) {
                min = val;
                cnt = 1;
            } else if (val == min)
                cnt++;
        }
        for (int val : nums) 
            if (val % min != 0)
                return 1;
        if (cnt <= 2)
            return 1;
        else
            return cnt / 2 + (cnt % 2 == 0 ? 0 : 1);
    }
}