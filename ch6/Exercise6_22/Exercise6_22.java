package basic_practiceCH6.Exercise6_22;

public class Exercise6_22 {
    public static boolean isNumber(String str){
        if(str==null ||str.equals(""))return false;

        for(int i=0;i<str.length();i++){
            //int num = str.charAt(i)-'0'; //char to int
            int num = Character.getNumericValue(str.charAt(i)); //char to int
            if(!(num>=0 && num<=9))return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));
        str="1234o";
        System.out.println(str+"는 숫자입니까?"+isNumber(str));
    }
}
