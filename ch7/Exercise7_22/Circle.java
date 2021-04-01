package basic_practiceCH7.Exercise7_22;

public class Circle extends Shape {
    double r;

    Circle(double r){
        this(new Point(0,0), r);
    }
    Circle(Point p, double r){
        super(p); //조상의 멤버는 조상의 생성자가 초기화하도록 함
        this.r = r;
    }
    @Override
    double calcArea() {
        return Math.PI*r*r;
    }
}
