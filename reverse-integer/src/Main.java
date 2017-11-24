public class Main {
    public int reverse(int x) {
        int flag = x < 0? -1 : 1;
        x = Math.abs(x);
        StringBuffer sb = new StringBuffer(String.valueOf(x));
        sb.reverse();
        try{
            x = Integer.parseInt(sb.toString());
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        x = flag * x;
        if(x > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(x < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else{
            return x;
        }
    }
}
