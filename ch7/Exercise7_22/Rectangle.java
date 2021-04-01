package basic_practiceCH7.Exercise7_22;

public class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height){
        this(new Point(0,0),width,height);
    }
    Rectangle(Point p, double width, double height){
        super(p); //조상의 멤버는 조상의 생성자가 초기화하도록 함
        this.width = width;
        this.height = height;
    }
    public boolean isSquare(){
        //정사각인지 아닌지를 알려줌
        return (width==height)?true:false;
    }

    @Override
    double calcArea() {
        return width*height;
    }
}
