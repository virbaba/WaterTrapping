class Solution {
    public int trap(int[] arr) {

        if(arr == null || arr.length == 0)
            return 0;

        int leftMax = 0, rightMax = 0;
        int left = 0, right = arr.length - 1;
        int trappedWater = 0;

        while(left < right){
            if(arr[left] < arr[right]){
                if(leftMax < arr[left]){
                    leftMax = arr[left];
                }
                else{
                    trappedWater += leftMax - arr[left];
                }
                left++;
            }
            else{
                if(rightMax < arr[right]){
                    rightMax = arr[right];
                }
                else{
                    trappedWater += rightMax - arr[right];
                }
                right--;
            }
        }

        return trappedWater;
    }
}
