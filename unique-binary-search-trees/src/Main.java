public class Main {
    public int numTrees(int n) {
        int counts = 0;
        if((n == 0) || (n == 1)){
            return 1;
        }else{
            for(int i = 0;i < n;i++){
                counts += numTrees(i)*numTrees(n-i-1);
            }
        }
        return counts;
    }
}
