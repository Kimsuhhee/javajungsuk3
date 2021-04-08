package Exercise9_3;

public class Exercise9_3 {
    public static void main(String[] args) {
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

        String[] temp = fullPath.split("\\\\");

        path=temp[0]+"\\"+temp[1]+"\\"+temp[2];
        fileName=temp[3];

        System.out.println("fullPath = " + fullPath);
        System.out.println("path = " + path);
        System.out.println("fileName = " + fileName);
    }
}
