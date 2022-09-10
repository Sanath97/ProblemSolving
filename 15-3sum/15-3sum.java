class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> arrValues = new HashMap<>();
        
        for(int i=0;i<nums.length;i++) {
            arrValues.put(nums[i], i);
        }
        
        Set<List<Integer>> tempSet = new HashSet<>();
        Set<List<Integer>> finalSet = new HashSet<>();
        
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                int target = (nums[i] + nums[j])*-1;
                if (arrValues.get(target)!=null &&
                    arrValues.get(target)!= i && arrValues.get(target)!= j) {
                    List<Integer> tempRes = new ArrayList<>();
                    tempRes.add(nums[i]);
                    tempRes.add(nums[j]);
                    tempRes.add(target);
                    tempSet.add(tempRes);
                }
            }
        }
        
        for (List<Integer> list: tempSet) {
            Collections.sort(list);
            finalSet.add(list);
        }
        return new ArrayList<>(finalSet);
    }
}