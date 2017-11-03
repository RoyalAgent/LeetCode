import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().toString().split(" ");
        int num = sc.nextInt();
        int[][] cube = new int[str.length][str.length];
        //建立一个二维上三角矩阵进行存储计算
        for(int i = 0; i < str.length; i++){
            for(int j = i+1; j < str.length ; j++){
                cube[i][j] = Integer.parseInt(str[i]) + Integer.parseInt(str[j]);
                if(cube[i][j] == num){
                    System.out.println("[" + (i+1) + "," + (j+1) + "]");
                    break;
                }
            }
        }
    }
}
