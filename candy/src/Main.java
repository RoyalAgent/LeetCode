import java.util.*;
public class Main {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if(n==0 || ratings == null)
            return 0;
        int[] count = new int[n];
        int sum=0;
        //初始，每个孩子至少有一颗糖
        Arrays.fill(count, 1);
        for(int i=1; i<n; i++){
            if(ratings[i] > ratings[i-1]){
                count[i] = count[i-1]+1;
            }
        }
        for(int i=n-1; i>0; i--){
            if(ratings[i]<ratings[i-1] && count[i]>=count[i-1]){
                count[i-1] = count[i]+1;
            }
            sum += count[i];
        }
        sum += count[0];
        return sum;
    }
}
