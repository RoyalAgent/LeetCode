 Given n, how many structurally unique BST's (binary search trees) that store values 1...n?

For example,
Given n = 3, there are a total of 5 unique BST's.

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3

**********************华丽的分割线***********************************
设dp[i]表示共有i个节点时，能产生的BST树的个数
n == 0 时，空树的个数必然为1，因此dp[0] = 1
n == 1 时，只有1这个根节点，数量也为1，因此dp[1] = 1
n == 2时，有两种构造方法，如下图所示：
加载中...
因此，dp[2] = dp[0] * dp[1] + dp[1] * dp[0]
n == 3时，构造方法如题目给的示例所示，dp[3] = dp[0] * dp[2] + dp[1] * dp[1] + dp[2] * dp[0] 
用递归实现即可。

