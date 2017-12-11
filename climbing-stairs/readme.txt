 You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top? 
你正在爬楼梯的情况。 需要n个步骤才能到达顶端。

每次你可以爬上1或2步。 有多少种不同的方法可以爬到顶端？

*******************************华丽的分割线***************************************
爬楼梯问题。经典的动态规划问题。每次上一个台阶或者两个台阶，问一共有多少种方法到楼顶。这个实际上就是斐波那契数列的求解。可以逆向来分析问题，如果有n个台阶，那么走完n个台阶的方式有f(n)种。而走完n个台阶有两种方法，先走完n-2个台阶，然后跨2个台阶；先走完n-1个台阶，然后跨1个台阶。所以f(n) = f(n-1) + f(n-2)。
