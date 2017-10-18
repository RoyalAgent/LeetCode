import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int str[] = {1,2,3,4,5,6,7,8,0};
        int str2[][] = new int[3][3];
        int temp = 0;
        DyadicArray array = new DyadicArray();
        //需要查找的数字
        int num = 5;
        //一维数组排序
        Arrays.sort(str);
        //一维数组转化为二维数组
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                str2[i][j] = str[temp];
                temp++;
            }
        }

        array.getDyadicArray(str2);
        array.getNum1(num,str2);
        array.getNum2(num,str2);
        array.getNum3(num,str2);
    }
}

class DyadicArray{
    private int str[][] = new int[3][3];
    private int num;
    //遍历显示二维数组
    public void getDyadicArray(int str[][]){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
    }
    //获取查找数字的位置(一行一行查找)
    public void getNum1(int num,int str[][]){
        boolean status = false;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (str[i][j] == num) {
                    System.out.println("行:"+(i+1)+"列:"+(j+1));
                    status = true;
                }
            }
        }
        //未查询到结果
        if(status == false){
            System.out.println("无结果");
        }
    }
    //获取查找数字的位置(先查找每行最末一个,定位行数,之后遍历行上元素)
    public void getNum2(int num,int str[][]){
        boolean status = false;
        //获取二维数组的列数
        int column = str[0].length;
        for(int i = 0; i < 3; i++){
            //定位数字在哪一行,判断每行最后一个元素是否大于等于需要找到的数字
            if(str[i][column-1] >= num){
                //遍历行上的元素
                for(int j = 0; j < 3; j++){
                    if(str[i][j] == num){
                        System.out.println("行:"+(i+1)+"列:"+(j+1));
                        status = true;
                    }
                }
            }
        }
        //未查询到结果
        if(status == false){
            System.out.println("无结果");
        }
    }
    //获取查找数字的位置(先查找每行最末一个,定位行数,之后二分查找)
    public void getNum3(int num,int str[][]){
        boolean status = false;
        int column = str[0].length;
        for(int i = 0; i < 3; i++){
            //定位数字在哪一行,判断每行最后一个元素是否大于等于需要找到的数字
            if(str[i][column-1] >= num){
                //二分查找
                int low = 0;
                int high = column-1;
                while(low <= high){
                    int mid = (low + high)/2;
                    if(str[i][mid] == num){
                        System.out.println("行:"+(i+1)+"列:"+(mid+1));
                        status = true;
                        break;
                    }
                    else if(str[i][mid] < num){
                        low = mid + 1;
                    }
                    else{
                        high = mid - 1;
                    }
                }
            }
        }
        //未查询到结果
        if(status == false){
            System.out.println("无结果");
        }
    }
}