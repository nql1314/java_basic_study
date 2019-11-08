public class Solution53 {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int ans=0;
        for (int i=0;i<nums.length;i++) {
            if (sum <=0) sum = nums[i];
            else {
                sum += nums[i];
                if (sum > ans) ans = sum;
            }
        }
        return ans;
    }
}
