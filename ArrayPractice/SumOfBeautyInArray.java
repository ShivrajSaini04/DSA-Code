public class SumOfBeautyInArray {
    
    public int sumOfBeauties(int[] nums) {
        int n = nums.length;
        int[] rightmin = new int[n];
        int[] leftmax = new int[n];
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        for(int i = n-1;i>=0;i--) {
            min = Math.min(min, nums[i]);
            rightmin[i] = min;
            max = Math.max(max, nums[n-i-1]);
            leftmax[n-i-1] = max;
        }
        int sum =0;
        for (int i=1;i<n-1;i++){

            if (leftmax[i-1] < nums[i] && nums[i] <  rightmin[i+1] ) sum+=2;
            else if (nums[i-1]<nums[i] && nums[i] < nums[i+1]) sum+=1;
            else sum += 0;
        }
        return sum;
    }
}
