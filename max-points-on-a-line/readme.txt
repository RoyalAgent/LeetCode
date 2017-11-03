Given n points on a 2D plane, find the maximum number of points that lie on the same straight line. 

*******************************华丽的分割线******************************************
主要思想:
选定一个点，分别计算其他点和它构成的直线的斜率，斜率相同的点肯定在同一条直线上。
计算斜率时，注意重合点和x值相同的两个点（数学上称斜率不存在，此时斜率用int的最大值表示）。
利用了HashMap来存储斜率和点的个数.
