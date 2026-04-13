public class Runing_Sum_oneDArray {

    // ye quetion array mai every index par apne se parevious
    //  ki value ko add kar ke ussi index par store kar rha hai 
    // Wase ham isme dp use karte hai lekin without dp ke bhi ho sakta hai ye
    // TC - O(n)  S.C - O(1)  ( because in - place hai )
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4 };
        int [] res = runningSum(arr);
        for (int ele : res) System.out.print(ele+" ");
    }
}
