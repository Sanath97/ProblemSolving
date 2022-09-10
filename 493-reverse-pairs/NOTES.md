**Approaches**
1. Basic bruteforce approach would be to do a nested comparison of each element with all elements on its right and count pairs that satisfy the given condition. Space is constant but time complexity would be O(n^2)
2. Optimal solution is a variant of merge sort. During the merge functionality we count number of pairs by taking advantage that array on left and right are sorted.
​
Essentially all the comparisons are made in merge step, and since arrays are sorted count of comparisons is reduced resulting in less complexity.
​
*Be cautious with conditions in code. More probable to make mistakes in writing conditions.*