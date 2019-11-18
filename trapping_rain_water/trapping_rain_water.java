class Solution {
    public int trap(int[] height) {

        if (height.length == 0) {
            return 0;
        }
        int[] rigHeight = new int[height.length];
        int[] lefHeight = new int[height.length];

        lefHeight[0] = height[0];

        for (int i = 1;i < height.length;i++) {
           lefHeight[i] = Integer.max(height[i],lefHeight[i-1]); 
        }

        rigHeight[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2;i >= 0;i--) {
            rigHeight[i] = Integer.max(height[i],rigHeight[i + 1]);
        }
        int total = 0;
        for (int i = 1;i < height.length;i++) {
            total += Integer.min(lefHeight[i],rigHeight[i]) - height[i];
        }
        return total;

    }
}
