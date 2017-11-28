 Given a linked list, return the node where the cycle begins. If there is no cycle, returnnull.

Follow up:
Can you solve it without using extra space? 

*****************华丽的分割线**************************************
1.先利用快慢指针确定是否有环
2.将两指针分别放在链表头(X)和相遇位置(Z)，并改为相同速度推进，则两指针在环开始位置相遇(Y)
设：链表头是X，环的第一个节点是Y，slow和fast第一次的交点是Z。各段的长度分别是a,b,c。环的长度是L。第一次相遇时slow走过的距离：a+b，fast走过的距离：a+b+c+b。因为fast的速度是slow的两倍，有 2(a+b) = a+b+c+b，可以得到a=c。让两个指针分别从X和Z开始走，每次走一步，那么正好会在Y相遇！也就是环的第一个节点。
