package basic_practiceCH7.Exercise7_22;

public class Point {
    int x, y;

    Point(){
        this(0,0);
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return"["+x+","+y+"]";
    }
}
