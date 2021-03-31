package basic_practiceCH6.Exercise6_6;

public class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
//    //두점 ( x, y) 와 (x1, y1)간의 거리를 구한다.
//    public double getDistance(int x, int y, int x1, int y1){
//        double z = Math.pow(x1-x,2)+Math.pow(y1-y,2);
//        return Math.sqrt(z);
//    }

    public double getDistance(int x1, int y1){
        double z = Math.pow(x1-this.x,2)+Math.pow(y1-this.y,2);
        return Math.sqrt(z);
    }
}

