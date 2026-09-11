/* You are given an array wealth of n positive integers, where wealth[i]
represents the wealth of person i. You are also given an integer k where 1 <
k < n.
A person is said to be rich if there are not more than k people who have
wealth greater than k × wealth[person].
In other words, person i is rich if:
count of people with wealth > k × wealth[i] ≤ k
Your task is to find and return the number of rich people in the array.
  
Input Format
• The first line contains two integers n and k, separated by a space.
• The second line contains n space-separated positive integers representing
the wealth array.
  
Output Format
A single integer representing the number of rich people.
  
Examples
Input               Output
6 2                   4
10 3 5 20 1 4
5 1                   2
5 10 2 8 1
4 2                   4
2 2 2 2
  
Explanation of Examples
Example 1
For k = 2 and wealth = [10, 3, 5, 20, 1, 4]:
• Person with wealth 10: threshold = 2×10 = 20. People with wealth > 20:
none. Count = 0 ≤ 2 ⇒ Rich
• Wealth 3: threshold = 6. People with wealth > 6: [10, 20]. Count =
2 ≤ 2 ⇒ Rich
• Wealth 5: threshold = 10. People with wealth > 10: [20]. Count = 1 ≤ 2
⇒ Rich
• Wealth 20: threshold = 40. People with wealth > 40: none. Count =
0 ≤ 2 ⇒ Rich
• Wealth 1: threshold = 2. People with wealth > 2: [3, 5, 10, 20]. Count =
4 > 2 ⇒ Not rich
• Wealth 4: threshold = 8. People with wealth > 8: [10, 20]. Count =
2 ≤ 2 ⇒ Rich
Total rich people = 4.

  Example 2
For k = 1 and wealth = [5, 10, 2, 8, 1]:
• Wealth 5: threshold = 5. People with wealth > 5: [10, 8]. Count = 2 > 1
⇒ Not rich
• Wealth 10: threshold = 10. People with wealth > 10: none. Count =
0 ≤ 1 ⇒ Rich
• Wealth 2: threshold = 2. People with wealth > 2: [5, 10, 8]. Count =
3 > 1 ⇒ Not rich
• Wealth 8: threshold = 8. People with wealth > 8: [10]. Count = 1 ≤ 1
⇒ Rich
• Wealth 1: threshold = 1. People with wealth > 1: [5, 10, 2, 8]. Count =
4 > 1 ⇒ Not rich
Total rich people = 2.
  
Example 3
For k = 2 and wealth = [2, 2, 2, 2]: All thresholds = 2 × 2 = 4. No one has
wealth > 4, so count = 0 ≤ 2 for everyone. Total rich people = 4.
Constraints
• 2 ≤ n ≤ 2 × 10^5
• 1 < k < n
• 1 ≤ wealth[i] ≤ 10^9 */
