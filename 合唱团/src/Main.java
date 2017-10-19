//public class Main {
//    public static void main(String[] args) {
//        int stuNum = 3; //学生数
//        int ability[] = {7,4,7}; //每位同学能力值
//        int k = 2; //选取学生个数
//        int d = 2; //间隔
//        int dpmax[] = new int[stuNum];
//        int dpmin[] = new int[stuNum];
//        int temp = 0;
//        int tempFin = 0;
//
//        dpmax = ability;
//        dpmin = ability;
//
//        for(int i = 1; i < k; i++){
//            for(int j = 0; j <= i; j++){
//                temp = ability[i] * dpmax[j];
//                if(dpmax[i] < temp){
//                    dpmax[i] = temp;
//                    System.out.println(dpmax[i]);
//                }
//            }
//        }
//    }
//}


import java.util.Scanner;

public class Main {
    // 参考 【小刀初试】的算法思想， Java版本，便于理解
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {
            int n = cin.nextInt();          // n 个学生
            int[] arr = new int [n+1];
            for (int i = 1; i <=n ; i++) {
                arr[i] = cin.nextInt();
            }
            int K = cin.nextInt();            // 选出K个
            int d = cin.nextInt();            // 两个学生的位置编号的差不超过 d
            long[][] fmax = new long[K+1][n+1]; // 记录最大乘积
            long[][] fmin = new long[K+1][n+1]; // 记录最小乘积
            // fmax[k][i]表示 : 当选中了k个学生，并且以第i个学生为结尾，所产生的最大乘积；
            // fmin[k][i]表示 : 当选中了k个学生，并且以第i个学生为结尾，所产生的最小乘积；
            //初始化第一行
            long  res = Integer.MIN_VALUE; // 记得用Long类型，考虑数值范围
            for (int i = 1; i <=n; i++) {
                fmax[1][i] = arr[i];
                System.out.println(fmax[1][i]);
                fmin[1][i] = arr[i];
                System.out.println(fmin[1][i]);
                System.out.println("************");
                for (int k = 2; k <=K; k++) {
                    for (int j = i-1 ; j > 0 &&  i-j<=d ; j--) {
                        fmax[k][i] = Math.max(fmax[k][i], Math.max(fmax[k-1][j] * arr[i], fmin[k-1][j] * arr[i]));
                        System.out.println(fmax[k][i]);
                        fmin[k][i] = Math.min(fmin[k][i], Math.min(fmax[k-1][j] * arr[i], fmin[k-1][j] * arr[i]));
                        System.out.println(fmin[k][i]);
                    }
                    System.out.println("******************");
                }
                res = Math.max(res ,fmax[K][i]);
            }
            System.out.println(res);
        }
    }
}

