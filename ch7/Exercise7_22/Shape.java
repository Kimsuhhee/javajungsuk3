package basic_practiceCH7.Exercise7_22;

abstract class Shape {
    Point p;
    Shape(){
        this(new Point(0,0));
    }
    Shape(Point p){
        this.p = p;
    }
    abstract double calcArea();

    Point getPosition(){
        return p;
    }
    void setPosition(Point p){
        this.p = p;
    }
}
