public class Main {
    public int romanToInt(String s) {
        int res=0;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            switch(c){
                case 'I':
                    res += (res >= 5 ? -1 : 1);
                    break;
                case 'V':
                    res=res+5;
                    break;
                case'X':
                    res += 10 * (res >= 50 ? -1 : 1);
                    break;
                case'L':
                    res=res+50;
                    break;
                case'C':
                    res += 100 * (res >= 500 ? -1 : 1);
                    break;
                case'D':
                    res=res+500;
                    break;
                case'M':
                    res=res+1000;
            }
        }
        return res;
    }
}
