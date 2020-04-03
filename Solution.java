public class SolutionOn {
    public static int maxSubArray(int[] nums) {
        int[] al = new int[nums.length];
        al[0] = nums[0];
        int max = al[0];
        for (int i = 1; i < nums.length; i++) {
            al[i] = Math.max(al[i-1]+nums[i],nums[i]);
            max = Math.max(max,al[i]);
        }
        return max;
    }
}
