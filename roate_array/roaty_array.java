//Given an array, rotate the array to the right by k steps, where k is non-negative. 
//
// Example 1: 
//
// 
//Input: [1,2,3,4,5,6,7] and k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
// 
//
// Example 2: 
//
// 
//Input: [-1,-100,3,99] and k = 2
//Output: [3,99,-1,-100]
//Explanation: 
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]
// 
//
// Note: 
//
// 
// Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem. 
// Could you do it in-place with O(1) extra space? 
// Related Topics Array



//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        if (k == 0) {
            return;
        }

        int count = 0;
        for (int i = 0;count < nums.length;i++) {
            count++;
            int temp = (i + k) % nums.length;
            int prev = nums[i];
            while (temp != i){
                int current = nums[temp];
                nums[temp] = prev;
                prev = current;
                temp = (temp + k) % nums.length;
                count++;
            }
            nums[i] = prev;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

