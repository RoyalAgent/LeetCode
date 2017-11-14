
/**
 * Created by Royal_agent on 2017/11/10.
 */
public class Main {
    public int singleNumber(int[] A) {
        int result = A[0];
        for (int i = 1; i < A.length; i++)
            result = result ^ A[i];
        return result;
    }
}
