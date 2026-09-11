/* You are given four positive integers a, b, c, d (with a ≤ b and c ≤ d). Define:
• S1 = set of all even numbers in the range [a, b] (inclusive)
• S2 = set of all multiples of 3 in the range [c, d] (inclusive)
Let U = S1 ∪ S2 (union of S1 and S2). The rank of an element x in set S
is defined as:
rank(x) = 1 + (number of elements in S that are > x)
In other words, elements are ranked in descending order (largest element
has rank 1, second largest has rank 2, etc.).
You are also given an integer k. Your task is to find the element in U that
has rank k. If no such element exists (i.e., k > |U| or k < 1), print −1.
  
Input Format
A single line containing five space-separated integers: a b c d k
  
Output Format
A single integer: the element with rank k in U, or −1 if no such element exists.
  
Examples
Input           Output
1 10 5 15 3      10
1 5 6 10 1        9
1 1 1 1 1        -1
2 100 3 100 10   94
  
Explanation of Examples
Example 1: a = 1, b = 10, c = 5, d = 15, k = 3
• S1 = even numbers in [1, 10] = {2, 4, 6, 8, 10}
• S2 = multiples of 3 in [5, 15] = {6, 9, 12, 15}
• U = S1 ∪ S2 = {2, 4, 6, 8, 10, 9, 12, 15}
• Sorted in descending order: {15, 12, 10, 9, 8, 6, 4, 2}
• Rank 1: 15, Rank 2: 12, Rank 3: 10
  
Example 2: a = 1, b = 5, c = 6, d = 10, k = 1
• S1 = even numbers in [1, 5] = {2, 4}
• S2 = multiples of 3 in [6, 10] = {6, 9}
• U = {2, 4, 6, 9}
• Sorted in descending order: {9, 6, 4, 2}
• Rank 1: 9
  
  Example 3: a = 1, b = 1, c = 1, d = 1, k = 1
• S1 = even numbers in [1, 1] = {} (1 is odd)
• S2 = multiples of 3 in [1, 1] = {} (1 is not a multiple of 3)
• U = {} (empty set)
• No element with rank 1
  
Example 4: a = 2, b = 100, c = 3, d = 100, k = 10
• S1: even numbers in [2, 100] (50 elements)
• S2: multiples of 3 in [3, 100] (33 elements: 3,6,9,...,99)
• S1 ∩ S2: multiples of 6 in [max(2, 3) = 3, 100] (16 elements: 6,12,...,96)
• |U| = 50 + 33 − 16 = 67
• The 10th largest element is 94
  
Constraints
• 1 ≤ a ≤ b ≤ 10^9
• 1 ≤ c ≤ d ≤ 10^9
• 1 ≤ k ≤ 10^18 */
