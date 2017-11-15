 Say you have an array for which the i th element is the price of a given stock on day i.
Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again). 
 假设你有一个数组，其中第i个元素是第i天给定股票的价格。
设计一个算法来找到最大的利润。 您可以根据需要完成尽可能多的交易（即多次买入和卖出一次股票）。 但是，您不可以同时进行多笔交易（即您必须在再次购买之前出售股票）。

*******************************华丽的分割线*********************************************
炒股想挣钱当然是低价买入高价抛出，那么这里我们只需要从第二天开始，如果当前价格比之前价格高，则把差值加入利润中，因为我们可以昨天买入，今日卖出，若明日价更高的话，还可以今日买入，明日再抛出。以此类推，遍历完整个数组后即可求得最大利润。
