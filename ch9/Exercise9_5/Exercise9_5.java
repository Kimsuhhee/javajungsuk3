package Exercise9_5;

public class Exercise9_5 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB","AB"));
        System.out.println(count("12345","AB"));
    }

    private static int count(String src, String target) {
        int count = 0 ;
        int pos = 0;
        int idx = 0;
        //반복문을 사용해서 아래의 과정을 반복한다.
        //src에서 target을 pos의 위치부터 찾는다.
        //찾으면 count의 값을 1 증가 시키고 ,
        //pos의 값을 target.length만큼 증가시킨다.
        //indexOf의 결과가 -1이면 반복문을 빠져나가서 count를 반환한다.

        while((idx=src.indexOf(target,pos))!=-1){
            count++;
            pos = idx+target.length();
        }
        return count;
    }
}
