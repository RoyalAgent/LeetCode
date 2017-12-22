Given n non-negative integers a1 , a2 , ..., an , where each represents a point at coordinate (i, ai ). n vertical lines are drawn such that the two endpoints of line i is at (i, ai ) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container.
给定n个非负整数a1，a2，...，an，其中每个代表坐标（i，ai）处的一个点。 绘制n条垂直线，使得线i的两个端点处于（i，ai）和（i，0）处。 找到两条线，它们与x轴一起形成一个容器，使得容器包含最多的水。

注意：您不得倾斜容器。

*************************************华丽的分割线****************************************
这题最关键的是两点，一是两边往中间找，二是每次放弃最短的版。
这么做的原因在于：从起点和终点开始找，宽度最大，这时每移动一次其中一个点，必然宽度变小。
如此一来，想求最大，只有高度增长才有可能做到，去掉限制----短板，即放弃高度较小的点。
