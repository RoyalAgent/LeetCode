import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        //使用hashset
        HashSet hash = new HashSet();
        //读入输入
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        while(line != null){
            //分割空格
            String arr[] = line.split(" ");
            //写入hashset
            for(int i = 0; i < arr.length; i++){
                if(hash.contains(arr[i]) == false){
                    hash.add(arr[i]);
                }
            }

            line = reader.readLine();
        }
        //输入总数
        System.out.println(hash.size());
    }
}
