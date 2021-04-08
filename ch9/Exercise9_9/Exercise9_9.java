package Exercise9_9;

public class Exercise9_9 {
    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)"+" -> "
                + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)"+" -> "
                + delChar("(1 2 3 4\t5)"," \t"));
    }

    private static String delChar(String src, String delch) {
        //주어진 문자열에서 금지된 문자들을 제거하여 반환한다.
        int idx = 0;
        StringBuffer answer = new StringBuffer(src.length());
        for(int i=0;i<src.length();i++){
            char ch = src.charAt(i);
            if(delch.indexOf(ch)==-1)answer.append(ch);

        }
        return answer.toString();
    }
}
