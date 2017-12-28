public class Main {
    public class Solution {
        public int maxSubArray(int[] A) {
            int maxsum=0;
            int sum=0;
            int max=A[0];
            for(int i=0;i<A.length;i++){
                sum+=A[i];
                if(sum<0)
                    sum=0;
                if(A[i]>max)
                    max=A[i];
                maxsum=maxsum>sum?maxsum:sum;
            }
            return max>0?maxsum:max;
        }
    }
}
