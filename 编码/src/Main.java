import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toString();
        char[] array = str.toCharArray();
        CodeIndex codeIndex = new CodeIndex();
        codeIndex.codeIndex(array);
    }
}

class CodeIndex{
    public void codeIndex(char[] charArrar){
        int index = 0;
        int i;
        int[] dic = {25*25*25+25*25+25+1,25*25+25+1,25+1,1};
        for(i = 0; i < charArrar.length; i++){
            index += (charArrar[i] - 'a')*dic[i];
        }
        System.out.println(index + (i - 1));
    }
}

