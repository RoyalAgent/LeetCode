题目描述


Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? 

**************************************华丽的分割线******************************************************
利用异或的知识，具体步骤如下：

两个相同的数异或结果为0，不同为1 ，根据该规则下列过程如下
假设 数组为 2,3,2,3,4,1,4
那么结果应该为1
2^3=0000 0010 ^ 0000 0011 = 0000 0001   1
1^2=0000 0001 ^ 0000 0010 = 0000 0011    3
3^3=0000 0011 ^ 0000 0011 =  0000 0000    0
0^4=0000 0000 ^ 0000 0100 = 0000 0100  4
4 ^ 1 =0000 0100 ^ 0000 0001 = 0000 0101 5
5 ^ 4= 0000 0101 ^ 0000 0100 =0000 0001  1
整个过程如上，最后结果为1
