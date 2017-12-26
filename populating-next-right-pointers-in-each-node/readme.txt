Given a binary tree

    struct TreeLinkNode {
      TreeLinkNode *left;
      TreeLinkNode *right;
      TreeLinkNode *next;
    }

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set toNULL.

Initially, all next pointers are set toNULL.

Note:

You may only use constant extra space.
You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).

For example,
Given the following perfect binary tree,

         1
       /  \
      2    3
     / \  / \
    4  5  6  7

After calling your function, the tree should look like:

         1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL
填充每个下一个指针指向其下一个正确的节点。 如果没有下一个正确的节点，下一个指针应该被设置为NULL。

最初，所有下一个指针都设置为NULL。
您只能使用恒定的额外空间。
你可以假设它是一棵完美的二叉树（即所有叶子在同一层次上，每个父亲有两个孩子）。

