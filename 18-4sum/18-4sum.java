class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int size = nums.length;
        
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<size;i++) {
            for(int j=i+1;j<size;j++) {
                long target2 = (long)target-((long)nums[i]+(long)nums[j]);
                int p1=j+1;
                int p2=size-1;
                
                while(p1<p2) {
                    if ((long)nums[p1]+(long)nums[p2]<target2) {
                        p1++;
                    }
                    else if ((long)nums[p1]+(long)nums[p2]>target2) {
                        p2--;
                    }
                    else {
                        List<Integer> tempRes = new ArrayList<>();
                        tempRes.add(nums[i]);
                        tempRes.add(nums[j]);
                        tempRes.add(nums[p1]);
                        tempRes.add(nums[p2]);
                        res.add(tempRes);
                        p1++;
                        p2--;
                    }
                }
            }
        }
        
        return new ArrayList<>(res);
        
    }
}