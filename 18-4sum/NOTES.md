**Approaches**
1. Sort the array, Select first 3 elements as 3 possible answers. Do a binary search for the fourth element(target-sum of 3 elements). Complexity is O(N^3XlogN). Use a set to ensure we are only storing **unique** quadruplets.
2. Sort the array, Select first 2 elements as 2 possible answers. Use 2-pointer technique to find remaining 2 elements. Complexity is O(N^3). Use a set to ensure we are only storing **unique** quadruplets. Advantage for this approach comes from the power of 2-pointer to find 2 elements in a single iteration.
​
​
**Lang Learnings:**
1. Java doesn't have *long long* it only has *long*. It is not *long int*, Just *long*
2. Sort an array in java using *Arrays.sort(arr)*