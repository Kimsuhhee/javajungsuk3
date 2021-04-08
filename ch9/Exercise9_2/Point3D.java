package Exercise9_2;

public class Point3D {
    int x,y,z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D() {
        this(0,0,0);
    }

    @Override
    public boolean equals(Object obj) {
        //인스턴스변수 x. y, z를 비교하도록 오버라이딩 하시오
        Point3D temp = (Point3D)obj;
        if((temp.x == this.x) &&(temp.y == this.y) && (temp.z == this.z))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "[" + x +
                "," + y +
                "," + z +
                ']';
    }
}
