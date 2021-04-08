package Exercise9_6;

public class Exercise9_6 {
    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src,10));
        System.out.println(fillZero(src,-1));
        System.out.println(fillZero(src,3));
    }

    private static String fillZero(String src, int length) {
        //src가 널이거나, src.length()가 length와 같으면 src를 그대로 반환한다.
        if(src ==null || src.length()==length)return src;

        //length의 값이 0보다 같거나 작으면 빈 문자열("")을 반환한다.
        if(length<=0) return "";

        //src의 길이가 length의 값보다 크면 src를 length만큼 잘라서 반환한다.
        if(src.length()>length)return src.substring(0,length);

        //길이가 length인 char배열을 생성한다.
        char [] temp = new char[length];
        //위의 배열을 0으로 채운다.
        for(int i=0;i<temp.length;i++)temp[i]='0';
        //src에서 문자배열을 뽑아내서 생성한 배열에 복사한다.
        System.arraycopy(src.toCharArray(),0,temp,length-src.length(),src.length());
        //생성한 배열로 String을 생성해서 반환한다.
        return new String(temp);
    }
}
