class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
    
    int mergeSort(int[] nums, int low, int high) {
        if (low>=high) {
            return 0;
        }
        int mid = (low+high)/2;
        int ans=mergeSort(nums, low, mid);
        ans += mergeSort(nums, mid+1, high);
        ans += merge(nums, low, mid, high);
        return ans;
    }
    
    int merge(int[] nums, int low, int mid, int high) {
        int ans=0;
        int j=mid+1;
        // Logic for counting number of pairs that satisfy given
        // condition.
        for(int i=low;i<=mid;i++) {
            while(j<=high && nums[i] > (2* (long) nums[j])) {
                j++;
            }
            ans+=(j-mid-1);
        }
        
        int[] sortedNums = new int[high-low+1];
        int p1=low;
        int p2=mid+1;
        int k=0;
        while(p1<mid+1 && p2<=high) {
            if(nums[p1] <= nums[p2]) {
                sortedNums[k++] = nums[p1++];
            }
            else {
                sortedNums[k++] = nums[p2++];
            }
        }
        
        while(p1<=mid) {
            sortedNums[k++] = nums[p1++];
        }
        
        while(p2<=high) {
            sortedNums[k++] = nums[p2++];
        }
        int k1=0;
        for(int i=low;i<=high;i++) {
            nums[i] = sortedNums[k1++];
        }
        return ans;
        
    }
}