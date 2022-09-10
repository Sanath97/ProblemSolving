class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Approach - 1, Sort and 2 pointers.
        // List<Integer> listInts = new ArrayList<Integer>();
        // for (int i: nums) {
        //     listInts.add(i);
        // }
        // Collections.sort(listInts);
        // System.out.println(listInts);
        // int p1 = 0;
        // int p2 = listInts.size() - 1;
        //  int[] res = new int[2];
        // while (p1 < p2) {
        //     int sum = listInts.get(p1) + listInts.get(p2);
        //     if (sum > target) {
        //         p2--;
        //     }
        //     else if (sum < target) {
        //         p1++;
        //     }
        //     else {
        //        res[0] = p1;
        //        res[1] = p2;
        //         break;
        //     }
        // }
        // return res;
        
        //Approach - 2, Use HashMap.
        Map<Integer, Integer> searchMap;
        searchMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            searchMap.put(nums[i], i);
        }
        int k;
        for (int i = 0; i < nums.length; i++) {
            int[] res = new int[2];
            k = 0;
            res[k++] = i;
            int searchtarget = target - nums[i];
            if (searchMap.get(searchtarget) != null && searchMap.get(searchtarget) != i) {
                res[k++] = searchMap.get(searchtarget);
                return res;
            }
                
        }
        return null;
        
    }
}