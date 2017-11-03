/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
import java.util.HashMap;

public class Main {
    public int maxPoints(Point[] points) {
        if (points.length < 3){
            return points.length;
        }

        int max = 0;//用于返回的结果，即共线点的最大个数
        HashMap<Double, Integer> map = new HashMap<Double, Integer>();//保存同一个斜率的点的个数

        for (int i = 0; i < points.length; i++) {//以每一个点为固定点
            map.clear();
            int duplicate = 1;//记录跟固定点重合的个数

            for(int j = 0 ; j < points.length; j++){//遍历其他点，求其与固定点之间的斜率
                if (i == j) {
                    continue;//如果是自己，跳过
                }
                double slope = 0.0;//斜率

                if (points[i].x == points[j].x && points[i].y == points[j].y) {//如果跟固定点重合
                    duplicate++;
                    continue;
                } else if (points[i].x == points[j].x) {//如果跟固定点在同一条竖线上，斜率设为最大值
                    slope = Integer.MAX_VALUE;
                } else {//计算该点与固定点的斜率
                    slope = 1.0 * (points[i].y - points[j].y) / (points[i].x - points[j].x);
                }
                map.put(slope, map.containsKey(slope) ? map.get(slope) + 1 : 1);
            }

            //更新最优解
            if (map.keySet().size() == 0) {//如果map为空
                max = duplicate > max ? duplicate : max;
            } else {
                for (double key : map.keySet()) {
                    max = Math.max((duplicate + map.get(key)), max);
                }
            }
        }
        return max;
    }
}

class Point {
    int x;
    int y;
    Point() { x = 0; y = 0; }
    Point(int a, int b) { x = a; y = b; }
  }